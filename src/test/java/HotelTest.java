import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom1;
    ConferenceRoom conferenceRoom1;
    DiningRoom diningRoom1;
    Guest guest1;

    @Before
    public void setUp() throws Exception {
        bedroom1 = new Bedroom(1, 2);
        guest1 = new Guest("guest1");
        conferenceRoom1 = new ConferenceRoom(2, 10);
        diningRoom1 = new DiningRoom(3, 100);
        this.hotel = new Hotel(bedroom1, conferenceRoom1, diningRoom1);

    }

    @Test
    public void getBedroom(){
        hotel.getRoom(bedroom1);
        assertEquals(1, hotel.totalRooms());
    }


    @Test
    public void hotelChecksGuest(){
        bedroom1.addGuestToBedroom(guest1, 3);
        hotel.getRoom(bedroom1);
        assertTrue(hotel.checkAvailability());
//        assertFalse(hotel.checkAvailability()); //to check if the room is not available(returns false)
        assertEquals(1,bedroom1.getTotalGuests());
        assertEquals("guest1",guest1.getName());
        assertEquals(1,bedroom1.getNumber());
    }


}
