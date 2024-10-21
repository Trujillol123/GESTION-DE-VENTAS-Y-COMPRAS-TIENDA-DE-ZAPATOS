package views;



import TiendaZapatos.DAOClienteImpl;
import TiendaZapatos.dashboard;
import interfaces.DAOCliente;
import java.awt.Color;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author cland
 */
public class Clientes extends javax.swing.JPanel {

    /**
     * Creates new form Clientes
     */
    public Clientes() {
        initComponents();
        initStyles ();
        loadClientes ();
    }
    
    private void loadClientes (){
        try {
            DAOCliente dao = new DAOClienteImpl();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            dao.read().forEach((c) -> model.addRow(new Object[]{c.getId_cliente(), c.getNombre(), c.getEmail(), c.getTelefono(), c.getDireccion(), c.getFecha_registro()}));
            
        } catch (Exception e) {
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new TiendaZapatos.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtbucarnombre = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();

        setOpaque(false);

        Background.setBackground(new java.awt.Color(0, 51, 51));
        Background.setPreferredSize(new java.awt.Dimension(823, 545));
        Background.setRoundTopLeft(50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logozapato_75_77.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        Titulo.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        Titulo.setText("Clientes");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Email", "Telefono", "Direccion", "Fecha"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        txtbucarnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbucarnombreActionPerformed(evt);
            }
        });

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnNuevo.setText("NUEVO");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnEditar.setText("EDITAR");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnBorrar.setText("BORRAR");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                .addGap(646, 646, 646))
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(412, 412, 412)
                .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6)
                .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6)
                .addComponent(btnBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(120, 120, 120))
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtbucarnombre))
                    .addComponent(jScrollPane1))
                .addGap(120, 120, 120))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(Titulo)))
                .addGap(12, 12, 12)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(txtbucarnombre)
                        .addGap(1, 1, 1)))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(190, 190, 190))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, 922, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents
     private void initStyles () {
        Titulo.putClientProperty( "FlatLaf.styleClass" , "h3" );
        
        txtbucarnombre.putClientProperty("JTextField.placeholderText", "Ingrese el nombre del cliente a buscar.");
         setPanelColor(Background, 90, 93, 95);
        
    }
     
     //DEFINIR COLORES CON METODO
    static void setPanelColor(JPanel panel, int red, int green, int blue){
        panel.setBackground(new Color(red, green, blue));
    }
   
     
    
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
       

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
         if (jTable1.getSelectedRow()> -1 ){
            try {
            int id_cliente = (int) jTable1.getValueAt(jTable1.getSelectedRow(),0);
            DAOCliente dao = new DAOClienteImpl ();
            dashboard.getInstance().showJpanel(new NewCliente(dao.getclientebyid(id_cliente)));

         
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Debe Seleccionar un cliente a Editar \n","AVISO",javax.swing.JOptionPane.INFORMATION_MESSAGE);

        }

        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        //dashboard.getInstance().showJpanel(new NewCliente());
        dashboard.getInstance().showJpanel(new NewCliente());
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        
        DAOCliente dao = new DAOClienteImpl();
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

    private void txtbucarnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbucarnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbucarnombreActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private TiendaZapatos.PanelRound Background;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtbucarnombre;
    // End of variables declaration//GEN-END:variables
}
