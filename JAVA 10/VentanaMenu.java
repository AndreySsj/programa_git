import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.ColorUIResource;


public class VentanaMenu extends JFrame{
    public JPanel panel;
    public JPanel panel2;


    public VentanaMenu(){
        this.setSize(1016, 1100);
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


        int xSize = 30;
        ImageIcon tortaMenu1 = new ImageIcon("tortaMenu.png");
        JLabel torta1 = new JLabel();
        torta1.setBounds(xSize, 230, 140, 150);
        torta1.setIcon(new ImageIcon(tortaMenu1.getImage().getScaledInstance(torta1.getWidth(), torta1.getHeight(), Image.SCALE_SMOOTH)));
        torta1.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                abrirVentanaTortas();
            }
        });
        panel.add(torta1);

        JLabel txtTorta1 = new JLabel("Tortas");
        txtTorta1.setBounds(70, 320, 140, 150);
        txtTorta1.setFont(new Font("Bahnschrift", 1, 20));
        panel.add(txtTorta1);

        ImageIcon malteadasMenu1 = new ImageIcon("malteadasMenu.png");
        JLabel malteadas = new JLabel();
        malteadas.setBounds(xSize + 180, 230, 140, 150);
        malteadas.setIcon(new ImageIcon(malteadasMenu1.getImage().getScaledInstance(malteadas.getWidth(), malteadas.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(malteadas);

        JLabel txtMalteadasMenu1 = new JLabel("Malteadas");
        txtMalteadasMenu1.setBounds(230, 320, 140, 150);
        txtMalteadasMenu1.setFont(new Font("Bahnschrift", 1, 20));
        panel.add(txtMalteadasMenu1);

        ImageIcon heladosMenu1 = new ImageIcon("heladosMenu.png");
        JLabel helados = new JLabel();
        helados.setBounds(xSize + 350, 230, 140, 150);
        helados.setIcon(new ImageIcon(heladosMenu1.getImage().getScaledInstance(helados.getWidth(), helados.getHeight(), Image.SCALE_SMOOTH)));
        helados.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                abrirVentanaHelados();
            }
        });
        panel.add(helados);

        JLabel txtheladosMenu1 = new JLabel("Helados");
        txtheladosMenu1.setBounds(420, 320, 140, 150);
        txtheladosMenu1.setFont(new Font("Bahnschrift", 1, 20));
        panel.add(txtheladosMenu1);

        ImageIcon ensaladasMenu1 = new ImageIcon("ensaladasMenu.png");
        JLabel ensaladas = new JLabel();
        ensaladas.setBounds(xSize+520, 230, 140, 150);
        ensaladas.setIcon(new ImageIcon(ensaladasMenu1.getImage().getScaledInstance(ensaladas.getWidth(), ensaladas.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(ensaladas);

        JLabel txtensaladasMenu1 = new JLabel("<html>Ensaladas<br> de fruta</html>");
        txtensaladasMenu1.setBounds(560, 330, 140, 150);
        txtensaladasMenu1.setFont(new Font("Bahnschrift", 1, 20));
        panel.add(txtensaladasMenu1);

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

    private void abrirVentanaTortas() {
        VentanaTortas vTortas = new VentanaTortas();
        vTortas.setVisible(true);
        this.setVisible(false);
    }

    private void abrirVentanaHelados() {
        VentanaHelados vHelados = new VentanaHelados();
        vHelados.setVisible(true);
        this.setVisible(false);
    }
    
}
