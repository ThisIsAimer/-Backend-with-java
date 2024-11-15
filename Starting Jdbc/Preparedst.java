import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Preparedst {

    public static void main(String[] args) throws Exception {
        
        Class.forName("org.postgresql.Driver");
        //load and register

        String url = "jdbc:postgresql://localhost:5432/Tutorial stuff";
        String userName = "postgres";
        String pass = "raunak2015";

        Connection con = DriverManager.getConnection(url, userName, pass);
        System.out.println("connection established");
        //create connection


        //create a statement
        

        int s_id = 102;
        String s_name = "jasmine";
        int s_marks = 20;

        // String query = "insert into students values ("+s_id+",'"+s_name+"',"+s_marks+");";
        String query = "insert into students values (?,?,?);";

        PreparedStatement st = con.prepareStatement(query);
        st.setInt(1, s_id);
        st.setString(2, s_name);
        st.setInt(3, s_marks);


        boolean status = st.execute();
        System.out.println(status);
        //execute a statement

        //process the results

        con.close();
        System.out.println("\nconnection closed!");
        //close
        
    }
    
}
