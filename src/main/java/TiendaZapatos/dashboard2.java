package TiendaZapatos;


import com.formdev.flatlaf.intellijthemes.FlatCarbonIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatGruvboxDarkHardIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatMaterialDesignDarkIJTheme;
import java.awt.Color;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


/* @author David Grijalba  */

public class dashboard2 extends javax.swing.JFrame {
    
    private static dashboard2 instance;
    
    // Crear form dashboard2
    private dashboard2() {
        
        // Configuración de la ventana dashboard2
        setTitle("StockBussinessAdmin");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Mostrar programa en pantalla completa
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice gd = ge.getDefaultScreenDevice();
        
        // Verificar si el dispositivo soporta modo de pantalla completa
        if (gd.isFullScreenSupported()) {
            // Configurar la ventana para pantalla completa
            gd.setFullScreenWindow(this);
        } else {
            // Si no se soporta, simplemente mostrar la ventana normalmente
            setSize(900, 850);
            setLocationRelativeTo(null);
            setVisible(true);
        }
        
        
        // Metodo predeterminado para iniciar los componentes
        initComponents();
        agregarBotonCerrar();
        agregarBotonMaximizar();
        initStyle();
        
        // Quitar foco de todos los botones
        PanelMenu.requestFocusInWindow();
        
    }

 public static dashboard2 getInstance() {
    if (instance == null) {
        instance = new dashboard2(); // Crea la instancia si no existe
        instance.setVisible(true); // Muestra la ventana
    } else {
        instance.toFront(); // Lleva la ventana al frente si ya está abierta
    }
    return instance; // Devuelve la instancia
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackGround = new javax.swing.JPanel();
        PanelMenu = new javax.swing.JPanel();
        RoundedMenu = new TiendaZapatos.PanelRound();
        content = new javax.swing.JPanel();
        MenuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuThemes = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        GruvboxDarkHard = new javax.swing.JMenuItem();
        MaterialDesignDark = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));

        BackGround.setBackground(new java.awt.Color(51, 0, 0));

        RoundedMenu.setBackground(new java.awt.Color(0, 102, 102));
        RoundedMenu.setRoundBottomLeft(70);
        RoundedMenu.setRoundBottomRight(70);
        RoundedMenu.setRoundTopLeft(70);
        RoundedMenu.setRoundTopRight(70);

        javax.swing.GroupLayout RoundedMenuLayout = new javax.swing.GroupLayout(RoundedMenu);
        RoundedMenu.setLayout(RoundedMenuLayout);
        RoundedMenuLayout.setHorizontalGroup(
            RoundedMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 208, Short.MAX_VALUE)
        );
        RoundedMenuLayout.setVerticalGroup(
            RoundedMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 496, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PanelMenuLayout = new javax.swing.GroupLayout(PanelMenu);
        PanelMenu.setLayout(PanelMenuLayout);
        PanelMenuLayout.setHorizontalGroup(
            PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RoundedMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelMenuLayout.setVerticalGroup(
            PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RoundedMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout BackGroundLayout = new javax.swing.GroupLayout(BackGround);
        BackGround.setLayout(BackGroundLayout);
        BackGroundLayout.setHorizontalGroup(
            BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackGroundLayout.createSequentialGroup()
                .addComponent(PanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BackGroundLayout.setVerticalGroup(
            BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        MenuBar.setFont(new java.awt.Font("Rubik Medium", 0, 12)); // NOI18N
        MenuBar.setMargin(new java.awt.Insets(10, 10, 10, 10));

        jMenu1.setText("File");
        MenuBar.add(jMenu1);

        MenuThemes.setText("Themes");

        jMenuItem1.setText("Carbon");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        MenuThemes.add(jMenuItem1);
        MenuThemes.add(jSeparator1);

        GruvboxDarkHard.setText("Gruvbox Dark Hard");
        GruvboxDarkHard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GruvboxDarkHardActionPerformed(evt);
            }
        });
        MenuThemes.add(GruvboxDarkHard);

        MaterialDesignDark.setText("Material Design Dark");
        MaterialDesignDark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaterialDesignDarkActionPerformed(evt);
            }
        });
        MenuThemes.add(MaterialDesignDark);

        MenuBar.add(MenuThemes);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(916, 558));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

     // Metodo para crear un boton de cerrar y ponerlo en la MenuBar   
    private void agregarBotonCerrar() {
        
        JButton btnCerrar = new JButton("X");
        
        btnCerrar.setForeground(Color.RED);  // Puedes personalizar el estilo aquí

        // Añadir funcionalidad al botón de cerrar
        btnCerrar.addActionListener((ActionEvent e) -> {
            System.exit(0);  // Cerrar la aplicación al hacer clic en el botón
        });
        // Añadir el "glue" para alinear el botón a la derecha
        MenuBar.add(Box.createHorizontalGlue());
    
         // Añadir el botón de cerrar a la barra de menú
        MenuBar.add(btnCerrar);
    }

    private void agregarBotonMaximizar() {
        
        JButton btnMaximizar = new JButton("M");
        
        btnMaximizar.setForeground(Color.WHITE);  // Puedes personalizar el estilo aquí

        // Añadir funcionalidad al botón de cerrar
        btnMaximizar.addActionListener((ActionEvent e) -> {
            this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        });
        // Añadir el "glue" para alinear el botón a la derecha
        MenuBar.add(Box.createHorizontalGlue());
    
         // Añadir el botón de cerrar a la barra de menú
        MenuBar.add(btnMaximizar);
    }
    
    private void GruvboxDarkHardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GruvboxDarkHardActionPerformed
        SwingUtilities.invokeLater(()->{
            
            try {
                UIManager.setLookAndFeel(new FlatGruvboxDarkHardIJTheme());
                SwingUtilities.updateComponentTreeUI(this);
            } catch (UnsupportedLookAndFeelException ex) {
                Logger.getLogger(dashboard2.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        });
        
        // Quitar foco de todos los botones
        PanelMenu.requestFocusInWindow();
    }//GEN-LAST:event_GruvboxDarkHardActionPerformed

    private void MaterialDesignDarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaterialDesignDarkActionPerformed
        SwingUtilities.invokeLater(()->{
            
            try {
                UIManager.setLookAndFeel(new FlatMaterialDesignDarkIJTheme());
                SwingUtilities.updateComponentTreeUI(this);
            } catch (UnsupportedLookAndFeelException ex) {
                Logger.getLogger(dashboard2.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        });
        
        // Quitar foco de todos los botones
        PanelMenu.requestFocusInWindow();
    }//GEN-LAST:event_MaterialDesignDarkActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        SwingUtilities.invokeLater(()->{
            
            try {
                UIManager.setLookAndFeel(new FlatCarbonIJTheme());
                SwingUtilities.updateComponentTreeUI(this);
            } catch (UnsupportedLookAndFeelException ex) {
                Logger.getLogger(dashboard2.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        });
        
        // Quitar foco de todos los botones
        PanelMenu.requestFocusInWindow();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    
    
    public static void main(String args[]) {
        
        FlatCarbonIJTheme.setup();
        
        //FlatRobotoFont.install();
        //UIManager.put("defaultFont", new Font (FlatRobotoFont.FAMILY, Font.PLAIN, 13));
        
        
        //FlatIntelliJLaf.setup(); 
        //UIManager.put("TextField.placeholderForeground", Color.GRAY); 
        
        /*
        // Abrir la ventana de login como primer paso
        java.awt.EventQueue.invokeLater(() -> {
             new login().setVisible(true);
        }); */
        
        
        java.awt.EventQueue.invokeLater(() -> {
            dashboard2.getInstance().setVisible(true);
        });
        
    }
    
    // Metodo para cambiar estilo de componentes
    private void initStyle() {
        
        RoundedMenu.setBackground(new java.awt.Color(255,255,255,15));
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackGround;
    private javax.swing.JMenuItem GruvboxDarkHard;
    private javax.swing.JMenuItem MaterialDesignDark;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenu MenuThemes;
    private javax.swing.JPanel PanelMenu;
    private TiendaZapatos.PanelRound RoundedMenu;
    private javax.swing.JPanel content;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
