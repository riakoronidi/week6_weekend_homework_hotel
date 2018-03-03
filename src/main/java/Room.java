import javax.smartcardio.Card;
import java.util.ArrayList;

public abstract class Room {

    private int number;
    private ArrayList<Guest> guests;
    private int capacity;

    public Room(int number, int capacity) {
        this.number = number;
        this.guests = new ArrayList<>();
        this.capacity = capacity;
    }

    public int getNumber() {
        return number;
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Guest> returnGuest() {
        return new ArrayList<>(guests);
    }


    public int getTotalGuests(){
        return this.guests.size();
    }

    public void addGuest(Guest guest){
        guests.add(guest);
    }

    public Guest removeGuest(){
        return guests.remove(0);
    }


}
