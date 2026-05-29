package src;
public class Main{
    public static void main(String[] args){
        HotelController controller =
                new HotelController();
        HotelView view=new HotelView();
        int choice;
        do {
            choice = view.menu();
            switch (choice) {
                case 1:
                    controller.displayRooms();
                    break;
                case 2:
                    java.util.Scanner sc=new java.util.Scanner(System.in);
                    System.out.print("Enter Room No : ");
                    int roomNo = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name : ");
                    String name = sc.nextLine();
                    System.out.print("Enter Phone : ");
                    String phone = sc.nextLine();
                    controller.bookRoom(roomNo,name, phone);
                    break;
                case 3:
                    java.util.Scanner s=new java.util.Scanner(System.in);
                    System.out.print("Enter Room No : ");
                    int room = s.nextInt();
                    controller.checkOut(room);
                    break;
                case 4:
                    System.out.println("Thank You");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 4);
    }
}