import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.plaf.ColorUIResource;

public class VentanaLogin extends JFrame {
    public JPanel panel;
    //public JPanel panel3;
    public JLabel txtLogin;
    public JLabel txtRecuerdame;
    public JLabel txtNoCuenta;
    public JLabel txtRegistrate;
    public JLabel txtOlviContra;

    public JTextField Usuario;
    public JPasswordField Contraseña;
    public JButton btnLogin;
    public JButton btnCrearCuenta;

    int xSize = 180;
    int ySize = 70;

    public VentanaLogin(){
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        iniciarComponentes();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    

    private void iniciarComponentes(){
        colocarPaneles();
        colocarEtiquetas();
        //colocarBotonGuardar();
        colocarBotones();
    }

    private void colocarPaneles(){
        panel =  new JPanel(new BorderLayout());
        panel.setLayout(null);
        panel.setBackground(new ColorUIResource(250, 223, 252));
        this.getContentPane().add(panel);



        /*panel3 =  new JPanel(new BorderLayout());
        panel3.setLayout(null);
        panel3.setBackground(Color.PINK);
        panel3.setBounds(150,190, 200,30 );
        panel.add(panel3);*/

    }

    private void colocarEtiquetas(){

        txtLogin = new JLabel("Login");
        txtLogin.setBounds(xSize, ySize, 200,40);
        txtLogin.setFont(new Font("Bahnschrift", 3, 40));
        txtLogin.setForeground(Color.BLACK);
        panel.add(txtLogin);

        Usuario = new JTextField("Username");
        Usuario.setBounds(xSize-40, ySize + 60, 200,30);
        Usuario.setFont(new Font("Arial", 0, 15));
        panel.add(Usuario);

        Contraseña = new JPasswordField("Password");
        Contraseña.setBounds(xSize-40, ySize + 110, 200,30);
        Contraseña.setFont(new Font("Arial", 0, 15));
        panel.add(Contraseña);

        txtRecuerdame = new JLabel("Recuerdame");
        txtRecuerdame.setBounds(xSize - 20, ySize + 142, 200,40);
        txtRecuerdame.setFont(new Font("Arial", 0, 13));
        txtRecuerdame.setForeground(Color.BLACK);
        panel.add(txtRecuerdame);

        txtOlviContra = new JLabel("<html>¿Olvidaste la<br> contraseña?</html>");
        txtOlviContra.setBounds(xSize + 80, ySize + 142, 300,40);
        txtOlviContra.setFont(new Font("Arial", 1, 13));
        txtOlviContra.setForeground(Color.BLACK);
        txtOlviContra.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                JOptionPane.showMessageDialog(null, "Se ha enviado un codigo a tu correo");

            }

        });
        panel.add(txtOlviContra);


        txtNoCuenta = new JLabel("No tienes una cuenta?");
        txtNoCuenta.setBounds(xSize - 40, ySize + 230, 200,40);
        txtNoCuenta.setFont(new Font("Arial", 0, 13));
        txtNoCuenta.setForeground(Color.BLACK);
        panel.add(txtNoCuenta);

        txtRegistrate = new JLabel("Registrate");
        txtRegistrate.setBounds(xSize + 100, ySize + 230, 200,40);
        txtRegistrate.setFont(new Font("Arial", 1, 13));
        txtRegistrate.setForeground(Color.BLACK);
        txtRegistrate.addMouseListener(new MouseAdapter() {
           @Override
           public void mouseClicked(MouseEvent e){
            abrirVentanaRegistrarse();
           } 
        });
        panel.add(txtRegistrate);


        /*JLabel txt8= new JLabel();
        txt8.setText("Login");
        txt8.setFont(new Font("Bahnschrift", 1, 30));
        txt8.setBounds(210, 80, 800, 40);
        panel.add(txt8);*/
    


    }

    private void colocarBotones(){
        btnLogin = new JButton("Iniciar Sesion");
        btnLogin.setBounds(140, ySize + 190, 200,40);
        btnLogin.setFont(new Font("Arial", 0, 20));
        btnLogin.setBackground(new ColorUIResource(249, 192, 248));
        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == btnLogin) {
                    String user = Usuario.getText();
                    String contra = Contraseña.getText();
                    
                    if (user.isEmpty() || contra.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Completa todos los campos");
                    } else {
                        if (user.equals("usuario123") && contra.equals("123456789")) {
                            JOptionPane.showMessageDialog(null, "Bienvenido");
                            abrirVentanaInicio();
                        } else {
                            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
                        }
                    }
                }
            }
        });
        panel.add(btnLogin);


        JCheckBox checkRecuerdame = new JCheckBox();
        checkRecuerdame.setBounds(xSize-40, ySize + 150, 20,20);
        checkRecuerdame.setOpaque(false);
        panel.add(checkRecuerdame);
    }

    private void abrirVentanaRegistrarse(){
        VentanaRegistrarse vRegistrarse = new VentanaRegistrarse();
        vRegistrarse.setVisible(true);
        this.setVisible(false);
    }

    private void abrirVentanaInicio(){
        VentanaInicio ventanaPrincipal = new VentanaInicio();
        ventanaPrincipal.setVisible(true);
        this.setVisible(false);
    }




            

    /*private void colocarBotonGuardar() {
        JButton guardarButton = new JButton("Guardar");
        guardarButton.setBounds(800, 535, 100, 30);
        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GuardarInformacion();
            }
        });
        panel.add(guardarButton);
    }*/

    /*public void GuardarInformacion() {
        String nombre = Nombre1.getText();
        String email = Email1.getText();
        String telefono = Telefono1.getText();
        String asunto = Asunto1.getText();
        String mensaje = Mensaje1.getText();
    
        JOptionPane.showMessageDialog(null, "Información guardada correctamente");
    }*/

}

