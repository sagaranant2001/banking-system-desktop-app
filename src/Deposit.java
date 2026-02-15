import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposit extends  JFrame implements ActionListener {

    JTextField amount;
    JButton deposit,back;
    String pinnumber;
    Deposit(String pinnumber)
    {
        this.pinnumber=pinnumber;

        setLayout(null);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons\\atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image =new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);

        // Making JLabel for printing message about depositing the amount //
        JLabel text=new JLabel("Enter the amount you want to deposit");
        text.setForeground(Color.WHITE);
        text.setBackground(Color.BLACK);
        text.setFont(new Font("System",Font.BOLD,16));
        text.setBounds(170,300,400,20);
        image.add(text);

        // Making JTextField for amount textfield //
        amount=new JTextField();
        amount.setBounds(170,350,320,25);
        amount.setFont(new Font("Raleway",Font.BOLD,22));
        image.add(amount);

        // Making JButton for deposit //
        deposit=new JButton("Deposit");
        deposit.setBounds(355,485,150,30);
        deposit.addActionListener(this);
        image.add(deposit);

        // Making Back Button //
        back =new JButton("BACK");
        back.setBounds(355,520,150,30);
        back.addActionListener(this);
        image.add(back);


        setTitle("Deposit Page");
        setSize(900,900);
        setLocation(300,0);
       // setUndecorated(true);
        setVisible(true);
    }

    public  void actionPerformed(ActionEvent ae)
    {
        if (ae.getSource()==deposit)
        {
        String number=amount.getText();
            Date date=new Date();
            if (number.equalsIgnoreCase(""))
            {
                JOptionPane.showMessageDialog(null,"Please enter the amount you want to deposit");
            }
            else {
                try {
                    InsertAndRedirect3(pinnumber, date, number);
                    JOptionPane.showMessageDialog(null,"Rs."+number+ "deposited successfully");
                    setVisible(false);
                    new Transactions(pinnumber).setVisible(true);
                }
                catch (Exception e)
                {
                    System.out.println(e);
                }
            }
        }
        else if (ae.getSource()==back)
        {
            setVisible(false);
             new Transactions(pinnumber).setVisible(true);
        }

    }
    public static void main(String[] args) {
        new Deposit("");
    }

    public static void InsertAndRedirect3(String pinnumber,Date date,String number) {
        try {
            String query = ("insert into bank values('" + pinnumber + "','" + date + "','Deposit','" + number + "')");
            InsertIntoDB5(query);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
    public  static void InsertIntoDB5(String query) throws Exception
    {
        Conn c=new Conn();
        c.s.executeUpdate(query);
        c.s.close();
    }

 }
