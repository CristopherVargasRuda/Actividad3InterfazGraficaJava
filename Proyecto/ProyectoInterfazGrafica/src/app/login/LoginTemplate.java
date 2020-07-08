
package app.login;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;


public class LoginTemplate extends JFrame{


    private JPanel pInferior, pSuperior;
    private JLabel lEslogan, lTituloLogin, lNotificaciones, lRegistro, lCondiciones, lCondiciones2;
    private JTextField tNombreUsuario; 
    private JPasswordField tClaveUsuario;
    private JButton bEntrar, bCerrar, bRegistrarse, bMaximizar, bMinimizar;
    private JCheckBox checkRecuerdame;
    private Color colorFondo, colorSpotify;
    private Font fontTPrincipal, fontTitulo, fontSubtitulo, fontBoton, fontSubtitulo2, fontPanel, fontCondiciones;
    private Cursor cMano;
    private Border border, border2, border3;
    private ImageIcon iLogo, iUsuario, iClave, iCerrar, iMaximizar, iMinimizar, iFacebook, iTwitter, iYoutube,  iDimAux;
    private JLabel lLogo, lUsuario, lClave, lFacebook, lTwitter, lYoutube;
    
    
    public LoginTemplate() {
        super("Login Usuario");//Titulo de la app
        
        //Decoradores
        
        //Color
        
        colorFondo = new Color(24, 26, 27);
        colorSpotify = new Color(25, 158, 72);
        
        
        
        //Font
        
        fontTPrincipal = new Font("Arial Rounded MT Bold", Font.PLAIN, 32);
        fontTitulo = new Font("Arial Rounded MT Bold", Font.PLAIN, 16);
        fontSubtitulo = new Font("book antiqua", Font.PLAIN, 15);
        fontSubtitulo2 = new Font("book antiqua", Font.PLAIN, 17);
        fontBoton = new Font("arial black", Font.PLAIN, 15);
        fontPanel = new Font("Times New Roman", Font.PLAIN, 17);
        fontCondiciones = new Font("Times New Roman black", Font.PLAIN, 9);
        
        //Cursos
        
        cMano = new Cursor(Cursor.HAND_CURSOR);//Cursor en forma de mano
        
        //Borders
        
        border = BorderFactory.createMatteBorder(0, 0, 2, 0, colorSpotify);
        border2 = BorderFactory.createMatteBorder(0, 0, 1, 0, colorSpotify);
        border3 = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.DARK_GRAY);
        
        //ImageIcon
        
        iLogo = new ImageIcon("resources/img/logo.png");
        iUsuario = new ImageIcon("resources/img/usuario.png");
        iClave = new ImageIcon("resources/img/clave.png");
        iFacebook = new ImageIcon("resources/img/facebook.png");
        iTwitter = new ImageIcon("resources/img/twitter.png");
        iYoutube = new ImageIcon("resources/img/youtube.png");
        iCerrar = new ImageIcon("resources/img/botonRojo.png");
        iMaximizar = new ImageIcon("resources/img/botonAmarillo.png");
        iMinimizar = new ImageIcon("resources/img/botonVerde.png");
        
        //JPanel

        
        pSuperior=new JPanel();//Ejemplificación
        pSuperior.setBounds(0, 0, 1200, 140);//posición y tamaño a través del setBounds
        pSuperior.setBorder(border3);
        pSuperior.setBackground(colorFondo);//Color del fondo
        pSuperior.setLayout(null);//Anular el Layout: Diseño por defecto
        this.add(pSuperior);//Añadir a la clase / al JFrame
        
        pInferior=new JPanel();
        pInferior.setBounds(0, 140, 1200, 510);
        pInferior.setBackground(colorFondo);
        pInferior.setLayout(null);
        this.add(pInferior);
        
       //JLabel
       

        lEslogan = new JLabel("Música Para Todos");
        lEslogan.setSize(320, 35);//Tamaño
        lEslogan.setLocation((pInferior.getWidth() - lEslogan.getWidth()) / 2, 20);//ubicación
        lEslogan.setForeground(Color.WHITE);
        lEslogan.setFont(fontTPrincipal);
        lEslogan.setHorizontalAlignment(SwingConstants.CENTER);
        pInferior.add(lEslogan);

        lTituloLogin = new JLabel("Para continuar, inicia sesión en Spotify");
        lTituloLogin.setSize(400, 30);
        lTituloLogin.setLocation((pInferior.getWidth() - lTituloLogin.getWidth()) / 2, 75);
        lTituloLogin.setForeground(Color.WHITE);
        lTituloLogin.setFont(fontTitulo);
        lTituloLogin.setHorizontalAlignment(SwingConstants.CENTER);
        pInferior.add(lTituloLogin);

        lNotificaciones = new JLabel("¿Has olvidado tu contraseña?");
        lNotificaciones.setSize(350, 43);
        lNotificaciones.setLocation((pInferior.getWidth() - lNotificaciones.getWidth()) / 2, 325);
        lNotificaciones.setForeground(colorSpotify);
        lNotificaciones.setFont(fontSubtitulo);
        lNotificaciones.setBorder(border3);
        lNotificaciones.setHorizontalAlignment(SwingConstants.CENTER);
        pInferior.add(lNotificaciones);
        
        lRegistro = new JLabel("¿No tienes cuenta?");
        lRegistro.setSize(250, 40);
        lRegistro.setLocation((pInferior.getWidth() - lRegistro.getWidth()) / 2, 365);
        lRegistro.setForeground(Color.WHITE);
        lRegistro.setFont(fontSubtitulo2);
        lRegistro.setHorizontalAlignment(SwingConstants.CENTER);
        pInferior.add(lRegistro);
        
        
        lCondiciones = new JLabel();
        lCondiciones.setText("Si haces clic en iniciar sesión con Facebook y "
                + "no eres usuario de Spotify, pasarás a estar");
        lCondiciones.setSize(400, 15);
        lCondiciones.setLocation((pInferior.getWidth() - lCondiciones.getWidth()) / 2, 475);
        lCondiciones.setForeground(Color.WHITE);
        lCondiciones.setFont(fontCondiciones);
        lCondiciones.setHorizontalAlignment(SwingConstants.CENTER);
        pInferior.add(lCondiciones);
        
        lCondiciones2 = new JLabel();
        lCondiciones2.setText("registrado y aceptas los Términos y Condiciones "
                + "y la Política de Privacidad de Spotify.");
        lCondiciones2.setSize(415, 15);
        lCondiciones2.setLocation((pInferior.getWidth() - lCondiciones2.getWidth()) / 2, 490);
        lCondiciones2.setForeground(Color.WHITE);
        lCondiciones2.setFont(fontCondiciones);
        lCondiciones2.setHorizontalAlignment(SwingConstants.CENTER);
        pInferior.add(lCondiciones2);
        
        
        //jTextField
        

        tNombreUsuario = new JTextField("Dirección de correo o Nombre de usuario");
        tNombreUsuario.setSize(420, 40);
        tNombreUsuario.setBorder(border);
        tNombreUsuario.setLocation((pInferior.getWidth() - tNombreUsuario.getWidth()) / 2, 125);
        tNombreUsuario.setForeground(Color.white);
        tNombreUsuario.setBackground(Color.DARK_GRAY);
        tNombreUsuario.setFont(fontPanel);
        tNombreUsuario.setCaretColor(colorSpotify);//Color del caret(la linea que parpadea indicando la posición de texto para escribir)
        tNombreUsuario.setHorizontalAlignment(SwingConstants.CENTER);
        pInferior.add(tNombreUsuario);   
        
        //JPasswordField
        

        tClaveUsuario = new JPasswordField("clave Usuario");
        tClaveUsuario.setSize(420, 40);
        tClaveUsuario.setBorder(border);
        tClaveUsuario.setLocation((pInferior.getWidth() - tClaveUsuario.getWidth()) / 2, 180);
        tClaveUsuario.setForeground(Color.white);
        tClaveUsuario.setBackground(Color.DARK_GRAY);
        tClaveUsuario.setFont(fontPanel);
        tClaveUsuario.setCaretColor(colorSpotify);
        tClaveUsuario.setHorizontalAlignment(SwingConstants.CENTER);
        pInferior.add(tClaveUsuario);
        
     

        //JButton
        

        
        bEntrar = new JButton("INICIAR SESIÓN");
        bEntrar.setSize(250, 45);
        bEntrar.setLocation((pInferior.getWidth() - bEntrar.getWidth()) / 2, 240);
        bEntrar.setBackground(colorSpotify);
        bEntrar.setForeground(Color.WHITE);
        bEntrar.setFont(fontBoton);
        bEntrar.setCursor(cMano);
        bEntrar.setBorder(null);
        bEntrar.setFocusable(false);//Quita el cuadro que bordea el texto del botón
        pInferior.add(bEntrar);

        bRegistrarse = new JButton("REGISTRATE");
        bRegistrarse.setSize(220, 45);
        bRegistrarse.setLocation((pInferior.getWidth() - bRegistrarse.getWidth()) / 2, 420);
        bRegistrarse.setFocusable(false);
        bRegistrarse.setBackground(colorSpotify);
        bRegistrarse.setForeground(Color.WHITE);
        bRegistrarse.setFont(fontBoton);
        bRegistrarse.setBorder(null);
        bRegistrarse.setCursor(cMano);
        pInferior.add(bRegistrarse);
        
        bCerrar = new JButton();
        bCerrar.setBounds(8, 7, 12, 12);
        bCerrar.setCursor(cMano);
        bCerrar.setContentAreaFilled(false);//Transparencia del boton
        bCerrar.setFocusable(false);//quitar propiedad focusable para completar la transparencia
        bCerrar.setBorder(null);//quitar bordes para completar transparencia
        iDimAux = new ImageIcon(iCerrar.getImage().getScaledInstance(12, 12, Image.SCALE_AREA_AVERAGING));
        bCerrar.setIcon(iDimAux);
        pSuperior.add(bCerrar);
        
        bMaximizar = new JButton();
        bMaximizar.setBounds(23, 7, 12, 12);
        bMaximizar.setCursor(cMano);
        bMaximizar.setContentAreaFilled(false);//Transparencia del boton
        bMaximizar.setFocusable(false);//quitar propiedad focusable para completar la transparencia
        bMaximizar.setBorder(null);//quitar bordes para completar transparencia
        iDimAux = new ImageIcon(iMaximizar.getImage().getScaledInstance(12, 12, Image.SCALE_AREA_AVERAGING));
        bMaximizar.setIcon(iDimAux);
        pSuperior.add(bMaximizar);
        
        bMinimizar = new JButton();
        bMinimizar.setBounds(38, 7, 12, 12);
        bMinimizar.setCursor(cMano);
        bMinimizar.setContentAreaFilled(false);//Transparencia del boton
        bMinimizar.setFocusable(false);//quitar propiedad focusable para completar la transparencia
        bMinimizar.setBorder(null);//quitar bordes para completar transparencia
        iDimAux = new ImageIcon(iMinimizar.getImage().getScaledInstance(12, 12, Image.SCALE_AREA_AVERAGING));
        bMinimizar.setIcon(iDimAux);
        pSuperior.add(bMinimizar);

        
        //JCheckButton
        
        checkRecuerdame = new JCheckBox("Recuérdame");
        checkRecuerdame.setSize(200, 25);
        checkRecuerdame.setFocusable(false);
        checkRecuerdame.setBackground(colorFondo);
        checkRecuerdame.setForeground(colorSpotify);
        checkRecuerdame.setFont(fontSubtitulo);
        checkRecuerdame.setLocation((pInferior.getWidth() - checkRecuerdame.getWidth()) / 2+44, 290);
        checkRecuerdame.setCursor(cMano);
        pInferior.add(checkRecuerdame);
        
        //JLabels para Decoradores a Través de imagenes
        
        iDimAux = new ImageIcon(iLogo.getImage().getScaledInstance(250, 95, Image.SCALE_AREA_AVERAGING));
        lLogo = new JLabel();
        lLogo.setSize(250, 95);
        lLogo.setLocation((pSuperior.getWidth() - lLogo.getWidth())/2, 22);
        lLogo.setIcon(iDimAux);
        pSuperior.add(lLogo);
        
        iDimAux = new ImageIcon(iFacebook.getImage().getScaledInstance(30, 30, Image.SCALE_AREA_AVERAGING));
        lFacebook = new JLabel();
        lFacebook.setBounds(12, 470, 30, 30);
        lFacebook.setIcon(iDimAux);
        pInferior.add(lFacebook);

        iDimAux = new ImageIcon(iTwitter.getImage().getScaledInstance(30, 30, Image.SCALE_AREA_AVERAGING));
        lTwitter = new JLabel();
        lTwitter.setBounds(52, 470, 30, 30);
        lTwitter.setIcon(iDimAux);
        pInferior.add(lTwitter);

        iDimAux = new ImageIcon(iYoutube.getImage().getScaledInstance(30, 30, Image.SCALE_AREA_AVERAGING));
        lYoutube = new JLabel();
        lYoutube.setBounds(92, 470, 30, 30);
        lYoutube.setIcon(iDimAux);
        pInferior.add(lYoutube);
        
        iDimAux = new ImageIcon(iUsuario.getImage().getScaledInstance(30, 30, Image.SCALE_AREA_AVERAGING));
        lUsuario = new JLabel();
        lUsuario.setBounds(355, 130, 30, 30);
        lUsuario.setIcon(iDimAux);
        pInferior.add(lUsuario);

        iDimAux = new ImageIcon(iClave.getImage().getScaledInstance(30, 30, Image.SCALE_AREA_AVERAGING));
        lClave = new JLabel();
        lClave.setBounds(355, 185, 30, 30);
        lClave.setIcon(iDimAux);
        pInferior.add(lClave);
        

        //JFrame
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1200, 650);
        setUndecorated(true);
        setLayout(null);
        setLocationRelativeTo(this);
        setVisible(true);
    }
    
    
    
}
