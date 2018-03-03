import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest1;
    Guest guest2;

    @Before
    public void before(){
        bedroom = new Bedroom(1,2);
        guest1 = new Guest("guest1");
        guest2 = new Guest("guest2");
    }

    @Test
    public void canAddGuest(){
        bedroom.addGuestToBedroom(guest1,3);
        bedroom.addGuestToBedroom(guest2,1);
        assertEquals(2, bedroom.getTotalGuests());
    }

    @Test
    public void canRemoveGuest(){
        bedroom.addGuestToBedroom(guest1,3);
        assertEquals(1, bedroom.getTotalGuests());
        bedroom.removeGuest();
        assertEquals(0, bedroom.getTotalGuests());
    }

    @Test
    public void getNightsForGuest(){
        bedroom.addGuestToBedroom(guest1,3);
        assertEquals(3,bedroom.getNoOfNights());
    }

    @Test
    public void getCapacity(){
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void CanGetCost() {
        bedroom.setCost(70.00);
        assertEquals(70.00,bedroom.getCost(),0.01);
    }
}
