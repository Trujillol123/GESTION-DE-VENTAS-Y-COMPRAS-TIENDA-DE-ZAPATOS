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
    private final ImageIcon ShoeRackIcon;
    
    

    public dashboard() {
        // Depuración de carga de recursos
        URL solUrl = getClass().getResource("/icons/sol.png");
        URL lunaUrl = getClass().getResource("/icons/luna.png");
        URL shoerackUrl = getClass().getResource("/images/ShoeRack_black_rb_182_103.png");

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
        
        if (shoerackUrl == null) {
            System.out.println("No se encontró ShoeRack_black_rb_182_103.png");
        } else {
            System.out.println("ShoeRack_black_rb_182_103.png encontrado en: " + shoerackUrl.toExternalForm());
        }

        SolIcon = new ImageIcon(solUrl);
        LunaIcon = new ImageIcon(lunaUrl);
        ShoeRackIcon = new ImageIcon(shoerackUrl);

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
        datetext = new javax.swing.JLabel();
        PanelMenu = new javax.swing.JPanel();
        logoletras = new javax.swing.JLabel();
        btnPrinciapl = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnCompras = new javax.swing.JButton();
        btnProveedores = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
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

        datetext.setText("Hoy es {dayname}  {day} de {mounth} del {year}");

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contentLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(datetext)))
                .addContainerGap(652, Short.MAX_VALUE))
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentLayout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(datetext, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PanelMenu.setBackground(new java.awt.Color(153, 153, 153));
        PanelMenu.setForeground(new java.awt.Color(102, 102, 102));

        logoletras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ShoeRack_rb_182_103.png"))); // NOI18N

        btnPrinciapl.setText("PRINCIPAL");
        btnPrinciapl.setBorder(null);
        btnPrinciapl.setBorderPainted(false);
        btnPrinciapl.setContentAreaFilled(false);
        btnPrinciapl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrinciapl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPrinciapl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPrinciapl.setMargin(new java.awt.Insets(0, 10, 0, 0));
        btnPrinciapl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrinciaplActionPerformed(evt);
            }
        });

        jButton2.setText("GESTION DE PRODUCTOS");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton2.setMargin(new java.awt.Insets(2, 10, 2, 0));

        btnVentas.setText("VENTAS");
        btnVentas.setBorder(null);
        btnVentas.setBorderPainted(false);
        btnVentas.setContentAreaFilled(false);
        btnVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVentas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnClientes.setText("CLIENTES");
        btnClientes.setBorder(null);
        btnClientes.setBorderPainted(false);
        btnClientes.setContentAreaFilled(false);
        btnClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClientes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnCompras.setText("COMPRAS");
        btnCompras.setBorder(null);
        btnCompras.setBorderPainted(false);
        btnCompras.setContentAreaFilled(false);
        btnCompras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCompras.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnProveedores.setText("PROVEDORES");
        btnProveedores.setBorder(null);
        btnProveedores.setBorderPainted(false);
        btnProveedores.setContentAreaFilled(false);
        btnProveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProveedores.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnReportes.setText("REPORTES");
        btnReportes.setBorder(null);
        btnReportes.setBorderPainted(false);
        btnReportes.setContentAreaFilled(false);
        btnReportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReportes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnLogout.setText("CERRAR SESION");
        btnLogout.setBorderPainted(false);
        btnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout PanelMenuLayout = new javax.swing.GroupLayout(PanelMenu);
        PanelMenu.setLayout(PanelMenuLayout);
        PanelMenuLayout.setHorizontalGroup(
            PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoletras, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(btnPrinciapl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCompras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnReportes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelMenuLayout.setVerticalGroup(
            PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoletras, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPrinciapl, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout BackGroundLayout = new javax.swing.GroupLayout(BackGround);
        BackGround.setLayout(BackGroundLayout);
        BackGroundLayout.setHorizontalGroup(
            BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackGroundLayout.createSequentialGroup()
                .addComponent(PanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, 1004, Short.MAX_VALUE))
        );
        BackGroundLayout.setVerticalGroup(
            BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE)
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

    private void btnPrinciaplActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrinciaplActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPrinciaplActionPerformed

    
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
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                FlatAnimatedLafChange.showSnapshot();
                FlatIntelliJLaf.setup(); // Tema claro
                FlatLaf.updateUI();
                FlatAnimatedLafChange.hideSnapshotWithAnimation();
                
                // Actualizar botón
                JToggleButton.setText("Light Mode");
                JToggleButton.setIcon(SolIcon);  // Cambia al icono de sol
                logoletras.setIcon(ShoeRackIcon); //Cambia las letras SHOERACK STORE de blanco a negro
                
                // Personalizar colores del botón para modo claro
                JToggleButton.setBackground(Color.WHITE);
                JToggleButton.setForeground(Color.BLACK);
                
                // Cambiar el color del PanelMenu y PanelCabezera
                PanelMenu.setBackground(Color.white);
                
                
                //Cambiar El color del content que recibe
                // Actualizar el color de los paneles dentro de 'content'
                updatePanelColors(content, Color.WHITE, Color.BLACK);
            }
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

            // Cambiar el color del fondo (background)
            PanelMenu.setBackground(Color.DARK_GRAY);
            
            
            // Actualizar el color de los paneles dentro de 'content' 
            updatePanelColors(content, Color.DARK_GRAY, Color.WHITE);
             
        });
    }
    
    
    
    
    
    public static void main(String args[]) {
        
        FlatRobotoFont.install();
        UIManager.put("defaultFont", new Font (FlatRobotoFont.FAMILY, Font.PLAIN, 13));
        FlatIntelliJLaf.setup(); 
        UIManager.put("Button.arc", 999);
        
        java.awt.EventQueue.invokeLater(() -> {
            new dashboard().setVisible(true);
        });
    }
       

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackGround;
    private javax.swing.JButton JToggleButton;
    private javax.swing.JPanel PanelMenu;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnCompras;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnPrinciapl;
    private javax.swing.JButton btnProveedores;
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton btnVentas;
    private javax.swing.JPanel content;
    private javax.swing.JLabel datetext;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel logoletras;
    // End of variables declaration//GEN-END:variables
    }