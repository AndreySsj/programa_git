import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class VentanaInicio extends JFrame {
    private JPanel panel;
    private JPanel panel2;
    private ArrayList<String> carritoProductos;
    private ArrayList<Double> carritoPrecios;
    private ArrayList<Integer> cantidadesProductos;

    public VentanaInicio() {
        this.setSize(1016, 1100);
        this.setLocationRelativeTo(null);
        iniciarComponentes();
        cantidadesProductos = new ArrayList<>();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void iniciarComponentes() {
        colocarPaneles();
        colocarEtiquetas();
        carritoProductos = new ArrayList<>();
        carritoPrecios = new ArrayList<>();
    }

    private void colocarPaneles() {
        panel = new JPanel(new BorderLayout());
        panel.setLayout(null);
        panel.setBackground(Color.WHITE);
        this.getContentPane().add(panel);

        panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setBackground(new Color(255, 161, 170));
        panel2.setBounds(0, 550, 1016, 160);
        panel.add(panel2);
    }

    private void colocarEtiquetas(){
        ImageIcon banner = new ImageIcon("Banner.png");
        JLabel banner2 = new JLabel();
        banner2.setBounds(0, 0, 1000, 150);
        banner2.setIcon(new ImageIcon(banner.getImage().getScaledInstance(banner2.getWidth(), banner2.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(banner2);

        ImageIcon logo = new ImageIcon("Logo.png");
        JLabel logo2 = new JLabel();
        logo2.setBounds(425, 10, 150, 130);
        logo2.setIcon(new ImageIcon(logo.getImage().getScaledInstance(logo2.getWidth(), logo2.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(logo2);

        JLabel Login = new JLabel();
        Login.setText("Iniciar Sesion");
        Login.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Login.setFont(new Font("Cooper Black", 1, 20));
        Login.setBounds(20, 100, 500, 80);
        Login.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                abrirVentanaLogin();
            }
        });
        panel.add(Login);

        JLabel inicio = new JLabel("Inicio");
        inicio.setBounds(55, 150, 73, 60);
        inicio.setFont(new Font("Cooper Black", 0, 25));
        inicio.setCursor(new Cursor(Cursor.HAND_CURSOR));
        inicio.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                abrirVentanaInicio();
            }
        });
        panel.add(inicio);

        JLabel domicilios = new JLabel("Domicilios");
        domicilios.setCursor(new Cursor(Cursor.HAND_CURSOR));
        domicilios.setBounds(190, 150, 135, 60);
        domicilios.setFont(new Font("Cooper Black", 0, 25));
        domicilios.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                abrirVentanaDomicilio();
            }
        });
        panel.add(domicilios);

        JLabel quienesSomos = new JLabel("¿Quienes Somos?");
        quienesSomos.setCursor(new Cursor(Cursor.HAND_CURSOR));
        quienesSomos.setBounds(393, 150, 213, 60);
        quienesSomos.setBackground(Color.CYAN);
        quienesSomos.setFont(new Font("Cooper Black", 0, 25));
        quienesSomos.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                abrirVentanaQuienesSomos();
            }
        });
        panel.add(quienesSomos);

        JLabel menu = new JLabel("Menú");
        menu.setCursor(new Cursor(Cursor.HAND_CURSOR));
        menu.setBounds(670, 150, 150, 60);
        menu.setFont(new Font("Cooper Black", 0, 25));
        menu.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                abrirVentanaMenu();
            }
        });
        panel.add(menu);

        JLabel contacto = new JLabel("Contacto");
        contacto.setCursor(new Cursor(Cursor.HAND_CURSOR));
        contacto.setBounds(800, 150, 116, 60);
        contacto.setFont(new Font("Cooper Black", 0, 25));
        contacto.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                abrirVentanaContacto();
            }
        });
        panel.add(contacto);

        ImageIcon imagen1 = new ImageIcon("img1.png");
        JLabel img1 = new JLabel();
        img1.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(200, 300, Image.SCALE_SMOOTH)));
        img1.setBounds(780, 230, 170, 230);
        panel.add(img1);

        ImageIcon imagen2 = new ImageIcon("img2.png");
        JLabel img2 = new JLabel();
        img2.setIcon(new ImageIcon(imagen2.getImage().getScaledInstance(200, 300, Image.SCALE_SMOOTH)));
        img2.setBounds(50, 230, 170, 230);
        panel2.add(img2);

        ImageIcon imagen3 = new ImageIcon("img3.png");
        JLabel img3 = new JLabel();
        img3.setIcon(new ImageIcon(imagen3.getImage().getScaledInstance(200, 300, Image.SCALE_SMOOTH)));
        img3.setBounds(300, 230, 170, 230);
        panel.add(img3);

        ImageIcon imagen4 = new ImageIcon("img4.png");
        JLabel img4 = new JLabel();
        img4.setIcon(new ImageIcon(imagen4.getImage().getScaledInstance(200, 300, Image.SCALE_SMOOTH)));
        img4.setBounds(535, 230, 180, 230);
        panel.add(img4);

        JLabel txt8= new JLabel();
        txt8.setText("<html>Ensalada de <br>frutas y helado</html>");
        txt8.setFont(new Font("Bahnschrift", 1, 20));
        txt8.setBounds(60, 376, 500, 230);
        panel.add(txt8);

        ImageIcon imagen5 = new ImageIcon("Carrito.png");
        JLabel img5 = new JLabel();
        img5.setCursor(new Cursor(Cursor.HAND_CURSOR));
        img5.setIcon(new ImageIcon(imagen5.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH)));
        img5.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                JOptionPane.showMessageDialog(null, "El producto ha sido añadido al carrito");
                agregarAlCarrito("<html>Ensalada de <br>frutas y helado</html>", 10.000);

            }

        });
        img5.setBounds(210, 370, 40, 230);
        panel.add(img5);

        JLabel txt9 = new JLabel();
        txt9.setText("<html>Postre de<br> Maracuya</html>");
        txt9.setFont(new Font("Bahnschrift", 1, 20));
        txt9.setBounds(340, 370, 500, 230);
        panel.add(txt9);


        ImageIcon imagen7 = new ImageIcon("Carrito.png");
        JLabel img7 = new JLabel();
        img7.setCursor(new Cursor(Cursor.HAND_CURSOR));
        img7.setIcon(new ImageIcon(imagen7.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH)));
        img7.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                JOptionPane.showMessageDialog(null, "El producto ha sido añadido al carrito");
                agregarAlCarrito("<html>Postre de<br> Maracuya</html>", 15.000);

            }

        });
        img7.setBounds(455, 370, 40, 230);
        panel.add(img7);

        JLabel txt10= new JLabel();
        txt10.setText("Choco Helado");
        txt10.setFont(new Font("Bahnschrift", 1, 20));
        txt10.setBounds(558, 376, 500, 230);
        panel.add(txt10);

        ImageIcon imagen6 = new ImageIcon("Carrito.png");
        JLabel img6 = new JLabel();
        img6.setCursor(new Cursor(Cursor.HAND_CURSOR));
        img6.setIcon(new ImageIcon(imagen6.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH)));
        img6.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                JOptionPane.showMessageDialog(null, "El producto ha sido añadido al carrito");
                agregarAlCarrito("Choco Helado", 8.000);

            }

        });
        img6.setBounds(700, 370, 40, 230);
        panel.add(img6);

        JLabel txt11= new JLabel();
        txt11.setText("Canasta M&M  ");
        txt11.setFont(new Font("Bahnschrift", 1, 20));
        txt11.setBounds(798, 376, 500, 230);
        panel.add(txt11);

        ImageIcon imagen8 = new ImageIcon("Carrito.png");
        JLabel img8 = new JLabel();
        img8.setCursor(new Cursor(Cursor.HAND_CURSOR));
        img8.setIcon(new ImageIcon(imagen8.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH)));
        img8.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                JOptionPane.showMessageDialog(null, "El producto ha sido añadido al carrito");
                agregarAlCarrito("Canasta M&M", 8.000);

            }

        });
        img8.setBounds(940, 370, 40, 230);
        panel.add(img8);


        ImageIcon logoA = new ImageIcon("Logo2.png");
        JLabel logo3 = new JLabel();
        logo3.setBounds(30, 570, 140, 110);
        logo3.setIcon(new ImageIcon(logoA.getImage().getScaledInstance(logo3.getWidth(), logo3.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(logo3);

        JLabel txt6= new JLabel();
        txt6.setText("UNETE A NUESTRAS REDES SOCIALES");
        txt6.setFont(new Font("Bahnschrift", 1, 20));
        txt6.setBounds(180, 600, 600, 40);
        panel.add(txt6);
    
        JLabel txt7= new JLabel();
        txt7.setText("Visítanos en calle 30 #8-69, Patios Centro, Los Patios");
        txt7.setFont(new Font("Bahnschrift", 1, 20));
        txt7.setBounds(180, 650, 800, 40);
        panel.add(txt7);

        ImageIcon Facebook = new ImageIcon("Facebook.png");
        JLabel Facebook1 = new JLabel();
        Facebook1.setIcon(new ImageIcon(Facebook.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH)));
        Facebook1.setBounds(760, 530, 170, 230);
        panel.add(Facebook1);

        ImageIcon Instagram = new ImageIcon("Instagram.png");
        JLabel Instagram1 = new JLabel();
        Instagram1.setIcon(new ImageIcon(Instagram.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH)));
        Instagram1.setBounds(820, 530, 170, 230);
        panel.add(Instagram1);

        ImageIcon Whatsaap = new ImageIcon("Whatsaap.png");
        JLabel Whatsaap1 = new JLabel();
        Whatsaap1.setIcon(new ImageIcon(Whatsaap.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH)));
        Whatsaap1.setBounds(880, 530, 170, 230);
        panel.add(Whatsaap1);



        panel.setComponentZOrder(banner2, 1);
        panel.setComponentZOrder(logo2, 0);
        panel.setComponentZOrder(logo3, 0);
        panel.setComponentZOrder(img2, 2);
        panel.setComponentZOrder(img3, 2);
        panel.setComponentZOrder(img4, 2);
        panel.setComponentZOrder(img1, 2);
        panel.setComponentZOrder(Facebook1, 2);
        panel.setComponentZOrder(Instagram1, 2);
        panel.setComponentZOrder(Whatsaap1, 2);
        panel.setComponentZOrder(txt6,2);
        panel.setComponentZOrder(txt7,2);
        panel.setComponentZOrder(txt8,2);
        panel.setComponentZOrder(txt9,2);
        panel.setComponentZOrder(txt10,2);
        panel.setComponentZOrder(txt11,2);
        panel.setComponentZOrder(Login,2);
        panel.setComponentZOrder(img5, 2);
        panel.setComponentZOrder(img6, 2);
        panel.setComponentZOrder(img7, 2);
        panel.setComponentZOrder(img8, 2);

    }

    private void abrirVentanaInicio(){
        VentanaInicio ventanaPrincipal = new VentanaInicio();
        ventanaPrincipal.setVisible(true);
    }

    private void abrirVentanaDomicilio() {
        VentanaDomicilio vDomicilio = new VentanaDomicilio();
        vDomicilio.setVisible(true);
        this.setVisible(false);
    }

    private void abrirVentanaQuienesSomos() {
        VentanaQuienesSomos vQuienesSomos = new VentanaQuienesSomos();
        vQuienesSomos.setVisible(true);
        this.setVisible(false);
    }

    private void abrirVentanaMenu(){
        VentanaMenu vMenu = new VentanaMenu();
        vMenu.setVisible(true);
        this.setVisible(false);
    }

    private void abrirVentanaContacto() {
        VentanaContacto vContacto = new VentanaContacto();
        vContacto.setVisible(true);
        this.setVisible(false);
    }

    private void abrirVentanaLogin(){
        VentanaLogin vLogin = new VentanaLogin();
        vLogin.setVisible(true);
        this.setVisible(false);
    }

    private void agregarAlCarrito(String producto, double precio) {
        carritoProductos.add(producto);
        carritoPrecios.add(precio);
        cantidadesProductos.add(1);
        mostrarCarrito();
        
    }

    private double calcularTotal(ArrayList<Double> precios, ArrayList<Integer> cantidades) {
        double total = 0.0;
        for (int i = 0; i < precios.size(); i++) {
            total += precios.get(i) * cantidades.get(i);
        }
        return total;
    }







    private void mostrarCarrito() {
        JFrame frameCarrito = new JFrame("Carrito de Compras");
        frameCarrito.setSize(700, 700);
        frameCarrito.setLocationRelativeTo(null);

        JPanel panelCarrito = new JPanel();
        panelCarrito.setLayout(null);

        JLabel titulo = new JLabel("CARRITO DE COMPRAS");
        titulo.setBounds(250, 10, 500, 40);
        titulo.setFont(new Font("Bahnschrift", 1, 22));
        panelCarrito.add(titulo);


        colocarProductosEnCarrito(panelCarrito);

        frameCarrito.add(panelCarrito);
        frameCarrito.setVisible(true);
    }

    private void colocarProductosEnCarrito(JPanel panelCarrito) {
        int ySizeProducto = 100;

        JLabel txtProducto = new JLabel("Producto");
        txtProducto.setBounds(25, ySizeProducto - 30, 100, 20);
        txtProducto.setFont(new Font("Arial", 1, 15));
        panelCarrito.add(txtProducto);

        JLabel txtCantidad = new JLabel("Cantidad");
        txtCantidad.setBounds(180, ySizeProducto - 30, 100, 20);
        txtCantidad.setFont(new Font("Arial", 1, 15));
        panelCarrito.add(txtCantidad);

        JLabel txtPrecio = new JLabel("Precio");
        txtPrecio.setBounds(290, ySizeProducto - 30, 100, 20);
        txtPrecio.setFont(new Font("Arial", 1, 15));
        panelCarrito.add(txtPrecio);

        JLabel txtSubtotal = new JLabel("Subtotal");
        txtSubtotal.setBounds(360, ySizeProducto - 30, 100, 20);
        txtSubtotal.setFont(new Font("Arial", 1, 15));
        panelCarrito.add(txtSubtotal);

        for (int i = 0; i < carritoProductos.size(); i++) {

            colocarProductoEnCarrito(panelCarrito, i, ySizeProducto);
            ySizeProducto += 50;
        }

        colocarMetodoPago(panelCarrito, ySizeProducto);
    }

    private void colocarProductoEnCarrito(JPanel panelCarrito, int index, int ySizeProducto) {
        JLabel producto = new JLabel(carritoProductos.get(index));
        JTextField cantidadTextField = new JTextField(cantidadesProductos.get(index).toString());
        JLabel precio = new JLabel(carritoPrecios.get(index).toString());

        cantidadTextField.setBounds(200, ySizeProducto + 10, 20, 20);
        producto.setBounds(25, ySizeProducto, 500, 40);
        precio.setBounds(300, ySizeProducto, 500, 40);

        panelCarrito.add(producto);
        panelCarrito.add(cantidadTextField);
        panelCarrito.add(precio);

        int index2 = index;
        final int finalYSizeProducto = ySizeProducto;

        cantidadTextField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int nuevaCantidad = Integer.parseInt(cantidadTextField.getText());
                cantidadesProductos.set(index2, nuevaCantidad);
                double nuevoSubtotal = carritoPrecios.get(index2) * nuevaCantidad;
                JLabel subtotal = (JLabel) panelCarrito.getComponentAt(377, finalYSizeProducto);
                subtotal.setText(String.valueOf(nuevoSubtotal));
                subtotal.setBounds(377, finalYSizeProducto, 500, 40);
            }
        });

        JButton botonEliminar = new JButton("Eliminar");
        botonEliminar.setBounds(480, ySizeProducto + 5, 80, 30);
        botonEliminar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                carritoProductos.remove(index2);
                carritoPrecios.remove(index2);
                mostrarCarrito();
            }
        });

        panelCarrito.add(botonEliminar);
    }

    private void colocarMetodoPago(JPanel panelCarrito, int ySize) {
        JLabel metodoPagoLabel = new JLabel("Selecciona el método de pago:");
        metodoPagoLabel.setBounds(25, ySize + 30, 500, 20);
        panelCarrito.add(metodoPagoLabel);

        
        JRadioButton botonPagarEfectivo = new JRadioButton("Pagar en Efectivo");
        botonPagarEfectivo.setBounds(25, ySize + 50, 500, 20);
        JRadioButton botonPagarTarjeta = new JRadioButton("Pagar con Tarjeta");
        botonPagarTarjeta.setBounds(25, ySize + 70, 500, 20);
        JRadioButton botonPagarTransferencia = new JRadioButton("Pagar con Transferencia");
        botonPagarTransferencia.setBounds(25, ySize + 90, 500, 20);

        ActionListener confirmacionPago = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double total = calcularTotal(carritoPrecios, cantidadesProductos);
                String mensaje = "¿Desea proceder con el pago por un total de $" + total + "?";
                int respuesta = JOptionPane.showConfirmDialog(null, mensaje, "Confirmar Pago", JOptionPane.YES_NO_OPTION);
                if (respuesta == JOptionPane.YES_OPTION) {
                    
                    JOptionPane.showMessageDialog(null, "El pago se ha realizado con éxito.");
                } else {
                    
                    JOptionPane.showMessageDialog(null, "El pago ha sido cancelado.");
                }
            }
        };
    
        botonPagarEfectivo.addActionListener(confirmacionPago);
        botonPagarTarjeta.addActionListener(confirmacionPago);
        botonPagarTransferencia.addActionListener(confirmacionPago);

       
        ButtonGroup grupoBotones = new ButtonGroup();
        grupoBotones.add(botonPagarEfectivo);
        grupoBotones.add(botonPagarTarjeta);
        grupoBotones.add(botonPagarTransferencia);

        panelCarrito.add(botonPagarEfectivo);
        panelCarrito.add(botonPagarTarjeta);
        panelCarrito.add(botonPagarTransferencia);
    }


    

}
