

package boletin23;

import java.awt.Color;
import java.lang.reflect.Array;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Boletin23 {

    
   
    public static void main(String[] args) {
        
   String [] Array = new String [] {"Opción1", "Opción2", "Opción3"};
        
    //Elementos panel1
        
    JLabel x = new JLabel("Nome");
    x.setLocation(20,10);
    x.setSize(100,75); 
    
    JLabel x1 = new JLabel("Password");
    x1.setLocation(20,50);
    x1.setSize(100,75);
    
    JTextField xText = new JTextField();
    xText.getText();
    xText.setLocation(110,35);
    xText.setSize(70,20);
    
    JPasswordField xText1 = new JPasswordField();
    xText1.getText();
    xText1.setLocation(110,75);
    xText1.setSize(70,20);
    
    JButton bot1 = new JButton("Premer");
    bot1.setLocation(10,140);
    bot1.setSize(85,20);
    
    JButton bot2 = new JButton("Limpar");
    bot2.setLocation(115,140);
    bot2.setSize(85,20);
    
    //Elementos panel2
    
    JList list = new JList();
    list.setLocation(10,240);
    list.setSize(100,100);
    list.setListData(Array);
    
    
    JButton bot3 = new JButton("Boton");
    bot3.setLocation(115,240);
    bot3.setSize(85,20);
    
    JTextArea xText2 = new JTextArea("Escribe...");
    xText2.setLocation(115, 290);
    xText2.setSize(100,50);
    
    
    //panel1
    JPanel panel1 = new JPanel();
    panel1.add(x);
    panel1.add(x1);
    panel1.add(xText);
    panel1.add(xText1);
    panel1.add(bot1);
    panel1.add(bot2);
    panel1.setBackground(Color.lightGray);
    panel1.setLayout(null);
    panel1.setBounds(0,0,210,210);
    
    //panel2
    JPanel panel2 = new JPanel();
    panel2.add(list);
    panel2.add(bot3);
    panel2.add(xText2);
    panel2.setBackground(Color.GRAY);
    panel2.setLayout(null);
    panel2.setBounds(0, 205, 210, 210);
    
    
    
    //ventana
    JFrame window = new JFrame("Formulario");
         
    window.setSize(210, 410);
    
    window.add(panel1);
    window.add(panel2);
    window.setResizable(false);
    
    
    window.setLocation(600,300);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    window.setVisible(true);
    
   
    
    }
    
}
