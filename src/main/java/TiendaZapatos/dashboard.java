package TiendaZapatos;

import java.awt.Dimension;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.extras.FlatAnimatedLafChange;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.time.LocalDate;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;
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
    private final ImageIcon LogoLetrasNegroIcon;
    private final ImageIcon LogoLetrasBlancoIcon;
    private final ImageIcon CasaIcon;
    private final ImageIcon CasaNegraIcon;
    private final ImageIcon GestionBlancoIcon;
    private final ImageIcon GestionNegroIcon;
    private final ImageIcon ComprasBlancoIcon;
    private final ImageIcon ComprasNegroIcon;
    private final ImageIcon SignoPesosBlancoIcon;
    private final ImageIcon SignoPesosNegroIcon;
    private final ImageIcon PersonaBlancoIcon;
    private final ImageIcon PersonaNegroIcon;
    private final ImageIcon ProveedoresBlancoIcon;
    private final ImageIcon ProveedoresNegroIcon;
    private ImageIcon icono;
    
   

    private static dashboard instance;
    
    private dashboard() {
        
        // Configurar la ventana
        setTitle("ShoesRack");
        setSize(800, 600);

        // Establecer el ícono
        Image logoImage = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/logozapato.png"));
        icono = new ImageIcon(logoImage); // Crear ImageIcon usando la variable icono
        setIconImage(icono.getImage()); // Establecer la imagen del ícono

        // Otras configuraciones de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        // Depuración de carga de recursos
        URL solUrl = getClass().getResource("/icons/sol.png");
        URL lunaUrl = getClass().getResource("/icons/luna.png");
        URL logoletrasnegroUrl = getClass().getResource("/images/logoletrasnegro.png");
        URL logoletrasblancoUrl = getClass().getResource("/images/logoletrasblanco.png");
        URL Casaurl = getClass ().getResource("/icons/casablanco.png");
        URL casanegraurl = getClass ().getResource("/icons/casanegro.png");
        URL gestionblancoUrl = getClass().getResource("/icons/gestionblanco.png");
        URL gestionnegroUrl = getClass().getResource("/icons/gestionnegro.png");
        URL comprasblancoUrl = getClass().getResource("/icons/comprasblanco.png");
        URL comprasnegroUrl = getClass().getResource("/icons/comprasnegro.png");
        URL signopesosblancoUrl = getClass().getResource("/icons/signopesosblanco.png");
        URL signopesosnegroUrl = getClass().getResource("/icons/signopesosnegro.png");
        URL personablancoUrl = getClass().getResource("/icons/personablanco.png");
        URL personanegroUrl = getClass().getResource("/icons/personanegro.png");
        URL proveedoresblancoUrl = getClass().getResource("/icons/proveedoresblanco.png");
        URL proveedoresnegroUrl = getClass().getResource("/icons/proveedoresnegro.png");
        
        SolIcon = new ImageIcon(solUrl);
        LunaIcon = new ImageIcon(lunaUrl);
        LogoLetrasNegroIcon = new ImageIcon(logoletrasnegroUrl);
        LogoLetrasBlancoIcon = new ImageIcon(logoletrasblancoUrl);
        CasaNegraIcon = new ImageIcon(casanegraurl);
        CasaIcon = new ImageIcon (Casaurl);
        GestionBlancoIcon = new ImageIcon(gestionblancoUrl);
        GestionNegroIcon = new ImageIcon(gestionnegroUrl);
        ComprasBlancoIcon = new ImageIcon(comprasblancoUrl);
        ComprasNegroIcon = new ImageIcon(comprasnegroUrl);
        SignoPesosBlancoIcon = new ImageIcon(signopesosblancoUrl);
        SignoPesosNegroIcon =  new ImageIcon(signopesosnegroUrl);
        PersonaBlancoIcon = new ImageIcon(personablancoUrl);
        PersonaNegroIcon = new ImageIcon(personanegroUrl);
        ProveedoresBlancoIcon = new ImageIcon(proveedoresblancoUrl);
        ProveedoresNegroIcon = new ImageIcon(proveedoresnegroUrl);
        
        initComponents();
        setLightMode(); 
        SetDate();
        initContent();
        
      
       
    }
    
    // Método público estático para obtener la única instancia
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
    btnPrinciapl.setOpaque(true);  // Asegurarse de que sea opaco
    btnPrinciapl.putClientProperty("JButton.buttonType", "roundRect"); // Aplicar borde redondeado
    btnPrinciapl.setBackground(Color.yellow);
    
    if (isDarkMode) {
        btnPrinciapl.setIcon(CasaIcon);
    } else {
        btnPrinciapl.setIcon(CasaNegraIcon);
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
        btnVentas.setIcon(SignoPesosBlancoIcon);
    } else {
        btnVentas.setIcon(SignoPesosNegroIcon);
    }
}
    
    private void styleButtonClientes(boolean isDarkMode) {
    btnClientes.setHorizontalAlignment(SwingConstants.LEFT);
    btnClientes.setHorizontalTextPosition(SwingConstants.RIGHT);
    btnClientes.setVerticalTextPosition(SwingConstants.CENTER);
    btnClientes.setIconTextGap(10); 
    
    if (isDarkMode) {
        btnClientes.setIcon(PersonaBlancoIcon);
    } else {
        btnClientes.setIcon(PersonaNegroIcon);
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

    public static void updateTableColors(JPanel panel, Color backgroundColor, Color foregroundColor) {
        for (java.awt.Component component : panel.getComponents()) {
            if (component instanceof JTable) {
                JTable table = (JTable) component;
                table.setBackground(backgroundColor);
                table.setForeground(foregroundColor);
                table.setGridColor(foregroundColor); // Cambia el color de la cuadrícula si es necesario
                // Cambiar colores en el modelo de tabla (por ejemplo, en las celdas)
                table.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
                    @Override
                    public Component getTableCellRendererComponent(JTable table, Object value, 
                                                                   boolean isSelected, boolean hasFocus, 
                                                                   int row, int column) {
                        Component cell = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                        cell.setBackground(isSelected ? backgroundColor.darker() : backgroundColor); // Cambia el color de fondo
                        cell.setForeground(foregroundColor); // Cambia el color de texto
                        return cell;
                    }
                });
            } else if (component instanceof JPanel) {
                // Llama recursivamente si el componente es un JPanel
                updateTableColors((JPanel) component, backgroundColor, foregroundColor);
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
                updatePanelColors(content, Color.getHSBColor(0.3966f, 0.1000f, 1.0000f), Color.BLACK);
                updateTableColors(content, Color.getHSBColor(0.3966f, 0.1000f, 1.0000f), Color.BLACK);
            }
        });
    }

    private void setDarkMode() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
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
                updateTableColors(content, Color.getHSBColor(0.3966f, 0.1000f, 1.0000f), Color.WHITE);
            }
        });
    }
    
    //DEFINIR COLORES CON METODO
    private void setPanelColor(JPanel panel, int red, int green, int blue){
        panel.setBackground(new Color(red, green, blue));
    }
  
    
    
    
    public static void main(String args[]) {
        
        FlatRobotoFont.install();
        UIManager.put("defaultFont", new Font (FlatRobotoFont.FAMILY, Font.PLAIN, 13));
        
        
        FlatIntelliJLaf.setup(); 
        UIManager.put("TextField.placeholderForeground", Color.GRAY); 
        
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
    private javax.swing.JLabel lbTitle;
    private javax.swing.JLabel lbTitle1;
    private javax.swing.JLabel logoletras;
    private javax.swing.JPanel panelTitle;
    private javax.swing.JPanel panelTitle1;
    // End of variables declaration//GEN-END:variables
    }

