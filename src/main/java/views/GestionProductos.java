
package views;

import TiendaZapatos.DAOGestionProductosImpl;
import TiendaZapatos.dashboard;
import interfaces.DAOZapato;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import models.zapato;

/**
 *
 * @author cland
 */
public class GestionProductos extends javax.swing.JPanel {

    /**
     * Creates new form GestionProductos
     */
    public GestionProductos() {
        initComponents();
        initStyles ();
        loadZapatos ();
    }

    private void loadZapatos (){
        try {
        DAOZapato dao = new DAOGestionProductosImpl();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        model.setRowCount(0); // Limpia el modelo antes de cargar nuevos datos
        
        List<zapato> zapatos = dao.ReadNames();
        System.out.println("Cantidad de zapatos obtenidos: " + zapatos.size());
        
        zapatos.forEach(z -> model.addRow(new Object[]{
            z.getId_zapato(),
            z.getNombre_categoria(),
            z.getNombre_marca(),
            z.getNombre_proveedor(),
            String.format("$ %.2f",z.getPrecio_compra()), //foramto para agregar $ al inicio del dato
            String.format("$ %.2f", z.getPrecio_venta()),
            
            z.getCantidad(),
            z.getDescripcion()
            
        }));
        
    } catch (Exception e) {
        e.printStackTrace(); 
    }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new TiendaZapatos.PanelRound();
        Titulo = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setToolTipText("");
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(808, 445));

        background.setBackground(new java.awt.Color(0, 51, 51));
        background.setPreferredSize(new java.awt.Dimension(999, 640));
        background.setRoundTopLeft(50);

        Titulo.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        Titulo.setText("Gestion de Productos");

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CATEGORIA", "MARCA", "PROVEEDOR", "PRECIO COMPRA", "PRECIO VENTA", "CANTIDAD", "DESCRIPCION"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnNuevo.setText("NUEVO");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnBorrar.setText("ELIMINAR");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnEditar.setText("EDITAR");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logozapato_75_77.png"))); // NOI18N

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                        .addGap(376, 376, 376))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(txtBuscar))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(18, 18, 18)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(34, 34, 34))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 808, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    private void initStyles() {
        Titulo.putClientProperty("FlatLaf.styleClass", "h3");
        
        txtBuscar.putClientProperty("JTextField.placeholderText", "Ingrese algun dato revelevante del producto a buscar."); 
      
         }

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
         
        String query = txtBuscar.getText(); // Obtener el texto del campo de busqueda
            DAOGestionProductosImpl daoZapato = new DAOGestionProductosImpl();

        try {
            List<zapato> zapatos = daoZapato.buscarZapato(query);

            
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);

            
            for (zapato zapato : zapatos) {
                model.addRow(new Object[]{
                    zapato.getId_zapato(),
                    zapato.getNombre_categoria(),
                    zapato.getNombre_marca(),
                    zapato.getNombre_proveedor(),
                    zapato.getPrecio_compra(),
                    zapato.getPrecio_venta(),             
                    zapato.getCantidad(),
                    zapato.getDescripcion()

                });
            }

            System.out.println("Resultados de la busqueda mostrados.");

        } catch (Exception e) {
            System.out.println("Error al buscar zapatos: " + e.getMessage());
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        dashboard.getInstance().showJpanel(new NewZapato());
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        
        DAOZapato dao = new DAOGestionProductosImpl();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        for (int i : jTable1.getSelectedRows()){
            try {
                
                dao.delete((int) jTable1.getValueAt(i, 0));
                model.removeRow(i);
                } catch (Exception e) {
             System.out.println(e.getMessage());        
            }
        }
    
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        
                 if (jTable1.getSelectedRow()> -1 ){
            try {
            int id_zapato = (int) jTable1.getValueAt(jTable1.getSelectedRow(),0);
            DAOZapato dao = new DAOGestionProductosImpl ();
            dashboard.getInstance().showJpanel(new NewZapato(dao.readById(id_zapato)));

         
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Debe Seleccionar un cliente a Editar \n","AVISO",javax.swing.JOptionPane.INFORMATION_MESSAGE);

        }

    }//GEN-LAST:event_btnEditarActionPerformed
  
    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private TiendaZapatos.PanelRound background;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
