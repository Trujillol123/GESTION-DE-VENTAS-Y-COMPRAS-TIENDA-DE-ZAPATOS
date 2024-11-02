package TiendaZapatos;


import CustomComponents.RoundedBorder;
import com.formdev.flatlaf.intellijthemes.FlatArcIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatCarbonIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatGruvboxDarkHardIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatMaterialDesignDarkIJTheme;
import java.awt.Color;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import views.login;

/* @author David Grijalba  */

public class dashboard2 extends javax.swing.JFrame {
    
    // Cargar todos los iconos usados con rutas absoluta
    private final ImageIcon ShoeRackBlancoIcon;
    private final ImageIcon ShoeRackNegroIcon;
    private final ImageIcon LogoBussinessBlancoIcon;
    private final ImageIcon LogoBussinessNegroIcon;
    
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
    
    private final ImageIcon LogoutBlancoIcon;
    private final ImageIcon LogoutNegroIcon;
    
    private final ImageIcon AuricularesBlancoIcon;
    private final ImageIcon AuricularesNegroIcon;
    
    private static dashboard2 instance;
    
    // Crear form dashboard2
    private dashboard2() {
        
        // Configuración de la ventana dashboard2
        setTitle("BussinessManagement v1.1");
        setSize(900, 540);
        setLocationRelativeTo(null);
        setVisible(true);
        //setExtendedState(JFrame.ICONIFIED);
        //setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        
        // Depuración de carga de recursos
        URL shoerackblancoUrl = getClass ().getResource("/images/ShoeRackBlanco.png");
        URL shoeracknegroUrl = getClass ().getResource("/images/ShoeRackNegro.png");
        URL logobussinessblancoUrl = getClass ().getResource("/icons/logobussinessblanco.png");
        URL logobussinessnegroUrl = getClass ().getResource("/icons/logobussinessnegro.png");
        
        
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
        
        URL logoutblancoUrl = getClass().getResource("/icons/logoutblanco.png");
        URL logoutnegroUrl = getClass().getResource("/icons/logoutnegro.png");
        
        URL auricularesblancoUrl = getClass().getResource("/icons/auricularesblanco.png");
        URL auricularesnegroUrl = getClass().getResource("/icons/auricularesnegro.png");
        
        ShoeRackBlancoIcon = new ImageIcon (shoerackblancoUrl);
        ShoeRackNegroIcon = new ImageIcon (shoeracknegroUrl);
        LogoBussinessBlancoIcon = new ImageIcon (logobussinessblancoUrl);
        LogoBussinessNegroIcon = new ImageIcon (logobussinessnegroUrl);
        
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
        
        LogoutBlancoIcon = new ImageIcon(logoutblancoUrl);
        LogoutNegroIcon = new ImageIcon(logoutnegroUrl);
        
        AuricularesBlancoIcon = new ImageIcon(auricularesblancoUrl);
        AuricularesNegroIcon = new ImageIcon(auricularesnegroUrl);
        
        /*
        // Mostrar programa en pantalla completa
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice gd = ge.getDefaultScreenDevice();
        
        // Verificar si el dispositivo soporta modo de pantalla completa
        if (gd.isFullScreenSupported()) {
            // Configurar la ventana para pantalla completa
            gd.setFullScreenWindow(this);
        } else {
            // Si no se soporta, simplemente mostrar la ventana normalmente
            setSize(900, 550);
            setLocationRelativeTo(null);
            setVisible(true);
        } */
        
        // Metodo predeterminado para iniciar los componentes
        initComponents();
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
    
    private void styleButtonPrincipal(boolean isDarkMode) {
        btnPrincipal.setHorizontalAlignment(SwingConstants.LEFT);
        btnPrincipal.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnPrincipal.setVerticalTextPosition(SwingConstants.CENTER);
        btnPrincipal.setIconTextGap(15); 
        btnPrincipal.setOpaque(true);
        
        if (isDarkMode) {
            btnPrincipal.setIcon(CasaBlancoIcon);
        } else {
            btnPrincipal.setIcon(CasaNegroIcon);
        }
    }
    
    private void styleButtonGestion(boolean isDarkMode) {
        btnGestion.setHorizontalAlignment(SwingConstants.LEFT);
        btnGestion.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnGestion.setVerticalTextPosition(SwingConstants.CENTER);
        btnGestion.setIconTextGap(15); 

        if (isDarkMode) {
            btnGestion.setIcon(GestionBlancoIcon);
        } else {
            btnGestion.setIcon(GestionNegroIcon);
        }
    }
    
    private void styleButtonCompras(boolean isDarkMode) {
        btnCompras.setHorizontalAlignment(SwingConstants.LEFT);
        btnCompras.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnCompras.setVerticalTextPosition(SwingConstants.CENTER);
        btnCompras.setIconTextGap(15); 

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
        btnVentas.setIconTextGap(15); 

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
        btnClientes.setIconTextGap(15); 

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
        btnProveedores.setIconTextGap(15); 

        if (isDarkMode) {
            btnProveedores.setIcon(ProveedoresBlancoIcon);
        } else {
            btnProveedores.setIcon(ProveedoresNegroIcon);
        }
    }
    
    private void styleButtonLogout(boolean isDarkMode) {
        btnLogout.setIconTextGap(15); 

        if (isDarkMode) {
            btnLogout.setIcon(LogoutBlancoIcon);
        } else {
            btnLogout.setIcon(LogoutNegroIcon);
        }
    }
    
    private void styleLabelNombreEmpresa(boolean isDarkMode) {
        
        nombreEmpresa.setVerticalTextPosition(SwingConstants.CENTER);
        nombreEmpresa.setIconTextGap(15); 

        if (isDarkMode) {
            nombreEmpresa.setIcon(ShoeRackBlancoIcon);
        } else {
            nombreEmpresa.setIcon(ShoeRackNegroIcon);
        }
    }
    
    private void styleLabelNombrePrograma(boolean isDarkMode) {
        
        nombrePrograma.setForeground(Color.WHITE);
        nombrePrograma.setIconTextGap(15); 

        if (isDarkMode) {
            nombrePrograma.setIcon(LogoBussinessBlancoIcon);
            nombrePrograma.setForeground(Color.WHITE);
        } else {
            nombrePrograma.setIcon(LogoBussinessNegroIcon);
            nombrePrograma.setForeground(Color.BLACK);
        }
    }
    
    private void styleLabelUsuarioPerfil(boolean isDarkMode) {
        
        usuarioPerfil.setIconTextGap(15); 

        if (isDarkMode) {
            usuarioPerfil.setIcon(AuricularesBlancoIcon);
        } else {
            usuarioPerfil.setIcon(AuricularesNegroIcon);
        }
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackGround = new javax.swing.JPanel();
        PanelMenu = new javax.swing.JPanel();
        btnLogout = new javax.swing.JButton();
        btnPrincipal = new javax.swing.JButton();
        btnGestion = new javax.swing.JButton();
        btnCompras = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnProveedores = new javax.swing.JButton();
        nombrePrograma = new javax.swing.JLabel();
        nombreEmpresa = new javax.swing.JLabel();
        usuarioPerfil = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        panelDerecho = new TiendaZapatos.GradientPanel();
        content = new javax.swing.JPanel();
        jSeparator5 = new javax.swing.JSeparator();
        lblFecha = new javax.swing.JLabel();
        MenuBar = new javax.swing.JMenuBar();
        MenuFile = new javax.swing.JMenu();
        MenuThemes = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        GruvboxDarkHard = new javax.swing.JMenuItem();
        MaterialDesignDark = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));

        BackGround.setBackground(new java.awt.Color(102, 0, 0));
        BackGround.setOpaque(false);

        PanelMenu.setBackground(new java.awt.Color(0, 0, 102));
        PanelMenu.setOpaque(false);
        PanelMenu.setPreferredSize(new java.awt.Dimension(260, 502));

        btnLogout.setFont(new java.awt.Font("Rubik", 0, 12)); // NOI18N
        btnLogout.setText("Log Out");
        btnLogout.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogout.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnLogout.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnLogout.setMaximumSize(new java.awt.Dimension(250, 35));
        btnLogout.setMinimumSize(new java.awt.Dimension(250, 35));
        btnLogout.setPreferredSize(new java.awt.Dimension(250, 35));
        btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLogoutMouseExited(evt);
            }
        });
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnPrincipal.setFont(new java.awt.Font("Rubik", 0, 12)); // NOI18N
        btnPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/casablanco.png"))); // NOI18N
        btnPrincipal.setText("Principal");
        btnPrincipal.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPrincipal.setPreferredSize(new java.awt.Dimension(250, 35));
        btnPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrincipalActionPerformed(evt);
            }
        });

        btnGestion.setFont(new java.awt.Font("Rubik", 0, 12)); // NOI18N
        btnGestion.setText("Gestion de productos");
        btnGestion.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnGestion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnGestion.setPreferredSize(new java.awt.Dimension(250, 35));
        btnGestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionActionPerformed(evt);
            }
        });

        btnCompras.setFont(new java.awt.Font("Rubik", 0, 12)); // NOI18N
        btnCompras.setText("Compras");
        btnCompras.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCompras.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCompras.setPreferredSize(new java.awt.Dimension(250, 35));
        btnCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprasActionPerformed(evt);
            }
        });

        btnVentas.setFont(new java.awt.Font("Rubik", 0, 12)); // NOI18N
        btnVentas.setText("Ventas");
        btnVentas.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnVentas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnVentas.setPreferredSize(new java.awt.Dimension(250, 35));
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });

        btnClientes.setFont(new java.awt.Font("Rubik", 0, 12)); // NOI18N
        btnClientes.setText("Clientes");
        btnClientes.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnClientes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnClientes.setPreferredSize(new java.awt.Dimension(250, 35));
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        btnProveedores.setFont(new java.awt.Font("Rubik", 0, 12)); // NOI18N
        btnProveedores.setText("Proveedores");
        btnProveedores.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnProveedores.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnProveedores.setPreferredSize(new java.awt.Dimension(250, 35));
        btnProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedoresActionPerformed(evt);
            }
        });

        nombrePrograma.setFont(new java.awt.Font("Rubik", 0, 12)); // NOI18N
        nombrePrograma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombrePrograma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bussinesslogo_blanco.png"))); // NOI18N
        nombrePrograma.setText("   BUSSINESS MANAGEMENT");
        nombrePrograma.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        nombrePrograma.setPreferredSize(new java.awt.Dimension(250, 45));

        nombreEmpresa.setBackground(new java.awt.Color(255, 153, 153));
        nombreEmpresa.setMaximumSize(new java.awt.Dimension(250, 50));
        nombreEmpresa.setMinimumSize(new java.awt.Dimension(250, 50));
        nombreEmpresa.setPreferredSize(new java.awt.Dimension(250, 50));

        usuarioPerfil.setFont(new java.awt.Font("Rubik", 0, 12)); // NOI18N
        usuarioPerfil.setText("David");

        javax.swing.GroupLayout PanelMenuLayout = new javax.swing.GroupLayout(PanelMenu);
        PanelMenu.setLayout(PanelMenuLayout);
        PanelMenuLayout.setHorizontalGroup(
            PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMenuLayout.createSequentialGroup()
                .addGroup(PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelMenuLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGestion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCompras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(usuarioPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(PanelMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nombrePrograma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nombreEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator2)
                            .addComponent(jSeparator3))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        PanelMenuLayout.setVerticalGroup(
            PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMenuLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(nombrePrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(nombreEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnGestion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnCompras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(usuarioPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        panelDerecho.setColor1(new java.awt.Color(6, 20, 27));
        panelDerecho.setColor2(new java.awt.Color(37, 55, 69));

        content.setBackground(new java.awt.Color(0, 51, 51));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        lblFecha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/calendarioblanco.png"))); // NOI18N
        lblFecha.setText("02/11/2024  ");
        lblFecha.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout panelDerechoLayout = new javax.swing.GroupLayout(panelDerecho);
        panelDerecho.setLayout(panelDerechoLayout);
        panelDerechoLayout.setHorizontalGroup(
            panelDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDerechoLayout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jSeparator5, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelDerechoLayout.setVerticalGroup(
            panelDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDerechoLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout BackGroundLayout = new javax.swing.GroupLayout(BackGround);
        BackGround.setLayout(BackGroundLayout);
        BackGroundLayout.setHorizontalGroup(
            BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackGroundLayout.createSequentialGroup()
                .addComponent(PanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelDerecho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BackGroundLayout.setVerticalGroup(
            BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelDerecho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        MenuBar.setFont(new java.awt.Font("Rubik Medium", 0, 12)); // NOI18N
        MenuBar.setMargin(new java.awt.Insets(10, 10, 10, 10));
        MenuBar.setPreferredSize(new java.awt.Dimension(118, 38));

        MenuFile.setText("File");
        MenuBar.add(MenuFile);

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

        jMenuItem2.setText("Arc");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        MenuThemes.add(jMenuItem2);

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

        setSize(new java.awt.Dimension(916, 548));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    
    private void GruvboxDarkHardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GruvboxDarkHardActionPerformed
        SwingUtilities.invokeLater(()->{
            
            try {
                UIManager.setLookAndFeel(new FlatGruvboxDarkHardIJTheme());
                SwingUtilities.updateComponentTreeUI(this);
            } catch (UnsupportedLookAndFeelException ex) {
                Logger.getLogger(dashboard2.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        });
        
        styleButtonPrincipal(true);
        styleButtonGestion(true);
        styleButtonCompras(true);
        styleButtonVentas(true);
        styleButtonClientes(true);
        styleButtonProveedores(true);
        styleButtonLogout(true);
        styleLabelNombreEmpresa(true);
        styleLabelNombrePrograma(true);
        styleLabelUsuarioPerfil(true);
        
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
        
        styleButtonPrincipal(true);
        styleButtonGestion(true);
        styleButtonCompras(true);
        styleButtonVentas(true);
        styleButtonClientes(true);
        styleButtonProveedores(true);
        styleButtonLogout(true);
        styleLabelNombreEmpresa(true);
        styleLabelNombrePrograma(true);
        styleLabelUsuarioPerfil(true);
        
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
        
        styleButtonPrincipal(true);
        styleButtonGestion(true);
        styleButtonCompras(true);
        styleButtonVentas(true);
        styleButtonClientes(true);
        styleButtonProveedores(true);
        styleButtonLogout(true);
        styleLabelNombreEmpresa(true);
        styleLabelNombrePrograma(true);
        styleLabelUsuarioPerfil(true);
        
        // Quitar foco de todos los botones
        PanelMenu.requestFocusInWindow();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnComprasActionPerformed

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVentasActionPerformed

    private void btnGestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGestionActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProveedoresActionPerformed

    private void btnPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrincipalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPrincipalActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        SwingUtilities.invokeLater(()->{
            
            try {
                UIManager.setLookAndFeel(new FlatArcIJTheme());
                SwingUtilities.updateComponentTreeUI(this);
            } catch (UnsupportedLookAndFeelException ex) {
                Logger.getLogger(dashboard2.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        });
        
        styleButtonPrincipal(false);
        styleButtonGestion(false);
        styleButtonCompras(false);
        styleButtonVentas(false);
        styleButtonClientes(false);
        styleButtonProveedores(false);
        styleButtonLogout(false);
        styleLabelNombreEmpresa(false);
        styleLabelNombrePrograma(false);
        styleLabelUsuarioPerfil(false);
        
        // Quitar foco de todos los botones
        PanelMenu.requestFocusInWindow();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void btnLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseEntered
        btnLogout.setForeground(Color.RED);
    }//GEN-LAST:event_btnLogoutMouseEntered

    private void btnLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseExited
        btnLogout.setForeground(btnPrincipal.getForeground());
    }//GEN-LAST:event_btnLogoutMouseExited

    public static void main(String args[]) {
        
        FlatCarbonIJTheme.setup();
        
        //FlatRobotoFont.install();
        //UIManager.put("defaultFont", new Font (FlatRobotoFont.FAMILY, Font.PLAIN, 13));
        
        
        //FlatIntelliJLaf.setup(); 
        //UIManager.put("TextField.placeholderForeground", Color.GRAY); 
        
        
        // Abrir la ventana de login como primer paso
        java.awt.EventQueue.invokeLater(() -> {
             new login().setVisible(true);
        });
        
        /*
            java.awt.EventQueue.invokeLater(() -> {
            dashboard2.getInstance().setVisible(true);
        }); */
        
    }
    
    // Metodo para cambiar estilo de componentes
    private void initStyle() {
        
        // Estilo menu lateral izquierdo
        //RoundedMenu.setBorder(new RoundedBorder(40));
        //RoundedMenu.setBackground(new java.awt.Color(255,255,255,15));
        
        // Especificacion
        //PanelCabezera.setBorder(new RoundedBorder(30));
        //PanelCabezera.setBackground(new java.awt.Color(0,0,0,1));
        
        // Estilo botones del PanelMenu al inicializar el programa
        nombrePrograma.setForeground(Color.WHITE);
        nombrePrograma.setIcon(LogoBussinessBlancoIcon);
        nombrePrograma.setIconTextGap(15);
        
        nombreEmpresa.setIcon(ShoeRackBlancoIcon);
        nombreEmpresa.setIconTextGap(15);
        
        btnPrincipal.setBackground(new java.awt.Color(0,0,0,1));
        btnPrincipal.setIcon(CasaBlancoIcon);
        btnPrincipal.setIconTextGap(15); 
        
        btnGestion.setBackground(new java.awt.Color(0,0,0,1));
        btnGestion.setIcon(GestionBlancoIcon);
        btnGestion.setIconTextGap(15); 
        
        btnCompras.setBackground(new java.awt.Color(0,0,0,1));
        btnCompras.setIcon(ComprasBlancoIcon);
        btnCompras.setIconTextGap(15); 
        
        btnVentas.setBackground(new java.awt.Color(0,0,0,1));
        btnVentas.setIcon(VentasBlancoIcon);
        btnVentas.setIconTextGap(15); 
        
        btnClientes.setBackground(new java.awt.Color(0,0,0,1));
        btnClientes.setIcon(ClientesBlancoIcon);
        btnClientes.setIconTextGap(15); 
        
        btnProveedores.setBackground(new java.awt.Color(0,0,0,1));
        btnProveedores.setIcon(ProveedoresBlancoIcon);
        btnProveedores.setIconTextGap(15);
        
        btnLogout.setBackground(new java.awt.Color(0,0,0,1));
        btnLogout.setIcon(LogoutBlancoIcon);
        btnLogout.setIconTextGap(15);
        
        usuarioPerfil.setIcon(AuricularesBlancoIcon);
        usuarioPerfil.setIconTextGap(15);
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackGround;
    private javax.swing.JMenuItem GruvboxDarkHard;
    private javax.swing.JMenuItem MaterialDesignDark;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenu MenuFile;
    private javax.swing.JMenu MenuThemes;
    private javax.swing.JPanel PanelMenu;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnCompras;
    private javax.swing.JButton btnGestion;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnPrincipal;
    private javax.swing.JButton btnProveedores;
    private javax.swing.JButton btnVentas;
    private javax.swing.JPanel content;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel nombreEmpresa;
    private javax.swing.JLabel nombrePrograma;
    private TiendaZapatos.GradientPanel panelDerecho;
    private javax.swing.JLabel usuarioPerfil;
    // End of variables declaration//GEN-END:variables
}
