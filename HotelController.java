class HotelController{
    Room[] rooms;
    int count;
    HotelController(int size){
        rooms=new Room[size];
        count=0;
    }
    void addRoom(int roomNo){
        rooms[count++]=new Room(roomNo);
    }
    Room[] getRooms(){
        return rooms;
    }
    int getCount(){
        return count;
    }
    Room findRoom(int roomNo){
        for (int i=0;i<count;i++){
            if (rooms[i].roomNo==roomNo){
                return rooms[i];
            }
        }
        return null;
    }
    String bookRoom(int roomNo){
        Room r=findRoom(roomNo);
        if (r==null)
            return "Room Not Found";
        if (!r.booked) {
            r.booked=true;
            return "Room Booked Successfully";
        }
        return "Room Already Booked";
    }
    String checkoutRoom(int roomNo) {
        Room r=findRoom(roomNo);
        if (r==null)
            return "Room Not Found";
        if (r.booked) {
            r.booked=false;
            return "Checkout Successful";
        }
        return "Room Already Available";
    }
}