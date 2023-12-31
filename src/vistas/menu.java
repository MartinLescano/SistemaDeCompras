
package vistas;

import accesoADatos.CompraData;
import accesoADatos.DetalleCompraData;
import accesoADatos.ProductoData;
import accesoADatos.ProveedorData;
import entidades.DetalleCompra;
import entidades.Producto;
import entidades.Proveedor;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;


public class menu extends javax.swing.JFrame {

    ProductoData pro = new ProductoData();
    DetalleCompraData dCompra = new DetalleCompraData();

    private DefaultTableModel modelo2 = new DefaultTableModel() {
        public boolean isCellEditable(int row, int column) {
            if (column == 0) {
                return false;
            } else if (column == 1) {
                return false;
            } else if (column == 2) {
                return false;
            } else if (column == 3) {
                return false;
            } else if (column == 4) {
                return false;
            } else if (column == 5) {
                return false;
            } else if (column == 6) {
                return false;
            } else if (column == 7) {
                return false;
            } else {
                return true;
            }
        }
    };

    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int row, int column) {
            if (column == 0) {
                return false;
            } else if (column == 1) {
                return false;
            } else if (column == 2) {
                return false;
            } else if (column == 3) {
                return false;
            } else if (column == 4) {
                return false;
            } else if (column == 5) {
                return false;
            } else {
                return true;
            }
        }
    };

    private DefaultTableModel modelo1 = new DefaultTableModel() {
        public boolean isCellEditable(int row, int column) {
            if (column == 0) {
                return false;
            } else if (column == 1) {
                return false;
            } else if (column == 2) {
                return false;
            } else if (column == 3) {
                return false;
            } else {
                return true;
            }
        }
    };

    /**
     * Creates new form menu
     */
    public menu() {
        initComponents();
        cargarCabeceraListarDetalle();
        cargarCabezera();
        cargarTabla();
        cargarCabezeraProve();
        cargarTablaProve();
        cargarComboProve();
        cargarComboProdu();
        jbBorrar.setEnabled(false);

        ImageIcon icono = new ImageIcon(getClass().getResource("/imagenes/logoicono.png"));
        setIconImage(icono.getImage());

        jlFecha.setText(fechaActual());
        imaCompra.setVisible(false);
        imaProductos.setVisible(false);
        columnasProductos();
        columnasProveedor();
        columnasCompras();

        SwingUtilities.invokeLater(() -> {
            PanelProducto.setVisible(true);
            revisionDeStock();
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuPrincipal = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jpBotonProductos = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jpBotonSalir = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jpBotonCompra = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jpBotonProveedores = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jpBotonConsultas = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        PanelProducto = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtNombreProducto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtablaProducto = new javax.swing.JTable();
        jBEliminar = new javax.swing.JButton();
        jBModificar = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jCCategoria = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        jtDescripcion = new javax.swing.JTextField();
        jBGuardarProdu = new javax.swing.JButton();
        jBLimpiarProdu = new javax.swing.JButton();
        PanelProveedores = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jtRazonSocial = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jtTelefonoProveedor = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtablaProveedor = new javax.swing.JTable();
        jBEliminarprove = new javax.swing.JButton();
        jBModificarProve = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jtDomicilioProveedor = new javax.swing.JTextField();
        jBGuardarProve = new javax.swing.JButton();
        jBLimpiarPro = new javax.swing.JButton();
        PanelCompra = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtDetalleCompra = new javax.swing.JTable();
        jlFecha = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jcProducto = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jcProveedor1 = new javax.swing.JComboBox<>();
        btnComprar = new javax.swing.JButton();
        jTCantidad = new javax.swing.JTextField();
        jTPrecioCompra = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        btnAgregarACarrito = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        JLTotalAPagar = new javax.swing.JLabel();
        jbBorrar = new javax.swing.JButton();
        PanelConsultas = new javax.swing.JPanel();
        botonConsultaCom = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        botonConsultaPro = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        imaProductos = new javax.swing.JLabel();
        imaCompra = new javax.swing.JLabel();
        fondoconsul = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        menuPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ELECTRONICS");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 320, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/m_pvmlogonew.jpg"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 130));

        menuPrincipal.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 130));

        jLabel8.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("SISTEMA DE COMPRA");
        menuPrincipal.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 830, -1));

        jPanel1.setBackground(new java.awt.Color(6, 60, 140));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpBotonProductos.setBackground(new java.awt.Color(6, 60, 130));
        jpBotonProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpBotonProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpBotonProductosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpBotonProductosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpBotonProductosMouseExited(evt);
            }
        });
        jpBotonProductos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(204, 204, 255));
        jLabel2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PRODUCTOS");
        jpBotonProductos.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 320, 20));

        jPanel1.add(jpBotonProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 320, 70));

        jpBotonSalir.setBackground(new java.awt.Color(6, 60, 130));
        jpBotonSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpBotonSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpBotonSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpBotonSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpBotonSalirMouseExited(evt);
            }
        });
        jpBotonSalir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("SALIR");
        jpBotonSalir.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 27, 310, -1));

        jPanel1.add(jpBotonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 320, 70));

        jpBotonCompra.setBackground(new java.awt.Color(6, 60, 130));
        jpBotonCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpBotonCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpBotonCompraMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpBotonCompraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpBotonCompraMouseExited(evt);
            }
        });
        jpBotonCompra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("COMPRA DE PRODUCTOS");
        jpBotonCompra.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 320, 20));

        jPanel1.add(jpBotonCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 320, 70));

        jpBotonProveedores.setBackground(new java.awt.Color(6, 60, 130));
        jpBotonProveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpBotonProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpBotonProveedoresMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpBotonProveedoresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpBotonProveedoresMouseExited(evt);
            }
        });
        jpBotonProveedores.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("PROVEEDORES");
        jpBotonProveedores.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 320, 20));

        jPanel1.add(jpBotonProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 320, 70));

        jpBotonConsultas.setBackground(new java.awt.Color(6, 60, 130));
        jpBotonConsultas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpBotonConsultas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpBotonConsultasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpBotonConsultasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpBotonConsultasMouseExited(evt);
            }
        });
        jpBotonConsultas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("CONSULTAS");
        jpBotonConsultas.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 27, 310, -1));

        jPanel1.add(jpBotonConsultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 320, 70));

        menuPrincipal.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 320, 510));

        jTabbedPane1.setBackground(new java.awt.Color(6, 60, 130));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTabbedPane1.setForeground(new java.awt.Color(6, 60, 130));
        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.setEnabled(false);

        PanelProducto.setBackground(new java.awt.Color(255, 255, 255));
        PanelProducto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("NOMBRE DEL PRODUCTO:");
        PanelProducto.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 190, -1));

        jLabel15.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("DESCRIPCION:");
        jLabel15.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        PanelProducto.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 100, 20));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel9.setText("_____________________________________________________");
        PanelProducto.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 390, 20));

        jtNombreProducto.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jtNombreProducto.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtNombreProducto.setBorder(null);
        PanelProducto.add(jtNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 390, -1));

        jtablaProducto.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jtablaProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtablaProducto.setGridColor(new java.awt.Color(204, 204, 204));
        jtablaProducto.setRowHeight(30);
        jtablaProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtablaProductoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtablaProducto);
        if (jtablaProducto.getColumnModel().getColumnCount() > 0) {
            jtablaProducto.getColumnModel().getColumn(0).setPreferredWidth(10);
        }

        PanelProducto.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 830, 200));

        jBEliminar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jBEliminar.setText("ELIMINAR");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });
        PanelProducto.add(jBEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 140, -1));

        jBModificar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jBModificar.setText("MODIFICAR");
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });
        PanelProducto.add(jBModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 430, 140, -1));

        jLabel25.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 51, 51));
        jLabel25.setText("CATEGORIA :");
        PanelProducto.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 90, -1));

        jCCategoria.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jCCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Categoria", "TV y AUDIO", "TECNOLOGIA", "ELECTROHOGAR" }));
        PanelProducto.add(jCCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 220, 40));

        jLabel32.setBackground(new java.awt.Color(255, 255, 255));
        jLabel32.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel32.setText("__________________________________________________________________");
        PanelProducto.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 490, 20));

        jtDescripcion.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jtDescripcion.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtDescripcion.setBorder(null);
        PanelProducto.add(jtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 470, -1));

        jBGuardarProdu.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jBGuardarProdu.setText("Guardar");
        jBGuardarProdu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarProduActionPerformed(evt);
            }
        });
        PanelProducto.add(jBGuardarProdu, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 40, 140, 40));

        jBLimpiarProdu.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jBLimpiarProdu.setText("Limpiar");
        jBLimpiarProdu.setMaximumSize(new java.awt.Dimension(82, 33));
        jBLimpiarProdu.setMinimumSize(new java.awt.Dimension(82, 33));
        jBLimpiarProdu.setPreferredSize(new java.awt.Dimension(82, 33));
        jBLimpiarProdu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarProduActionPerformed(evt);
            }
        });
        PanelProducto.add(jBLimpiarProdu, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 120, 140, 40));

        jTabbedPane1.addTab("Producto", PanelProducto);

        PanelProveedores.setBackground(new java.awt.Color(255, 255, 255));
        PanelProveedores.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel13.setText("______________________________________________________");
        PanelProveedores.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 380, 40));

        jtRazonSocial.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jtRazonSocial.setBorder(null);
        PanelProveedores.add(jtRazonSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 390, -1));

        jLabel17.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("RAZON SOCIAL:");
        PanelProveedores.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 110, -1));

        jLabel22.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 51, 51));
        jLabel22.setText("DOMICILIO:");
        PanelProveedores.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 80, -1));

        jLabel23.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel23.setText("___________________");
        PanelProveedores.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 140, 20));

        jtTelefonoProveedor.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jtTelefonoProveedor.setBorder(null);
        PanelProveedores.add(jtTelefonoProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 140, -1));

        jLabel24.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 51, 51));
        jLabel24.setText("TELEFONO:");
        PanelProveedores.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 80, -1));

        jtablaProveedor.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jtablaProveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtablaProveedor.setGridColor(new java.awt.Color(204, 204, 204));
        jtablaProveedor.setRowHeight(30);
        jtablaProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtablaProveedorMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtablaProveedor);

        PanelProveedores.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 830, 230));

        jBEliminarprove.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jBEliminarprove.setText("ELIMINAR");
        jBEliminarprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarproveActionPerformed(evt);
            }
        });
        PanelProveedores.add(jBEliminarprove, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 140, -1));

        jBModificarProve.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jBModificarProve.setText("MODIFICAR");
        jBModificarProve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarProveActionPerformed(evt);
            }
        });
        PanelProveedores.add(jBModificarProve, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 430, 140, -1));

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel18.setText("___________________________________________________________");
        PanelProveedores.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 430, 40));

        jtDomicilioProveedor.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jtDomicilioProveedor.setBorder(null);
        PanelProveedores.add(jtDomicilioProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 400, -1));

        jBGuardarProve.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jBGuardarProve.setText("Guardar");
        jBGuardarProve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarProveActionPerformed(evt);
            }
        });
        PanelProveedores.add(jBGuardarProve, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 30, 140, 40));

        jBLimpiarPro.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jBLimpiarPro.setText("Limpiar");
        jBLimpiarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarProActionPerformed(evt);
            }
        });
        PanelProveedores.add(jBLimpiarPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 110, 140, 40));

        jTabbedPane1.addTab("Proveedores", PanelProveedores);

        PanelCompra.setBackground(new java.awt.Color(255, 255, 255));
        PanelCompra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtDetalleCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtDetalleCompra.setRowHeight(30);
        jScrollPane3.setViewportView(jtDetalleCompra);

        PanelCompra.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 830, 140));

        jlFecha.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jlFecha.setAlignmentY(0.0F);
        jlFecha.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(102, 102, 102)));
        PanelCompra.add(jlFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 40, 170, 30));

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel10.setText("  FECHA DE COMPRA");
        PanelCompra.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, 150, -1));

        jcProducto.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jcProducto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PanelCompra.add(jcProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 320, 30));

        jLabel11.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel11.setText("PRODUCTO:");
        PanelCompra.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 100, 30));

        jLabel12.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel12.setText("PROVEEDOR:");
        PanelCompra.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 27, 100, 30));

        jcProveedor1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jcProveedor1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PanelCompra.add(jcProveedor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 320, 30));

        btnComprar.setText("COMPRAR");
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });
        PanelCompra.add(btnComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 400, 170, -1));

        jTCantidad.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        PanelCompra.add(jTCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 80, 30));

        jTPrecioCompra.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        PanelCompra.add(jTPrecioCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 80, 30));

        jLabel20.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel20.setText("CANTIDAD:");
        PanelCompra.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel26.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel26.setText("PRECIO COMPRA:");
        PanelCompra.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, -1, 20));

        btnAgregarACarrito.setText("AGREGAR A CARRITO");
        btnAgregarACarrito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarACarritoMouseClicked(evt);
            }
        });
        PanelCompra.add(btnAgregarACarrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, 170, -1));

        jLabel27.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel27.setText("TOTAL A PAGAR:");
        PanelCompra.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 120, 30));

        JLTotalAPagar.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        PanelCompra.add(JLTotalAPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 110, 30));

        jbBorrar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jbBorrar.setText("BORRAR");
        jbBorrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbBorrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbBorrarMouseClicked(evt);
            }
        });
        jbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarActionPerformed(evt);
            }
        });
        PanelCompra.add(jbBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 170, 170, 30));

        jTabbedPane1.addTab("Compra de Productos", PanelCompra);

        PanelConsultas.setBackground(new java.awt.Color(8, 65, 134));
        PanelConsultas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonConsultaCom.setBackground(new java.awt.Color(6, 60, 130));
        botonConsultaCom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonConsultaCom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonConsultaComMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonConsultaComMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonConsultaComMouseExited(evt);
            }
        });
        botonConsultaCom.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel30.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("POR COMPRA");
        botonConsultaCom.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 240, 30));

        PanelConsultas.add(botonConsultaCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 260, 70));

        botonConsultaPro.setBackground(new java.awt.Color(6, 60, 130));
        botonConsultaPro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonConsultaPro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonConsultaProMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonConsultaProMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonConsultaProMouseExited(evt);
            }
        });
        botonConsultaPro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel29.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("POR PRODUCTO");
        botonConsultaPro.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 240, 30));

        PanelConsultas.add(botonConsultaPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 260, 70));

        imaProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ELECTONICS (21).png"))); // NOI18N
        imaProductos.setText("jLabel6");
        PanelConsultas.add(imaProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 560, 480));

        imaCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ELECTONICS (22) (1).png"))); // NOI18N
        PanelConsultas.add(imaCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 560, 480));

        fondoconsul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1.png"))); // NOI18N
        PanelConsultas.add(fondoconsul, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 570, 480));

        jPanel3.setBackground(new java.awt.Color(8, 65, 134));
        PanelConsultas.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 280, 490));

        jTabbedPane1.addTab("Consultas", PanelConsultas);

        menuPrincipal.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 830, 510));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/wavy-blue-background-free-vector.jpg"))); // NOI18N
        menuPrincipal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1280, 690));

        getContentPane().add(menuPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarACarritoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarACarritoMouseClicked

        if (jcProveedor1.getSelectedItem().toString().equals("Seleccione un Proveedor")) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un proveedor");
        } else if (jcProducto.getSelectedItem().toString().equals("Seleccione un producto")) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un producto");
        } else if (jTCantidad.getText().equals("") || !jTCantidad.getText().matches("[0-9]*")) {
            JOptionPane.showMessageDialog(null, "Debe ingresar la cantidad correctamente");
            jTCantidad.setText("");
        } else if (jTPrecioCompra.getText().equals("") || !jTPrecioCompra.getText().matches("[0-9]*")) {
            JOptionPane.showMessageDialog(null, "Debe ingresar el precio correctamente");
            jTPrecioCompra.setText("");
        } else {       
            listarTablaDetalle();
            jcProveedor1.setEnabled(false);
            jbBorrar.setEnabled(true);
            jcProducto.setSelectedIndex(0);
            jTCantidad.setText("");
            jTPrecioCompra.setText("");
        }
    }//GEN-LAST:event_btnAgregarACarritoMouseClicked

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        cargarCarrito();
        jcProveedor1.setSelectedIndex(0);
        jcProducto.setSelectedIndex(0);
        modelo.setRowCount(0);
        cargarTabla();

        DefaultTableModel mod = (DefaultTableModel) jtDetalleCompra.getModel();
        mod.setRowCount(0);
        jTPrecioCompra.setText("");
        jTCantidad.setText("");
        JLTotalAPagar.setText("");
        jcProveedor1.setEnabled(true);
    }//GEN-LAST:event_btnComprarActionPerformed

    private void jBModificarProveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarProveActionPerformed
        int idp = jtablaProveedor.getSelectedRow();
        int id = Integer.parseInt(this.jtablaProveedor.getValueAt(idp, 0).toString());

        String razon = jtRazonSocial.getText();
        String domi = jtDomicilioProveedor.getText();
        String tele = jtTelefonoProveedor.getText();
        boolean estado = true;
        Proveedor pro = new Proveedor(id, razon, domi, tele, estado);

        ProveedorData proda = new ProveedorData();

        proda.actualizarProveedor(pro);

        modelo1.setRowCount(0);
        jtRazonSocial.setText("");
        jtDomicilioProveedor.setText("");
        jtTelefonoProveedor.setText("");
        cargarTablaProve();
        jcProveedor1.removeAllItems();
        cargarComboProve();
    }//GEN-LAST:event_jBModificarProveActionPerformed

    private void jBEliminarproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarproveActionPerformed

        int fila = jtablaProveedor.getSelectedRow();
        int id = Integer.parseInt(this.jtablaProveedor.getValueAt(fila, 0).toString());
        modelo1.removeRow(fila);
        ProveedorData prove = new ProveedorData();
        prove.eliminarProveedor(id);
        jtRazonSocial.setText("");
        jtDomicilioProveedor.setText("");
        jtTelefonoProveedor.setText("");

        cargarComboProve();
    }//GEN-LAST:event_jBEliminarproveActionPerformed

    private void jtablaProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtablaProveedorMouseClicked
        int fila = jtablaProveedor.rowAtPoint(evt.getPoint());

        jtRazonSocial.setText(jtablaProveedor.getValueAt(fila, 1).toString());
        jtDomicilioProveedor.setText(jtablaProveedor.getValueAt(fila, 2).toString());
        jtTelefonoProveedor.setText(jtablaProveedor.getValueAt(fila, 3).toString());
    }//GEN-LAST:event_jtablaProveedorMouseClicked

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed

        int idp = jtablaProducto.getSelectedRow();
        int id = Integer.parseInt(this.jtablaProducto.getValueAt(idp, 0).toString());
        String nom = jtNombreProducto.getText();
        String des = jtDescripcion.getText();

        int stock = 0;
        String cate = (String) jCCategoria.getSelectedItem();
        boolean estado = true;
        Producto prod = new Producto(id, nom, des, 0, stock, cate, estado);

        ProductoData proData = new ProductoData();

        proData.actualizarProducto(prod);
        modelo.setRowCount(0);
        cargarTabla();
        jtNombreProducto.setText("");
        jtDescripcion.setText("");

        jCCategoria.setSelectedItem("");
        cargarComboProdu();
        jCCategoria.setSelectedIndex(0);
    }//GEN-LAST:event_jBModificarActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        int fila = jtablaProducto.getSelectedRow();

        int id = Integer.parseInt(this.jtablaProducto.getValueAt(fila, 0).toString());
        modelo.removeRow(fila);
        ProductoData pro = new ProductoData();
        pro.eliminarProducto(id);
        jtNombreProducto.setText("");
        jtDescripcion.setText("");
        jCCategoria.setSelectedItem("");
        cargarComboProdu();
        jCCategoria.setSelectedIndex(0);
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jtablaProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtablaProductoMouseClicked

        int fila = jtablaProducto.rowAtPoint(evt.getPoint());
        jtNombreProducto.setText(jtablaProducto.getValueAt(fila, 1).toString());
        jtDescripcion.setText(jtablaProducto.getValueAt(fila, 2).toString());
        jCCategoria.setSelectedItem(jtablaProducto.getValueAt(fila, 5).toString());

    }//GEN-LAST:event_jtablaProductoMouseClicked

    private void jpBotonProveedoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBotonProveedoresMouseExited
        jpBotonProveedores.setBackground(new Color(6, 60, 130));
    }//GEN-LAST:event_jpBotonProveedoresMouseExited

    private void jpBotonProveedoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBotonProveedoresMouseEntered
        jpBotonProveedores.setBackground(new Color(6, 45, 115));
    }//GEN-LAST:event_jpBotonProveedoresMouseEntered

    private void jpBotonProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBotonProveedoresMouseClicked
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jpBotonProveedoresMouseClicked

    private void jpBotonCompraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBotonCompraMouseExited
        jpBotonCompra.setBackground(new Color(6, 60, 130));
    }//GEN-LAST:event_jpBotonCompraMouseExited

    private void jpBotonCompraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBotonCompraMouseEntered
        jpBotonCompra.setBackground(new Color(6, 45, 115));
    }//GEN-LAST:event_jpBotonCompraMouseEntered

    private void jpBotonCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBotonCompraMouseClicked
        jTabbedPane1.setSelectedIndex(2);

    }//GEN-LAST:event_jpBotonCompraMouseClicked

    private void jpBotonSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBotonSalirMouseExited
        jpBotonSalir.setBackground(new Color(6, 60, 130));
    }//GEN-LAST:event_jpBotonSalirMouseExited

    private void jpBotonSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBotonSalirMouseEntered
        jpBotonSalir.setBackground(new Color(6, 45, 115));
    }//GEN-LAST:event_jpBotonSalirMouseEntered

    private void jpBotonSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBotonSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jpBotonSalirMouseClicked

    private void jpBotonProductosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBotonProductosMouseExited
        jpBotonProductos.setBackground(new Color(6, 60, 130));
    }//GEN-LAST:event_jpBotonProductosMouseExited

    private void jpBotonProductosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBotonProductosMouseEntered
        jpBotonProductos.setBackground(new Color(6, 45, 115));
    }//GEN-LAST:event_jpBotonProductosMouseEntered

    private void jpBotonProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBotonProductosMouseClicked
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jpBotonProductosMouseClicked

    private void jpBotonConsultasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBotonConsultasMouseClicked
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_jpBotonConsultasMouseClicked

    private void jpBotonConsultasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBotonConsultasMouseEntered
        jpBotonConsultas.setBackground(new Color(6, 45, 115));
    }//GEN-LAST:event_jpBotonConsultasMouseEntered

    private void jpBotonConsultasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBotonConsultasMouseExited
        jpBotonConsultas.setBackground(new Color(6, 60, 130));
    }//GEN-LAST:event_jpBotonConsultasMouseExited

    private void jbBorrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbBorrarMouseClicked
        if (modelo2.getRowCount() == 0) {
            jcProveedor1.setEnabled(true);
            jcProveedor1.setSelectedIndex(0);
        }

    }//GEN-LAST:event_jbBorrarMouseClicked

    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed

        remover();
        jcProducto.setSelectedIndex(0);
        jTCantidad.setText("");
        jTPrecioCompra.setText("");
    }//GEN-LAST:event_jbBorrarActionPerformed

    private void botonConsultaProMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonConsultaProMouseExited
        botonConsultaPro.setBackground(new Color(6, 60, 130));
        imaProductos.setVisible(false);
    }//GEN-LAST:event_botonConsultaProMouseExited

    private void botonConsultaProMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonConsultaProMouseEntered
        botonConsultaPro.setBackground(new Color(6, 45, 115));
        imaProductos.setVisible(true);
    }//GEN-LAST:event_botonConsultaProMouseEntered

    private void botonConsultaProMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonConsultaProMouseClicked
        consultaProducto cp = new consultaProducto();
        cp.setVisible(true);
        cp.setLocationRelativeTo(null);
    }//GEN-LAST:event_botonConsultaProMouseClicked

    private void botonConsultaComMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonConsultaComMouseExited
        botonConsultaCom.setBackground(new Color(6, 60, 130));
        imaCompra.setVisible(false);
    }//GEN-LAST:event_botonConsultaComMouseExited

    private void botonConsultaComMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonConsultaComMouseEntered
        botonConsultaCom.setBackground(new Color(6, 45, 115));
        imaCompra.setVisible(true);
    }//GEN-LAST:event_botonConsultaComMouseEntered

    private void botonConsultaComMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonConsultaComMouseClicked
        consultaCompra cc = new consultaCompra();
        cc.setVisible(true);
        cc.setLocationRelativeTo(null);
    }//GEN-LAST:event_botonConsultaComMouseClicked

    private void jBGuardarProveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarProveActionPerformed
        String razons = jtRazonSocial.getText();
        if (razons.isEmpty() || !razons.matches("[a-zA-Z\\s\\.,']+")) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un nombre de proveedor válido");
            jtRazonSocial.setText("");
        } else {
            if (jtDomicilioProveedor.getText().equals("") || jtDomicilioProveedor.getText().matches("[A-Za-z_0-9]*[0-9][A-Za-z_0-9]*")) {
                JOptionPane.showMessageDialog(null, "Debe ingresar el domicilio correctamente");
                jtDomicilioProveedor.setText("");
            } else {
                if (jtTelefonoProveedor.getText().equals("") || !jtTelefonoProveedor.getText().matches("[0-9]*")) {
                    JOptionPane.showMessageDialog(null, "Debe ingresar el télefono correctamente");
                    jtTelefonoProveedor.setText("");
                } else {

                    String razon = jtRazonSocial.getText();
                    String domicilio = jtDomicilioProveedor.getText();
                    String telefono = jtTelefonoProveedor.getText();
                    boolean estado = true;
                    Proveedor proveedor = new Proveedor(razon, domicilio, telefono, estado);
                    ProveedorData prove = new ProveedorData();
                    prove.guardarProveedor(proveedor);
                    jtRazonSocial.setText("");
                    jtDomicilioProveedor.setText("");
                    jtTelefonoProveedor.setText("");
                    modelo1.setRowCount(0);

                    cargarTablaProve();
                    cargarComboProve();
                }
            }
        }
    }//GEN-LAST:event_jBGuardarProveActionPerformed

    private void jBLimpiarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarProActionPerformed
        jtRazonSocial.setText("");
        jtDomicilioProveedor.setText("");
        jtTelefonoProveedor.setText("");
    }//GEN-LAST:event_jBLimpiarProActionPerformed

    private void jBGuardarProduActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarProduActionPerformed
        if (jtNombreProducto.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Error debe ingresar el nombre del producto");
            jtNombreProducto.setText("");
        } else {
            if (jtDescripcion.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Error ingrese datos en Descripcion");
                jtDescripcion.setText("");
            } else {
                if (jCCategoria.getSelectedItem().toString().equals("Seleccione Categoria")) {
                    JOptionPane.showMessageDialog(null, "Debe seleccionar una categoria");
                } else {
                    String nombreProducto = jtNombreProducto.getText();
                    String descripcion = jtDescripcion.getText();
                    int stock = 0;
                    String cate = (String) jCCategoria.getSelectedItem();
                    boolean estado = true;
                    Producto producto = new Producto(nombreProducto, descripcion, 0, stock, cate, estado);
                    ProductoData pro = new ProductoData();
                    pro.guardarProducto(producto);
                    jtNombreProducto.setText("");
                    jtDescripcion.setText("");
                    jCCategoria.setSelectedItem("");

                    modelo.setRowCount(0);
                    cargarTabla();
                    cargarComboProdu();
                    jCCategoria.setSelectedIndex(0);
                }
            }
        }
    }//GEN-LAST:event_jBGuardarProduActionPerformed

    private void jBLimpiarProduActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarProduActionPerformed

        jtNombreProducto.setText("");
        jtDescripcion.setText("");
        jCCategoria.setSelectedIndex(0);
    }//GEN-LAST:event_jBLimpiarProduActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLTotalAPagar;
    private javax.swing.JPanel PanelCompra;
    private javax.swing.JPanel PanelConsultas;
    private javax.swing.JPanel PanelProducto;
    private javax.swing.JPanel PanelProveedores;
    private javax.swing.JPanel botonConsultaCom;
    private javax.swing.JPanel botonConsultaPro;
    private javax.swing.JButton btnAgregarACarrito;
    private javax.swing.JButton btnComprar;
    private javax.swing.JLabel fondoconsul;
    private javax.swing.JLabel imaCompra;
    private javax.swing.JLabel imaProductos;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBEliminarprove;
    private javax.swing.JButton jBGuardarProdu;
    private javax.swing.JButton jBGuardarProve;
    private javax.swing.JButton jBLimpiarPro;
    private javax.swing.JButton jBLimpiarProdu;
    private javax.swing.JButton jBModificar;
    private javax.swing.JButton jBModificarProve;
    private javax.swing.JComboBox<String> jCCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTCantidad;
    private javax.swing.JTextField jTPrecioCompra;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JComboBox<String> jcProducto;
    private javax.swing.JComboBox<String> jcProveedor1;
    private javax.swing.JLabel jlFecha;
    private javax.swing.JPanel jpBotonCompra;
    private javax.swing.JPanel jpBotonConsultas;
    private javax.swing.JPanel jpBotonProductos;
    private javax.swing.JPanel jpBotonProveedores;
    private javax.swing.JPanel jpBotonSalir;
    private javax.swing.JTextField jtDescripcion;
    private javax.swing.JTable jtDetalleCompra;
    private javax.swing.JTextField jtDomicilioProveedor;
    private javax.swing.JTextField jtNombreProducto;
    private javax.swing.JTextField jtRazonSocial;
    private javax.swing.JTextField jtTelefonoProveedor;
    private javax.swing.JTable jtablaProducto;
    private javax.swing.JTable jtablaProveedor;
    private javax.swing.JPanel menuPrincipal;
    // End of variables declaration//GEN-END:variables

    public void cargarTabla() {
        ProductoData pro = new ProductoData();

        for (Producto producto : pro.listaProductos()) {
            modelo.addRow(new Object[]{
                producto.getIdProducto(),
                producto.getNombreProducto(),
                producto.getDescripcion(),
                producto.getPrecioActual(),
                producto.getStock(),
                producto.getCategoria()});
        }
    }

    public void cargarTablaProve() {

        ProveedorData pro = new ProveedorData();

        for (Proveedor proveedor : pro.listaProveedores()) {
            modelo1.addRow(new Object[]{
                proveedor.getIdProveedor(),
                proveedor.getRazonSocial(),
                proveedor.getDomicilio(),
                proveedor.getTelefono()});
        }
    }

    public void listarTablaDetalle() {

        try {
            if (Integer.parseInt(jTCantidad.getText()) > 0 && Integer.parseInt(jTPrecioCompra.getText()) > 0) {
                ProductoData produ = new ProductoData();
                double subtotal = Double.parseDouble(jTPrecioCompra.getText()) * Integer.parseInt(jTCantidad.getText());

                if (modelo2.getRowCount() == 0) {
                    modelo2.addRow(new Object[]{
                        produ.buscarIDProducto((String) jcProducto.getSelectedItem()).getIdProducto(),
                        jcProducto.getSelectedItem(),
                        jTCantidad.getText(),
                        jTPrecioCompra.getText(),
                        String.format("%.2f", subtotal),
                        jlFecha.getText()
                    });
                } else {
                    modelo2.addRow(new Object[]{
                        produ.buscarIDProducto((String) jcProducto.getSelectedItem()).getIdProducto(),
                        jcProducto.getSelectedItem(),
                        jTCantidad.getText(),
                        jTPrecioCompra.getText(),
                        String.format("%.2f", subtotal),
                        jlFecha.getText()
                    });
                    Integer ultimoId = (Integer) modelo2.getValueAt((modelo2.getRowCount() - 1), 0);
                    for (int i = 0; i < modelo2.getRowCount(); i++) {
                        if (ultimoId.toString().equals(modelo2.getValueAt(i, 0).toString()) && modelo2.getRowCount() != i + 1) {
                            modelo2.setValueAt(Integer.parseInt(jTCantidad.getText()) + Integer.parseInt(modelo2.getValueAt(i, 2).toString()), i, 2);
                            modelo2.setValueAt(jTPrecioCompra.getText(), i, 3);
                            modelo2.removeRow(modelo2.getRowCount() - 1);
                            modelo2.setValueAt(Integer.parseInt(jTPrecioCompra.getText()) * Integer.parseInt(modelo2.getValueAt(i, 2).toString()), i, 4);
                        }
                    }
                }
                calcularTotal();
            } else {
                JOptionPane.showMessageDialog(this, "Ingresar Cantidad/Precio mayor a 0");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Ingresar Cantidad/Precio correctamente");
        }
    }
    
    public void calcularTotal() {
        double total = 0;
        for (int i = 0; i < jtDetalleCompra.getRowCount(); i++) {
            Object subtt = jtDetalleCompra.getValueAt(i, 4);
            String subttStr = subtt.toString().replace(",", ".");
            total += Double.parseDouble(subttStr);
        }
        JLTotalAPagar.setText(String.format("%.2f", total));
    }

    public void cargarTablaDetalle() {

        CompraData coda = new CompraData();
        int idcom = coda.obtenerIdCompra();
        ProductoData produ = new ProductoData();

        for (DetalleCompra d : dCompra.obtenerDetalleCompraFull(idcom)) {
            modelo2.addRow(new Object[]{
                d.getCompra().getIdCompra(),
                produ.buscarIDProducto((String) jcProducto.getSelectedItem()).getIdProducto(),
                d.getProducto().getNombreProducto(),
                d.getCantidad(),
                d.getPrecioCosto(),
                d.getSubTotal(),
                d.getCompra().getFecha()});
        }
    }

    private void cargarCabeceraListarDetalle() {

        modelo2.addColumn("ID Producto");
        modelo2.addColumn("Producto");
        modelo2.addColumn("Cantidad");
        modelo2.addColumn("Precio Unitario");
        modelo2.addColumn("SubTotal");
        modelo2.addColumn("Fecha");
        jtDetalleCompra.setModel(modelo2);
    }

    public void cargarCarrito() {
        CompraData com = new CompraData();
        ProveedorData prove = new ProveedorData();

        String r = (String) jcProveedor1.getSelectedItem();
        Proveedor m = prove.buscarProveedor(r);
        int t = m.getIdProveedor();

        com.realizarCompra(t, LocalDate.now());
        int idComp = com.obtenerIdCompra();

        int totalFilas = jtDetalleCompra.getRowCount();
        int filaActual = 0;

        while (filaActual < totalFilas) {
            Object idProd = jtDetalleCompra.getValueAt(filaActual, 0);
            Object cantidad = jtDetalleCompra.getValueAt(filaActual, 2);
            Object precio = jtDetalleCompra.getValueAt(filaActual, 3);

            double subtotal = Double.parseDouble(precio.toString()) * Integer.parseInt(cantidad.toString());
            dCompra.generarDetalleCompra(Integer.parseInt(cantidad.toString()),
                    Double.parseDouble(precio.toString()),
                    subtotal,
                    idComp,
                    Integer.parseInt(idProd.toString()));
            filaActual++;
        }
        actualizarStock();
        actualizarPrecio();
    }

    private void cargarCabezeraProve() {
        modelo1.addColumn("ID");
        modelo1.addColumn("Razon Social");
        modelo1.addColumn("Domicilio");
        modelo1.addColumn("Telefono");
        jtablaProveedor.setModel(modelo1);
    }

    private void cargarCabezera() {
        modelo.addColumn("Id");
        modelo.addColumn("Nombre");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Precio Actual");
        modelo.addColumn("Stock");
        modelo.addColumn("Categoria");
        jtablaProducto.setModel(modelo);
    }

    public String fechaActual() {
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("      dd/MM/YYYY");
        return formatoFecha.format(fecha);
    }

    public void cargarComboProve() {
        jcProveedor1.removeAllItems();
        ProveedorData prove = new ProveedorData();
        jcProveedor1.addItem("Seleccione un Proveedor");
        for (Proveedor proveedor : prove.listaProveedores()) {

            jcProveedor1.addItem(proveedor.getRazonSocial());
        }
    }

    public void cargarComboProdu() {
        jcProducto.removeAllItems();
        ProductoData produ = new ProductoData();
        jcProducto.addItem("Seleccione un producto");
        for (Producto producto : produ.listaProductos()) {
            jcProducto.addItem(producto.getNombreProducto());
        }
    }

    public void remover() {
        DefaultTableModel compra = (DefaultTableModel) jtDetalleCompra.getModel();
        int fila = jtDetalleCompra.getSelectedRow();
        if (fila >= 0) {
            compra.removeRow(fila);
            calcularTotal();
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un producto del carrito de compra");
        }
    }

    private void actualizarStock() {
        for (int i = 0; i < modelo2.getRowCount(); i++) {
            Producto pr = new Producto();
            ProductoData prdata = new ProductoData();
            int idPro = Integer.parseInt(jtDetalleCompra.getValueAt(i, 0).toString());
            int cant = Integer.parseInt(jtDetalleCompra.getValueAt(i, 2).toString());
            pr = prdata.obtenerProducto(idPro);
            int st = pr.getStock() + cant;
            prdata.actualizarStock(st, idPro);
        }
    }

    private void actualizarPrecio() {
        for (int i = 0; i < modelo2.getRowCount(); i++) {
            ProductoData prdata = new ProductoData();
            int idPro = Integer.parseInt(jtDetalleCompra.getValueAt(i, 0).toString());
            double precio = Double.parseDouble(jtDetalleCompra.getValueAt(i, 3).toString());
            // Aument0 el precio en un 20%
            precio *= 1.2;
            int totalp = (int) precio;
            prdata.actualizarPrecio(totalp, idPro);
        }
    }

    private void columnasProductos() {
        jtablaProducto.setModel(modelo);
        jtablaProducto.getColumnModel().getColumn(0).setPreferredWidth(20);
        jtablaProducto.getColumnModel().getColumn(1).setPreferredWidth(180);
        jtablaProducto.getColumnModel().getColumn(2).setPreferredWidth(180);
        jtablaProducto.getColumnModel().getColumn(3).setPreferredWidth(60);
        jtablaProducto.getColumnModel().getColumn(4).setPreferredWidth(20);
        jtablaProducto.getColumnModel().getColumn(5).setPreferredWidth(90);
    }

    private void columnasProveedor() {
        jtablaProveedor.setModel(modelo1);
        jtablaProveedor.getColumnModel().getColumn(0).setPreferredWidth(20);
        jtablaProveedor.getColumnModel().getColumn(1).setPreferredWidth(180);
        jtablaProveedor.getColumnModel().getColumn(2).setPreferredWidth(200);
        jtablaProveedor.getColumnModel().getColumn(3).setPreferredWidth(100);
    }

    private void columnasCompras() {
        jtDetalleCompra.setModel(modelo2);
        jtDetalleCompra.getColumnModel().getColumn(0).setPreferredWidth(40);
        jtDetalleCompra.getColumnModel().getColumn(1).setPreferredWidth(180);
        jtDetalleCompra.getColumnModel().getColumn(2).setPreferredWidth(20);
        jtDetalleCompra.getColumnModel().getColumn(3).setPreferredWidth(80);
        jtDetalleCompra.getColumnModel().getColumn(4).setPreferredWidth(80);
        jtDetalleCompra.getColumnModel().getColumn(5).setPreferredWidth(90);
    }

    public void revisionDeStock() {
        if (!pro.stockMinimo().isEmpty()) {
            JOptionPane.showMessageDialog(PanelProducto, "PRODUCTOS CON STOCK BAJO\n Realice Consulta de Productos");
        }
    }

}
