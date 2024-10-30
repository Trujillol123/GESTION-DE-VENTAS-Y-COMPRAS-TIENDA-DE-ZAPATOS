/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TiendaZapatos;

import DataBase.Database;
import interfaces.DAOZapatoColorTalla;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import models.zapato_color;
import models.zapatocolor_talla;

/**
 *
 * @author cland
 */
public class DAOZapatoColorTallaImpl extends Database implements DAOZapatoColorTalla  {

        @Override
        public void actualizarCantidadTalla(int id_zapato,  int idTalla,int idColor, int cantidad) throws Exception {
           DAOZapatoColorImpl daoZapatoColor = new DAOZapatoColorImpl();

           // Obtén o crea el idZapatoColor con base en idZapato e idColor
           int idZapatoColor = daoZapatoColor.obtenerIdZapatoColor(id_zapato, idColor);

           String selectSQL = "SELECT cantidad FROM zapatocolor_talla WHERE id_zapatocolor = ? AND id_talla = ?";
           String updateSQL = "UPDATE zapatocolor_talla SET cantidad = cantidad + ? WHERE id_zapatocolor = ? AND id_talla = ?";
           String insertSQL = "INSERT INTO zapatocolor_talla (id_zapatocolor,  id_talla, cantidad) VALUES (?, ?, ?)";

           try {
               this.Conectar();

               // Verificar si ya existe el registro
               PreparedStatement selectStmt = this.conexion.prepareStatement(selectSQL);
               selectStmt.setInt(1, idZapatoColor);
               selectStmt.setInt(2, idTalla);
               ResultSet rs = selectStmt.executeQuery();

               if (rs.next()) {
                   // Si existe, actualiza la cantidad
                   PreparedStatement updateStmt = this.conexion.prepareStatement(updateSQL);
                   updateStmt.setInt(1, cantidad);
                   updateStmt.setInt(2, idZapatoColor);
                   updateStmt.setInt(3, idTalla);
                   updateStmt.executeUpdate();
               } else {
                   // Si no existe, inserta un nuevo registro
                   PreparedStatement insertStmt = this.conexion.prepareStatement(insertSQL);
                   insertStmt.setInt(1, idZapatoColor);
                   insertStmt.setInt(2, idTalla);
                   insertStmt.setInt(3, cantidad);
                   insertStmt.executeUpdate();
               }

               rs.close();
               selectStmt.close();
           } catch (SQLException e) {
               throw new SQLException("Error al actualizar o insertar en zapatoColortalla: " + e.getMessage(), e);
           } finally {
               this.Cerrar();
           }
        }        

    @Override
    public List<zapatocolor_talla> read() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public zapatocolor_talla readById(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void create(zapatocolor_talla zapatocolor_talla) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public List<zapatocolor_talla> obtenerTallasPorId(int idZapatocolor) throws Exception {
    
        List<zapatocolor_talla> tallasZapato = new ArrayList<>();

            try {
                this.Conectar();

                String query = "SELECT t.numero_talla, zt.cantidad " +
                 "FROM zapatocolor_talla zt " +
                 "JOIN talla t ON zt.id_talla = t.id_talla " +
                 "WHERE zt.id_zapatocolor = ?";
                
                PreparedStatement st = this.conexion.prepareStatement(query);
                st.setInt(1, idZapatocolor);

                ResultSet rs = st.executeQuery();

                while (rs.next()) {
                    zapatocolor_talla talla = new zapatocolor_talla();
                   
                    talla.setNumero_talla(rs.getString("numero_talla"));
                    talla.setCantidad(rs.getInt("cantidad"));
                    tallasZapato.add(talla);
                }
            } catch (Exception e) {
                throw e;
            } finally {
                this.Cerrar();
            }

            return tallasZapato;
        }
}
