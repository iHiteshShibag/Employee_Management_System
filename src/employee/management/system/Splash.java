package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Splash extends JFrame implements ActionListener {
   
    Splash() {
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        heading.setBounds(190, 15, 1500, 50);
        heading.setFont(new Font("BOLD", Font.ITALIC, 20));
        heading.setForeground(Color.RED);
        add(heading);
        
        ImageIcon i1 = new ImageIcon("C:\\Users\\CS\\Documents\\NetBeansProjects\\Employee Management System\\src\\icons\\front3.jpg");
        //Image i2 = i1.getImage().getScaledInstance(1500, 900, Image.SCALE_DEFAULT);
        //ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 1260, 600);
        add(image);
        
        JButton clickhere = new JButton ("CLICK HERE TO CONTINUE");
        clickhere.setBounds(950, 500, 189, 70);
        clickhere.setBackground(Color.WHITE);
        clickhere.setForeground(Color.BLUE);
        clickhere.addActionListener(this);
        image.add(clickhere);
        
        
        setSize(1260, 630);
        setLocation(45, 50);
        setVisible(true);
        
//        while(true) {
//            heading.setVisible(true);
//            try {
//                Thread.sleep(500);
//            }catch (Exception e){
//            
//            }
//            heading.setVisible(false);
//            try {
//                Thread.sleep(500);
//            }catch (Exception e){
//            
//            }
//        }
    }

    
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login();
    }
    
    public static void main(String args[]) {
        new Splash();
    }
}
