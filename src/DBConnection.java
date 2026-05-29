package src;
import java.sql.DriverManager;
import java.sql.Connection;
class DBConnection{
    public static Connection getConnection(){
            Connection con=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            String url="jdbc:mysql://localhost:3306/hoteldb";
            String user="root";
            String password="Mithukit@24";
            con=DriverManager.getConnection(url,user,password);
            System.out.println("Connected");
        } 
        catch(Exception e){
            e.printStackTrace();
        }
        return con;
    }
}