/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views;

import TiendaZapatos.DAOMarcaImpl;
import TiendaZapatos.DAOProveedoresImpl;
import TiendaZapatos.dashboard;
import interfaces.DAOProveedor;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import models.marca;
import views.Proveedores;

/**
 *
 * @author cland
 */
public class NewProveedor extends javax.swing.JPanel {


    
    
    public NewProveedor()  {
        initComponents();
        initStyles ();
        obtenerMarcas();
        cargarMarcas();
    
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtfNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtfDomicilio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        txtemail = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        combomarcas = new javax.swing.JComboBox<>();

        txtfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfNombreActionPerformed(evt);
            }
        });

        jLabel4.setText("Marca");

        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });

        jLabel5.setText("Telefono");

        jLabel6.setText("Direccion");

        txtfDomicilio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfDomicilioActionPerformed(evt);
            }
        });

        jLabel7.setText("Email");

        Titulo.setText("Registrar Nuevo Proveedor");

        jLabel3.setText("Nombre");

        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });

        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jSeparator3.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator3.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));
        jSeparator3.setPreferredSize(new java.awt.Dimension(50, 90));

        combomarcas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combomarcasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                            .addComponent(txtfNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                            .addComponent(jLabel5)
                            .addComponent(combomarcas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(38, 38, 38)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addComponent(txtfDomicilio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(210, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(txtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(combomarcas, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(24, 24, 24)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtfDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(54, 54, 54)
                                    .addComponent(jLabel7)))
                            .addGap(26, 26, 26)
                            .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(88, 88, 88))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

     private void initStyles () {
        Titulo.putClientProperty( "FlatLaf.styleClass" , "h3" );
        txtfNombre.putClientProperty("JTextField.placeholderText", "Ingrese el nombre del proveedor.");
        txtfDomicilio.putClientProperty("JTextField.placeholderText", "Ingrese la direccion de el proveedor.");
        combomarcas.putClientProperty("JTextField.placeholderText", "Ingrese la marca del proveedor.");
        txtTelefono.putClientProperty("JTextField.placeholderText", "Ingrese el telefono del proveedor.");
        txtemail.putClientProperty("JTextField.placeholderText", "Ingrese el email del proveedor.");
        
        

    }
    
    private void txtfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfNombreActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtfDomicilioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfDomicilioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfDomicilioActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
 // Obtener datos del formulario
        String nombre = txtfNombre.getText().trim();
        String email = txtemail.getText().trim();
        String telefono = txtTelefono.getText().trim();
        String direccion = txtfDomicilio.getText().trim();

        // Obtener la marca seleccionada y su ID
        marca marcaSeleccionada = (marca) combomarcas.getSelectedItem();
        if (marcaSeleccionada == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar una marca", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            return; // Salir si no se selecciona ninguna marca
        }
        int id_marca = marcaSeleccionada.getId_marca(); // Obtener el ID de la marca seleccionada

        // Validar campos antes de proceder
        if (!validarCampos(nombre, email, telefono, direccion, marcaSeleccionada.toString())) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            txtfNombre.requestFocus();
            return; // Salir si hay campos vacíos
        }

        // Crear objeto proveedor
        models.proveedor proveedor = new models.proveedor();
        proveedor.setNombre_proveedor(nombre);
        proveedor.setEmail(email);
        proveedor.setTelefono(telefono);
        proveedor.setDireccion(direccion);
        proveedor.setid_marca(id_marca); // Aquí se establece la marca

        // Intentar registrar proveedor
        try {
            DAOProveedor dao = new DAOProveedoresImpl();
            dao.create(proveedor); // Llamada al método para crear el proveedor en la base de datos
            javax.swing.JOptionPane.showMessageDialog(this, "El proveedor se registró con éxito", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);

            // Limpiar los campos del formulario después del registro
            txtfNombre.setText("");
            txtemail.setText("");
            txtTelefono.setText("");
            txtfDomicilio.setText("");
            combomarcas.setSelectedIndex(0); // Reiniciar el JComboBox

        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Ocurrió un error al registrar al proveedor", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            e.printStackTrace(); // Mostrar el error en la consola para depuración
        }
    
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        
        dashboard.getInstance().showJpanel(new Proveedores());
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void combomarcasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combomarcasActionPerformed
   
    }//GEN-LAST:event_combomarcasActionPerformed
 
       private boolean validarCampos(String nombre, String email, String telefono, String direccion, String marca) {
        return !(marca.trim().isEmpty() || nombre.isEmpty() || email.isEmpty() || telefono.isEmpty() || direccion.isEmpty());
    }     
       
         public List<marca> obtenerMarcas() {
        DAOMarcaImpl daoMarca = new DAOMarcaImpl();
        List<marca> marcas = new ArrayList<>(); // Crear una lista para almacenar las marcas

        try {
            marcas = daoMarca.getAllMarcas(); // Asumiendo que este método existe y retorna List<marca>
        } catch (Exception e) {
            Logger.getLogger(NewProveedor.class.getName()).log(Level.SEVERE, null, e);
            javax.swing.JOptionPane.showMessageDialog(this, "Error al obtener las marcas", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
        }

        return marcas; // Retornar la lista de marcas
    }

    

    private void cargarMarcas() {
        List<marca> listaMarcas = obtenerMarcas(); // Método que obtiene las marcas
        for (marca m : listaMarcas) {
            combomarcas.addItem(m); // Agregar cada marca al JComboBox
        }
    }

    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<marca> combomarcas;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtfDomicilio;
    private javax.swing.JTextField txtfNombre;
    // End of variables declaration//GEN-END:variables
}
