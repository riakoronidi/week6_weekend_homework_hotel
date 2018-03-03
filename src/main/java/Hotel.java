import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ConferenceRoom conference1;
    private DiningRoom diningRoom1;
    private Guest guest;


    public Hotel(Bedroom bedroom1, ConferenceRoom conference1, DiningRoom dining1) {
        this.bedrooms = new ArrayList<>();
        this.conference1 = conference1;
        this.diningRoom1 = dining1;
        this.guest = guest;
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

    public boolean checkAvailability(){
        boolean result = false;
        for (Bedroom bedroom: this.bedrooms){
//        check if room is available for the guests
            if (bedroom.getTotalGuests() <= bedroom.getCapacity()) {
                return result = true;
            }
        }
       return result;
    }



}
