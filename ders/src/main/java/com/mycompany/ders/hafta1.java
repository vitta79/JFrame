/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ders;

/**
 *
 * @author vitta
 */
import com.sun.java.accessibility.util.AWTEventMonitor;
import java.awt.*;
import java.awt.event.KeyAdapter;
import javax.swing.*;
import javax.swing.text.JTextComponent;
public class hafta1 extends JFrame{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ilk Console Deneme");
        
        JFrame frame1=new JFrame("Ana Sayfa");
        frame1.setTitle("Main Frame");
        frame1.setBounds(50, 60, 450,200);
        
        JLabel label1=new JLabel();
        label1.setText("Hello World");
        
        JButton button1=new JButton();
        button1.setText("next page");
        button1.setLocation(25, 25);
        button1.setVisible(true);
        button1.setSize(100, 30);
        frame1.add(button1);
        frame1.add(label1);
        
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //  frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      //  frame1.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame1.setLocationRelativeTo(null);
        frame1.setVisible(true);
        
    }
     private void buttonActionPerformed(java.awt.event.ActionEvent evt) {    
          hafta2 hf=new hafta2();
          hf.setVisible(true);
     }
    
    
}
