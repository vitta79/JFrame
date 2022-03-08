/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author vitta
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;
public class quizHazirlik extends JFrame{
    
    public quizHazirlik() {
        setTitle("Ana Sayfa");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(500,350);
        setLocationRelativeTo(null);
      //  setBounds(95, 56, 500, 300);
    }

    @Override
     addKeyListener(new KeyAdapter(){
        public void keyPressed(KeyEvent evt){
            formKeyPressed(evt);
        }
    }) ;
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new quizHazirlik();
        JTextField txt=new JTextField();
        txt.setSize(100, 30);
        txt.setVisible(true);
        txt.setLocation(100, 60);
        
        JLabel lbl1=new JLabel("Hello World", SwingConstants.CENTER);
        lbl1.setVisible(true);
        
    } 
    public void formKeyPressed(KeyEvent e){
        System.out.println("keyy");
}
    
}
