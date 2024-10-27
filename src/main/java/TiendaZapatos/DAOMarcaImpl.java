/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TiendaZapatos;

import DataBase.Database;
import interfaces.DAOMarca;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import models.marca;

/**
 *
 * @author cland
 */
public class DAOMarcaImpl extends Database implements DAOMarca{

    @Override
   
    public List<marca> getAllMarcas() throws Exception {
        List<marca> lista = new ArrayList<>();
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM marca;");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                marca marca = new marca(rs.getInt("id_marca"), rs.getString("nombre_marca"));
                lista.add(marca);
            }
            rs.close();
            st.close();
        } catch (SQLException e) {
            throw new Exception("Error al obtener marcas: " + e.getMessage(), e);
        } finally {
            this.Cerrar();
        }
        return lista;
    }
}