package views;

import TiendaZapatos.DAOCompraZapatoImpl;
import TiendaZapatos.dashboard;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import TiendaZapatos.DAOFacturaCompraImpl;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Date;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import models.facturacompra;
/**
 *
 * @author cland
 */
public class Compras extends javax.swing.JPanel {

    private int idFacturaSeleccionada;
    private DAOCompraZapatoImpl daoCompraZapatoImpl = new DAOCompraZapatoImpl();
    private String Proveedor;
    
    
    public Compras() {
        initComponents();
        initStyles ();
        loadCompras();
              
    }
   
    
    
    
    private void loadCompras (){
        try {
        DAOFacturaCompraImpl dao = new DAOFacturaCompraImpl();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        model.setRowCount(0); // Limpia el modelo antes de cargar nuevos datos
        
        List<facturacompra> facturacompras = dao.ReadNames();
        System.out.println("Cantidad de zapatos obtenidos: " + facturacompras.size());
        
        facturacompras.forEach(z -> model.addRow(new Object[]{
            z.getId_facturacompra(),
            z.getNombre_proveedor(),
            z.getCantidad(),
            z.getFecha(),
            String.format("$ %.2f", z.getTotal())
           
            
           
            
        }));
        
    } catch (Exception e) {
        e.printStackTrace(); // Muestra el error en la consola
    }
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        Background = new TiendaZapatos.PanelRound();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Titulo = new javax.swing.JLabel();
        btnNuevaCompra = new javax.swing.JButton();
        btnDetalles = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jDateChooser4 = new com.toedter.calendar.JDateChooser();
        jDateChooser5 = new com.toedter.calendar.JDateChooser();
        txtbuscar = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jButton2.setText("NUEVA VENTA ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("DETALLES");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton5.setText("FILTRAR ");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(823, 537));

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setRoundTopLeft(50);

        jLabel2.setText("De :");

        jLabel3.setText("Hasta :");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Factura Compra", "Proveedor", "Cantidad", "Fecha", "Total"
            }
        ));
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        Titulo.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        Titulo.setText("Registro de Compras");

        btnNuevaCompra.setText("NUEVA COMPRA");
        btnNuevaCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaCompraActionPerformed(evt);
            }
        });

        btnDetalles.setText("DETALLES");
        btnDetalles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetallesActionPerformed(evt);
            }
        });

        jButton6.setText("FILTRAR ");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        txtbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscarActionPerformed(evt);
            }
        });

        btnbuscar.setText("BUSCAR");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logozapato_75_77.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtbuscar))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BackgroundLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                                .addGap(166, 166, 166))
                            .addGroup(BackgroundLayout.createSequentialGroup()
                                .addComponent(jScrollPane1)
                                .addGap(18, 18, 18)))
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnNuevaCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDetalles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jDateChooser5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDateChooser4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(59, 59, 59))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtbuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(btnbuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(btnNuevaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDetalles, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(6, 6, 6)
                        .addComponent(jDateChooser4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents
    private void initStyles () {
        Titulo.putClientProperty( "FlatLaf.styleClass" , "h3" );
        txtbuscar.putClientProperty("JTextField.placeholderText", "Ingrese cualquier dato relevante de la factura de compra a buscar.");
        
            // Agregar KeyListener al JTextField txtbuscar
            txtbuscar.addKeyListener(new KeyAdapter() {
           @Override
           public void keyPressed(KeyEvent e) {
               if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                   btnbuscarActionPerformed(null); // Llamar al metodo de buscar del boton de busqueda
               }
           }
       });
        
    }
     
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnNuevaCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaCompraActionPerformed
        dashboard.getInstance().showJpanel(new NewCompra());
    }//GEN-LAST:event_btnNuevaCompraActionPerformed

    private void btnDetallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetallesActionPerformed

             Object[] facturaSeleccionada = obtenerFacturaSeleccionada(); // Cambié el nombre del método
    if (facturaSeleccionada != null) {
        // Obtener ID de factura y nombre del proveedor
        int idFactura = Integer.parseInt(facturaSeleccionada[0].toString()); // Co  nvertir el primer elemento a int
        String nombreProveedor = (String) facturaSeleccionada[1]; // El segundo elemento ya es un String

        
        DetalleNewCompra detalleNewCompra = new DetalleNewCompra(idFactura, nombreProveedor); 

       
        dashboard.getInstance().showJpanel(detalleNewCompra);
    } else {
        JOptionPane.showMessageDialog(this, "Por favor, seleccione una factura.");
    }
    }//GEN-LAST:event_btnDetallesActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        filtrarPorFechas();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
    String query = txtbuscar.getText(); // Obtener el texto del texfield de busqueda
    DAOFacturaCompraImpl daoFacturaCompra = new DAOFacturaCompraImpl();
    
    try {
        List<facturacompra> facturas = daoFacturaCompra.buscarFactura(query); // Llamar al metodo de busqueda
        
        // Limpiar la tabla antes de mostrar los resultados
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        
        // Agregar los resultados a la tabla
        for (facturacompra factura : facturas) {
            model.addRow(new Object[]{
                factura.getId_facturacompra(),
                factura.getNombre_proveedor(),
                factura.getCantidad(),
                factura.getFecha(),
                factura.getTotal()
            });
        }
        
        System.out.println("Resultados de la búsqueda mostrados.");
        
    } catch (Exception e) {
        System.out.println("Error al buscar facturas: " + e.getMessage());
    }
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void txtbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbuscarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // Obtener el ID de facturacompra de la fila seleccionada
    int filaSeleccionada = jTable1.getSelectedRow();
    if (filaSeleccionada != -1) {
        idFacturaSeleccionada = Integer.parseInt(jTable1.getValueAt(filaSeleccionada, 0).toString());
        String Proveedor = jTable1.getValueAt(filaSeleccionada, 1).toString(); 

    }
    }//GEN-LAST:event_jTable1MouseClicked

    private Object[] obtenerFacturaSeleccionada() {
        int filaSeleccionada = jTable1.getSelectedRow(); // Obtener la fila seleccionada
        if (filaSeleccionada != -1) {
            int idFactura = Integer.parseInt(jTable1.getValueAt(filaSeleccionada, 0).toString());
            String nombreProveedor = jTable1.getValueAt(filaSeleccionada, 1).toString();
            return new Object[]{idFactura, nombreProveedor}; // Retornar ambos valores
        }
        return null; 
    }

       private void filtrarPorFechas() {
                    
            java.util.Date fechaInicioUtil = jDateChooser5.getDate(); // Fecha de inicio (java.util.Date)
            java.util.Date fechaFinUtil = jDateChooser4.getDate(); // Fecha de fin (java.util.Date)

            // Convertir java.util.Date a java.sql.Date
            java.sql.Date fechaInicio = new java.sql.Date(fechaInicioUtil.getTime());
            java.sql.Date fechaFin = new java.sql.Date(fechaFinUtil.getTime());

            DAOFacturaCompraImpl daoFacturaCompra = new DAOFacturaCompraImpl();

            try {
                // Llamar al método de búsqueda de facturas entre fechas con java.sql.Date
                List<facturacompra> facturas = daoFacturaCompra.buscarFacturaPorFechas(fechaInicio, fechaFin);

                // Limpiar la tabla antes de mostrar los resultados
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.setRowCount(0);

                // Agregar los resultados a la tabla
                for (facturacompra factura : facturas) {
                    model.addRow(new Object[]{
                        factura.getId_facturacompra(),
                        factura.getNombre_proveedor(),
                        factura.getCantidad(),
                        factura.getFecha(),
                        factura.getTotal()
                    });
                }

                System.out.println("Resultados de la búsqueda por fechas mostrados.");
            } catch (Exception e) {
                System.out.println("Error al buscar facturas por fechas: " + e.getMessage());
            }
}







    // Variables declaration - do not modify//GEN-BEGIN:variables
    private TiendaZapatos.PanelRound Background;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton btnDetalles;
    private javax.swing.JButton btnNuevaCompra;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private com.toedter.calendar.JDateChooser jDateChooser4;
    private com.toedter.calendar.JDateChooser jDateChooser5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtbuscar;
    // End of variables declaration//GEN-END:variables
}
