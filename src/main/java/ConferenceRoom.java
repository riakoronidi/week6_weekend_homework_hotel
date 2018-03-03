public class ConferenceRoom extends Room {

    private double cost;

    public ConferenceRoom(int number, int capacity) {
        super(number, capacity);
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
