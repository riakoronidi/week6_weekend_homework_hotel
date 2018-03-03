import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;

    @Before
    public void setUp() throws Exception {
        conferenceRoom = new ConferenceRoom(2, 10);
    }

    @Test
    public void canGetCapacity() {
        assertEquals(10, conferenceRoom.getCapacity());

    }

    @Test
    public void CanGetCost() {
        conferenceRoom.setCost(100.00);
        assertEquals(100.00,conferenceRoom.getCost(),0.01);
    }
}
