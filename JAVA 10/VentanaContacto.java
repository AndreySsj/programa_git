import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Cursor;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaContacto extends JFrame {
    public JPanel panel;
    public JPanel panel2;

    public JTextField Nombre1;
    public JTextField Email1;
    public JTextField Telefono1;
    public JTextField Asunto1;
    public JTextField Mensaje1;

    public VentanaContacto(){
        this.setSize(1016, 1000);
        this.setLocationRelativeTo(null);
        iniciarComponentes();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    
    private void iniciarComponentes(){
        colocarPaneles();
        colocarEtiquetas();
        colocarBotonGuardar();
    }

    private void colocarPaneles(){
        panel =  new JPanel(new BorderLayout());
        panel.setLayout(null);
        panel.setBackground(Color.WHITE);
        this.getContentPane().add(panel);

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

        panel.setComponentZOrder(banner2, 1);
        panel.setComponentZOrder(logo2, 0);

        JLabel inicio = new JLabel("Inicio");
        inicio.setCursor(new Cursor(Cursor.HAND_CURSOR));
        inicio.setBounds(55, 160, 73, 60);
        inicio.setFont(new Font("Cooper Black", 0, 25));
        inicio.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                abrirVentanaInicio();
            }
        });
        panel.add(inicio);

        JLabel domicilios = new JLabel("Domicilios");
        domicilios.setCursor(new Cursor(Cursor.HAND_CURSOR));
        domicilios.setBounds(190, 160, 135, 60);
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
        quienesSomos.setBounds(393, 160, 213, 60);
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
        menu.setBounds(670, 160, 180, 60);
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
        contacto.setBounds(800, 160, 116, 60);
        contacto.setFont(new Font("Cooper Black", 0, 25));
        contacto.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                abrirVentanaContacto();
            }
        });
        panel.add(contacto);

        JLabel txt4 = new JLabel("CONTACTATE CON NOSOTROS");
        txt4.setBounds(300, 210, 500, 60);
        txt4.setForeground(Color.BLUE);
        txt4.setFont(new Font("Cooper Black", 0, 25));
        panel.add(txt4);

        JLabel txt5 = new JLabel("Contáctenos sobre cualquier cosa relacionada con nuestra empresa o nuestros servicios. ");
        txt5.setBounds(50, 250, 5000, 60);
        txt5.setFont(new Font("Bahnschrift", 0, 20));
        panel.add(txt5);

        JLabel txt6 = new JLabel("Haremos todo lo posible por darle respuesta a la brevedad.");
        txt6.setBounds(50, 280, 5000, 60);
        txt6.setFont(new Font("Bahnschrift", 0, 20));
        panel.add(txt6);

        Nombre1 = new JTextField();
        Nombre1.setBounds(250, 360, 500, 25);
        Nombre1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Nombre1.setFont(new Font("Bahnschrift", 0, 20));
        panel.add(Nombre1);

        Email1 = new JTextField();
        Email1.setBounds(250, 400, 500, 25);
        Email1.setFont(new Font("Bahnschrift", 0, 20));
        panel.add(Email1);

        Telefono1 = new JTextField();
        Telefono1.setBounds(250, 450, 500, 25);
        Telefono1.setFont(new Font("Bahnschrift", 0, 20));
        panel.add(Telefono1);

        Asunto1 = new JTextField();
        Asunto1.setBounds(250, 500, 500, 25);
        Asunto1.setFont(new Font("Bahnschrift", 0, 20));
        panel.add(Asunto1);

        Mensaje1 = new JTextField();
        Mensaje1.setBounds(250, 540, 500,25);
        Mensaje1.setFont(new Font("Bahnschrift", 0, 20));
        panel.add(Mensaje1);

        JLabel txt8= new JLabel();
        txt8.setText("Nombre");
        txt8.setFont(new Font("Bahnschrift", 1, 20));
        txt8.setBounds(100, 350, 800, 40);
        panel.add(txt8);
    
        JLabel txt9= new JLabel();
        txt9.setText("E-mail");
        txt9.setFont(new Font("Bahnschrift", 1, 20));
        txt9.setBounds(100, 390, 800, 40);
        panel.add(txt9);

        JLabel txt10= new JLabel();
        txt10.setText("<html>Numero de <Br> Telefono</html>");
        txt10.setFont(new Font("Bahnschrift", 1, 20));
        txt10.setBounds(100, 440, 800, 40);
        panel.add(txt10);
    
        JLabel txt11= new JLabel();
        txt11.setText("Asunto");
        txt11.setFont(new Font("Bahnschrift", 1, 20));
        txt11.setBounds(100, 500, 800, 40);
        panel.add(txt11);

        JLabel txt12= new JLabel();
        txt12.setText("Mensaje");
        txt12.setFont(new Font("Bahnschrift", 1, 20));
        txt12.setBounds(100, 540, 800, 40);
        panel.add(txt12);

        JLabel txt13 = new JLabel("Datos de Contacto");
        txt13.setBounds(50, 580, 500, 60);
        txt13.setForeground(Color.BLUE);
        txt13.setFont(new Font("Cooper Black", 0, 25));
        panel.add(txt13);

        ImageIcon Ubicacion = new ImageIcon("Ubicacion.png");
        JLabel Ubicacion1 = new JLabel();
        Ubicacion1.setIcon(new ImageIcon(Ubicacion.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH)));
        Ubicacion1.setBounds(50, 525, 180, 230);
        panel.add(Ubicacion1);

        JLabel txt14 = new JLabel("Calle 30 #8-69, Patios Centro, Los Patios, Cúcuta");
        txt14.setBounds(90, 530, 500, 230);
        txt14.setFont(new Font("Bahnschrift", 0, 20));
        panel.add(txt14);

        ImageIcon Facebook = new ImageIcon("Facebook.png");
        JLabel Facebook1 = new JLabel();
        Facebook1.setIcon(new ImageIcon(Facebook.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH)));
        Facebook1.setBounds(50, 555, 170, 230);
        panel.add(Facebook1);

        JLabel txt15 = new JLabel("@heladeriaelpuntoD");
        txt15.setBounds(90, 560, 500, 230);
        txt15.setFont(new Font("Bahnschrift", 0, 20));
        panel.add(txt15);

        ImageIcon Instagram = new ImageIcon("Instagram.png");
        JLabel Instagram1 = new JLabel();
        Instagram1.setIcon(new ImageIcon(Instagram.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH)));
        Instagram1.setBounds(300, 555, 170, 230);
        panel.add(Instagram1);

        JLabel txt16 = new JLabel("@heladeriaelpuntoD");
        txt16.setBounds(340, 560, 500, 230);
        txt16.setFont(new Font("Bahnschrift", 0, 20));
        panel.add(txt16);

        ImageIcon Whatsaap = new ImageIcon("Whatsaap.png");
        JLabel Whatsaap1 = new JLabel();
        Whatsaap1.setIcon(new ImageIcon(Whatsaap.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH)));
        Whatsaap1.setBounds(550, 555, 170, 230);
        panel.add(Whatsaap1);

        JLabel txt17 = new JLabel("+57 304 5670727");
        txt17.setBounds(590, 560, 560, 230);
        txt17.setFont(new Font("Bahnschrift", 0, 20));
        panel.add(txt17);

        panel.setComponentZOrder(txt4, 0);
        panel.setComponentZOrder(txt5, 0);
        panel.setComponentZOrder(txt6, 0);
        panel.setComponentZOrder(Nombre1, 0);
        panel.setComponentZOrder(Telefono1, 0);
        panel.setComponentZOrder(Email1, 0);
        panel.setComponentZOrder(Asunto1, 0);
        panel.setComponentZOrder(Mensaje1, 0);
        panel.setComponentZOrder(txt8, 0);
        panel.setComponentZOrder(txt9, 1);
        panel.setComponentZOrder(txt10, 0);
        panel.setComponentZOrder(txt11, 1);
        panel.setComponentZOrder(txt12, 1);
        panel.setComponentZOrder(txt13, 1);
        panel.setComponentZOrder(Ubicacion1, 1);
        panel.setComponentZOrder(txt14, 1);
        panel.setComponentZOrder(Facebook1, 1);
        panel.setComponentZOrder(txt15, 1);
        panel.setComponentZOrder(txt16, 1);
        panel.setComponentZOrder(txt17, 1);

    }

    private void abrirVentanaInicio(){
        VentanaInicio ventanaPrincipal = new VentanaInicio();
        ventanaPrincipal.setVisible(true);
        this.setVisible(false);
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
    }

    private void colocarBotonGuardar() {
        JButton guardarButton = new JButton("Guardar");
        guardarButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        guardarButton.setBounds(800, 535, 100, 30);
        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GuardarInformacion();
                Nombre1.setEditable(false);
                Email1.setEditable(false);
                Telefono1.setEditable(false);
                Asunto1.setEditable(false);
                Mensaje1.setEditable(false);
            }
        });
        panel.add(guardarButton);
    }

    public void GuardarInformacion() {
        String nombre = Nombre1.getText();
        String email = Email1.getText();
        String telefono = Telefono1.getText();
        String asunto = Asunto1.getText();
        String mensaje = Mensaje1.getText();
    
        JOptionPane.showMessageDialog(null, "Información guardada correctamente");
    }

}
