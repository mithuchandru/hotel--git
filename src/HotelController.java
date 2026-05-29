package src;
import java.sql.*;
public class HotelController{
    Connection con=DBConnection.getConnection();
    public void displayRooms(){
        try{
            String query="SELECT*FROM rooms";
            PreparedStatement pst=con.prepareStatement(query);
            ResultSet rs=pst.executeQuery();
            System.out.println("\nROOM DETAILS");
            while(rs.next()){
                System.out.println(rs.getInt(1) + "  "+ rs.getString(2) + "  "+ rs.getString(3) + "  "+ rs.getString(4));
            }
        }
         catch(Exception e){
            System.out.println(e);
        }
    }
    public void bookRoom(int roomNo,String name,String phone){
        try{
            String query="UPDATE rooms SET customer_name=?, phone_no=?, status='Booked' WHERE room_no=?";
            PreparedStatement pst=con.prepareStatement(query);
            pst.setString(1, name);
            pst.setString(2, phone);
            pst.setInt(3, roomNo);
            int rows=pst.executeUpdate();
            if(rows>0){
                System.out.println("Room Booked");
            }
        } 
        catch(Exception e){
            System.out.println(e);
        }
    }

   public void checkOut(int roomNo) {
    try {
        String checkQuery = "SELECT status FROM rooms WHERE room_no=?";
        PreparedStatement checkPst=con.prepareStatement(checkQuery);
        checkPst.setInt(1, roomNo);
        ResultSet rs = checkPst.executeQuery();
        if (rs.next()) {
            String status = rs.getString("status");
            if (status.equals("Available")) {
                System.out.println( "Room Already Not Booked");
            } else {
                String query ="UPDATE rooms SET customer_name=NULL, phone_no=NULL, status='Available' WHERE room_no=?";
                PreparedStatement pst =con.prepareStatement(query);
                pst.setInt(1, roomNo);
                pst.executeUpdate();
                System.out.println( "Check Out Successful");
            }
        } else {
            System.out.println("Room Not Found");
        }
    } catch (Exception e) {
        System.out.println(e);
    }
}
}
