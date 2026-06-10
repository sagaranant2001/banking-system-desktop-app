import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignUpPage3 extends JFrame implements ActionListener
{
    JRadioButton savingaccount, fdaccount, currentaccount, rdaccount;
    JCheckBox atmcard, internetbanking, mobilebanking, emailalerts, chequebook, estatements, declaration;
    JButton submitbutton, cancel;
    JLabel accountType,cdnumber,pnnumber ;
    String formno;

    SignUpPage3( String formno) {
        this.formno=formno;
        setLayout(null); // We need to set layout as null otherwise setBound will not work.//
        // code for ACCOUNTS DETAILS HEADING //
        JLabel l1 = new JLabel("Page 3: Account Details");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        l1.setBackground(Color.WHITE);
        l1.setBounds(280, 40, 400, 40);
        add(l1);

        // Label code for ACCOUNT TYPE //
        accountType = new JLabel("Account Type");
        accountType.setFont(new Font("Raleway", Font.BOLD, 22));
        accountType.setBackground(Color.WHITE);
        accountType.setBounds(100, 140, 200, 30);
        add(accountType);

        // Radio Button for 1st ACCOUNT TYPE i.e. SAVING-ACCOUNT //
        savingaccount = new JRadioButton("Saving Account");
        savingaccount.setFont(new Font("Raleway", Font.BOLD, 20));
        savingaccount.setBackground(Color.WHITE);
        savingaccount.setBounds(100, 180, 250, 30);
        add(savingaccount);

        // Radio Button for 2nd ACCOUNT TYPE i.e. FIXED DEPOSIT ACCOUNT //
        fdaccount = new JRadioButton("Fixed Deposit Account");
        fdaccount.setFont(new Font("Raleway", Font.BOLD, 20));
        fdaccount.setBackground(Color.WHITE);
        fdaccount.setBounds(350, 180, 250, 30);
        add(fdaccount);

        // Radio Button for 3rd ACCOUNT TYPE i.e. CURRENT ACCOUNT //
        currentaccount = new JRadioButton("Current Account");
        currentaccount.setFont(new Font("Raleway", Font.BOLD, 20));
        currentaccount.setBackground(Color.WHITE);
        currentaccount.setBounds(100, 220, 250, 30);
        add(currentaccount);

        // Radio Button for 4th ACCOUNT TYPE i.e. RECCURING DEPOSIT ACCOUNT //
        rdaccount = new JRadioButton("Reccuring Deposit Account");
        rdaccount.setFont(new Font("Raleway", Font.BOLD, 20));
        rdaccount.setBackground(Color.WHITE);
        rdaccount.setBounds(350, 220, 350, 30);
        add(rdaccount);

        //GROUPING RADIO BUTTONS TO CHOOSE EITHER OF THE ONE //
        ButtonGroup groupaccount = new ButtonGroup();
        groupaccount.add(savingaccount);
        groupaccount.add(fdaccount);
        groupaccount.add(currentaccount);
        groupaccount.add(rdaccount);

        // Label code for CARD NUMBER //
        JLabel cardnumber = new JLabel("Card Number");
        cardnumber.setFont(new Font("Raleway", Font.BOLD, 22));
        cardnumber.setBackground(Color.WHITE);
        cardnumber.setBounds(100, 280, 200, 30);
        add(cardnumber);

        // Label code for CARD NUMBER REPRESENTATION (XXXX-XXXX-4987) //
        cdnumber = new JLabel("XXXX-XXXX-4987");
        cdnumber.setFont(new Font("Raleway", Font.BOLD, 22));
        cdnumber.setBackground(Color.WHITE);
        cdnumber.setBounds(360, 280, 220, 30);
        add(cdnumber);

        // Label code for CARD NUMBER (16-digit card number) //
        JLabel digitsixteen = new JLabel("Your 16 Digit Card Number");
        digitsixteen.setFont(new Font("Raleway", Font.BOLD, 15));
        digitsixteen.setBackground(Color.WHITE);
        digitsixteen.setBounds(100, 310, 200, 15);
        add(digitsixteen);

        // Label code for PIN-NUMBER //
        JLabel pinnumber = new JLabel("PIN: ");
        pinnumber.setFont(new Font("Raleway", Font.BOLD, 22));
        pinnumber.setBackground(Color.WHITE);
        pinnumber.setBounds(100, 350, 200, 30);
        add(pinnumber);

        // Label code for CARD NUMBER REPRESENTATION (XXXX-XXXX-4987) //
        pnnumber = new JLabel("XXXX");
        pnnumber.setFont(new Font("Raleway", Font.BOLD, 22));
        pnnumber.setBackground(Color.WHITE);
        pnnumber.setBounds(360, 350, 200, 30);
        add(pnnumber);

        // Label code for PIN-NUMBER (4-digit card number) //
        JLabel digitfour = new JLabel("Your 4 password");
        digitfour.setFont(new Font("Raleway", Font.BOLD, 15));
        digitfour.setBackground(Color.WHITE);
        digitfour.setBounds(100, 380, 200, 15);
        add(digitfour);

        // Label code for SERVICES REQUIRED //
        JLabel servicesrequired = new JLabel("Services Required: ");
        servicesrequired.setFont(new Font("Raleway", Font.BOLD, 22));
        servicesrequired.setBackground(Color.WHITE);
        servicesrequired.setBounds(100, 420, 200, 30);
        add(servicesrequired);

        // CheckBox Code for ATM CARD //
        atmcard = new JCheckBox("ATM CARD");
        atmcard.setBackground(Color.WHITE);
        atmcard.setFont(new Font("Raleway", Font.BOLD, 15));
        atmcard.setBounds(100, 460, 200, 30);
        add(atmcard);

        // CheckBox Code for INTERNET BANKING //
        internetbanking = new JCheckBox("INTERNET BANKING");
        internetbanking.setBackground(Color.WHITE);
        internetbanking.setFont(new Font("Raleway", Font.BOLD, 15));
        internetbanking.setBounds(300, 460, 200, 30);
        add(internetbanking);

        // CheckBox Code for MOBILE BANKING //
        mobilebanking = new JCheckBox("MOBILE BANKING");
        mobilebanking.setBackground(Color.WHITE);
        mobilebanking.setFont(new Font("Raleway", Font.BOLD, 15));
        mobilebanking.setBounds(100, 500, 200, 30);
        add(mobilebanking);

        // CheckBox Code for EMAIL & SMS ALERTS //
        emailalerts = new JCheckBox("EMAIL & SMS ALERTS");
        emailalerts.setBackground(Color.WHITE);
        emailalerts.setFont(new Font("Raleway", Font.BOLD, 15));
        emailalerts.setBounds(300, 500, 200, 30);
        add(emailalerts);

        // CheckBox Code for CHEQUE BOOK //
        chequebook = new JCheckBox("CHEQUE BOOK");
        chequebook.setBackground(Color.WHITE);
        chequebook.setFont(new Font("Raleway", Font.BOLD, 15));
        chequebook.setBounds(100, 540, 200, 30);
        add(chequebook);

        // CheckBox Code for E-STATEMENTS //
        estatements = new JCheckBox("E-Statements");
        estatements.setBackground(Color.WHITE);
        estatements.setFont(new Font("Raleway", Font.BOLD, 15));
        estatements.setBounds(300, 540, 200, 30);
        add(estatements);

        // CheckBox Code for HEREBY DECLARATION //
        declaration = new JCheckBox("I hereby declares that the above entered details are correct to the best of my Knowledge");
        declaration.setFont(new Font("Railway", Font.BOLD, 15));
        declaration.setBackground(Color.WHITE);
        declaration.setBounds(100, 575, 680, 30);
        add(declaration);

        // code for SUBMIT BUTTON //
        submitbutton = new JButton("Submit");
        submitbutton.setBackground(Color.BLACK);
        submitbutton.setForeground(Color.WHITE);
        submitbutton.setFont(new Font("Raleway", Font.BOLD, 15));
        submitbutton.addActionListener(this);
        submitbutton.setBounds(200, 620, 100, 30);
        add(submitbutton);


        // code for CANCEL BUTTON //
        cancel = new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Raleway", Font.BOLD, 15));
        cancel.addActionListener(this);
        cancel.setBounds(400, 620, 100, 30);
        add(cancel);

        // code to set Background color and size of the frame //
        getContentPane().setBackground(Color.WHITE);
        setBackground(Color.WHITE);
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == submitbutton) {
            String accountTypeAction = null;
            String declaration="";
            if (savingaccount.isSelected()) {
                accountTypeAction = "Saving Account";
            }
            if (fdaccount.isSelected()) {
                accountTypeAction = "Fixed Deposit Account";
            }
            if (currentaccount.isSelected()) {
                accountTypeAction = "Current Account";
            }
            if (rdaccount.isSelected()) {
                accountTypeAction = "Reccuring Deposit Account";
            }
            Random ran = new Random();
            String cardnumber = "" +Math.abs((ran.nextLong() % 900000000L) + 504093600000000L);
            String pinnumber = "" + Math.abs((ran.nextLong() % 9000L) + 1000L);
             String facility="";
            if (atmcard.isSelected()) {
                facility = facility + " ATM CARD";
            } else if (internetbanking.isSelected()) {
                facility = facility + " INTERNET BANKING";
            } else if (mobilebanking.isSelected()) {
                facility = facility + " MOBILE BANKING";
            } else if (emailalerts.isSelected()) {
                facility = facility + " E-mail & SMS Alerts";
            } else if (chequebook.isSelected()) {
                facility = facility + " Cheque Book";
            } else if (estatements.isSelected()) {
                facility = facility + " E-statements";
            }
            boolean isFieldValid=(isFieldValid3(accountTypeAction,cardnumber,pinnumber,facility,declaration));
            System.out.println(isFieldValid);
            insertAndRedirect3(isFieldValid,accountTypeAction,cardnumber,pinnumber,facility,declaration,formno);
            setVisible(false);
            new Login().setVisible(true);
        } else if (ae.getSource() == cancel) {
            Login login=new Login();
            login.setVisible(true);
        }
    }
    public static void main(String[] args) {

        new SignUpPage3("");
    }
    public void insertAndRedirect3(boolean isFieldValid, String accountTypeAction
            , String cardnumber, String pinnumber, String facility, String declaration, String formno)
    {
        if(isFieldValid)
        {
            System.out.println(accountTypeAction);
            System.out.println(cardnumber);
            System.out.println(pinnumber);
            System.out.println(facility);
            System.out.println(declaration);
            try {
                String query1 = ("insert into Signup3 values('"+formno+"','"+accountTypeAction+
            "','" + cardnumber + "','" + pinnumber + "','"+facility+"','"+declaration+"')");

                String query2 = ("insert into login values('"+formno+"','" + cardnumber + "','" + pinnumber + "')");
                insertIntoDB3(query1,query2);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }
    public void insertIntoDB3(String query1, String query2)
    {
        try {
            Conn c=new Conn();
            c.s.executeUpdate(query1);
            c.s.executeUpdate(query2);
           JOptionPane.showMessageDialog(null,"Card number" +cdnumber+"Pin number" +pnnumber);
            c.s.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
    public static boolean isFieldValid3(String accountTypeAction, String cardnumber, String pinnumber,String facility
    ,String declaration)
    {
        try {
            if (accountTypeAction == null || accountTypeAction.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Mandatory to select a account type");
                return false;
            } else if (cardnumber.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Enter Cardnumber");
                return false;
            } else if (pinnumber.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Enter Pin Number");
                return false;
            } else if (facility.isEmpty()){
                JOptionPane.showMessageDialog(null,"Choose the facilities first");
                return false;
            } else if (declaration==null) {
                JOptionPane.showMessageDialog(null,"Tick the declaration checkbox");
                return false;
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return true;
    }

 }


 // Line number 266  //
// video number 6/12 Duration : 40:08 //



