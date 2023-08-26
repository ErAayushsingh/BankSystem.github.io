package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {
    JRadioButton r1,r2,r3,m1,m2,m3;
    JButton next;

    JTextField textName ,textFname, textEmail,textAdd,textcity,textState,textPin;
    JDateChooser dateChooser;
    Random ran = new Random();
    long first4 =(ran.nextLong() % 9000L) +1000L;
    String first = " " + Math.abs(first4);
    Signup(){
        super ("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("img/bank.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(90,90,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,90,90);
        add(image);

        JLabel label1 = new JLabel("APPLICATION FORM NO."+ first);
        label1.setBounds(200,20,550,37);
        label1.setFont(new Font("Raleway",Font.BOLD,30));
        add(label1);

        JLabel label2 = new JLabel("Page 1 : Personal Details");
        label2.setFont(new Font("Ralway",Font.BOLD, 20));
        label2.setBounds(330,70,550,28);
        add(label2);

//        JLabel label3 = new JLabel("");
//        label3.setFont(new Font("Raleway", Font.BOLD,18));
//        label3.setBounds(290,90,550,28);
//        add(label3);

        JLabel labelName = new JLabel("Name :");
        labelName.setFont(new Font("Raleway", Font.BOLD, 18));
        labelName.setBounds(80,140,100,30);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Raleway",Font.BOLD, 13));
        textName.setBounds(280,140,400,30);
        add(textName);

        JLabel labelfName = new JLabel("Father's Name :");
        labelfName.setFont(new Font("Raleway", Font.BOLD, 18));
        labelfName.setBounds(80,190,200,30);
        add(labelfName);

        textFname = new JTextField();
        textFname.setFont(new Font("Raleway",Font.BOLD, 13));
        textFname.setBounds(280,190,400,30);
        add(textFname);

        JLabel DOB = new JLabel("Date of Birth");
        DOB.setFont(new Font("Raleway", Font.BOLD, 18));
        DOB.setBounds(80,240,200,30);
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(280,240,400,30);
        add(dateChooser);

        JLabel labelG = new JLabel("Gender");
        labelG.setFont(new Font("Raleway", Font.BOLD, 18));
        labelG.setBounds(80,290,200,30);
        add(labelG);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway", Font.BOLD,13));
        r1.setBackground(new Color(222,255,228));
        r1.setBounds(280,290,60,30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setBackground(new Color(222,255,228));
        r2.setFont(new Font("Raleway", Font.BOLD,13));
        r2.setBounds(430,290,90,30);
        add(r2);

        r3 = new JRadioButton("Others");
        r3.setBackground(new Color(222,255,228));
        r3.setFont(new Font("Raleway", Font.BOLD,13));
        r3.setBounds(600,290,90,30);
        add(r3);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);

        JLabel labelEmail = new JLabel("Email address :");
        labelEmail.setFont(new Font("Raleway", Font.BOLD, 18));
        labelEmail.setBounds(80,340,200,30);
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway",Font.BOLD, 13));
        textEmail.setBounds(280,340,400,30);
        add(textEmail);


        JLabel labelMs = new JLabel("Marital Status :");
        labelMs.setFont(new Font("Raleway", Font.BOLD, 18));
        labelMs.setBounds(80,390,200,30);
        add(labelMs);

        m1 = new JRadioButton("Married");
        m1.setBounds(280,390,100,30);
        m1.setBackground(new Color(222,255,228));
        m1.setFont(new Font("Raleway", Font.BOLD,13));
        add(m1);

        m2 = new JRadioButton("Unmarried");
        m2.setBackground(new Color(222,255,228));
        m2.setBounds(430,390,100,30);
        m2.setFont(new Font("Raleway", Font.BOLD,13));
        add(m2);

        m3 = new JRadioButton("Other");
        m3.setBackground(new Color(222,255,228));
        m3.setBounds(615,390,100,30);
        m3.setFont(new Font("Raleway", Font.BOLD,13));
        add(m3);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(m1);
        buttonGroup1.add(m2);
        buttonGroup1.add(m3);

        JLabel labelAdd = new JLabel("Address :");
        labelAdd.setFont(new Font("Raleway", Font.BOLD, 18));
        labelAdd.setBounds(80,440,200,30);
        add(labelAdd);

        textAdd = new JTextField();
        textAdd.setFont(new Font("Raleway",Font.BOLD, 13));
        textAdd.setBounds(280,440,400,30);
        add(textAdd);

        JLabel labelCity = new JLabel("City :");
        labelCity.setFont(new Font("Raleway", Font.BOLD, 18));
        labelCity.setBounds(80,490,200,30);
        add(labelCity);

        textcity = new JTextField();
        textcity.setFont(new Font("Raleway",Font.BOLD, 13));
        textcity.setBounds(280,490,400,30);
        add(textcity);

        JLabel labelPin = new JLabel("Pin Code :");
        labelPin.setFont(new Font("Raleway", Font.BOLD, 18));
        labelPin.setBounds(80,540,200,30);
        add(labelPin);

        textPin = new JTextField();
        textPin.setFont(new Font("Raleway",Font.BOLD, 13));
        textPin.setBounds(280,540,400,30);
        add(textPin);

        JLabel labelstate = new JLabel("State :");
        labelstate.setFont(new Font("Raleway", Font.BOLD, 18));
        labelstate.setBounds(80,590,200,30);
        add( labelstate);

        textState = new JTextField();
        textState.setFont(new Font("Raleway",Font.BOLD, 13));
        textState.setBounds(280,590,400,30);
        add(textState);

        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD, 13));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(400,640,80,30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,800);
        setLocation(340,40);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String formno = first;
        String name = textName.getText();
        String fname = textFname.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(r1.isSelected()){
            gender = "Male";
        }else if (r2.isSelected()){
            gender = "Female";
        }
        String email = textEmail.getText();
        String marital =null;
        if (m1.isSelected()){
            marital = "Married";
        } else if (m2.isSelected()) {
            marital = "Unmarried";
        } else if (m3.isSelected()) {
            marital = "Other";
        }

        String address = textAdd.getText();
        String city = textcity.getText();
        String pincode = textPin.getText();
        String state = textState.getText();

        try{
            if (textName.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Fill all the fields");
            }else {
                Connn c = new Connn();
                String q = "insert into signup values('"+formno+"', '"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"', '"+address+"', '"+city+"','"+pincode+"','"+state+"' )";
                c.statement.executeUpdate(q);
               new Signup2(formno);
                setVisible(false);
            }

        }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Signup();
    }
}
