package views;

import DataBase.Database;
import TiendaZapatos.dashboard;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import java.awt.Color;
import java.awt.Font;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.SwingWorker;
import javax.swing.UIManager;

/**
 *
 * @author David Grijalba
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
        initStyles();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        Buttons_bar = new javax.swing.JPanel();
        labelCerrar = new javax.swing.JLabel();
        labelMinimizar = new javax.swing.JLabel();
        loginContent = new TiendaZapatos.GradientPanel();
        labelTittle = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        PassField = new javax.swing.JPasswordField();
        info = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnLogin = new javax.swing.JButton();
        Store = new javax.swing.JLabel();
        ShoeRack = new javax.swing.JLabel();
        Pattern = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        Background.setBackground(new java.awt.Color(0, 102, 153));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/close.png"))); // NOI18N
        labelCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelCerrarMouseClicked(evt);
            }
        });

        labelMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/minimize.png"))); // NOI18N
        labelMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelMinimizarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Buttons_barLayout = new javax.swing.GroupLayout(Buttons_bar);
        Buttons_bar.setLayout(Buttons_barLayout);
        Buttons_barLayout.setHorizontalGroup(
            Buttons_barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Buttons_barLayout.createSequentialGroup()
                .addContainerGap(714, Short.MAX_VALUE)
                .addComponent(labelMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Buttons_barLayout.setVerticalGroup(
            Buttons_barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Buttons_barLayout.createSequentialGroup()
                .addGroup(Buttons_barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        Background.add(Buttons_bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 40));

        loginContent.setColor1(new java.awt.Color(6, 20, 27));
        loginContent.setColor2(new java.awt.Color(37, 55, 69));

        labelTittle.setFont(new java.awt.Font("Rubik ExtraBold", 0, 24)); // NOI18N
        labelTittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTittle.setText("Iniciar Sesion");

        jLabel3.setFont(new java.awt.Font("Rubik Light", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Usuario");

        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Rubik Light", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Contraseña");

        PassField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassFieldActionPerformed(evt);
            }
        });

        info.setFont(new java.awt.Font("Rubik Light", 0, 14)); // NOI18N
        info.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        info.setText("No tiene usuario? solicite a su empleador.");

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));

        btnLogin.setFont(new java.awt.Font("Rubik Light", 0, 14)); // NOI18N
        btnLogin.setText("Iniciar Sesion");
        btnLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginContentLayout = new javax.swing.GroupLayout(loginContent);
        loginContent.setLayout(loginContentLayout);
        loginContentLayout.setHorizontalGroup(
            loginContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginContentLayout.createSequentialGroup()
                .addGroup(loginContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginContentLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(loginContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelTittle)
                            .addGroup(loginContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator1)
                                .addGroup(loginContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(loginContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtUser)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(PassField, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginContentLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(info)
                                        .addGap(91, 91, 91))))))
                    .addGroup(loginContentLayout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        loginContentLayout.setVerticalGroup(
            loginContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginContentLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(labelTittle)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PassField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(info)
                .addGap(18, 18, 18)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        Background.add(loginContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 520, 500));

        Store.setFont(new java.awt.Font("Rubik ExtraBold", 0, 24)); // NOI18N
        Store.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Store.setText("Store");
        Background.add(Store, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 150, 40));

        ShoeRack.setFont(new java.awt.Font("Rubik ExtraBold", 0, 24)); // NOI18N
        ShoeRack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ShoeRack.setText("Shoe Rack");
        Background.add(ShoeRack, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 150, 40));

        Pattern.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo+Pattern_280_500.png"))); // NOI18N
        Background.add(Pattern, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String user = txtUser.getText();
        String password = String.valueOf(PassField.getPassword());

        if(user.isEmpty() || password.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "Debe ingresar un usuario y una contraseña.");
        return;
        }

        new SwingWorker<Void, Void>() {
         @Override
            protected Void doInBackground() throws Exception {
             try {
                // Establecer conexión con la base de datos
                Database db = new Database();
                db.Conectar();
                
                // Crear una sentencia SQL para verificar las credenciales
                String query = "SELECT * FROM usuario WHERE user = ? AND password = ?";
                java.sql.PreparedStatement ps = db.conexion.prepareStatement(query);
                ps.setString(1, user);
                ps.setString(2, password);
                
                java.sql.ResultSet rs = ps.executeQuery();

                // Verificar si hay resultados (usuario válido)
                if(rs.next()) {
                    javax.swing.JOptionPane.showMessageDialog(null, "Login exitoso");

                    // Aquí cerramos la ventana de login
                    dispose();
                    
                    // Abrimos el dashboard (esto lo haremos también en segundo plano)
                    java.awt.EventQueue.invokeLater(() -> {
                        dashboard.getInstance().setVisible(true);
                    });
                } else {
                    javax.swing.JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos.");
                }

                // Cerrar la conexión
                rs.close();
                ps.close();
                db.Cerrar();
            } catch (Exception e) {
                e.printStackTrace();
                javax.swing.JOptionPane.showMessageDialog(null, "Error en la conexión a la base de datos.");
            }
            return null;
        }

        @Override
        protected void done() {
            // Aquí podrías actualizar la interfaz si fuera necesario
        }
        }.execute();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void labelCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_labelCerrarMouseClicked

    private void labelMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMinimizarMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_labelMinimizarMouseClicked

    private void PassFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PassFieldActionPerformed

    private void initStyles() {
        txtUser.putClientProperty("JTextField.placeholderText", "Ingrese su nombre de usuario");
        PassField.putClientProperty("JPasswordField.placeholderText", "Ingrese su contraseña");
        PassField.setBackground(new java.awt.Color(0,0,0,1));
        txtUser.setBackground(new java.awt.Color(0,0,0,1));
        Buttons_bar.setBackground(new java.awt.Color(0,0,0,1));
        btnLogin.setBackground(new java.awt.Color(0,0,0,1));
    }
    

    public static void main(String args[]) {
    // Inicialización del estilo visual y look-and-feel
    FlatRobotoFont.install();
    UIManager.put("defaultFont", new Font(FlatRobotoFont.FAMILY, Font.PLAIN, 13));
    FlatIntelliJLaf.setup();
    UIManager.put("TextField.placeholderForeground", Color.GRAY);

    // Abrir la ventana de login como primer paso
    java.awt.EventQueue.invokeLater(() -> {
        new login().setVisible(true);
    });
}
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JPanel Buttons_bar;
    private javax.swing.JPasswordField PassField;
    private javax.swing.JLabel Pattern;
    private javax.swing.JLabel ShoeRack;
    private javax.swing.JLabel Store;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel info;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelCerrar;
    private javax.swing.JLabel labelMinimizar;
    private javax.swing.JLabel labelTittle;
    private TiendaZapatos.GradientPanel loginContent;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
