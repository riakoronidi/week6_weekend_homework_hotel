public class Bedroom extends Room {

    private double cost;
    private int noOfNights;

    public Bedroom(int number, int capacity) {
        super(number, capacity);
        this.cost = cost;
        this.noOfNights = noOfNights;
    }

    public int getNoOfNights() {
        return noOfNights;
    }

    public void addGuestToBedroom(Guest guest, int nights){
        super.addGuest(guest);
        this.noOfNights = nights;
   }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

//    public void available(Guest guest){
//        if (.getGuests() <= bedroom.getCapacity()) {
////            guests.add(guest);
//            .addGuest();
//        }
//    }

}
