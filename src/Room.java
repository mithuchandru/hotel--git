package src;
public class Room{
    private int roomNo;
    private String customerName;
    private String phoneNo;
    private String status;
    public Room(int roomNo, String customerName, String phoneNo, String status){
        this.roomNo=roomNo;
        this.customerName=customerName;
        this.phoneNo=phoneNo;
        this.status=status;
    }
    public int getRoomNo(){
        return roomNo;
    }
    public String getCustomerName(){
        return customerName;
    }
    public String getPhoneNo(){
        return phoneNo;
    }
    public String getStatus(){
        return status;
    }
}