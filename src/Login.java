import javax.swing.*; //It specifically imports JFrame class
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener    //JFrame is extended as we need to create the Frame //
{

    JButton sigin,clear,signup;
    JTextField cardTextField;
    JPasswordField pinTextField;

    Login() // Making a constructor
    {
        // Making the FRAME()
        //setTitle is a function/Method which sets the title of the frame.//
        setTitle("AUTOMATED TELLER MACHINE");
        setLayout(null); // We need to set layout as null otherwise setBound will not work.//
        // setSize is a function/Method which sets the width and height of the Frame.
        setSize(800, 480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Ensures the application exits on close
        //setVisible() is a function/Method which help to show the frame to the user (written true or false)
        setVisible(true);
        //setLocation() is a function/Method which helps to decide where the frame will be open on screen
        //It is optional to write. If not understood just remove it and see the results.
        setLocation(350, 200);
        ImageIcon i1 = new ImageIcon("C:\\Users\\Dell\\IdeaProjects\\BankManagementSystem\\src\\icons\\logo.jpg");
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label1 = new JLabel(i3);
        label1.setBounds(70, 10, 100, 100);
        add(label1);

        //Making label of the ATM//
        // 1.) Welcome to ATM Label:-
        JLabel text = new JLabel("WELCOME TO ATM");
        text.setFont(new Font("Osward", Font.BOLD, 38));
        text.setBounds(200, 40, 400, 40);
        add(text);

        // 2.) CARD NUMBER KA LABEL
        JLabel cardno = new JLabel("CARD No: ");
        cardno.setFont(new Font("Raleway", Font.BOLD, 28));
        cardno.setBounds(120, 150, 150, 30);
        add(cardno);

        // Making TextBox for the card number
        cardTextField = new JTextField();
        cardTextField.setBounds(300, 150, 250, 30);
        cardTextField.setFont(new Font("Arial",Font.BOLD,20));
        add(cardTextField);

        // 3.) PIN KA LABEL
        JLabel pinno = new JLabel("PIN : ");
        pinno.setFont(new Font("Raleway", Font.BOLD, 28));
        pinno.setBounds(120, 220, 230, 40);
        add(pinno);

        // Making TextBox for the pin number
        pinTextField = new JPasswordField();
        pinTextField.setBounds(300, 220, 230, 30);
        pinTextField.setFont(new Font("Arial",Font.BOLD,20));
        add(pinTextField);

        // Making Buttons of  the ATM
        // 1.) SIGN-IN Button
        sigin = new JButton("SIGN-IN");
        sigin.setBounds(300, 300, 100, 30);
        sigin.setBackground(Color.BLACK);
        sigin.setForeground(Color.WHITE);
        sigin.addActionListener(this);
        add(sigin);

        // 2.) CLEAR Button
        clear = new JButton("CLEAR");
        clear.setBounds(430, 300, 100, 30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);

        // 3.) SIGNUP Button
        signup = new JButton("SIGN-UP");
        signup.setBounds(300, 350, 230, 30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);
        getContentPane().setBackground(Color.WHITE);
    }
    @Override
    public void actionPerformed(ActionEvent ae)
    {
        if (ae.getSource()==clear)
        {
            cardTextField.setText("");
            pinTextField.setText("");
            }

        else if(ae.getSource()==sigin)
        {
            Conn c=new Conn();
            String cardnumber=cardTextField.getText();
            String pinnumber=pinTextField.getText(); // It is in yellow color as it tells that pin
  // is a password field and it s decoriated to use get getText(0 method with password
  // but as because decoriated not restricted, so we can use it.

String query= "select cardnumber,pinnumber from signup3";
         //  '"+cardnumber+"','"+pinnumber+"';
try {
     ResultSet rs=c.s.executeQuery(query);
     c.s.close();
     //Resultset is a class imported from import.Sql.Resultset package
     if (rs.next())
     {
         setVisible(false);
         new Transactions(pinnumber).setVisible(true);
     }
     else
     {
         JOptionPane.showMessageDialog(null,"Incorrect cardNumber or pin");

     }
 }
 catch (Exception e)
 {
     System.out.println(e);
 }
        }
        else if (ae.getSource()==signup)
        {
            setVisible(false);
            new SignUpPage1().setVisible(true);

        }
    }
        public static void main(String[] args) {

            new Login();  //Making anonymous object of Login class
        }
    }


/* Database mai login query mai kuch nahi aa raha hai............. */