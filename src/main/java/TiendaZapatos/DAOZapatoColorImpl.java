/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TiendaZapatos;

import DataBase.Database;
import interfaces.DAOZapatoColor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import models.zapato_color;

/**
 *
 * @author cland
 */
public class DAOZapatoColorImpl  extends Database implements DAOZapatoColor {

    @Override
    public int create(zapato_color zapato_color) throws SQLException, Exception {
        
        int idZapatocolor = -1;
         try {
             this.Conectar();

             // Comprobar si el zapato color ya existe
             PreparedStatement checkStmt = this.conexion.prepareStatement(
                 "SELECT id_zapatocolor FROM zapato_color WHERE id_zapato = ? AND id_color = ?"
             );
             checkStmt.setInt(1, zapato_color.getId_zapato());
             checkStmt.setInt(2, zapato_color.getId_color());

             ResultSet rs = checkStmt.executeQuery();
             if (rs.next()) {
                 // Si existe, retorna el id encontrado
                 idZapatocolor = rs.getInt("id_zapatocolor");
             } else {
                 // Si no existe, crea el nuevo zapato_color
                 PreparedStatement st = this.conexion.prepareStatement(
                     "INSERT INTO zapato_color (id_zapato, id_color) VALUES (?, ?)",
                     PreparedStatement.RETURN_GENERATED_KEYS
                 );
                 st.setInt(1, zapato_color.getId_zapato());
                 st.setInt(2, zapato_color.getId_color());
                 st.executeUpdate();

                 // Obtener el id generado
                 rs = st.getGeneratedKeys();
                 if (rs.next()) {
                     idZapatocolor = rs.getInt(1);
                 }
             }
             rs.close();
             checkStmt.close();
         } catch (Exception e) {
             throw new SQLException("Error al crear o obtener zapato_color: " + e.getMessage(), e);
         } finally {
             this.Cerrar();
         }
         return idZapatocolor;
        }    

    @Override
    public List<zapato_color> read() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public zapato_color readById(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int obtenerIdporcantidad(int cantidad) throws Exception {

        int idZapatocolor = -1;
        String sql = "SELECT id_zapatocolor FROM zapato_color WHERE cantidad = ?";

        try {
            this.Conectar(); 
            PreparedStatement stmt = this.conexion.prepareStatement(sql);
            stmt.setInt(1, cantidad);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                idZapatocolor = rs.getInt("id_zapatocolor");
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            throw new SQLException("Error al obtener el ID por cantidad: " + e.getMessage(), e);
        } finally {
            this.Cerrar();
        }
        return idZapatocolor;


                }    
    
        @Override
    public int obtenerIdZapatoColor(int idZapato, int idColor) throws Exception {
        int idZapatoColor = -1; // Valor por defecto si no se encuentra
        String sql = "SELECT id_zapatocolor FROM zapato_color WHERE id_zapato = ? AND id_color = ?";

        try {
            this.Conectar();
            PreparedStatement stmt = this.conexion.prepareStatement(sql);
            stmt.setInt(1, idZapato); // Establece el ID del zapato
            stmt.setInt(2, idColor);   // Establece el ID del color
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                idZapatoColor = rs.getInt("id_zapatocolor");
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            throw new SQLException("Error al obtener el ID del zapato color: " + e.getMessage(), e);
        } finally {
            this.Cerrar();
        }

        return idZapatoColor;
    }

    int obtenerIdZapatoColor(int id_zapato) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
            public List<zapato_color> obtenerColoresZapato(int idZapato) throws Exception {
              
                List<zapato_color> coloresZapato = new ArrayList<>();

         try {
             this.Conectar();
               String query = "SELECT zc.id_zapatocolor, zc.id_zapato, z.descripcion, zc.cantidad, col.nombre_color " +
                              "FROM zapato_color zc " + 
                              "JOIN zapato z ON zc.id_zapato = z.id_zapato " +
                              "JOIN colores col ON zc.id_color = col.id_color " +
                              "WHERE zc.id_zapato = ?"; // Filtrar por id_zapato

             PreparedStatement st = this.conexion.prepareStatement(query);
             st.setInt(1, idZapato);

             ResultSet rs = st.executeQuery();

             while (rs.next()) {
                 zapato_color color = new zapato_color();
                 color.setId_zapatocolor(rs.getInt("id_zapatocolor"));
                 color.setId_zapato(rs.getInt("id_zapato"));
                 color.setnombre_zapato(rs.getString("descripcion"));
                 color.setCantidad(rs.getInt("cantidad"));
                 color.setNombreColor(rs.getString("nombre_color"));
                 coloresZapato.add(color);
             }
             
             System.out.println("Colores encontrados: " + coloresZapato.size());
         } catch (Exception e) {
             throw e;
         } finally {
             this.Cerrar();
         }

         return coloresZapato;
            }
}
