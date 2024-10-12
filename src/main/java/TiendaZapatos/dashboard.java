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
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import views.Clientes;
import views.Compras;
import views.GestionProductos;
import views.Principal;
import views.Proveedores;


import views.NewZapato;
import views.Ventas;
import views.NewCliente;

public class dashboard extends JFrame {

    // Cargar los íconos de sol y luna con rutas absolutas
    private final ImageIcon SolIcon;
    private final ImageIcon LunaIcon;
    private final ImageIcon ShoeRackIcon;
    private final ImageIcon CasaIcon;
    private final ImageIcon CasaNegraIcon;
    
   

    public dashboard() {
        // Depuración de carga de recursos
        URL solUrl = getClass().getResource("/icons/sol.png");
        URL lunaUrl = getClass().getResource("/icons/luna.png");
        URL shoerackUrl = getClass().getResource("/images/ShoeRack_black_rb_182_103.png");
        URL Casaurl = getClass ().getResource("/icons/casa.png");
        URL casanegraurl = getClass ().getResource("/icons/casanegra.png");
  

        SolIcon = new ImageIcon(solUrl);
        LunaIcon = new ImageIcon(lunaUrl);
        ShoeRackIcon = new ImageIcon(shoerackUrl);
        CasaNegraIcon = new ImageIcon(casanegraurl);
        CasaIcon = new ImageIcon (Casaurl);
        initComponents();
        setLightMode(); 
        SetDate();
        initContent();
        styleButtonPrincipal(rootPaneCheckingEnabled);
       
    }
    

    
    private void styleButtonPrincipal(boolean isDarkMode) {
    btnPrinciapl.setHorizontalAlignment(SwingConstants.LEFT);
    btnPrinciapl.setHorizontalTextPosition(SwingConstants.RIGHT);
    btnPrinciapl.setVerticalTextPosition(SwingConstants.CENTER);
    btnPrinciapl.setIconTextGap(10); 
    
    if (isDarkMode) {
        btnPrinciapl.setIcon(CasaIcon);
    } else {
        btnPrinciapl.setIcon(CasaNegraIcon);
    }
}
   private void initContent() {
       showJpanel(new Compras());
}
   
   public static void showJpanel (JPanel p){
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
        datetext = new javax.swing.JLabel();
        PanelMenu = new javax.swing.JPanel();
        logoletras = new javax.swing.JLabel();
        btnPrinciapl = new javax.swing.JButton();
        btnGestiondeProductos = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnCompras = new javax.swing.JButton();
        btnProveedores = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        JToggleButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1060, 583));

        content.setBackground(new java.awt.Color(204, 255, 255));
        content.setForeground(new java.awt.Color(255, 255, 255));
        content.setPreferredSize(new java.awt.Dimension(883, 474));

        datetext.setText("Hoy es {dayname}  {day} de {mounth} del {year}");

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(datetext)
                .addContainerGap(747, Short.MAX_VALUE))
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(datetext, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(601, Short.MAX_VALUE))
        );

        PanelMenu.setBackground(new java.awt.Color(153, 153, 153));
        PanelMenu.setForeground(new java.awt.Color(102, 102, 102));

        logoletras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ShoeRack_black_rb_182_103.png"))); // NOI18N

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

        btnGestiondeProductos.setText("GESTION DE PRODUCTOS");
        btnGestiondeProductos.setBorder(null);
        btnGestiondeProductos.setBorderPainted(false);
        btnGestiondeProductos.setContentAreaFilled(false);
        btnGestiondeProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGestiondeProductos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnGestiondeProductos.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnGestiondeProductos.setMargin(new java.awt.Insets(2, 10, 2, 0));
        btnGestiondeProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestiondeProductosActionPerformed(evt);
            }
        });

        btnVentas.setText("VENTAS");
        btnVentas.setBorder(null);
        btnVentas.setBorderPainted(false);
        btnVentas.setContentAreaFilled(false);
        btnVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVentas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });

        btnClientes.setText("CLIENTES");
        btnClientes.setBorder(null);
        btnClientes.setBorderPainted(false);
        btnClientes.setContentAreaFilled(false);
        btnClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClientes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        btnCompras.setText("COMPRAS");
        btnCompras.setBorder(null);
        btnCompras.setBorderPainted(false);
        btnCompras.setContentAreaFilled(false);
        btnCompras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCompras.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprasActionPerformed(evt);
            }
        });

        btnProveedores.setText("PROVEDORES");
        btnProveedores.setBorder(null);
        btnProveedores.setBorderPainted(false);
        btnProveedores.setContentAreaFilled(false);
        btnProveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProveedores.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedoresActionPerformed(evt);
            }
        });

        btnLogout.setText("CERRAR SESION");
        btnLogout.setBorderPainted(false);
        btnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        JToggleButton.setBackground(new java.awt.Color(204, 204, 204));
        JToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JToggleButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelMenuLayout = new javax.swing.GroupLayout(PanelMenu);
        PanelMenu.setLayout(PanelMenuLayout);
        PanelMenuLayout.setHorizontalGroup(
            PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoletras, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(btnPrinciapl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnGestiondeProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCompras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(JToggleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelMenuLayout.setVerticalGroup(
            PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoletras, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPrinciapl, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGestiondeProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JToggleButton, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                .addGap(70, 70, 70)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
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
           showJpanel(new Principal()); 
           
    }//GEN-LAST:event_btnPrinciaplActionPerformed

    private void btnGestiondeProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestiondeProductosActionPerformed
           showJpanel(new GestionProductos());
     }//GEN-LAST:event_btnGestiondeProductosActionPerformed

    private void btnComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprasActionPerformed
        showJpanel(new Compras()); 
    }//GEN-LAST:event_btnComprasActionPerformed

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
        showJpanel(new Ventas()); 
    }//GEN-LAST:event_btnVentasActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        showJpanel(new Clientes()); 
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedoresActionPerformed
       showJpanel(new Proveedores()); 
    }//GEN-LAST:event_btnProveedoresActionPerformed

    
    private void SetDate (){
    LocalDate now = LocalDate.now();
    
         int year = now.getYear();
         int dia = now.getDayOfMonth();
         int month = now.getMonthValue();
         String[] meses = {"enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Diciembre"};
         datetext.setText(+dia+" de "+meses[month-1]+" de "+year);
}   
    
    
public static void updatePanelColors(JPanel panel, Color backgroundColor, Color foregroundColor) {
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
                
                styleButtonPrincipal(false);
                
                
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

            styleButtonPrincipal(true);
            
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
    private javax.swing.JButton btnGestiondeProductos;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnPrinciapl;
    private javax.swing.JButton btnProveedores;
    private javax.swing.JButton btnVentas;
    private static javax.swing.JPanel content;
    private javax.swing.JLabel datetext;
    private javax.swing.JLabel logoletras;
    // End of variables declaration//GEN-END:variables
    }