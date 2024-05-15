import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class VentanaRegistrarse extends JFrame {
    public JLabel registrate;
    public JPanel panel;
    public JLabel nombre;
    public JLabel correo;
    public JLabel contraseña;
    public JLabel confirmContraseña;
    public JLabel txtYaCuenta;
    public JLabel txtIniciarSesion;
    public JTextField fieldNombre;
    public JTextField fieldCorreo;
    public JPasswordField fieldContraseña;
    public JPasswordField fieldConfirmContra;
    public JButton btnRegistrate;

    int xSize = 150;
    int ySize = 50;

    public VentanaRegistrarse(){
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);

        iniciarComponentes();

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void iniciarComponentes(){
        colocarPaneles();
        colocarEtiquetas();
        colocarBotones();
    }

    private void colocarPaneles(){
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }

    private void colocarEtiquetas(){

        registrate = new JLabel("Registrate");
        registrate.setBounds(xSize, ySize, 200,40);
        registrate.setFont(new Font("Bahnschrift", 3, 40));
        registrate.setForeground(Color.BLACK);
        panel.add(registrate);

        nombre = new JLabel("Ingresa tu nombre");
        nombre.setBounds(xSize - 60, ySize + 40, 200,40);
        nombre.setFont(new Font("Bahnschrift", 0, 16));
        nombre.setForeground(Color.BLACK);
        panel.add(nombre);

        fieldNombre = new JTextField();
        fieldNombre.setBounds(xSize - 60, ySize + 70, 300, 30);
        panel.add(fieldNombre);

        correo = new JLabel("Ingresa tu correo");
        correo.setBounds(xSize - 60, ySize + 100, 200,40);
        correo.setFont(new Font("Bahnschrift", 0, 16));
        correo.setForeground(Color.BLACK);
        panel.add(correo);

        fieldCorreo = new JTextField();
        fieldCorreo.setBounds(xSize - 60, ySize + 130, 300, 30);
        panel.add(fieldCorreo);

        contraseña = new JLabel("Ingresa tu contraseña");
        contraseña.setBounds(xSize - 60, ySize + 160, 200,40);
        contraseña.setFont(new Font("Bahnschrift", 0, 16));
        contraseña.setForeground(Color.BLACK);
        panel.add(contraseña);

        fieldContraseña = new JPasswordField();
        fieldContraseña.setBounds(xSize - 60, ySize + 190, 300,30);
        panel.add (fieldContraseña);

        confirmContraseña = new JLabel("confirma tu contraseña");
        confirmContraseña.setBounds(xSize - 60, ySize + 220, 200,40);
        confirmContraseña.setFont(new Font("Bahnschrift", 0, 16));
        confirmContraseña.setForeground(Color.BLACK);
        panel.add(confirmContraseña);

        fieldConfirmContra = new JPasswordField();
        fieldConfirmContra.setBounds(xSize - 60, ySize + 250, 300,30);
        panel.add (fieldConfirmContra);

        txtYaCuenta = new JLabel("¿Ya tienes una cuenta?");
        txtYaCuenta.setBounds(xSize - 60, ySize + 280, 300,30);
        txtYaCuenta.setFont(new Font("Arial", 0, 13));
        panel.add(txtYaCuenta);

        txtIniciarSesion = new JLabel("Iniciar Sesion");
        txtIniciarSesion.setBounds(xSize + 90, ySize + 280, 300,30);
        txtIniciarSesion.setFont(new Font("Arial", 1, 13));
        txtIniciarSesion.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
            abrirVentanaLogin();
            }
        });
        panel.add(txtIniciarSesion);

    }

    private void colocarBotones(){
        btnRegistrate = new JButton("Registrate");
        btnRegistrate.setBounds(xSize, ySize + 320, 200,40);
        btnRegistrate.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                fieldNombre.setEditable(false);
                fieldCorreo.setEditable(false);
                fieldContraseña.setEditable(false);
                fieldConfirmContra.setEditable(false);
                JOptionPane.showMessageDialog(null, "Te has registrado correctamente.");
                abrirVentanaLogin();
            }

        });
        panel.add(btnRegistrate);
    }

    private void abrirVentanaLogin(){
        VentanaLogin vLogin = new VentanaLogin();
        vLogin.setVisible(true);
        this.setVisible(false);
    }
}
