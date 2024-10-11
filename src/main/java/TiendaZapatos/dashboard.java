package TiendaZapatos;

import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.extras.FlatAnimatedLafChange;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.net.URL;
import java.time.LocalDate;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import views.Compras;
import views.GestionProductos;
import views.Principal;
import views.UpZapato;
import views.Ventas;

public class dashboard extends JFrame {

    // Cargar los íconos de sol y luna con rutas absolutas
    private final ImageIcon SolIcon;
    private final ImageIcon LunaIcon;
    
    

    public dashboard() {
        // Depuración de carga de recursos
        URL solUrl = getClass().getResource("/icons/sol.png");
        URL lunaUrl = getClass().getResource("/icons/luna.png");

        if (solUrl == null) {
            System.err.println("No se encontró sol.png");
        } else {
            System.out.println("sol.png encontrado en: " + solUrl.toExternalForm());
        }

        if (lunaUrl == null) {
            System.err.println("No se encontró luna.png");
        } else {
            System.out.println("luna.png encontrado en: " + lunaUrl.toExternalForm());
        }

        SolIcon = new ImageIcon(solUrl);
        LunaIcon = new ImageIcon(lunaUrl);

        initComponents();
        setLightMode(); 
        SetDate();
        initContent();
    }
   private void initContent() {
       showJpanel(new Compras());
}
   
   private void showJpanel (JPanel p){
       p.setSize(1205, 636);
       p.setLocation(0,0);
       
       content.removeAll();
       content.add(p, BorderLayout.CENTER);
       content.revalidate();
       content.repaint();
       
        if (FlatLaf.isLafDark()) {
        updatePanelColors(p, Color.DARK_GRAY, Color.WHITE);
    } else {
        updatePanelColors(p, Color.WHITE, Color.BLACK);
    }
   }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackGround = new javax.swing.JPanel();
        content = new javax.swing.JPanel();
        JToggleButton = new javax.swing.JButton();
        PanelCabezera = new javax.swing.JPanel();
        datetext = new javax.swing.JLabel();
        PanelMenu = new javax.swing.JPanel();
        btnPrinciapl = new javax.swing.JButton();
        txtTitulo2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnCompras = new javax.swing.JButton();
        btnProveedores = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        btnConfiguracion = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1060, 583));

        content.setBackground(new java.awt.Color(204, 255, 255));
        content.setForeground(new java.awt.Color(255, 255, 255));
        content.setPreferredSize(new java.awt.Dimension(883, 474));

        JToggleButton.setBackground(new java.awt.Color(51, 51, 51));
        JToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JToggleButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(JToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(JToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelCabezera.setBackground(new java.awt.Color(102, 102, 102));
        PanelCabezera.setForeground(new java.awt.Color(51, 51, 51));

        datetext.setText("Hoy es {dayname}  {day} de {mounth} del {year}");

        javax.swing.GroupLayout PanelCabezeraLayout = new javax.swing.GroupLayout(PanelCabezera);
        PanelCabezera.setLayout(PanelCabezeraLayout);
        PanelCabezeraLayout.setHorizontalGroup(
            PanelCabezeraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCabezeraLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(datetext)
                .addContainerGap(714, Short.MAX_VALUE))
        );
        PanelCabezeraLayout.setVerticalGroup(
            PanelCabezeraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCabezeraLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(datetext, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelMenu.setBackground(new java.awt.Color(153, 153, 153));
        PanelMenu.setForeground(new java.awt.Color(102, 102, 102));

        btnPrinciapl.setText("PRINCIPAL");
        btnPrinciapl.setBorderPainted(false);
        btnPrinciapl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txtTitulo2.setForeground(new java.awt.Color(255, 255, 255));
        txtTitulo2.setText("SHOES RACK");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("STORE");

        jButton2.setText("GESTION DE PRODUCTOS");
        jButton2.setBorderPainted(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnVentas.setText("VENTAS");
        btnVentas.setBorderPainted(false);
        btnVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnClientes.setText("CLIENTES");
        btnClientes.setBorderPainted(false);
        btnClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnCompras.setText("COMPRAS");
        btnCompras.setBorderPainted(false);
        btnCompras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnProveedores.setText("PROVEDORES");
        btnProveedores.setBorderPainted(false);
        btnProveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnReportes.setText("REPORTES");
        btnReportes.setBorderPainted(false);
        btnReportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnConfiguracion.setText("REPORTES");
        btnConfiguracion.setBorderPainted(false);
        btnConfiguracion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnLogout.setText("CERRAR SESION");
        btnLogout.setBorderPainted(false);
        btnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout PanelMenuLayout = new javax.swing.GroupLayout(PanelMenu);
        PanelMenu.setLayout(PanelMenuLayout);
        PanelMenuLayout.setHorizontalGroup(
            PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMenuLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPrinciapl, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfiguracion, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(7, Short.MAX_VALUE))
        );
        PanelMenuLayout.setVerticalGroup(
            PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMenuLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelMenuLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtTitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btnPrinciapl, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnCompras, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnVentas, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnReportes, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnConfiguracion, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout BackGroundLayout = new javax.swing.GroupLayout(BackGround);
        BackGround.setLayout(BackGroundLayout);
        BackGroundLayout.setHorizontalGroup(
            BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackGroundLayout.createSequentialGroup()
                .addComponent(PanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, 992, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(BackGroundLayout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(PanelCabezera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BackGroundLayout.setVerticalGroup(
            BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BackGroundLayout.createSequentialGroup()
                .addComponent(PanelCabezera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
                .addContainerGap())
        );

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JToggleButtonActionPerformed

        JToggleButton.setText("Light Mode");
        JToggleButton.setIcon(SolIcon);  // Cambia al icono de sol

        // Alternar entre los temas oscuro y claro

        if (FlatLaf.isLafDark()) {
            setLightMode();
        } else {
            setDarkMode();
        }

    }//GEN-LAST:event_JToggleButtonActionPerformed

    
    private void SetDate (){
    LocalDate now = LocalDate.now();
    
         int year = now.getYear();
         int dia = now.getDayOfMonth();
         int month = now.getMonthValue();
         String[] meses = {"enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Diciembre"};
         datetext.setText(+dia+" de "+meses[month-1]+" de "+year);
}   
    
    
private void updatePanelColors(JPanel panel, Color backgroundColor, Color foregroundColor) {
    panel.setBackground(backgroundColor);
    for (java.awt.Component component : panel.getComponents()) {
        if (component instanceof JPanel) {
            ((JPanel) component).setBackground(backgroundColor);
            ((JPanel) component).setForeground(foregroundColor);
            updatePanelColors((JPanel) component, backgroundColor, foregroundColor);
        } else {
            component.setBackground(backgroundColor);
            component.setForeground(foregroundColor);
        }
    }
}    
    
    
    private void setLightMode() {
        EventQueue.invokeLater(() -> {
            FlatAnimatedLafChange.showSnapshot();
            FlatIntelliJLaf.setup(); // Tema claro
            FlatLaf.updateUI();
            FlatAnimatedLafChange.hideSnapshotWithAnimation();

            // Actualizar botón
            JToggleButton.setText("Light Mode");
            JToggleButton.setIcon(SolIcon);  // Cambia al icono de sol

            // Personalizar colores del botón para modo claro
            JToggleButton.setBackground(Color.WHITE);
            JToggleButton.setForeground(Color.BLACK);

            // Cambiar el color del PanelMenu y PanelCabezera
            PanelMenu.setBackground(Color.LIGHT_GRAY);
            PanelCabezera.setBackground(Color.LIGHT_GRAY);
            
            //Cambiar El color del content que recibe
            // Actualizar el color de los paneles dentro de 'content'
            updatePanelColors(content, Color.WHITE, Color.BLACK);
            
                    
                    
        });
    }

    private void setDarkMode() {
        EventQueue.invokeLater(() -> {
            FlatAnimatedLafChange.showSnapshot();
            FlatDarculaLaf.setup(); // Tema oscuro
            FlatLaf.updateUI();
            FlatAnimatedLafChange.hideSnapshotWithAnimation();

            // Actualizar botón
            JToggleButton.setText("Dark Mode");
            JToggleButton.setIcon(LunaIcon);  // Cambia al icono de luna

            // Personalizar colores del botón para modo oscuro
            JToggleButton.setBackground(Color.DARK_GRAY);
            JToggleButton.setForeground(Color.WHITE);

            // Cambiar el color del PanelMenu y PanelCabezera
            PanelMenu.setBackground(Color.DARK_GRAY);
            PanelCabezera.setBackground(Color.DARK_GRAY);

            // Cambiar el color de la letra
            txtTitulo2.setForeground(Color.WHITE);
            jLabel2.setForeground(Color.WHITE);
            
            // Actualizar el color de los paneles dentro de 'content' 
            updatePanelColors(content, Color.DARK_GRAY, Color.WHITE);
             
        });
    }
    
    
    
    
    
    public static void main(String args[]) {
        
        FlatRobotoFont.install();
        UIManager.put("defaultFont", new Font (FlatRobotoFont.FAMILY, Font.PLAIN, 13));
        FlatIntelliJLaf.setup(); 
        UIManager.put("Button.arc", 999);
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new dashboard().setVisible(true);
            }
        });
    }
       

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackGround;
    private javax.swing.JButton JToggleButton;
    private javax.swing.JPanel PanelCabezera;
    private javax.swing.JPanel PanelMenu;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnCompras;
    private javax.swing.JButton btnConfiguracion;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnPrinciapl;
    private javax.swing.JButton btnProveedores;
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton btnVentas;
    private javax.swing.JPanel content;
    private javax.swing.JLabel datetext;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel txtTitulo2;
    // End of variables declaration//GEN-END:variables
    }