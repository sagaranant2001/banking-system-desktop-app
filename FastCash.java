import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FastCash extends JFrame implements ActionListener
    {

        JLabel cash;
        JButton amt1,amt2,amt3,amt4,amt5,amt6,back;
        String pinnumber;
       FastCash(String pinnumber)
        {
            this.pinnumber=pinnumber;
            setLayout(null);

            ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons\\atm.jpg"));
            Image i2=i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
            ImageIcon i3=new ImageIcon(i2);
            JLabel image=new JLabel(i3);
            image.setBounds(0,0,900,900);
            add(image);

            setTitle("Transaction Page");
            setSize(900,900);
            setLocation(300,0);
            //setUndecorated(true);
            setVisible(true);

            // Making label for PLEASE SELECT YOUR TRANSACTION//
            cash=new JLabel("Please select your withdraw amount");
            cash.setBounds(190,300,700,35);
            cash.setForeground(Color.WHITE);
//        cash.addAncestorListener();
            cash.setFont(new Font("System", Font.BOLD, 18));
            image.add(cash);

            // Making BUTTON for DEPOSIT //
            amt1=new JButton("100");
            amt1.setBounds(170,415,150,30);
            amt1.addActionListener(this);
            image.add(amt1);
            //setVisible(true);

            // Making BUTTON for CASH WITHDRAWAL //
            amt2=new JButton("200");
            amt2.setBounds(355,415,150,30);
            amt2.addActionListener(this);
            image.add(amt2);


            // Making BUTTON for FAST CASH //
            amt3=new JButton("500");
            amt3.setBounds(170,450,150,30);
            amt3.addActionListener(this);
            image.add(amt3);


            // Making BUTTON for MINI STATEMENT //
            amt4=new JButton("1000");
            amt4.setBounds(355,450,150,30);
            amt4.addActionListener(this);
            image.add(amt4);


            // Making BUTTON for PIN CHANGE //
            amt5=new JButton("2000");
            amt5.setBounds(170,485,150,30);
            amt5.addActionListener(this);
            image.add(amt5);


            // Making BUTTON for BALANCE ENQUIRY //
            amt6=new JButton("5000");
            amt6.setBounds(355,485,150,30);
            amt6.addActionListener(this);
            image.add(amt6);


            // Making BUTTON for EXIT //
            back=new JButton("BACK");
           back.setBounds(355,520,150,30);
            back.addActionListener(this);
            image.add(back);

        }
        @Override
        public void actionPerformed(ActionEvent ae)
        {
            if (ae.getSource()==back)
            {
                setVisible(false);
                new Transactions(pinnumber).setVisible(true);
            } else if (ae.getSource()==amt1) {
        JOptionPane.showMessageDialog(null,"Rs. 100 withdrawal successfully");
            } else if (ae.getSource()==amt2) {
        JOptionPane.showMessageDialog(null,"Rs. 200 withdrawal successfully");
            }
         else if (ae.getSource()==amt3) {
        JOptionPane.showMessageDialog(null,"Rs. 500 withdrawal successfully");
        }
         else if (ae.getSource()==amt4) {
        JOptionPane.showMessageDialog(null,"Rs. 1000 withdrawal successfully");
            }
        else if (ae.getSource()==amt5) {
        JOptionPane.showMessageDialog(null,"Rs. 2000 withdrawal successfully");
            }
        else if (ae.getSource()==amt6) {
        JOptionPane.showMessageDialog(null,"Rs. 5000 withdrawal successfully");
    }
        }

        public static  void main(String[] args) {
            new FastCash("");

        }
    }
