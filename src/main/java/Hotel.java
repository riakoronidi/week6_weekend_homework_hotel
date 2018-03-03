import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ConferenceRoom conference1;
    private DiningRoom diningRoom1;


    public Hotel(Bedroom bedroom1, ConferenceRoom conference1, DiningRoom dining1) {
        this.bedrooms = new ArrayList<>();
        this.conference1 = conference1;
        this.diningRoom1 = dining1;
    }


    public void getRoom(Bedroom bedroom){
//        for (Bedroom index: this.bedrooms) {
            bedrooms.add(bedroom);
    }

    public int totalRooms(){
        return this.bedrooms.size();
    }


    public void getGuest(){
        for (Bedroom bedroom: this.bedrooms) {
             bedroom.returnGuest();
        }
    }
//    public void checkAvailability(){
//
//        for (Bedroom bedroom: this.bedrooms){
////        check if room is available for the guests
//            if (bedroom.getGuests() <= bedroom.getCapacity()) {
////        add guest in that room
//                bedroom.addGuest().;
//            }
////        get that room?
//
//        }
//
//
//    }



}
