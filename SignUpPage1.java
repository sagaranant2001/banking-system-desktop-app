import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;
import java.util.Random;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignUpPage1  extends JFrame implements  ActionListener
{
    long random;
    JTextField nameTextField,fathernameTextField;
    JTextField emailTextField,addressTextField;
    JTextField cityTextField,stateTextField,pincodeTextField;
    JLabel gender,maritalstatus;
    JRadioButton male,female,other,married,unmarried;
    ButtonGroup gendergroup;
    JDateChooser datechooser;
    JButton next;
    boolean isFieldValid;
    SignUpPage1()
    {
        setTitle("SIGNUP PAGE 1");
        setLayout(null); // We need to set layout as null otherwise setBound will not work.//
        Random ran = new Random();
        random=(Math.abs(ran.nextLong() % 9000L)+ 1000L);

        // code for formno.//
        JLabel formno =new JLabel("APPLICATION FORM: "+random);
        formno.setFont(new Font("Raleway",Font.BOLD,38));
        formno.setBounds(140,20,600,40);
        add(formno);

        //code for PERSONAL DETAILS//
        JLabel personalDetails =new JLabel(" Page 1: PERSONAL DETAILS");
        personalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        personalDetails.setBounds(290,80,400,30);
        add(personalDetails);

        //code for NAME//
        JLabel name =new JLabel("NAME: ");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);

        //Making TEXTBOX for NAME//
        nameTextField =new JTextField();
        nameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        nameTextField.setBounds(300,140,400,30);
        add(nameTextField);

        //code for FATHER'S NAME//
        JLabel fathername =new JLabel("FATHER'S NAME: ");
        fathername.setFont(new Font("Raleway",Font.BOLD,20));
        fathername.setBounds(100,190,200,30);
        add(fathername);

        //Making TEXTBOX for FATHER'S NAME//
        fathernameTextField =new JTextField();
        fathernameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        fathernameTextField.setBounds(300,190,400,30);
        add(fathernameTextField);

        //code for DOB//
        JLabel dob =new JLabel("Date Of Birth: ");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob);

        //code for making the calendar//
        datechooser=new JDateChooser();
        datechooser.setBounds(300,240,400,30);
        datechooser.setForeground(new Color(105,105,105));
        add(datechooser);

        //code for GENDER//
        gender =new JLabel("GENDER: ");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);

        //making RADIO BUTTONS OF THE GENDER
        male=new JRadioButton("MALE");
        male.setBounds(300,290,60,30);
        male.setBackground(Color.WHITE);
        add(male);
        female=new JRadioButton("FEMALE");
        female.setBounds(450,290,120,30);
        female.setBackground(Color.WHITE);
        add(female);

        other=new JRadioButton("OTHERS");
        other.setBounds(600,290,180,30);
        other.setBackground(Color.WHITE);
        add(other);

        gendergroup=new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        gendergroup.add(other);

        //code for EMAIL ADDRESS//
        JLabel email =new JLabel("EMAIL: ");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,340,200,30);
        add(email);

        //Making TEXTBOX for EMAIL//
        emailTextField =new JTextField();
        emailTextField.setFont(new Font("Raleway",Font.BOLD,14));
        emailTextField.setBounds(300,340,400,30);
        add(emailTextField);


        //code for MARITAL STATUS//
        maritalstatus =new JLabel("MARITAL STATUS: ");
        maritalstatus.setFont(new Font("Raleway",Font.BOLD,20));
        maritalstatus.setBounds(100,390,200,30);
        add(maritalstatus);

        //Adding RADIO BUTTONS FOR MARITAL STATUS//
        married=new JRadioButton("MARRIED");
        married.setBounds(300,390,120,30);
        married.setBackground(Color.WHITE);
        add(married);

        unmarried=new JRadioButton("UNMARRIED");
        unmarried.setBounds(450,390,180,30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);

       ButtonGroup maritalgroup=new ButtonGroup();
       maritalgroup.add(married);
       maritalgroup.add(unmarried);


        //code for ADDRESS//
        JLabel address =new JLabel("ADDRESS: ");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100,440,200,30);
        add(address);

        //Making TEXTBOX for ADDRESS//
        addressTextField =new JTextField();
        addressTextField.setFont(new Font("Raleway",Font.BOLD,14));
        addressTextField.setBounds(300,440,400,30);
        add(addressTextField);

        //code for CITY//
        JLabel city =new JLabel("CITY: ");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,490,200,30);
        add(city);

        //Making TEXTBOX for CITY//
        cityTextField =new JTextField();
        cityTextField.setFont(new Font("Raleway",Font.BOLD,14));
        cityTextField.setBounds(300,490,400,30);
        add(cityTextField);

        //code for STATE//
        JLabel state =new JLabel("STATE: ");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,540,200,30);
        add(state);

        //Making TEXTBOX for STATE//
        stateTextField =new JTextField();
        stateTextField.setFont(new Font("Raleway",Font.BOLD,14));
        stateTextField.setBounds(300,540,400,30);
        add(stateTextField);

        //code for PINCODE//
        JLabel pincode =new JLabel("PINCODE: ");
        pincode.setFont(new Font("Raleway",Font.BOLD,20));
        pincode.setBounds(100,590,200,30);
        add(pincode);

        //Making TEXTBOX for PINCODE//
        pincodeTextField =new JTextField();
        pincodeTextField.setFont(new Font("Raleway",Font.BOLD,14));
        pincodeTextField.setBounds(300,590,400,30);
        add(pincodeTextField);

        // Making the next Button//
        next=new JButton("NEXT");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    public static void main(String[] args)
    {
        new SignUpPage1();
    }
  @Override
    public void actionPerformed (ActionEvent ae)
  {
        String formno = "" + random; //Here random was of long type so it is changed to String type
        String name = nameTextField.getText();
        String fathername = fathernameTextField.getText();
        String dob = ((JTextField) datechooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if (male.isSelected()) {
            gender = "Male";
        } else if (female.isSelected()) {
            gender = "female";
        } else if (other.isSelected()) {
            gender = "others";
        }
        String email = emailTextField.getText();
        String maritalstatus = null;
        if (married.isSelected()) {
            maritalstatus = "Married";
        } else if (unmarried.isSelected()) {
            maritalstatus = "Unmarried";
        }
        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pincode = pincodeTextField.getText();

     boolean isFieldValid = isFieldValid1(name, fathername, dob, email, address, city, state, pincode, gender, maritalstatus, formno);
      insertAndRedirect1(isFieldValid, formno, name, fathername, dob, gender, email, maritalstatus, address, city, state, pincode);
  }
  public void insertAndRedirect1(boolean isFieldValid, String formno, String name, String fathername,
   String dob, String gender, String email, String maritalstatus, String address,
     String city, String state, String pincode)
  {
        if(isFieldValid) {
            try {
            String query=("insert into signup values('"+ formno +"','"+ name +"','"+ fathername
            +"','" + dob + "','"+ gender +"','"+ email +"','"+ maritalstatus +"','"+ address +"','"
             + city +"','"+ state +"','"+ pincode +"')");
                insertIntoDb1(query);
            }catch (Exception e){
                System.out.println(e);
            }

              setVisible(false);
              SignUpPage2 signUpPage2 = new SignUpPage2(formno);
              signUpPage2.setVisible(true);
          }
    }
    public static void insertIntoDb1(String query) throws SQLException
    {

        Conn c = new Conn();
        c.s.executeUpdate(query);
        c.s.close();  // closing the database //

    }

    public static boolean isFieldValid1(String name, String fathername, String dob,
    String email, String address, String city, String state, String pincode,
       String gender, String maritalstatus, String formno)
    {
        if (name.equals("")) {
            JOptionPane.showMessageDialog(null, "Name field is required");
        return false;
        }
        if (fathername.equals("")) {
            JOptionPane.showMessageDialog(null, "father's Name field is required");
            return false;
        }
        if (dob.equals("")) {
            JOptionPane.showMessageDialog(null, "DOB field is required");
            return false;
        }
        if (email.equals("")) {
            JOptionPane.showMessageDialog(null, "email field is required");
            return false;
        }
        if (address.equals("")) {
            JOptionPane.showMessageDialog(null, "address field is required");
            return false;
        }
        if (city.equals("")) {
            JOptionPane.showMessageDialog(null, "city field is required");
            return false;
        }
        if (state.equals("")) {
            JOptionPane.showMessageDialog(null, "state field is required");
            return false;
        }
        if (pincode.equals("")) {
            JOptionPane.showMessageDialog(null, "pincode field is required");
            return false;
        }
        if (gender == null) {
            JOptionPane.showMessageDialog(null, "Gender Field is mandatory");
            return false;
        }
        if (maritalstatus == null) {
            JOptionPane.showMessageDialog(null, "Marital Status field is required");
            return false;
        }
        return true;
    }
}
