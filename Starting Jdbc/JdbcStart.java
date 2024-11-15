import java.sql.*;
//import package

// public class JdbcStart {


//     public static void main(String[] args) throws Exception {
        
//         Class.forName("org.postgresql.Driver");
//         //load and register

//         String url = "jdbc:postgresql://localhost:5432/Tutorial stuff";
//         String userName = "postgres";
//         String pass = "raunak2015";

//         Connection con = DriverManager.getConnection(url, userName, pass);
//         System.out.println("connection established");
//         //create connection

//         Statement st = con.createStatement();
//         //create a statement
        
//         // String query = "select s_name from students where s_id = 1;";
//         //--------------------------------------------------------------
//         String query = "select * from students;";

//         ResultSet result = st.executeQuery(query);
//         //execute a statement

//         // System.out.println(result.next()); //we go to the first record
//         // System.out.println(result.getString("s_name"));
//         //---------------------------------------------------------------------
//         int i = 1; // printing all the rows
//         while(result.next()){
//             System.out.print("the data in the " + i + "st column is: "+result.getInt(1)+"-");
//             System.out.print(result.getString(2)+"-");
//             System.out.println(result.getInt(3));
//             i++;
//         }

//         //process the results

//         con.close();
//         System.out.println("\nconnection closed!");
//         //close
        
//     }
    
// }




public class JdbcStart {


    public static void main(String[] args) throws Exception {
        
        Class.forName("org.postgresql.Driver");
        //load and register

        String url = "jdbc:postgresql://localhost:5432/Tutorial stuff";
        String userName = "postgres";
        String pass = "raunak2015";

        Connection con = DriverManager.getConnection(url, userName, pass);
        System.out.println("connection established");
        //create connection

        Statement st = con.createStatement();
        //create a statement
        
        // update Query

        // String query = "insert into students values(6,'unknown',50);";
        // String query = "update students set s_name='mohan' where s_id = 5;";
        String query = "delete from students where s_id = 6;";

        boolean status = st.execute(query);
        System.out.println(status);
        //execute a statement

        //process the results

        con.close();
        System.out.println("\nconnection closed!");
        //close
        
    }
    
}

