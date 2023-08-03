package employee.management.system;

import java.awt.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;
import java.util.*;
import java.awt.event.*;

public class AddEmployee extends JFrame implements ActionListener{
    
    Random ran = new Random();
    int number = ran.nextInt(999999);
    
    JTextField tfname, tffname, tfaddress, tfphone, tfaadhar, tfemail, tfsalary, tfdesignation;
    JDateChooser dcdob;
    JComboBox cbeducation;
    JLabel lblempId;
    JButton add, back;
    
    AddEmployee() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Add Employee Details");
        heading.setBounds(270, 30, 500, 50);
        heading.setFont(new Font("ROMAN_BASELINE", Font.BOLD, 40));
        add(heading);
        
        JLabel labelname = new JLabel("Name");
        labelname.setBounds(110, 150, 150,30);
        labelname.setFont(new Font("ITALIC", Font.BOLD, 20));
        add(labelname);
        
        tfname = new JTextField();
        tfname.setBounds(200, 150, 150, 30);
        add(tfname);
        
        JLabel labelfname = new JLabel("Father's Name");
        labelfname.setBounds(450, 150, 150,30);
        labelfname.setFont(new Font("ITALIC", Font.BOLD, 20));
        add(labelfname);
        
        tffname = new JTextField();
        tffname.setBounds(600, 150, 150, 30);
        add(tffname);
        
        JLabel labeldob = new JLabel("DOB");
        labeldob.setBounds(115, 200, 150,30);
        labeldob.setFont(new Font("ITALIC", Font.BOLD, 20));
        add(labeldob);
        
        dcdob = new JDateChooser();
        dcdob.setBounds(200, 200, 150, 30);
        add(dcdob);
        
        JLabel labelsalary = new JLabel("Salary");
        labelsalary.setBounds(510, 200, 150,30);
        labelsalary.setFont(new Font("ITALIC", Font.BOLD, 20));
        add(labelsalary);
        
        tfsalary = new JTextField();
        tfsalary.setBounds(600, 200, 150, 30);
        add(tfsalary);
        
        JLabel labeladdress = new JLabel("Address");
        labeladdress.setBounds(90, 250, 150,30);
        labeladdress.setFont(new Font("ITALIC", Font.BOLD, 20));
        add(labeladdress);
        
        tfaddress = new JTextField();
        tfaddress.setBounds(200, 250, 150, 30);
        add(tfaddress);
        
        JLabel labelphone = new JLabel("Phone");
        labelphone.setBounds(510, 250, 150,30);
        labelphone.setFont(new Font("ITALIC", Font.BOLD, 20));
        add(labelphone);
        
        tfphone = new JTextField();
        tfphone.setBounds(600, 250, 150, 30);
        add(tfphone); 
        
        JLabel labelemail = new JLabel("Email");
        labelemail.setBounds(100, 300, 150,30);
        labelemail.setFont(new Font("ITALIC", Font.BOLD, 20));
        add(labelemail);
        
        tfemail = new JTextField();
        tfemail.setBounds(200, 300, 150, 30);
        add(tfemail);
        
        JLabel labeleducation = new JLabel("Highest Education");
        labeleducation.setBounds(410, 300, 450, 30);
        labeleducation.setFont(new Font("ITALIC", Font.BOLD, 20));
        add(labeleducation);
        
        String courses[] = {"BCA", "BTECH", "B.SC.CS", "MCA", "M.SC.CS", "MCA", "MTECH", "LLB", "Phd", "MSc Data Science", "MSc Web Development", "MSc CyberSecurity", "MSc Cloud Computing", "MSc Android Developer"};
        cbeducation = new JComboBox(courses);
        cbeducation.setBounds(600, 300, 150, 30);
        add(cbeducation);
        
        JLabel labeldesignation = new JLabel("Designation");
        labeldesignation.setBounds(50, 350, 150, 30);
        labeldesignation.setFont(new Font("ITALIC", Font.BOLD, 20));
        add(labeldesignation);
        
        tfdesignation = new JTextField();
        tfdesignation.setBounds(200, 350, 150, 30);
        add(tfdesignation);
        
        JLabel labelaadhar = new JLabel("Aadhar Number");
        labelaadhar.setBounds(430, 350, 190, 30);
        labelaadhar.setFont(new Font("ITALIC", Font.BOLD, 20));
        add(labelaadhar);
        
        tfaadhar = new JTextField();
        tfaadhar.setBounds(600, 350, 150, 30);
        add(tfaadhar);
        
        JLabel labelempId = new JLabel("Employee id");
        labelempId.setBounds(50, 400, 150, 30);
        labelempId.setFont(new Font("ITALIC", Font.ITALIC, 20));
        add(labelempId);
        
        lblempId = new JLabel("" + number);
        lblempId.setBounds(200, 400, 150, 30);
        lblempId.setFont(new Font("ITALIC", Font.ITALIC, 20));
        add(lblempId);
        
        add = new JButton("Add Details :");
        add.setBounds(250, 550, 150, 40);
        add.addActionListener(this);
        add.setBackground(Color.LIGHT_GRAY);
        add.setForeground(Color.darkGray);
        add(add);
        
        back = new JButton("Back :");
        back.setBounds(450, 550, 150, 40);
        back.addActionListener(this);
        back.setBackground(Color.LIGHT_GRAY);
        back.setForeground(Color.darkGray);
        add(back);
        
        setSize(900, 700);
        setLocation(300, 50);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == add) {
            String name = tfname.getText();
            String fname = tffname.getText();
            String dob = ((JTextField) dcdob.getDateEditor().getUiComponent()).getText();
            String salary = tfsalary.getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            String education = (String) cbeducation.getSelectedItem();
            String designation = tfdesignation.getText();
            String aadhar = tfaadhar.getText();
            String empId = lblempId.getText();
            
            try {
                Conn conn = new Conn();
                String query = "insert into employee values('"+name+"', '"+fname+"', '"+dob+"', '"+salary+"', '"+address+"', '"+phone+"', '"+email+"', '"+education+"', '"+designation+"', '"+aadhar+"', '"+empId+"')";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Details added successfully");
                setVisible(false);
                new Home();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            setVisible(false);
            new Home();
        }
    }
    
    public static void main (String[] args){
        new AddEmployee();
    }
}
