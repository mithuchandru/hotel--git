package src;
import java.util.Scanner;
public class HotelView {
    Scanner sc = new Scanner(System.in);
    public int menu() {
        System.out.println("\n===== HOTEL MENU =====");
        System.out.println("1. Display Rooms");
        System.out.println("2. Book Room");
        System.out.println("3. Check Out");
        System.out.println("4. Exit");
        System.out.print("Enter Choice : ");
        return sc.nextInt();
    }
}