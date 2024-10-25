package TiendaZapatos;

import java.awt.Dimension;
import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.extras.FlatAnimatedLafChange;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import views.Clientes;
import views.Compras;
import views.GestionProductos;
import views.Principal;
import views.Proveedores;
import javax.swing.JButton;
import javax.swing.UIManager;

import views.Ventas;
import views.login;

public class dashboard extends JFrame {

    // Cargar todos los iconos usados con rutas absolutas
    private final ImageIcon SolIcon;
    private final ImageIcon LunaIcon;
    private final ImageIcon LogoLetrasNegroIcon;
    private final ImageIcon LogoLetrasBlancoIcon;
    private final ImageIcon CasaBlancoIcon;
    private final ImageIcon CasaNegroIcon;
    private final ImageIcon GestionBlancoIcon;
    private final ImageIcon GestionNegroIcon;
    private final ImageIcon ComprasBlancoIcon;
    private final ImageIcon ComprasNegroIcon;
    private final ImageIcon VentasBlancoIcon;
    private final ImageIcon VentasNegroIcon;
    private final ImageIcon ClientesBlancoIcon;
    private final ImageIcon ClientesNegroIcon;
    private final ImageIcon ProveedoresBlancoIcon;
    private final ImageIcon ProveedoresNegroIcon;
    

    
    private static dashboard instance;
    
    private dashboard() {
        
        // Configurar la ventana
        setTitle("ShoesRack");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        // Depuración de carga de recursos
        URL solUrl = getClass().getResource("/icons/sol.png");
        URL lunaUrl = getClass().getResource("/icons/luna.png");
        URL logoletrasnegroUrl = getClass().getResource("/images/logoletrasnegro.png");
        URL logoletrasblancoUrl = getClass().getResource("/images/logoletrasblanco.png");
        URL casablancoUrl = getClass ().getResource("/icons/casablanco.png");
        URL casanegroUrl = getClass ().getResource("/icons/casanegro.png");
        URL gestionblancoUrl = getClass().getResource("/icons/gestionblanco.png");
        URL gestionnegroUrl = getClass().getResource("/icons/gestionnegro.png");
        URL comprasblancoUrl = getClass().getResource("/icons/comprasblanco.png");
        URL comprasnegroUrl = getClass().getResource("/icons/comprasnegro.png");
        URL ventasblancoUrl = getClass().getResource("/icons/ventasblanco.png");
        URL ventasnegroUrl = getClass().getResource("/icons/ventasnegro.png");
        URL clientesblancoUrl = getClass().getResource("/icons/clientesblanco.png");
        URL clientesnegroUrl = getClass().getResource("/icons/clientesnegro.png");
        URL proveedoresblancoUrl = getClass().getResource("/icons/proveedoresblanco.png");
        URL proveedoresnegroUrl = getClass().getResource("/icons/proveedoresnegro.png");
        
        SolIcon = new ImageIcon(solUrl);
        LunaIcon = new ImageIcon(lunaUrl);
        LogoLetrasNegroIcon = new ImageIcon(logoletrasnegroUrl);
        LogoLetrasBlancoIcon = new ImageIcon(logoletrasblancoUrl);
        CasaBlancoIcon = new ImageIcon (casablancoUrl);
        CasaNegroIcon = new ImageIcon(casanegroUrl);
        GestionBlancoIcon = new ImageIcon(gestionblancoUrl);
        GestionNegroIcon = new ImageIcon(gestionnegroUrl);
        ComprasBlancoIcon = new ImageIcon(comprasblancoUrl);
        ComprasNegroIcon = new ImageIcon(comprasnegroUrl);
        VentasBlancoIcon = new ImageIcon(ventasblancoUrl);
        VentasNegroIcon =  new ImageIcon(ventasnegroUrl);
        ClientesBlancoIcon = new ImageIcon(clientesblancoUrl);
        ClientesNegroIcon = new ImageIcon(clientesnegroUrl);
        ProveedoresBlancoIcon = new ImageIcon(proveedoresblancoUrl);
        ProveedoresNegroIcon = new ImageIcon(proveedoresnegroUrl);
        
        initComponents();
        setLightMode(); 
        initContent();
    }
    
   public static dashboard getInstance() {
    if (instance == null) {
        instance = new dashboard(); // Crea la instancia si no existe
        instance.setVisible(true); // Muestra la ventana
    } else {
        instance.toFront(); // Lleva la ventana al frente si ya está abierta
    }
    return instance; // Devuelve la instancia
}
   
    
    private void styleButtonPrincipal(boolean isDarkMode) {
    btnPrinciapl.setHorizontalAlignment(SwingConstants.LEFT);
    btnPrinciapl.setHorizontalTextPosition(SwingConstants.RIGHT);
    btnPrinciapl.setVerticalTextPosition(SwingConstants.CENTER);
    btnPrinciapl.setIconTextGap(10); 
    //btnPrinciapl.setOpaque(true);  // Asegurarse de que sea opaco
    btnPrinciapl.putClientProperty("JButton.buttonType", "roundRect"); // Aplicar borde redondeado
    btnPrinciapl.setBackground(Color.yellow);
    
    if (isDarkMode) {
        btnPrinciapl.setIcon(CasaBlancoIcon);
    } else {
        btnPrinciapl.setIcon(CasaNegroIcon);
    }
}
    
    private void styleButtonGestiondeProductos(boolean isDarkMode) {
    btnGestiondeProductos.setHorizontalAlignment(SwingConstants.LEFT);
    btnGestiondeProductos.setHorizontalTextPosition(SwingConstants.RIGHT);
    btnGestiondeProductos.setVerticalTextPosition(SwingConstants.CENTER);
    btnGestiondeProductos.setIconTextGap(10); 
    
    if (isDarkMode) {
        btnGestiondeProductos.setIcon(GestionBlancoIcon);
    } else {
        btnGestiondeProductos.setIcon(GestionNegroIcon);
    }
}
    
    private void styleButtonCompras(boolean isDarkMode) {
        btnCompras.setHorizontalAlignment(SwingConstants.LEFT);
        btnCompras.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnCompras.setVerticalTextPosition(SwingConstants.CENTER);
        btnCompras.setIconTextGap(10); 

        if (isDarkMode) {
            btnCompras.setIcon(ComprasBlancoIcon);
        } else {
            btnCompras.setIcon(ComprasNegroIcon);
        }
    }
    
    private void styleButtonVentas(boolean isDarkMode) {
        btnVentas.setHorizontalAlignment(SwingConstants.LEFT);
        btnVentas.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnVentas.setVerticalTextPosition(SwingConstants.CENTER);
        btnVentas.setIconTextGap(10); 

        if (isDarkMode) {
            btnVentas.setIcon(VentasBlancoIcon);
        } else {
            btnVentas.setIcon(VentasNegroIcon);
        }
    }

    private void styleButtonClientes(boolean isDarkMode) {
        btnClientes.setHorizontalAlignment(SwingConstants.LEFT);
        btnClientes.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnClientes.setVerticalTextPosition(SwingConstants.CENTER);
        btnClientes.setIconTextGap(10); 

        if (isDarkMode) {
            btnClientes.setIcon(ClientesBlancoIcon);
        } else {
            btnClientes.setIcon(ClientesNegroIcon);
        }
    }
    
    private void styleButtonProveedores(boolean isDarkMode) {
        btnProveedores.setHorizontalAlignment(SwingConstants.LEFT);
        btnProveedores.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnProveedores.setVerticalTextPosition(SwingConstants.CENTER);
        btnProveedores.setIconTextGap(10); 

        if (isDarkMode) {
            btnProveedores.setIcon(ProveedoresBlancoIcon);
        } else {
            btnProveedores.setIcon(ProveedoresNegroIcon);
        }
    }
    
   private void initContent() {
       showJpanel(new Compras());
}
   
   public void showJpanel (JPanel p){
       // Configurar tamaño y ubicación del panel
    p.setPreferredSize(new Dimension(content.getWidth(), content.getHeight())); // Ajustar al tamaño de 'content'
    p.setLocation(0, 0);
    
    // Limpiar el panel anterior y agregar el nuevo
    content.removeAll();
    content.setLayout(new BorderLayout());  // Asegurarse de que 'content' usa BorderLayout
    content.add(p, BorderLayout.CENTER);   // Agregar el panel al centro
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
        content = new TiendaZapatos.PanelRound();
        datetext = new javax.swing.JLabel();
        PanelMenu = new javax.swing.JPanel();
        btnPrinciapl = new javax.swing.JButton();
        btnGestiondeProductos = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnCompras = new javax.swing.JButton();
        btnProveedores = new javax.swing.JButton();
        JToggleButton = new javax.swing.JButton();
        logoletras = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1060, 583));

        content.setBackground(new java.awt.Color(102, 0, 0));
        content.setRoundTopLeft(50);

        datetext.setText("Hoy es {dayname}  {day} de {mounth} del {year}");

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(datetext)
                .addContainerGap(493, Short.MAX_VALUE))
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(datetext, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(496, Short.MAX_VALUE))
        );

        PanelMenu.setBackground(new java.awt.Color(204, 0, 204));
        PanelMenu.setForeground(new java.awt.Color(102, 102, 102));

        btnPrinciapl.setBackground(new java.awt.Color(255, 102, 102));
        btnPrinciapl.setFont(new java.awt.Font("Rubik", 0, 12)); // NOI18N
        btnPrinciapl.setText("PRINCIPAL");
        btnPrinciapl.setBorder(null);
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

        btnGestiondeProductos.setFont(new java.awt.Font("Rubik", 0, 12)); // NOI18N
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

        btnVentas.setFont(new java.awt.Font("Rubik", 0, 12)); // NOI18N
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

        btnClientes.setFont(new java.awt.Font("Rubik", 0, 12)); // NOI18N
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

        btnCompras.setFont(new java.awt.Font("Rubik", 0, 12)); // NOI18N
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

        btnProveedores.setFont(new java.awt.Font("Rubik", 0, 12)); // NOI18N
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
                .addGroup(PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelMenuLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(logoletras, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelMenuLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnGestiondeProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                            .addComponent(btnPrinciapl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCompras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(PanelMenuLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(btnProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelMenuLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(JToggleButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelMenuLayout.setVerticalGroup(
            PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMenuLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(logoletras, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnPrinciapl, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGestiondeProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout BackGroundLayout = new javax.swing.GroupLayout(BackGround);
        BackGround.setLayout(BackGroundLayout);
        BackGroundLayout.setHorizontalGroup(
            BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackGroundLayout.createSequentialGroup()
                .addComponent(PanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BackGroundLayout.setVerticalGroup(
            BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
           btnPrinciapl.putClientProperty("JButton.buttonType", "roundRect"); // Aplicar borde redondeado

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

    
   
 
    
    public static void updatePanelColors(JPanel panel, Color backgroundColor, Color foregroundColor) {
        panel.setBackground(backgroundColor);
        for (java.awt.Component component : panel.getComponents()) {
            if (component instanceof JPanel jPanel) {
                jPanel.setBackground(backgroundColor);
                jPanel.setForeground(foregroundColor);
            updatePanelColors(jPanel, backgroundColor, foregroundColor);
            } else if (component instanceof JButton) {
            // Estiliza el botón
            JButton button = (JButton) component;
            button.setBackground(backgroundColor.darker()); // Cambia a un color más oscuro
            button.setForeground(foregroundColor);
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
            
            styleButtonPrincipal(false);
            styleButtonGestiondeProductos(false);
            styleButtonCompras(false);
            styleButtonVentas(false);
            styleButtonClientes(false);
            styleButtonProveedores(false);
            
            
            JToggleButton.setText("Light Mode");
            JToggleButton.setIcon(SolIcon);  // Cambia al icono de sol
            
            logoletras.setIcon(LogoLetrasNegroIcon); //Cambia las letras SHOERACK STORE de blanco a negro
            
            
            JToggleButton.setForeground(Color.WHITE);
            
            // Cambiar el color del PanelMenu
            setPanelColor(BackGround, 240, 240, 240);
            setPanelColor(PanelMenu, 240, 240, 240);
            
            
            //Cambiar El color del content que recibe
            // Actualizar el color de los paneles dentro de 'content'
            updatePanelColors(content, Color.getHSBColor(0.0f, 0.0f, 0.96f), Color.BLACK);
        });
    }

    private void setDarkMode() {
            EventQueue.invokeLater(() -> {
            FlatAnimatedLafChange.showSnapshot();
            FlatDarculaLaf.setup(); // Tema oscuro
            FlatLaf.updateUI();
            FlatAnimatedLafChange.hideSnapshotWithAnimation();
            
            
            styleButtonPrincipal(true);
            styleButtonGestiondeProductos(true);
            styleButtonCompras(true);
            styleButtonVentas(true);
            styleButtonClientes(true);
            styleButtonProveedores(true);
            
            // Actualizar botón
            JToggleButton.setText("Dark Mode");
            JToggleButton.setIcon(LunaIcon);  // Cambia al icono de luna
            
            logoletras.setIcon(LogoLetrasBlancoIcon);
            
            
            // Personalizar colores del botón para modo oscuro
            JToggleButton.setBackground(Color.DARK_GRAY);
            JToggleButton.setForeground(Color.WHITE);
            
            
            // Cambiar el color del fondo (background)
            setPanelColor(BackGround, 60, 63, 65);
            setPanelColor(PanelMenu, 60, 63, 65);
            
            //juepucha
            // Actualizar el color de los paneles dentro de 'content'
            updatePanelColors(content, Color.getHSBColor(0.9444f, 0.8846f, 0.1020f), Color.WHITE);
        });
    }
    
    //DEFINIR COLORES CON METODO
    private void setPanelColor(JPanel panel, int red, int green, int blue){
        panel.setBackground(new Color(red, green, blue));
    }
  
    
    public static void main(String args[]) {
        
        FlatRobotoFont.install();
        //UIManager.put("defaultFont", new Font (FlatRobotoFont.FAMILY, Font.PLAIN, 13));
        
        
        FlatIntelliJLaf.setup(); 
        UIManager.put("TextField.placeholderForeground", Color.GRAY); 
        
        // Abrir la ventana de login como primer paso
        java.awt.EventQueue.invokeLater(() -> {
             new login().setVisible(true);
        });
        
        
        java.awt.EventQueue.invokeLater(() -> {
            dashboard.getInstance().setVisible(true);
        });
        
    } 


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackGround;
    private javax.swing.JButton JToggleButton;
    private javax.swing.JPanel PanelMenu;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnCompras;
    private javax.swing.JButton btnGestiondeProductos;
    private javax.swing.JButton btnPrinciapl;
    private javax.swing.JButton btnProveedores;
    private javax.swing.JButton btnVentas;
    private TiendaZapatos.PanelRound content;
    private javax.swing.JLabel datetext;
    private javax.swing.JLabel logoletras;
    // End of variables declaration//GEN-END:variables
    }

