public class Main{
    public static void main(String[] args){
        HotelController controller=new HotelController(10);
        HotelView view=new HotelView();
        controller.addRoom(101);
        controller.addRoom(102);
        controller.addRoom(103);
        while(true){
            view.showMenu();
            int choice=view.getChoice();
            switch(choice){
                case 1:
                    view.displayRooms(controller.getRooms(),
                            controller.getCount());
                    break;
                case 2:
                    int search=view.getRoomNo("Enter Room Number: ");
                    if(controller.findRoom(search)!=null){
                        view.showMessage("Room Found");
                    }
                    else{
                        view.showMessage("Room Not Found");
                    }
                    break;
                case 3:
                    int book=view.getRoomNo("Enter Room Number: ");
                    view.showMessage(controller.bookRoom(book));
                    break;
                case 4:
                    int checkout=view.getRoomNo("Enter Room Number: ");
                    view.showMessage(controller.checkoutRoom(checkout));
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}