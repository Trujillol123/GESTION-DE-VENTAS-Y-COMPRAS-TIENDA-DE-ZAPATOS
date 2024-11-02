/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TiendaZapatos;

import interfaces.DAOMetodopago;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import models.metodopago;

/**
 *
 * @author cland
 */
public class DAOMetodoPagoImpl extends DataBase.Database implements DAOMetodopago{

    @Override
    public List<metodopago> read() throws Exception {
        
         List<metodopago> lista = new ArrayList<>();
                try {
                    this.Conectar();
                    PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM metodopago;");
                    ResultSet rs = st.executeQuery();
                    while (rs.next()) {
                        metodopago metodopago = new metodopago(rs.getInt("id_metodopago"), rs.getString("nombre_metodopago"));
                        lista.add(metodopago);
                    }
                    rs.close();
                    st.close();
                } catch (SQLException e) {
                    throw new Exception("Error al obtener los metodos de pago : " + e.getMessage(), e);
                } finally {
                    this.Cerrar();
                }
                return lista;
    
    
    }

    @Override
    public metodopago readById(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
