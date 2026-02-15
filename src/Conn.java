import java.sql.*;

public class Conn {
    Connection c=null;
    Statement s;
    Conn()
    {
        try {
            //Class.forName(com.mysql.cj.jdbc.Driver);
            c=DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","anant1223");
            s= c.createStatement();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

//    public static void main(String[] args) {}
}
