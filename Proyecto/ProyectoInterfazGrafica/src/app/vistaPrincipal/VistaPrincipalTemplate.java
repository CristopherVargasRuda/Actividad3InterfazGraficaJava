
package app.vistaPrincipal;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VistaPrincipalTemplate extends JFrame{
    
     private JPanel panel;
    private JLabel label;
    
    public VistaPrincipalTemplate(){
    super("Vista Principal");
    
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1200, 700);
        setLocationRelativeTo(this);
        //setUndecorated(true);
        this.getContentPane().setBackground(Color.cyan);
        setLayout(null);
        setVisible(true);
    }
    
    public void saludar(){
        String saludo = "hola mundo";
        System.out.println(saludo);
    }
}
