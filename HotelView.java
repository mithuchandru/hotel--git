import java.util.Scanner;
class HotelView{
    Scanner sc=new Scanner(System.in);
    void showMenu(){
        System.out.println("\n--- Hotel Room Menu ---");
        System.out.println("1. Display Rooms");
        System.out.println("2. Search Room");
        System.out.println("3. Book Room");
        System.out.println("4. Checkout Room");
        System.out.println("5. Exit");
    }
    int getChoice(){
        System.out.print("Enter choice: ");
        return sc.nextInt();
    }
    int getRoomNo(String msg){
        System.out.print(msg);
        return sc.nextInt();
    }
    void displayRooms(Room[] rooms,int count){
        System.out.println("\nRoom Details:");
        for (int i=0;i<count;i++) {
            System.out.println("Room No: "+rooms[i].roomNo+" - " + (rooms[i].booked ? "Booked" : "Available"));
        }
    }
    void showMessage(String msg){
        System.out.println(msg);
    }
}