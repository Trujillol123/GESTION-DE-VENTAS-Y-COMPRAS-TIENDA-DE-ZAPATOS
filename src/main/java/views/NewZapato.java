/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views;

import TiendaZapatos.DAOCategoriasImpl;
import TiendaZapatos.DAOColoresImpl;
import TiendaZapatos.DAOCompraZapatoImpl;
import TiendaZapatos.DAOFacturaCompraImpl;
import TiendaZapatos.DAOGestionProductosImpl;
import TiendaZapatos.DAOMarcaImpl;
import TiendaZapatos.DAOProveedoresImpl;
import TiendaZapatos.DAOTallaImpl;
import TiendaZapatos.DAOZapatoColorImpl;
import TiendaZapatos.DAOZapatoColorTallaImpl;
import TiendaZapatos.dashboard;
import com.toedter.calendar.JDateChooser;
import interfaces.DAOCategoria;
import interfaces.DAOColores;
import interfaces.DAOFacturacompra;
import interfaces.DAOZapato;
import interfaces.DAOZapatoColor;
import interfaces.DAOZapatoColorTalla;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import models.categoria;
import models.colores;
import models.marca;
import models.proveedor;
import models.talla;
import models.zapato;

/**
 *
 * @author cland
 */
public class NewZapato extends javax.swing.JPanel {

    private ImageIcon icono;
    
    public NewZapato() {
        initComponents();
        initStyles (false, null);
        obtenerTallas ();
        cargarCategorias ();
        cargarMarcas();
        cargarProveedores ();
        obtenerMarcas();
        obtenerCategorias ();
        obtenerProveedores ();
        obtenerColores();
      
        combomarcas.addActionListener(evt -> comboproveedoresActionPerformed(evt)); 
    }
    
     public NewZapato(models.zapato zapato) {
        initComponents();
        initStyles (true, zapato);
        obtenerTallas ();
        obtenerMarcas();
        obtenerCategorias ();
        obtenerProveedores ();
        obtenerColores();
      
        
    }

   

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        lblCategoria15 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        combocategoria = new javax.swing.JComboBox<>();
        btnLimpiar = new javax.swing.JButton();
        combomarcas = new javax.swing.JComboBox<>();
        jLabel45 = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        lblCategoria16 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        comboproveedores = new javax.swing.JComboBox<>();
        lblCategoria17 = new javax.swing.JLabel();
        btnSubir = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        Background.setBackground(new java.awt.Color(255, 102, 51));
        Background.setPreferredSize(new java.awt.Dimension(888, 405));

        lblCategoria15.setText("CATEGORIA");

        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });

        combocategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combocategoriaActionPerformed(evt);
            }
        });

        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        combomarcas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combomarcasActionPerformed(evt);
            }
        });

        jLabel45.setText("DESCRIPCION");

        Titulo.setText("SUBIR NUEVO PRODUCTO");

        lblCategoria16.setText("PROVEEDOR");

        jLabel47.setText("PRECIO");

        comboproveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboproveedoresActionPerformed(evt);
            }
        });

        lblCategoria17.setText("MARCA");
        lblCategoria17.setMaximumSize(new java.awt.Dimension(42, 22));
        lblCategoria17.setRequestFocusEnabled(false);

        btnSubir.setText("SUBIR");
        btnSubir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubirActionPerformed(evt);
            }
        });

        btnAtras.setText("ATRAS");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/panel 2.png"))); // NOI18N

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BackgroundLayout.createSequentialGroup()
                                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCategoria17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(combomarcas, 0, 274, Short.MAX_VALUE)
                                    .addComponent(comboproveedores, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblCategoria15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(combocategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblCategoria16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(49, 49, 49)
                                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                                        .addComponent(txtPrecio)
                                        .addComponent(txtDescripcion))
                                    .addComponent(btnSubir, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(96, 96, 96)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(38, 38, 38))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(33, 33, 33)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCategoria15, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(combocategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCategoria17, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(combomarcas, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addComponent(lblCategoria16, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboproveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSubir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(67, 67, 67))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, 1014, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    private void initStyles (boolean isEdition, zapato zapato) {
                Titulo.putClientProperty("FlatLaf.styleClass", "h3");

           if (isEdition) {
               Titulo.setText("Editar Zapato");
               btnSubir.setText("GUARDAR");

               if (zapato != null) {
                   txtDescripcion.setText(zapato.getDescripcion());
                   txtPrecio.setText(String.valueOf(zapato.getPrecio_venta()));

                   cargarCategorias();
                   cargarMarcas();
                   cargarProveedores(); // Carga proveedores por defecto

                   setCategoriaSeleccionada(zapato.getId_categoria());
                   setMarcaSeleccionada(zapato.getId_marca());
                   setProveedorSeleccionado(zapato.getId_proveedor());
               }
           } else {
               Titulo.setText("Nuevo Zapato");
               btnSubir.setText("REGISTRAR");

               // Limpiar campos
               txtDescripcion.setText("");
               txtPrecio.setText("");

               cargarCategorias();
               cargarMarcas();
               cargarProveedores(); 
           }
    }
    
    
    private void combocategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combocategoriaActionPerformed
       
    }//GEN-LAST:event_combocategoriaActionPerformed
    private void btnSubirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubirActionPerformed
     
        // Validación y obtención de categoría seleccionada
        categoria categoriaSeleccionada = (categoria) combocategoria.getSelectedItem();
        if (categoriaSeleccionada == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar una categoría", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
        int id_categoria = categoriaSeleccionada.getId_categoria();

        // Validación y obtención de marca seleccionada
        marca marcaSeleccionada = (marca) combomarcas.getSelectedItem();
        if (marcaSeleccionada == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar una marca", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
        int id_marca = marcaSeleccionada.getId_marca();

        // Validación y obtención de proveedor seleccionado
        proveedor proveedorSeleccionado = (proveedor) comboproveedores.getSelectedItem();
        if (proveedorSeleccionado == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar un proveedor", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
        int id_proveedor = proveedorSeleccionado.getId_proveedor();

        // Obtención y validación del precio (float)
        String precioTexto = txtPrecio.getText().trim();
        float precio_venta;
        try {
            precio_venta = Float.parseFloat(precioTexto);
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debe ingresar un precio válido", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        String descripcion = txtDescripcion.getText().trim();


        // Crear objeto zapato
        models.zapato zapato = new models.zapato();
        zapato.setId_categoria(id_categoria);
        zapato.setId_marca(id_marca);
        zapato.setId_proveedor(id_proveedor);
        zapato.setPrecio_venta(precio_venta);
        zapato.setDescripcion(descripcion);

      // Intentar registrar zapato y compra
    try {
        // DAO para manejar zapato
        DAOGestionProductosImpl daoZapato = new DAOGestionProductosImpl();
        daoZapato.create(zapato);
       
        javax.swing.JOptionPane.showMessageDialog(this, "Zapato Registrado Con Éxito", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
           
        // Mensaje de depuración para verificar que esta sección se está ejecutando
        System.out.println("Limpieza de campos en proceso...");
        
        // Limpiar campos después de registrar el zapato
        txtPrecio.setText("");
        txtDescripcion.setText("");
        combocategoria.setSelectedIndex(0); 
        combomarcas.setSelectedIndex(0);    
        comboproveedores.setSelectedIndex(0);     
            
        
  
        
        
    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Ocurrió un error al registrar el zapato o la compra", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }

     }//GEN-LAST:event_btnSubirActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed

        dashboard.getInstance().showJpanel(new GestionProductos());
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void comboproveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboproveedoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboproveedoresActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
          // Limpiar campos después de registrar el zapato
        txtPrecio.setText("");
        txtDescripcion.setText("");
        combocategoria.setSelectedIndex(00); 
        combomarcas.setSelectedIndex(00);    
        comboproveedores.setSelectedIndex(00);     
            
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void combomarcasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combomarcasActionPerformed
        
      marca marcaseleccionada = (marca) combomarcas.getSelectedItem(); // Obtén el proveedor seleccionado
    
    if (marcaseleccionada != null) {
        int id_marca = marcaseleccionada.getId_marca(); // Asegúrate de que este método exista en la clase proveedor
        System.out.println("ID del proveedor seleccionado: " + id_marca);

        // Filtra los proveedores por el ID de la marca
        
        List<proveedor> proveedores = obtenenrProveedoresPorMarca(id_marca);
        if (proveedores.isEmpty()) {
            System.out.println("No se encontraron proveedores para esta marca.");
        } else {
            System.out.println("Se encontraron proveedores para esta marca.");
        }
        cargarProveedores2(proveedores); // Llama a este método para cargar los proveedores filtrados
    }
    
    }//GEN-LAST:event_combomarcasActionPerformed

    public List<talla> obtenerTallas() {
         DAOTallaImpl daoTalla = new DAOTallaImpl();
        List<talla> tallas = new ArrayList<>(); // Crear una lista para almacenar las tallas

        try {
            tallas = daoTalla.getallTallas(); 
        } catch (Exception e) {
            Logger.getLogger(NewProveedor.class.getName()).log(Level.SEVERE, null, e);
            javax.swing.JOptionPane.showMessageDialog(this, "Error al obtener las tallas", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
        }

        return tallas; // Retornar la lista de tallas
    }
  
    public List<marca> obtenerMarcas() {
        DAOMarcaImpl daoMarca = new DAOMarcaImpl();
        List<marca> marcas = new ArrayList<>(); // Crear una lista para almacenar las marcas

        try {
            marcas = daoMarca.getAllMarcas(); 
        } catch (Exception e) {
            Logger.getLogger(NewProveedor.class.getName()).log(Level.SEVERE, null, e);
            javax.swing.JOptionPane.showMessageDialog(this, "Error al obtener las marcas", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
        }

        return marcas; // Retornar la lista de marcas
    }

    private void cargarMarcas() {
        combomarcas.removeAllItems(); // Limpia el JComboBox antes de llenarlo
        List<marca> listaMarcas = obtenerMarcas(); // Método que obtiene las marcas
        for (marca m : listaMarcas) {
            combomarcas.addItem(m); // Agregar cada marca al JComboBox
        }
    }
    
    public List<categoria> obtenerCategorias() {
        DAOCategoriasImpl daocategoria = new DAOCategoriasImpl();
        List<categoria> categorias = new ArrayList<>(); // Crear una lista para almacenar las marcas

        try {
            categorias = daocategoria.getallCategorias(); 
        } catch (Exception e) {
            Logger.getLogger(NewProveedor.class.getName()).log(Level.SEVERE, null, e);
            javax.swing.JOptionPane.showMessageDialog(this, "Error al obtener las marcas", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
        }

        return categorias; // Retornar la lista de marcas
    }

    private void cargarCategorias() {
        
         combocategoria.removeAllItems(); // Limpia el JComboBox antes de llenarlo
         
        
        List<categoria> listaCategorias = obtenerCategorias(); // Método que obtiene las marcas
        for (categoria c : listaCategorias) {
            combocategoria.addItem(c); // Agregar cada marca al JComboBox
        }
    }
    
    private void setCategoriaSeleccionada(int id_categoria) {
    for (int i = 0; i < combocategoria.getItemCount(); i++) {
        categoria c = combocategoria.getItemAt(i);
        if (c.getId_categoria() == id_categoria) {
            combocategoria.setSelectedItem(c); // Seleccionar el objeto de categoría correcto
            break;
        }
    }
}
    
    private void setMarcaSeleccionada(int id_marca) {
    for (int i = 0; i < combomarcas.getItemCount(); i++) {
        marca m = combomarcas.getItemAt(i);
        if (m.getId_marca()== id_marca) {
            combomarcas.setSelectedItem(m); // Seleccionar el objeto de categoría correcto
            break;
        }
    }
}
    
    private void setProveedorSeleccionado(int id_proveedor) {
    for (int i = 0; i < comboproveedores.getItemCount(); i++) {
        proveedor p = comboproveedores.getItemAt(i);
        if (p.getId_proveedor()== id_proveedor) {
            comboproveedores.setSelectedItem(p); // Seleccionar el objeto de categoría correcto
            break;
        }
    }
}
    
    public List<proveedor> obtenerProveedores() {
        DAOProveedoresImpl daoProveedor = new DAOProveedoresImpl();
        List<proveedor> proveedores = new ArrayList<>(); // Crear una lista para almacenar las marcas

        try {
            proveedores = daoProveedor.getAllProveedores(); 
        } catch (Exception e) {
            Logger.getLogger(NewProveedor.class.getName()).log(Level.SEVERE, null, e);
            javax.swing.JOptionPane.showMessageDialog(this, "Error al obtener las marcas", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
        }

        return proveedores; // Retornar la lista de marcas
    }
    
    private void cargarProveedores() {
        
        
    comboproveedores.removeAllItems(); // Limpia el JComboBox antes de llenarlo
    comboproveedores.addItem(new proveedor(0, "")); // Agrega un valor en blanco o por defecto
    
    List<proveedor> listaproveedor = obtenerProveedores(); // Método que obtiene los proveedores
    for (proveedor z : listaproveedor) {
        comboproveedores.addItem(z); // Agregar cada proveedor al JComboBox
    }
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
    
    private void cargarProveedores2 (List<proveedor> proveedor) {
          comboproveedores.removeAllItems(); // Limpia el JComboBox antes de llenarlo
    for (proveedor z : proveedor) {
        comboproveedores.addItem(z); // Agrega cada zapato al JComboBox
    
        }
    
    }
    
        
    private List<proveedor> obtenenrProveedoresPorMarca(int id_marca) {
      List<proveedor> todosProveedores = obtenerProveedores(); // Este método debe retornar todos los zapatos
         List<proveedor> proovedoresfiltrados = new ArrayList<>();

    for (proveedor z : todosProveedores) {
        if (z.getid_marca()== id_marca) { // Verifica si el ID del proveedor coincide
            proovedoresfiltrados.add(z);
        }
    }

    // Agrega una impresión para verificar la cantidad de zapatos filtrados
    System.out.println("Zapatos filtrados: " + proovedoresfiltrados.size());
    return proovedoresfiltrados;   }
  
    
    
    private java.sql.Date obtenerFechaSQL(JDateChooser dateChooser) {
    java.util.Date fechaUtil = dateChooser.getDate();
    if (fechaUtil != null) {
        return new java.sql.Date(fechaUtil.getTime()); // Convertir java.util.Date a java.sql.Date
    }
    return null; // Si no hay fecha, retorna null   
    
}
    
    private void limpiarFormulario() {
    txtPrecio.setText("");
    txtDescripcion.setText("");
    combocategoria.setSelectedIndex(0); // O el valor que corresponda para "ninguno"
    combomarcas.setSelectedIndex(0);
    comboproveedores.setSelectedIndex(0);
    
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSubir;
    private javax.swing.JComboBox<categoria> combocategoria;
    private javax.swing.JComboBox<marca> combomarcas;
    private javax.swing.JComboBox<proveedor> comboproveedores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel lblCategoria15;
    private javax.swing.JLabel lblCategoria16;
    private javax.swing.JLabel lblCategoria17;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
