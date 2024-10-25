/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views;

import TiendaZapatos.DAOColoresImpl;
import TiendaZapatos.DAOGestionProductosImpl;
import TiendaZapatos.DAOProveedoresImpl;
import TiendaZapatos.DAOTallaImpl;
import TiendaZapatos.dashboard;
import com.toedter.calendar.JDateChooser;
import interfaces.DAOColores;
import interfaces.DAOTalla;
import java.sql.Date;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.colores;
import models.proveedor;
import models.talla;
import models.zapato;
import views.Compras;

/**
 *
 * @author cland
 */
public class NewCompra extends javax.swing.JPanel {

    private Date fechaProducto;
    private String descripcionProducto;
    private int cantidadProducto;
    private float precioCompraProducto;
    private DefaultTableModel tableModel; // Modelo de la tabla
        
        
    public NewCompra() {
        initComponents();
        initStyles ();
        cargarZapatos();
        obtenerZapatos();
        obtenerProveedores();
        obtenerColores();
        obtenerTallas ();
        cargarProveedores ();
        cargarColores();
        cargarTallas ();
        
        
        comboproveedores.addActionListener(evt -> comboproveedoresActionPerformed(evt));        
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comboproveedores = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        date = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        comboZapato = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtPrecioU = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        btnAgregarPrdocuto = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        Color = new javax.swing.JLabel();
        comboTallas = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        combocolor = new javax.swing.JComboBox<>();

        Titulo.setText("Nueva Compra");

        jLabel2.setText("Cantidad :");

        comboproveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboproveedoresActionPerformed(evt);
            }
        });

        jLabel3.setText("Proveedor :");

        jLabel4.setText("Total Compra :");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Cantidad", "Color", "Talla", "Fecha de Compra", "Precio Unitario", "Subtotal"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        comboZapato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboZapatoActionPerformed(evt);
            }
        });

        jLabel5.setText("Fecha :");

        jLabel6.setText("Precio Unitario");

        btnAgregarPrdocuto.setText("AGREGAR PRODUCTO");
        btnAgregarPrdocuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPrdocutoActionPerformed(evt);
            }
        });

        jLabel7.setText("Producto  : ");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnRegistrar.setText("REGISTAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        Color.setText("Talla : ");

        comboTallas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTallasActionPerformed(evt);
            }
        });

        jLabel8.setText("Color :");

        combocolor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combocolorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 873, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(BackgroundLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(comboproveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(BackgroundLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(comboZapato, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(BackgroundLayout.createSequentialGroup()
                                .addComponent(Color)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(comboTallas, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BackgroundLayout.createSequentialGroup()
                                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addGap(12, 12, 12)
                                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPrecioU)
                                    .addComponent(btnAgregarPrdocuto, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(combocolor, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(Titulo)
                        .addGap(51, 51, 51)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(comboproveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboZapato, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPrecioU, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregarPrdocuto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addGap(18, 18, 18)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Color, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboTallas, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combocolor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(92, 92, 92)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void initStyles () {
        Titulo.putClientProperty( "FlatLaf.styleClass" , "h3" );
        date.putClientProperty("JTextField.placeholderText", "Ingrese la fecha de compra.");
        txtCantidad.putClientProperty("JTextField.placeholderText", "Cantidad a comprar.");
        txtPrecioU.putClientProperty("JTextField.placeholderText", "Precio por unidad.");

        
        
    }
    
  
    
    private void comboproveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboproveedoresActionPerformed
    
      proveedor proveedorSeleccionado = (proveedor) comboproveedores.getSelectedItem(); // Obtén el proveedor seleccionado
    
    if (proveedorSeleccionado != null) {
        int id_proveedor = proveedorSeleccionado.getId_proveedor(); // Asegúrate de que este método exista en la clase proveedor
        System.out.println("ID del proveedor seleccionado: " + id_proveedor);

        // Filtra los zapatos por el ID del proveedor
        List<zapato> zapatos = obtenerZapatosPorProveedor(id_proveedor);
        if (zapatos.isEmpty()) {
            System.out.println("No se encontraron zapatos para este proveedor.");
        } else {
            System.out.println("Se encontraron zapatos para este proveedor.");
        }
        cargarZapatos2(zapatos); // Llama a este método para cargar los zapatos filtrados
    }
    
    }//GEN-LAST:event_comboproveedoresActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        
        dashboard.getInstance().showJpanel(new Compras());
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void comboZapatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboZapatoActionPerformed
      zapato zapatoSeleccionado = (zapato) comboZapato.getSelectedItem(); // Obtener el zapato seleccionado

    if (zapatoSeleccionado != null) {
        // Imprimir el zapato seleccionado para depuracion
        System.out.println("Zapato seleccionado: " + zapatoSeleccionado.getDescripcion());

        try {
            // Obtener el precio de compra del zapato seleccionado
            float precioCompra = obtenerPrecioCompraZapato(zapatoSeleccionado.getId_zapato());
            
            // Formatear el precio a dos decimales y asignarlo al campo txtPrecioU
            txtPrecioU.setText(String.format("%.2f", precioCompra));

           
            txtPrecioU.setEditable(false); // Esto hace que el JTextField no sea editable
            
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al obtener el precio de compra del zapato.");
        }
    }
    }//GEN-LAST:event_comboZapatoActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
 
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void comboTallasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTallasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboTallasActionPerformed

    private void combocolorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combocolorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combocolorActionPerformed

    private void btnAgregarPrdocutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPrdocutoActionPerformed
                   // Obtener los datos del formulario
    zapato zapatoSeleccionado = (zapato) comboZapato.getSelectedItem();

    // Verificar que txtCantidad no esté vacío
    if (txtCantidad.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, ingresa una cantidad válida.", "Error", JOptionPane.ERROR_MESSAGE);
        return; // Salir del método si la cantidad es inválida
    }

    int cantidad = Integer.parseInt(txtCantidad.getText());

    // Manejo del precio con formato adecuado
    float precioCompra = 0;
    try {
        NumberFormat format = NumberFormat.getInstance();
        precioCompra = format.parse(txtPrecioU.getText()).floatValue();
    } catch (ParseException e) {
        // Manejar el error de formato
        JOptionPane.showMessageDialog(this, "Formato de precio no válido.", "Error", JOptionPane.ERROR_MESSAGE);
        return; // Salir del método si el formato es incorrecto
    }

    // Obtener la fecha desde el JDateChooser
    java.sql.Date fechaProducto = obtenerFechaSQL(date);
    
    // Aseggurarse que el zapato no este en blanco
    if (zapatoSeleccionado == null) {
        JOptionPane.showMessageDialog(this, "Por favor, selecciona un zapato.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    String color = combocolor.getSelectedItem().toString();
    String talla = comboTallas.getSelectedItem().toString();
    
    String descripcion = zapatoSeleccionado.getDescripcion();
   

    // Agregar la fila a la tabla
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel(); 
    Object[] rowData = { descripcion, cantidad, color, talla,  fechaProducto, precioCompra,precioCompra * cantidad}; 
    model.addRow(rowData);

    // Guardar los datos para otra tabla 
    guardarDatosParaOtraTabla(fechaProducto, descripcion, cantidad, precioCompra);

    // Limpiar los campos del formulario
    txtCantidad.setText("");
    txtPrecioU.setText("");
    comboZapato.setSelectedIndex(0); // Resetea los Combobox
    comboTallas.setSelectedIndex(0);
    combocolor.setSelectedIndex(0);
    }//GEN-LAST:event_btnAgregarPrdocutoActionPerformed
    
    
    private void guardarDatosParaOtraTabla(Date fecha, String descripcion, int cantidad, float precioCompra) {
    


// Puedes almacenar estos datos en atributos de clase o en otra estructura
    this.fechaProducto = fecha; // Atributo de clase para almacenar la fecha
    this.descripcionProducto = descripcion; // Atributo de clase para almacenar la descripción
    this.cantidadProducto = cantidad; // Atributo de clase para almacenar la cantidad
    this.precioCompraProducto = precioCompra; // Atributo de clase para almacenar el precio

    
    // DAOFacturaImpl.insertarDatos(fecha, descripcion, cantidad, precioCompra);
}
    
    public List<proveedor> obtenerProveedores() {
        DAOProveedoresImpl daoProveedor = new DAOProveedoresImpl();
        List<proveedor> proveedores = new ArrayList<>(); // Crear una lista para almacenar los proveedores

        try {
            proveedores = daoProveedor.getAllProveedores(); 
        } catch (Exception e) {
            Logger.getLogger(NewProveedor.class.getName()).log(Level.SEVERE, null, e);
            javax.swing.JOptionPane.showMessageDialog(this, "Error al obtener las marcas", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
        }

        return proveedores; // Retornar la lista de proveedores
    }
    
    private void cargarProveedores() {
    comboproveedores.addItem(new proveedor(0, "")); // Agregar un valor en blanco o por defecto
    
    List<proveedor> listaproveedor = obtenerProveedores(); // Método que obtiene los proveedores
    for (proveedor p : listaproveedor) {
        comboproveedores.addItem(p); // Agregar cada proveedor al JComboBox
    }
}
    
    private void cargarZapatos() {
        comboZapato.addItem(new zapato(0, "")); // Agregar un valor en blanco o por defecto 
        
        List<zapato> listaZapato = obtenerZapatos(); // Método que obtiene las marcas
        for (zapato z : listaZapato) {
            comboZapato.addItem(z); // Agregar cada marca al JComboBox
        }
    }
    
    private void cargarZapatos2(List<zapato> zapatos) {
          comboZapato.removeAllItems(); // Limpia el JComboBox antes de llenarlo
    for (zapato z : zapatos) {
        comboZapato.addItem(z); // Agrega cada zapato al JComboBox
    
        }
    
    }
    
    private void cargarColores() {
        combocolor.addItem(new colores(0, "")); // Agregar un valor en blanco o por defecto 
        
        List<colores> listaColores = obtenerColores(); // Método que obtiene las marcas
        for (colores z : listaColores) {
            combocolor.addItem(z); // Agregar cada marca al JComboBox
        }
    }
    
    private void cargarTallas() {
        comboTallas.addItem(new talla(0, "")); // Agregar un valor en blanco o por defecto 
        
        List<talla> listatallas = obtenerTallas(); // Método que obtiene las marcas
        for (talla z : listatallas) {
            comboTallas.addItem(z); // Agregar cada marca al JComboBox
        }
    }
    
    public List<zapato> obtenerZapatos() {
        DAOGestionProductosImpl daoZapato = new DAOGestionProductosImpl();
        List<zapato> zapato = new ArrayList<>(); // Crear una lista para almacenar las marcas

        try {
            zapato = daoZapato.getallZapatos(); 
        } catch (Exception e) {
            Logger.getLogger(zapato.class.getName()).log(Level.SEVERE, null, e);
            javax.swing.JOptionPane.showMessageDialog(this, "Error al obtener los Zapatos", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
        }

        return zapato; // Retornar la lista de marcas
    }
    
    public List<colores> obtenerColores() {
        DAOColores daocolores = new DAOColoresImpl();
        List<colores> colores = new ArrayList<>(); // Crear una lista para almacenar las tallas

        try {
            colores = daocolores.getallColors(); 
        } catch (Exception e) {
            Logger.getLogger(NewProveedor.class.getName()).log(Level.SEVERE, null, e);
            javax.swing.JOptionPane.showMessageDialog(this, "Error al obtener los colores", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
        }

        return colores; // Retornar la lista de tallas
    }
    
    public List<talla> obtenerTallas() {
        DAOTalla daotallas = new DAOTallaImpl();
        List<talla> talla = new ArrayList<>(); // Crear una lista para almacenar las tallas

        try {
            talla = daotallas.getallTallas(); 
        } catch (Exception e) {
            Logger.getLogger(NewProveedor.class.getName()).log(Level.SEVERE, null, e);
            javax.swing.JOptionPane.showMessageDialog(this, "Error al obtener los colores", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
        }

        return talla; // Retornar la lista de tallas
    }
    
    private List<zapato> obtenerZapatosPorProveedor(int id_proveedor) {
      List<zapato> todosZapatos = obtenerZapatos(); // Este método debe retornar todos los zapatos
    List<zapato> zapatosFiltrados = new ArrayList<>();

    for (zapato z : todosZapatos) {
        if (z.getId_proveedor() == id_proveedor) { // Verifica si el ID del proveedor coincide
            zapatosFiltrados.add(z);
        }
    }

    // Agrega una impresión para verificar la cantidad de zapatos filtrados
    System.out.println("Zapatos filtrados: " + zapatosFiltrados.size());
    return zapatosFiltrados;   }
   
    private float obtenerPrecioCompraZapato(int idZapato) {
        DAOGestionProductosImpl daoZapato = new DAOGestionProductosImpl();
        float precioCompra = 0;

        try {
            // Aquí haces la consulta para obtener el precio_compra basado en el idZapato
            precioCompra = daoZapato.getPrecioCompraPorZapato(idZapato);
        } catch (Exception e) {
            Logger.getLogger(zapato.class.getName()).log(Level.SEVERE, null, e);
            javax.swing.JOptionPane.showMessageDialog(this, "Error al obtener el precio del zapato", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
        }

        return precioCompra; // Retorna el precio de compra
    }

    
    private java.sql.Date obtenerFechaSQL(JDateChooser dateChooser) {
    java.util.Date fechaUtil = dateChooser.getDate();
    if (fechaUtil != null) {
        return new java.sql.Date(fechaUtil.getTime()); // Convertir java.util.Date a java.sql.Date
    }
    return null; // Si no hay fecha, retorna null   
    
}
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JLabel Color;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton btnAgregarPrdocuto;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<talla> comboTallas;
    private javax.swing.JComboBox<zapato> comboZapato;
    private javax.swing.JComboBox<colores> combocolor;
    private javax.swing.JComboBox<proveedor> comboproveedores;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtPrecioU;
    // End of variables declaration//GEN-END:variables

   
}