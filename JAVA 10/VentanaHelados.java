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

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.plaf.ColorUIResource;

public class VentanaHelados extends JFrame{
    public JPanel panel;
    public JPanel panel2;
    public ArrayList<String> carritoProductos;
    public ArrayList<Double> carritoPrecios;
    public ArrayList<Integer> cantidadesProductos;


    public VentanaHelados(){
        this.setSize(1016, 1100);
        this.setLocationRelativeTo(null);
        iniciarComponentes();
        cantidadesProductos = new ArrayList<>();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    private void iniciarComponentes(){
        colocarPaneles();
        colocarEtiquetas();
        carritoProductos = new ArrayList<>();
        carritoPrecios = new ArrayList<>();
    }

    private void colocarPaneles(){
        panel =  new JPanel(new BorderLayout());
        panel.setLayout(null);
        panel.setBackground(Color.WHITE);
        this.getContentPane().add(panel);

        panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setBackground(new ColorUIResource(255, 161, 170));
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


        int xSize = 85;
        ImageIcon HeladoFresas1 = new ImageIcon("HeladoFresas.png");
        JLabel HeladoFresas = new JLabel();
        HeladoFresas.setBounds(xSize, 230, 140, 150);
        HeladoFresas.setIcon(new ImageIcon(HeladoFresas1.getImage().getScaledInstance(HeladoFresas.getWidth(), HeladoFresas.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(HeladoFresas);

        JLabel txtHeladoFresas = new JLabel("<html>Fresas con<br>crema y<br>helado");
        txtHeladoFresas.setBounds(85, 320, 200, 150);
        txtHeladoFresas.setFont(new Font("Bahnschrift", 1, 20));
        panel.add(txtHeladoFresas);

        JLabel txtPrecio1 = new JLabel("10.000");
        txtPrecio1.setBounds(110, 370, 160, 150);
        txtPrecio1.setFont(new Font("Bahnschrift", 1, 17));
        panel.add(txtPrecio1);

        ImageIcon Carrito1 = new ImageIcon("Carrito.png");
        JLabel Carrito = new JLabel();
        Carrito.setBounds(xSize + 100, 400, 35, 35);
        Carrito.setIcon(new ImageIcon(Carrito1.getImage().getScaledInstance(Carrito.getWidth(), Carrito.getHeight(), Image.SCALE_SMOOTH)));
        Carrito.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                JOptionPane.showMessageDialog(null, "El producto ha sido añadido al carrito");
                agregarAlCarrito("<html>Fresas con<br>crema y<br>helado", 10.000);

            }

        });
        panel.add(Carrito);

        ImageIcon Maracumango1 = new ImageIcon("Maracumango.png");
        JLabel Maracumango = new JLabel();
        Maracumango.setBounds(xSize + 180, 230, 140, 150);
        Maracumango.setIcon(new ImageIcon(Maracumango1.getImage().getScaledInstance(Maracumango.getWidth(), Maracumango.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(Maracumango);

        JLabel txtMaracumango = new JLabel("Maracumango");
        txtMaracumango.setBounds(270, 320, 140, 150);
        txtMaracumango.setFont(new Font("Bahnschrift", 1, 20));
        panel.add(txtMaracumango);

        JLabel txtPrecio2 = new JLabel("10.000");
        txtPrecio2.setBounds(300, 350, 160, 150);
        txtPrecio2.setFont(new Font("Bahnschrift", 1, 17));
        panel.add(txtPrecio2);

        ImageIcon Carrito2 = new ImageIcon("Carrito.png");
        JLabel Carrito3 = new JLabel();
        Carrito3.setBounds(xSize + 300, 400, 35, 35);
        Carrito3.setIcon(new ImageIcon(Carrito2.getImage().getScaledInstance(Carrito.getWidth(), Carrito.getHeight(), Image.SCALE_SMOOTH)));
        Carrito3.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                JOptionPane.showMessageDialog(null, "El producto ha sido añadido al carrito");
                agregarAlCarrito("Maracumango", 60.000);
            }

        });
        panel.add(Carrito3);

        ImageIcon Chocohelado1 = new ImageIcon("Chocohelado.png");
        JLabel Chocohelado = new JLabel();
        Chocohelado.setBounds(xSize + 350, 230, 140, 150);
        Chocohelado.setIcon(new ImageIcon(Chocohelado1.getImage().getScaledInstance(Chocohelado.getWidth(), Chocohelado.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(Chocohelado);

        JLabel txtChocohelado = new JLabel("Chocohelado");
        txtChocohelado.setBounds(435, 335, 180, 150);
        txtChocohelado.setFont(new Font("Bahnschrift", 1, 20));
        panel.add(txtChocohelado);

        JLabel txtPrecio3 = new JLabel("20.000");
        txtPrecio3.setBounds(460, 360, 160, 150);
        txtPrecio3.setFont(new Font("Bahnschrift", 1, 17));
        panel.add(txtPrecio3);

        ImageIcon Carrito4 = new ImageIcon("Carrito.png");
        JLabel Carrito5 = new JLabel();
        Carrito5.setBounds(xSize + 450, 415, 35, 35);
        Carrito5.setIcon(new ImageIcon(Carrito4.getImage().getScaledInstance(Carrito.getWidth(), Carrito.getHeight(), Image.SCALE_SMOOTH)));
        Carrito5.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                JOptionPane.showMessageDialog(null, "El producto ha sido añadido al carrito");
                agregarAlCarrito("Chocohelado", 20.000);
            }

        });
        panel.add(Carrito5);

        ImageIcon FrutosDBosque1 = new ImageIcon("FrutosDBosque.png");
        JLabel FrutosDBosque = new JLabel();
        FrutosDBosque.setBounds(xSize+520, 230, 140, 150);
        FrutosDBosque.setIcon(new ImageIcon(FrutosDBosque1.getImage().getScaledInstance(FrutosDBosque.getWidth(), FrutosDBosque.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(FrutosDBosque);

        JLabel txtFrutosDBosque = new JLabel("<html>Frutos de<br>bosque</html>");
        txtFrutosDBosque.setBounds(605, 340, 140, 150);
        txtFrutosDBosque.setFont(new Font("Bahnschrift", 1, 20));
        panel.add(txtFrutosDBosque);

        JLabel txtPrecio4 = new JLabel("12.000");
        txtPrecio4.setBounds(640, 375, 160, 150);
        txtPrecio4.setFont(new Font("Bahnschrift", 1, 17));
        panel.add(txtPrecio4);

        ImageIcon Carrito6 = new ImageIcon("Carrito.png");
        JLabel Carrito7 = new JLabel();
        Carrito7.setBounds(xSize + 625, 425, 35, 35);
        Carrito7.setIcon(new ImageIcon(Carrito6.getImage().getScaledInstance(Carrito.getWidth(), Carrito.getHeight(), Image.SCALE_SMOOTH)));
        Carrito7.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                JOptionPane.showMessageDialog(null, "El producto ha sido añadido al carrito");
                agregarAlCarrito("<html>Frutos de <br>bosque</html>", 57.000);
            }

        });
        panel.add(Carrito7);

        ImageIcon SalpiconHelado1 = new ImageIcon("Salpicon Helado.png");
        JLabel SalpiconHelado = new JLabel();
        SalpiconHelado.setBounds(xSize+690, 230, 140, 150);
        SalpiconHelado.setIcon(new ImageIcon(SalpiconHelado1.getImage().getScaledInstance(SalpiconHelado.getWidth(), SalpiconHelado.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(SalpiconHelado);

        JLabel txtSalpiconHelado = new JLabel("SalpiconHelado");
        txtSalpiconHelado.setBounds(780, 330, 140, 150);
        txtSalpiconHelado.setFont(new Font("Bahnschrift", 1, 20));
        panel.add(txtSalpiconHelado);

        JLabel txtPrecio5 = new JLabel("60.000");
        txtPrecio5.setBounds(810, 370, 160, 150);
        txtPrecio5.setFont(new Font("Bahnschrift", 1, 17));
        panel.add(txtPrecio5);

        ImageIcon Carrito8 = new ImageIcon("Carrito.png");
        JLabel Carrito9 = new JLabel();
        Carrito9.setBounds(xSize + 790, 420, 35, 35);
        Carrito9.setIcon(new ImageIcon(Carrito8.getImage().getScaledInstance(Carrito.getWidth(), Carrito.getHeight(), Image.SCALE_SMOOTH)));
        Carrito9.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                JOptionPane.showMessageDialog(null, "El producto ha sido añadido al carrito");
                agregarAlCarrito("SalpiconHelado", 14.000);
            }

        });
        panel.add(Carrito9);

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
        panel.setComponentZOrder(Facebook1, 2);
        panel.setComponentZOrder(Instagram1, 2);
        panel.setComponentZOrder(Whatsaap1, 2);
        panel.setComponentZOrder(txt6,2);
        panel.setComponentZOrder(txt7,2);
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

    }

    private void abrirVentanaContacto() {
        VentanaContacto vContacto = new VentanaContacto();
        vContacto.setVisible(true);
        this.setVisible(false);
    }

    public void agregarAlCarrito(String producto, double precio) {
        carritoProductos.add(producto);
        carritoPrecios.add(precio);
        cantidadesProductos.add(1);
        mostrarCarrito();
        
    }

    public double calcularTotal(ArrayList<Double> precios, ArrayList<Integer> cantidades) {
        double total = 0.0;
        for (int i = 0; i < precios.size(); i++) {
            total += precios.get(i) * cantidades.get(i);
        }
        return total;
    }

    public void mostrarCarrito() {
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

    public void colocarProductosEnCarrito(JPanel panelCarrito) {
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

    public void colocarProductoEnCarrito(JPanel panelCarrito, int index, int ySizeProducto) {
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

    public void colocarMetodoPago(JPanel panelCarrito, int ySize) {
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