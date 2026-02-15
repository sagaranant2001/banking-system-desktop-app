import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PinChange extends JFrame implements ActionListener {
    JButton back,change;
    JPasswordField existingpinTextField,newpinTextField,reenternewpinTextField;
 String pinnumber;
    PinChange(String pinnumber)
    {
        this.pinnumber=pinnumber;
        setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons\\atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);

        // Label for Text CHANGE YOUR PIN........//
        JLabel pn=new JLabel("Change Your PIN");
        pn.setForeground(Color.WHITE);
        pn.setBackground(Color.BLACK);
        pn.setFont(new Font("System",Font.BOLD,16));
        pn.setBounds(250,280,500,35);
        image.add(pn);


        // Label for ENTERING EXISTING PIN........//
        JLabel existingpin=new JLabel("Enter EXISTING PIN:");
        existingpin.setForeground(Color.WHITE);
        existingpin.setBackground(Color.BLACK);
        existingpin.setFont(new Font("System",Font.BOLD,16));
        existingpin.setBounds(165,320,180,25);
        image.add(existingpin);

        //JTextField for ENTERING EXISTING PIN......//
        existingpinTextField= new JPasswordField();
        existingpinTextField.setBounds(330,320,180,25);
        existingpinTextField.setFont(new Font("Raleway",Font.BOLD,16));
        image.add(existingpinTextField);


        // Label for ENTERING NEW PIN........//
        JLabel newpin=new JLabel("Enter NEW PIN:");
        newpin.setForeground(Color.WHITE);
        newpin.setBackground(Color.BLACK);
        newpin.setFont(new Font("System",Font.BOLD,16));
        newpin.setBounds(165,360,180,25);
        image.add(newpin);

        //JTextField for ENTERING NEW PIN......//
        newpinTextField= new JPasswordField();
        newpinTextField.setBounds(330,360,180,25);
        newpinTextField.setFont(new Font("Raleway",Font.BOLD,16));
        image.add(newpinTextField);


        // Label for ENTERING RE-ENTERING NEW PIN........//
        JLabel reenternewpin=new JLabel("Re-Enter NEW PIN:");
        reenternewpin.setForeground(Color.WHITE);
        reenternewpin.setBackground(Color.BLACK);
        reenternewpin.setFont(new Font("System",Font.BOLD,16));
        reenternewpin.setBounds(165,390,180,25);
        image.add(reenternewpin);


        //JTextField for ENTERING RE-ENTERING NEW PIN......//
        reenternewpinTextField= new JPasswordField();
        reenternewpinTextField.setBounds(330,390,180,25);
        reenternewpinTextField.setFont(new Font("Raleway",Font.BOLD,16));
        image.add(reenternewpinTextField);

       //JButton for BACK //
        back =new JButton("BACK");
        back.setForeground(Color.black);
        back.setBackground(Color.white);
        back.setBounds(400,440,100,25);
        back.addActionListener(this);
        image.add(back);


        //JButton for change //
        change =new JButton("change");
        change.setForeground(Color.black);
        change.setBackground(Color.white);
        change.setBounds(160,440,100,25);
        change.addActionListener(this);
        image.add(change);

        setSize(900,900);
        setLocation(300,0);
        setVisible(true);
    }

@Override
    public void actionPerformed(ActionEvent ae) {
    if (ae.getSource() == change) {
        try {
            String epin=existingpinTextField.getText();
            String npin = newpinTextField.getText();
            String rpin = reenternewpinTextField.getText();


            if (!npin.equalsIgnoreCase(rpin)) {
                JOptionPane.showMessageDialog(null, "The pin didn't matched");
                return;
            }
            if (epin.equalsIgnoreCase(""))
            {
                JOptionPane.showMessageDialog(null,"Please enter existing pin");
            return;
            }
            if (npin.equalsIgnoreCase(""))
            {
                JOptionPane.showMessageDialog(null,"Please enter new pin");
            return;
            }
            if (rpin.equalsIgnoreCase(""))
            {
                JOptionPane.showMessageDialog(null,"Please re-enter new pin");

                return;
            }
            Conn c=new Conn();
            String query1="update bank set pin= '"+rpin+"'where pin='"+pinnumber+"";
            String query2="update login set pin= '"+rpin+"'where pin='"+pinnumber+"";
            String query3="update signup3 set pin= '"+rpin+"'where pin='"+pinnumber+"";
             c.s.executeUpdate(query1);
             c.s.executeUpdate(query2);
             c.s.executeUpdate(query3);

            JOptionPane.showMessageDialog(null,"Pin changed successfully");
            setVisible(false);
            new Transactions(rpin).setVisible(true);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
        else {
            setVisible(false);
            new Transactions("").setVisible(true);
        }
    }
    public static void main(String[] args) {
        new PinChange("").setVisible(true);


    }

    }
