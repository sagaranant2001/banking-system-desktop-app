//import jdk.jfr.Category; //
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.Random;
import java.awt.event.*;


public class SignUpPage2 extends JFrame implements ActionListener
{
    long random;
    JTextField pannumberTextField, aadharcardTextField;
    JLabel SeniorCitizen, ExistingAccount;
    JRadioButton syes, sno, eyes, eno;
    JComboBox Religion1, Category1, Income1, Education1, Occupation1;
    JButton next;
    String formno;

    SignUpPage2(String formno) {
        this.formno = formno;
        setTitle("SIGNUP PAGE 2");
        setLayout(null); // We need to set layout as null otherwise setBound will not work.//
        Random ran = new Random();
        random = (Math.abs(ran.nextLong() % 9000L) + 1000L);

        //code for PROFESSIONAL DETAILS//
        JLabel professionalDetails = new JLabel(" Page 1: PROFESSIONAL DETAILS");
        professionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        professionalDetails.setBounds(290, 80, 400, 30);
        add(professionalDetails);

        //code for RELIGION//
        JLabel Religion = new JLabel("RELIGION: ");
        Religion.setFont(new Font("Raleway", Font.BOLD, 20));
        Religion.setBounds(100, 140, 150, 30);
        add(Religion);

        //Combo Box for RELIGION//
        String valReligion[] = {"Select", "Hindu", "MUSLIM", "SIKHS", "CHRISTIAN", "OTHERS"};
        Religion1 = new JComboBox(valReligion);
        Religion1.setBounds(300, 140, 400, 30);
        add(Religion1);

        //code for CATEGORY//
        JLabel Category = new JLabel("CATEGORY: ");
        Category.setFont(new Font("Raleway", Font.BOLD, 20));
        Category.setBounds(100, 190, 200, 30);
        add(Category);

        //Combo Box for CATEGORY//
        String valCategory[] = {"Select", "GENERAL", "SC", "ST", "OBC", "OTHERS"};
        Category1 = new JComboBox(valCategory);
        Category1.setBounds(300, 190, 400, 30);
        add(Category1);


        //code for INCOME//
        JLabel Income = new JLabel("INCOME: ");
        Income.setFont(new Font("Raleway", Font.BOLD, 20));
        Income.setBounds(100, 240, 200, 30);
        add(Income);

        //Combo Box for INCOME //
        String valIncome[] = {"Select", "0-1 LAKHS", "1-2 LAKHS", "2-5 LAKHS", "5 LAKHS And Above"};
        Income1 = new JComboBox(valIncome);
        Income1.setBounds(300, 240, 400, 30);
        add(Income1);

        //code for SENIOR CITIZEN//
        SeniorCitizen = new JLabel("SENIOR CITIZEN : ");
        SeniorCitizen.setFont(new Font("Raleway", Font.BOLD, 20));
        SeniorCitizen.setBounds(100, 290, 200, 30);
        add(SeniorCitizen);

        //making RADIO BUTTONS OF THE SENIOR CITIZEN//
        syes = new JRadioButton("YES");
        syes.setBounds(300, 290, 60, 30);
        syes.setBackground(Color.WHITE);
        add(syes);
        sno = new JRadioButton("NO");
        sno.setBounds(450, 290, 120, 30);
        sno.setBackground(Color.WHITE);
        add(sno);

        //Grouping both YES/NO FOR SENIOR CITIZEN //
        ButtonGroup senior = new ButtonGroup();//This code allows us to choose either
        senior.add(syes);                   // YES OR NO
        senior.add(sno);


        //code for EDUCATION QUALIFICATION//
        JLabel EducationQulaification = new JLabel("EDUCATION : ");
        EducationQulaification.setFont(new Font("Raleway", Font.BOLD, 18));
        EducationQulaification.setBounds(100, 340, 200, 30);
        add(EducationQulaification);

        //Combo Box for EDUCATION QUALIFICATION //
        String valeducation[] = {"Select", "10th", "12th", "GRADUATE", "POST GRADUATE", "OTHERS"};
        Education1 = new JComboBox(valeducation);
        Education1.setBounds(300, 340, 400, 30);
        add(Education1);


        //code for EXISTING ACCOUNT//
        ExistingAccount = new JLabel("EXISTING ACCOUNT: ");
        ExistingAccount.setFont(new Font("Raleway", Font.BOLD, 18));
        ExistingAccount.setBounds(100, 390, 200, 30);
        add(ExistingAccount);

        //Adding RADIO BUTTONS FOR EXISTING ACCOUNT//
        eyes = new JRadioButton("YES");
        eyes.setBounds(300, 390, 120, 30);
        eyes.setBackground(Color.WHITE);
        add(eyes);

        eno = new JRadioButton("NO");
        eno.setBounds(450, 390, 180, 30);
        eno.setBackground(Color.WHITE);
        add(eno);

        //Grouping both YES/NO FOR SENIOR CITIZEN //
        ButtonGroup existingacc = new ButtonGroup(); //This code allows us to choose either //
        existingacc.add(eyes);                     //YES OR NO //
        existingacc.add(eno);


        //code for OCCUPATION//
        JLabel occupation = new JLabel("OCCUPATION: ");
        occupation.setFont(new Font("Raleway", Font.BOLD, 20));
        occupation.setBounds(100, 440, 200, 30);
        add(occupation);

        //Combo Box For OCCUPATION//
        String valoccupation[] = {"Select", "SALARIED", "SELF-EMPLOYED", "BUSINESSMEN", "STUDENT", "RETIRED", "OTHERS"};
        Occupation1 = new JComboBox(valoccupation);
        Occupation1.setBounds(300, 440, 400, 30);
        add(Occupation1);


        //code for PAN NUMBER//
        JLabel PanNumber = new JLabel("PAN NUMBER: ");
        PanNumber.setFont(new Font("Raleway", Font.BOLD, 20));
        PanNumber.setBounds(100, 490, 200, 30);
        add(PanNumber);

        //Making TEXTBOX for PAN NUMBER //
        pannumberTextField = new JTextField();
        pannumberTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        pannumberTextField.setBounds(300, 490, 400, 30);
        add(pannumberTextField);

        //code for AADHAR CARD//
        JLabel AadharNumber = new JLabel("AADHAR NUMBER: ");
        AadharNumber.setFont(new Font("Raleway", Font.BOLD, 20));
        AadharNumber.setBounds(100, 540, 200, 30);
        add(AadharNumber);

        //Making TEXTBOX for AADHAR CARD//
        aadharcardTextField = new JTextField();
        aadharcardTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        aadharcardTextField.setBounds(300, 540, 400, 30);
        add(aadharcardTextField);


        // Making the next Button//
        next = new JButton("NEXT");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);

        // This code sets the BACKGROUND COLOR and size and location of BACKGROUND//
        getContentPane().setBackground(Color.WHITE);
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }

    public static void main(String[] args) {

        new SignUpPage2("");
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String formno = "" + random; //Here random was of long type so it is changed to String type \\
        // Here typecasting is performed as Religion1 is converted into String from combo Box //
        String sreligion = (String) Religion1.getSelectedItem();
        // Here typecasting is performed as Income1 is converted into String from combo Box //
        String sincome = (String) Income1.getSelectedItem();
        // Here typecasting is performed as Category1 is converted into String from combo Box //
        String scategory = (String) Category1.getSelectedItem();
        String SeniorCitizen = null;
        if (syes.isSelected()) {
            SeniorCitizen = "YES";
        } else if (sno.isSelected()) {
            SeniorCitizen = "no";
        }
        String ExistingAccount = null;
        if (eyes.isSelected()) {
            ExistingAccount = "YES";
        } else if (eno.isSelected()) {
            ExistingAccount = "YES";
        }
        // Here typecasting is performed as Education1 is converted into String from combo Box //
        String seducationqulaification = (String) Education1.getSelectedItem();
        // Here typecasting is performed as Occupation1 is converted into String from combo Box //
        String soccupation = (String) Occupation1.getSelectedItem();
        String pannumber = pannumberTextField.getText();
        String aadharcard = aadharcardTextField.getText();
        boolean isFieldValido = isFieldValid2(formno, scategory, sincome,
                sreligion, SeniorCitizen, ExistingAccount, pannumber, aadharcard);
        insertAndRedirect2(isFieldValido, formno, sreligion, scategory, sincome, soccupation,
       seducationqulaification, pannumber, aadharcard, SeniorCitizen, ExistingAccount);
    }

    public void insertAndRedirect2(boolean isFieldValido, String formno, String sreligion, String scategory, String sincome,
         String soccupation, String seducationqulaification, String pannumber, String aadharcard,
         String SeniorCitizen, String ExistingAccount)
    {
        if (isFieldValido) {
            try {
                String query = ("insert into signup2 values('" + formno + "','" + sreligion + "','" + scategory + "','" + sincome +
                        "','" + SeniorCitizen + "','" + seducationqulaification + "','" + ExistingAccount + "','" + soccupation +
                        "','" + pannumber + "','" + aadharcard + "')");
                insertIntoDB2(query);
            } catch (Exception e) {
                System.out.println(e);
            }

            setVisible(false);
            SignUpPage3 signUpPage3 = new SignUpPage3(formno);
            signUpPage3.setVisible(true);
        }
    }

    public static void insertIntoDB2(String query) throws SQLException {
        Conn c = new Conn();
        c.s.executeUpdate(query);
        c.s.close(); // closing the database//
    }

    public static boolean isFieldValid2(String sreligion, String scategory, String sincome,
                                        String pannumber, String aadharcard, String formno, String SeniorCitizen, String ExistingAccount) {
        try {
            if (sreligion == null || sreligion.isEmpty() || sreligion.equalsIgnoreCase("Select")) {
                JOptionPane.showMessageDialog(null, "Religion field is required");
                return false;
            }
            if (pannumber.equals("")) {
                JOptionPane.showMessageDialog(null, "Pan Number field is required");
                return false;
            }
            if (aadharcard.equals("")) {
                JOptionPane.showMessageDialog(null, "Aadhar Card Number field is required");
                return false;
            }
            if (scategory == null || scategory.isEmpty() || scategory.equalsIgnoreCase("Select")) {
                JOptionPane.showMessageDialog(null, "Category field is mandatory");
                return false;
            }
            if (sincome == null || sincome.isEmpty() || sincome.equalsIgnoreCase("Select")) {
                JOptionPane.showMessageDialog(null, "Income field is mandatory");
                return false;
            }
            if (SeniorCitizen == null || SeniorCitizen.isEmpty() || SeniorCitizen.equalsIgnoreCase("Select")) {
                JOptionPane.showMessageDialog(null, "Senior Citizen field is mandatory");
                return false;
            }
            if (ExistingAccount == null || ExistingAccount.isEmpty() || ExistingAccount.equalsIgnoreCase("Select")) {
                JOptionPane.showMessageDialog(null, "Existing Account field is mandatory");
                return false;
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return true;

    }
}


