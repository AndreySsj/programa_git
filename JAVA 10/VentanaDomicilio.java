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

public class VentanaDomicilio extends JFrame {
    public JPanel panel;
    public JPanel panel2;

    public VentanaDomicilio(){
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
        panel2.setBounds(0, 550, 1016, 150);
        panel.add(panel2);

       
    }

    private void colocarEtiquetas(){
        ImageIcon banner = new ImageIcon("Banner.png");
        JLabel banner2 = new JLabel();
        banner2.setBounds(0, 0, 1000, 150);
        banner2.setIcon(new ImageIcon(banner.getImage().getScaledInstance(banner2.getWidth(), banner2.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(banner2);

        /*ImageIcon fondo = new ImageIcon("fondo.png");
        JLabel fondo1 = new JLabel();
        fondo1.setBounds(0, 565, 1000, 150);
        fondo1.setIcon(new ImageIcon(fondo.getImage().getScaledInstance(fondo1.getWidth(), fondo1.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(fondo1);*/

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

        ImageIcon logoA = new ImageIcon("Logo2.png");
        JLabel logo3 = new JLabel();
        logo3.setBounds(30, 570, 140, 110);
        logo3.setIcon(new ImageIcon(logoA.getImage().getScaledInstance(logo3.getWidth(), logo3.getHeight(), Image.SCALE_SMOOTH)));
        panel2.add(logo3);

        ImageIcon Facebook = new ImageIcon("Facebook.png");
        JLabel Facebook1 = new JLabel();
        Facebook1.setIcon(new ImageIcon(Facebook.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH)));
        Facebook1.setBounds(760, 530, 170, 230);
        panel2.add(Facebook1);

        ImageIcon Instagram = new ImageIcon("Instagram.png");
        JLabel Instagram1 = new JLabel();
        Instagram1.setIcon(new ImageIcon(Instagram.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH)));
        Instagram1.setBounds(820, 530, 170, 230);
        panel2.add(Instagram1);

        ImageIcon Whatsaap = new ImageIcon("Whatsaap.png");
        JLabel Whatsaap1 = new JLabel();
        Whatsaap1.setIcon(new ImageIcon(Whatsaap.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH)));
        Whatsaap1.setBounds(880, 530, 170, 230);
        panel2.add(Whatsaap1);

        JLabel txt6= new JLabel();
        txt6.setText("UNETE A NUESTRAS REDES SOCIALES");
        txt6.setFont(new Font("Bahnschrift", 1, 20));
        txt6.setBounds(180, 600, 600, 40);
        panel2.add(txt6);
    
        JLabel txt7= new JLabel();
        txt7.setText("Visítanos en calle 30 #8-69, Patios Centro, Los Patios");
        txt7.setFont(new Font("Bahnschrift", 1, 20));
        txt7.setBounds(180, 650, 800, 40);
        panel2.add(txt7);
        


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
}


