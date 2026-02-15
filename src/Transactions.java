import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;

public class Transactions extends JFrame implements ActionListener
{

    JLabel cash;
    JButton deposit,cashwithdrawal,fastcash,ministatements, pinchange,balanceenquiry, exit;
     String pinnumber;
    Transactions(String pinnumber)
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
        cash=new JLabel("Please select your transaction");
        cash.setBounds(235,300,700,35);
        cash.setForeground(Color.WHITE);
//        cash.addAncestorListener();
        cash.setFont(new Font("System", Font.BOLD, 18));
        image.add(cash);

      // Making BUTTON for DEPOSIT //
        deposit=new JButton("DEPOSIT");
        deposit.setBounds(170,415,150,30);
        deposit.addActionListener(this);
        image.add(deposit);
        //setVisible(true);

        // Making BUTTON for CASH WITHDRAWAL //
        cashwithdrawal=new JButton("CASH WITHDRAWAL");
        cashwithdrawal.setBounds(355,415,150,30);
        cashwithdrawal.addActionListener(this);
        image.add(cashwithdrawal);


        // Making BUTTON for FAST CASH //
        fastcash=new JButton("FAST CASH");
        fastcash.setBounds(170,450,150,30);
        fastcash.addActionListener(this);
        image.add(fastcash);


        // Making BUTTON for MINI STATEMENT //
        ministatements=new JButton("MINI STATEMENT");
        ministatements.setBounds(355,450,150,30);
        ministatements.addActionListener(this);
        image.add(ministatements);


        // Making BUTTON for PIN CHANGE //
        pinchange=new JButton("PIN CHANGE");
        pinchange.setBounds(170,485,150,30);
        pinchange.addActionListener(this);
        image.add(pinchange);


        // Making BUTTON for BALANCE ENQUIRY //
        balanceenquiry=new JButton("BALANCE ENQUIRY");
        balanceenquiry.setBounds(355,485,150,30);
        balanceenquiry.addActionListener(this);
        image.add(balanceenquiry);


        // Making BUTTON for EXIT //
        exit=new JButton("EXIT");
        exit.setBounds(355,520,150,30);
        exit.addActionListener(this);
        image.add(exit);

    }
    @Override
    public void actionPerformed(ActionEvent ae)
    {
     if (ae.getSource()==exit)
     {
         System.exit(0);
     } else if (ae.getSource()==deposit) {
         setVisible(false);
         new Deposit(pinnumber).setVisible(true);
     } else if (ae.getSource()==cashwithdrawal) {
         setVisible(false);
         new CashWithdrawal(pinnumber).setVisible(true);
     } else if (ae.getSource()==fastcash) {
         setVisible(false);
         new FastCash(pinnumber).setVisible(true);
     } else if (ae.getSource()==pinchange) {
         setVisible(false);
         new  PinChange(pinnumber).setVisible(true);
     }
    }

    public static  void main(String[] args) {
        new Transactions("");

    }

}
