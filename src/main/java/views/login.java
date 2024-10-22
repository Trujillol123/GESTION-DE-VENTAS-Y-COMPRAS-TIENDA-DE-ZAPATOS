package views;

import DataBase.Database;
import TiendaZapatos.dashboard;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.SwingWorker;

/* @author David Grijalba */

public class login extends javax.swing.JFrame {

    private ImageIcon icono;
    
    public login() {
        
        Image logoImage = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/logozapato.png"));
        icono = new ImageIcon(logoImage); // Crear ImageIcon usando la variable icono
        setIconImage(icono.getImage()); // Establecer la imagen del ícono
        
        initComponents();
        initStyles();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        Buttons_bar = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JLabel();
        btnMinimizar = new javax.swing.JLabel();
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

        Buttons_bar.setBackground(new java.awt.Color(204, 204, 204));

        btnCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/close.png"))); // NOI18N
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCerrarMouseExited(evt);
            }
        });

        btnMinimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/minimize.png"))); // NOI18N
        btnMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Buttons_barLayout = new javax.swing.GroupLayout(Buttons_bar);
        Buttons_bar.setLayout(Buttons_barLayout);
        Buttons_barLayout.setHorizontalGroup(
            Buttons_barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Buttons_barLayout.createSequentialGroup()
                .addGap(720, 720, 720)
                .addComponent(btnMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Buttons_barLayout.setVerticalGroup(
            Buttons_barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

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
        PassField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PassFieldKeyTyped(evt);
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
                .addContainerGap(31, Short.MAX_VALUE))
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

        Store.setFont(new java.awt.Font("Rubik ExtraBold", 0, 24)); // NOI18N
        Store.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Store.setText("Store");

        ShoeRack.setFont(new java.awt.Font("Rubik ExtraBold", 0, 24)); // NOI18N
        ShoeRack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ShoeRack.setText("Shoe Rack");

        Pattern.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo+Pattern_280_500.png"))); // NOI18N

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Buttons_bar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ShoeRack, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Store, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(loginContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(Pattern)
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addComponent(Buttons_bar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(250, 250, 250)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ShoeRack, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(Store, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addComponent(loginContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Pattern)
        );

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

        if (user.isEmpty() || password.isEmpty()) {
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
                    try (java.sql.PreparedStatement ps = db.conexion.prepareStatement(query)) {
                        ps.setString(1, user);
                        ps.setString(2, password);
                        
                        java.sql.ResultSet rs = ps.executeQuery();
                        
                        // Verificar si hay resultados (usuario válido)
                        if (rs.next()) {
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
                    }
                    db.Cerrar();
                } catch (HeadlessException | ClassNotFoundException | SQLException e) {
                    e.printStackTrace();
                    javax.swing.JOptionPane.showMessageDialog(null, "Error en la conexión a la base de datos.");
                }
                
                return null;
                
            }
            
            @Override
            protected void done() {
            //Cambiar interfaz si es necesarios
        }
        }.execute();
    }//GEN-LAST:event_btnLoginActionPerformed


    private void PassFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassFieldActionPerformed
        
    }//GEN-LAST:event_PassFieldActionPerformed

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnCerrarMouseClicked

    private void btnCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseEntered
        btnCerrar.setBackground(Color.red);
    }//GEN-LAST:event_btnCerrarMouseEntered

    private void btnCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseExited
        btnCerrar.setBackground(new java.awt.Color(0,0,0,1));
    }//GEN-LAST:event_btnCerrarMouseExited

    private void btnMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnMinimizarMouseClicked

    private void PassFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PassFieldKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_PassFieldKeyTyped

    private void initStyles() {
        txtUser.putClientProperty("JTextField.placeholderText", "Ingrese su nombre de usuario");
        PassField.putClientProperty("JPasswordField.placeholderText", "Ingrese su contraseña");
        PassField.setBackground(new java.awt.Color(0,0,0,1));
        txtUser.setBackground(new java.awt.Color(0,0,0,1));
        Buttons_bar.setBackground(new java.awt.Color(0,0,0,1));
        btnLogin.setBackground(new java.awt.Color(0,0,0,1));
    }
    
//Main si estuviera en el login.java
/*
    public static void main(String args[]) {
    // Inicialización del estilo visual y look-and-feel
    FlatRobotoFont.install();
    UIManager.put("defaultFont", new Font(FlatRobotoFont.FAMILY, Font.PLAIN, 13));
    FlatIntelliJLaf.setup();
    UIManager.put("TextField.placeholderForeground", Color.GRAY);

}

*/
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JPanel Buttons_bar;
    private javax.swing.JPasswordField PassField;
    private javax.swing.JLabel Pattern;
    private javax.swing.JLabel ShoeRack;
    private javax.swing.JLabel Store;
    private javax.swing.JLabel btnCerrar;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel btnMinimizar;
    private javax.swing.JLabel info;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelTittle;
    private TiendaZapatos.GradientPanel loginContent;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
