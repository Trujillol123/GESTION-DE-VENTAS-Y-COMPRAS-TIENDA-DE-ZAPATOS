package views;

import TiendaZapatos.DAOFacturaCompraImpl;
import TiendaZapatos.dashboard;
import java.awt.Color;
import java.util.List;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import models.facturacompra;
import TiendaZapatos.DAOFacutraVentaImpl;
import TiendaZapatos.DAOVentaZapatoImpl;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import models.facturaventa;
import models.ventazapato;
import views.DetalleNewVenta;

/**
 *
 * @author cland
 */
public class Ventas extends javax.swing.JPanel {


    
     private int idFacturaSeleccionada;
     private String cliente;
    
    public Ventas() {
        initComponents();
        initStyles ();
        loadVentas ();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackGround = new TiendaZapatos.PanelRound();
        Titulo = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        btnNuevaVEnta = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jDateChooser4 = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jDateChooser5 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        btnDetalles = new javax.swing.JButton();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1205, 636));

        BackGround.setBackground(new java.awt.Color(0, 51, 51));
        BackGround.setRoundTopLeft(50);

        Titulo.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        Titulo.setText("Registro de Ventas");

        jButton3.setText("BUSCAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });

        btnNuevaVEnta.setText("NUEVA VENTA ");
        btnNuevaVEnta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaVEntaActionPerformed(evt);
            }
        });

        jLabel3.setText("Hasta :");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID FACTURA", "CLIENTE", "METODO DE PAGO", "CANTIDAD", "FECHA DE PAGO", "CANTIDAD PAGADA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setText("De :");

        jButton5.setText("FILTRAR ");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logozapato_75_77.png"))); // NOI18N

        btnDetalles.setText("DETALLES");
        btnDetalles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetallesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BackGroundLayout = new javax.swing.GroupLayout(BackGround);
        BackGround.setLayout(BackGroundLayout);
        BackGroundLayout.setHorizontalGroup(
            BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackGroundLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackGroundLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackGroundLayout.createSequentialGroup()
                        .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(BackGroundLayout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtBuscar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BackGroundLayout.createSequentialGroup()
                                .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jDateChooser5, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jDateChooser4, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(btnDetalles, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNuevaVEnta, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(237, 237, 237))))
        );
        BackGroundLayout.setVerticalGroup(
            BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackGroundLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNuevaVEnta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDetalles, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackGroundLayout.createSequentialGroup()
                        .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(BackGroundLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BackGroundLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BackGroundLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(12, 12, 12)
                                .addComponent(jDateChooser5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(BackGroundLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(12, 12, 12)
                                .addComponent(jDateChooser4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
      
      private void loadVentas (){
          
          
          
          try {
        DAOFacutraVentaImpl dao = new DAOFacutraVentaImpl();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        model.setRowCount(0); // Limpia el modelo antes de cargar nuevos datos
        
        List<facturaventa> facturaventas = dao.ReadNames();
        
        
        facturaventas.forEach(z -> model.addRow(new Object[]{
            z.getId_facturaventa(),
            z.getNombre_cliente(),
            z.getNombre_metodopago(),
            z.getCantidad(),         
            z.getFecha(),         
            String.format("$ %.2f", z.getCantidad_pagada())
           
            
           
            
        }));
        
    } catch (Exception e) {
        e.printStackTrace(); // Muestra el error en la consola
    }
    }
    

    
    
    
    
    
    private void initStyles () {
        Titulo.putClientProperty( "FlatLaf.styleClass" , "h3" );
        txtBuscar.putClientProperty("JTextField.placeholderText", "Ingrese cualquier dato relevante de la venta a buscar.");
            // Agregar KeyListener al JTextField txtbuscar
            txtBuscar.addKeyListener(new KeyAdapter() {
           @Override
           public void keyPressed(KeyEvent e) {
               if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                   jButton3ActionPerformed(null); // Llamar al metodo de buscar del boton de busqueda
               }
           }
       });
    }
       
    private void btnNuevaVEntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaVEntaActionPerformed
      dashboard.getInstance().showJpanel(new NewVenta());
    }//GEN-LAST:event_btnNuevaVEntaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         
            String query = txtBuscar.getText(); // Obtener el texto del campo de busqueda
            DAOFacutraVentaImpl daoVenta = new DAOFacutraVentaImpl();

        try {
            List<facturaventa> ventasBuscar = daoVenta.buscarVenta(query);
            
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            
            model.setRowCount(0);
          
            for (facturaventa ventas : ventasBuscar) {
                model.addRow(new Object[]{
                    
                    ventas.getId_facturaventa(),
                    ventas.getNombre_cliente(),
                    ventas.getNombre_metodopago(),
                    ventas.getCantidad(),
                    ventas.getFecha(),
                    ventas.getCantidad_pagada()
                    
                    
                    
                

                });
            }

            System.out.println("Resultados de la busqueda mostrados.");

        } catch (Exception e) {
            System.out.println("Error al buscar ventas: " + e.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        filtrarPorFechas();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnDetallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetallesActionPerformed
          Object[] facturaSeleccionada = obtenerFacturaSeleccionada(); // Cambié el nombre del método
    if (facturaSeleccionada != null) {
        // Obtener ID de factura y nombre del proveedor
        int idFactura = Integer.parseInt(facturaSeleccionada[0].toString()); // Co  nvertir el primer elemento a int
        String nombreCliente = (String) facturaSeleccionada[1]; // El segundo elemento ya es un String

        
        DetalleNewVenta detalleNewVenta = new DetalleNewVenta(idFactura, nombreCliente); 

       
        dashboard.getInstance().showJpanel(detalleNewVenta);
    } else {
        JOptionPane.showMessageDialog(this, "Por favor, seleccione una factura.");
    }
    }//GEN-LAST:event_btnDetallesActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
           // Obtener el ID de facturaventa  de la fila seleccionada
    int filaSeleccionada = jTable1.getSelectedRow();
    if (filaSeleccionada != -1) {
        idFacturaSeleccionada = Integer.parseInt(jTable1.getValueAt(filaSeleccionada, 0).toString());
        String cliente = jTable1.getValueAt(filaSeleccionada, 1).toString(); 

    }
    }//GEN-LAST:event_jTable1MouseClicked

    
   
    
    
    private Object[] obtenerFacturaSeleccionada() {
           int filaSeleccionada = jTable1.getSelectedRow(); // Obtener la fila seleccionada
           if (filaSeleccionada != -1) {
               int idFactura = Integer.parseInt(jTable1.getValueAt(filaSeleccionada, 0).toString());
               String nombreCliente = jTable1.getValueAt(filaSeleccionada, 1).toString();
               return new Object[]{idFactura, nombreCliente}; // Retornar ambos valores
           }
           return null; 
       }
    
     private void filtrarPorFechas() {
                    
            java.util.Date fechaInicioUtil = jDateChooser5.getDate(); // Fecha de inicio (java.util.Date)
            java.util.Date fechaFinUtil = jDateChooser4.getDate(); // Fecha de fin (java.util.Date)

            // Convertir java.util.Date a java.sql.Date
            java.sql.Date fechaInicio = new java.sql.Date(fechaInicioUtil.getTime());
            java.sql.Date fechaFin = new java.sql.Date(fechaFinUtil.getTime());

            DAOFacutraVentaImpl daoFacturaVenta = new DAOFacutraVentaImpl();

            try {
                // Llamar al método de búsqueda de facturas entre fechas con java.sql.Date
                List<facturaventa> facturas = daoFacturaVenta.buscarVentaPorFechas(fechaInicio, fechaFin);

                // Limpiar la tabla antes de mostrar los resultados
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.setRowCount(0);

                // Agregar los resultados a la tabla
                
                
                   for (facturaventa factura : facturas) {
                     model.addRow(new Object[]{
                    
                    factura.getId_facturaventa(),
                    factura.getNombre_cliente(),
                    factura.getNombre_metodopago(),
                    factura.getCantidad(),
                    factura.getFecha(),
                    factura.getCantidad_pagada()
                
             
                    });
                }

                System.out.println("Resultados de la búsqueda por fechas mostrados.");
            } catch (Exception e) {
                System.out.println("Error al buscar facturas por fechas: " + e.getMessage());
            }
}


    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private TiendaZapatos.PanelRound BackGround;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton btnDetalles;
    private javax.swing.JButton btnNuevaVEnta;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private com.toedter.calendar.JDateChooser jDateChooser4;
    private com.toedter.calendar.JDateChooser jDateChooser5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
