/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views;

import TiendaZapatos.DAOZapatoColorImpl;
import TiendaZapatos.DAOZapatoColorTallaImpl;
import java.util.List;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import models.zapato_color;
import models.zapatocolor_talla;

/**
 *
 * @author cland
 */
public class DetalleProductos extends javax.swing.JPanel {

    /**
     * Creates new form DetalleProductos
     */
    
        private int idZapato;
        
    
     public DetalleProductos(int id_zapatocolor) {
        
        initComponents();
        loadZapatoColors(idZapato);
        agregarListeners();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaColores = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaTallas = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        tablaColores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Descripcion", "Color", "Cantidad", "id_zapatocolor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaColores);
        if (tablaColores.getColumnModel().getColumnCount() > 0) {
            tablaColores.getColumnModel().getColumn(3).setResizable(false);
        }

        tablaTallas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Talla", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaTallas);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void agregarListeners() {
        tablaColores.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
        @Override
        public void valueChanged(ListSelectionEvent e) {
            if (!e.getValueIsAdjusting()) { // Solo ejecuta si no es un ajuste
                int row = tablaColores.getSelectedRow(); // Obtiene la fila seleccionada
                if (row != -1) { // Verifica que haya una fila seleccionada
                    // Confirmamos que estamos obteniendo el `id_zapatocolor`
                    try {
                        int id_zapatocolor = (int) tablaColores.getValueAt(row, 3); // Suponiendo que columna 3 es id_zapatocolor
                        System.out.println("Fila seleccionada: " + row + ", id_zapatocolor: " + id_zapatocolor);

                        loadTallas(id_zapatocolor); // Llama al método para cargar tallas con id_zapatocolor
                    } catch (Exception ex) {
                        System.out.println("Error al obtener id_zapatocolor: " + ex.getMessage());
                    }
                }
            }
        }
    });
    }
    
    public void loadZapatoColors(int idZapato) {
     try {
        DAOZapatoColorImpl daoZapatoColor = new DAOZapatoColorImpl();
        
        DefaultTableModel model = (DefaultTableModel) tablaColores.getModel();
        model.setRowCount(0); // Limpia el modelo
        
        List<zapato_color> colores = daoZapatoColor.obtenerColoresZapato(idZapato);
        
        for (zapato_color color : colores) {
            System.out.println("Descripción: " + color.getnombre_zapato()); 
            System.out.println("Color: " + color.getNombreColor());         
            System.out.println("Cantidad: " + color.getCantidad());        
            System.out.println("ID Zapatocolor en la base de datos: " + color.getId_zapatocolor()); // Verificar que estamos obteniendo el ID correcto

            model.addRow(new Object[]{
                color.getnombre_zapato(),
                color.getNombreColor(),
                color.getCantidad(),
                color.getId_zapatocolor() // Asegúrate de que este sea el id_zapatocolor
            });
        }
        
        // Mueve la ocultación de la columna id_zapatocolor fuera del bucle
        tablaColores.getColumnModel().getColumn(3).setMinWidth(0);
        tablaColores.getColumnModel().getColumn(3).setMaxWidth(0);
        tablaColores.getColumnModel().getColumn(3).setPreferredWidth(0);
        
        System.out.println("Colores del zapato cargados en la tabla.");
        
    } catch (Exception e) {
        System.out.println("Error al cargar los colores del zapato: " + e.getMessage());
        e.printStackTrace();
    }
}
    
    private void loadTallas(int id_zapatocolor) {
        
       try {
        System.out.println("Llamando a obtenerTallasPorId con id_zapatocolor: " + id_zapatocolor);

        DAOZapatoColorTallaImpl daoTalla = new DAOZapatoColorTallaImpl();
        
        DefaultTableModel model = (DefaultTableModel) tablaTallas.getModel();
        model.setRowCount(0); // Limpia el modelo

        // Obtener las tallas usando el ID del color del zapato
        List<zapatocolor_talla> tallas = daoTalla.obtenerTallasPorId(id_zapatocolor);
        
        if (tallas.isEmpty()) {
            System.out.println("No se encontraron tallas para el id_zapatocolor: " + id_zapatocolor);
        } else {
            for (zapatocolor_talla talla : tallas) {
                System.out.println("Talla encontrada: " + talla.getNumero_talla() + ", Cantidad: " + talla.getCantidad());
                model.addRow(new Object[]{
                    talla.getNumero_talla(), // Número de talla
                    talla.getCantidad()      // Cantidad disponible
                });
            }
        }
        
        System.out.println("Tallas cargadas en la tabla.");
    } catch (Exception e) {
        System.out.println("Error al cargar las tallas: " + e.getMessage());
        e.printStackTrace();
    }
}
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaColores;
    private javax.swing.JTable tablaTallas;
    // End of variables declaration//GEN-END:variables
}
