import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.ColorUIResource;



public class VentanaQuienesSomos extends JFrame {
    public JPanel panel;
    public JPanel panel2;
    public JPanel panel3;

    public VentanaQuienesSomos(){
        this.setSize(1016, 1000);
        this.setLocationRelativeTo(null);
        iniciarComponentes();

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    private void iniciarComponentes(){
        colocarPaneles();
        colocarEtiquetas();
    }

    private void colocarPaneles(){
        panel =  new JPanel(new BorderLayout());
        panel.setLayout(null);
        panel.setBackground(Color.WHITE);
        this.getContentPane().add(panel);

        panel2 = new JPanel();
        panel2.setBackground(Color.WHITE);
        panel2.setBounds(50, 240, 900, 300);
        panel2.setLayout(null);
        panel.add(panel2);

        panel3 = new JPanel();
        panel3.setLayout(null);
        panel3.setBackground(new ColorUIResource(255, 161, 170));
        panel3.setBounds(0, 550, 1000, 150);
        panel.add(panel3);
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

        ImageIcon imagenQuienesSomos = new ImageIcon("imagenQuienesSomos.png");
        JLabel imagenQsomos = new JLabel();
        imagenQsomos.setIcon(new ImageIcon(imagenQuienesSomos.getImage().getScaledInstance(200, 300, Image.SCALE_SMOOTH)));
        imagenQsomos.setBounds(680, 25, 200, 260);
        panel2.add(imagenQsomos);

        JLabel txtImg1 = new JLabel("<html>Heladeria el punto D es una empresa comercializadora <br> de helados, ensaladas de frutas, malteadas, tortas,<br> postres y demás productos, que desea brindar la mejor<br> calidad y atención a sus clientes para deleitar su <br> paladar con nuestros maravillosos productos.<br>" );
        txtImg1.setBounds(10, 5, 900, 180);
        txtImg1.setFont(new Font("Bahnschrift", 0, 27));
        panel2.add(txtImg1);

        JLabel txtImg2 = new JLabel("<html>Queremos llegar a ser la heladeria favorita de los <br> habitantes del municipio de Los Patios y su area<br>metropolitana.</html>");
        txtImg2.setBounds(10, 5, 900, 480);
        txtImg2.setFont(new Font("Bahnschrift", 0, 27));
        panel2.add(txtImg2);

        panel.setComponentZOrder(banner2, 1);
        panel.setComponentZOrder(logo2, 0);

        JLabel inicio = new JLabel("Inicio");
        inicio.setBounds(55, 150, 73, 60);
        inicio.setFont(new Font("Cooper Black", 0, 25));
        inicio.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                abrirVentanaInicio();
            }
        });
        panel.add(inicio);

        JLabel domicilios = new JLabel("Domicilios");
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
        menu.setBounds(670, 150, 180, 60);
        menu.setFont(new Font("Cooper Black", 0, 25));
        menu.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                abrirVentanaMenu();
            }
        });
        panel.add(menu);

        JLabel contacto = new JLabel("Contacto");
        contacto.setBounds(800, 150, 116, 60);
        contacto.setFont(new Font("Cooper Black", 0, 25));
        contacto.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                abrirVentanaContacto();
            }
        });
        panel.add(contacto);

        /*JTextArea txt1 = new JTextArea();
        txt1.setText("");
        txt1.setFont(new Font("Bahnschrift", 0, 10));
        txt1.setBounds(10, 10, 600, 300);
        txt1.setBackground(Color.GRAY);
        txt1.setEditable(false);
        panel2.add(txt1);

        /*ImageIcon fondo = new ImageIcon("fondo.png");
        JLabel fondo1 = new JLabel();
        fondo1.setBounds(0, 565, 1000, 150);
        fondo1.setIcon(new ImageIcon(fondo.getImage().getScaledInstance(fondo1.getWidth(), fondo1.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(fondo1);*/

        ImageIcon logoA = new ImageIcon("Logo2.png");
        JLabel logo4 = new JLabel();
        logo4.setBounds(30, 570, 140, 110);
        logo4.setIcon(new ImageIcon(logoA.getImage().getScaledInstance(logo4.getWidth(), logo4.getHeight(), Image.SCALE_SMOOTH)));
        panel3.add(logo4);

        JLabel txt6= new JLabel();
        txt6.setText("UNETE A NUESTRAS REDES SOCIALES");
        txt6.setFont(new Font("Bahnschrift", 1, 20));
        txt6.setBounds(180, 600, 600, 40);
        panel3.add(txt6);
    
        JLabel txt7= new JLabel();
        txt7.setText("Visítanos en calle 30 #8-69, Patios Centro, Los Patios");
        txt7.setFont(new Font("Bahnschrift", 1, 20));
        txt7.setBounds(180, 650, 800, 40);
        panel3.add(txt7);

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


        panel.setComponentZOrder(txt6, 0);
        panel.setComponentZOrder(txt7, 1);
        //panel.setComponentZOrder(fondo1, 1);
        panel.setComponentZOrder(logo4, 0);
        panel.setComponentZOrder(Facebook1, 2);
        panel.setComponentZOrder(Instagram1, 2);
        panel.setComponentZOrder(Whatsaap1, 2);

    }

    private void abrirVentanaInicio(){
        VentanaInicio ventanaPrincipal = new VentanaInicio();
        ventanaPrincipal.setVisible(true);
        this.setVisible(false);
    }

    private void abrirVentanaDomicilio() {
        VentanaDomicilio vDomicilio = new VentanaDomicilio();
        vDomicilio.setVisible(true);
    }

    private void abrirVentanaQuienesSomos() {
        VentanaQuienesSomos vQuienesSomos = new VentanaQuienesSomos();
        vQuienesSomos.setVisible(true);
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

}
