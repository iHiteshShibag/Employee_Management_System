package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Home extends JFrame implements ActionListener{
    
    JButton  View, Add, Update, Remove;
    
    Home() {
        
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon("C:\\Users\\CS\\Documents\\NetBeansProjects\\Employee Management System\\src\\icons\\home1.jpg");
        Image i2 = i1.getImage().getScaledInstance(1200, 630, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1120, 630);
        add(image);
        
        JLabel heading = new JLabel("Employee Management System");
        heading.setBounds(35, 20, 400, 40);
        heading.setFont(new Font("Raleway", Font.ITALIC, 25));
        image.add(heading);
        
        Add = new JButton("Add Employee");
        Add.setBounds(50, 80, 150, 40);
        Add.addActionListener(this);
        image.add(Add);
        
        View = new JButton("View Employees");
        View.setBounds(220, 80, 150, 40);
        View.addActionListener(this);
        image.add(View);
        
        Update = new JButton("Update Employee");
        Update.setBounds(50, 140, 150, 40);
        Update.addActionListener(this);
        image.add(Update);
        
        Remove = new JButton("Remove Employee");
        Remove.setBounds(220, 140, 150, 40);
        Remove.addActionListener(this);
        image.add(Remove);
        
        setSize(1120, 630);
        setLocation(250, 100);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == Add) {
            setVisible(false);
            new AddEmployee();
        } else if (ae.getSource() == View) {
            setVisible(false);
            new ViewEmployee();
        } else if (ae.getSource() == Update) {
            setVisible(false);
            new ViewEmployee();
        } else if (ae.getSource() == Remove) {
            setVisible(false);
            new RemoveEmployee();
        }
             
    }
    
    public static void main(String[] args) {
        new Home();
    }
}