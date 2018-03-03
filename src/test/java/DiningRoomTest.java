import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom diningRoom;

    @Before
    public void setUp() throws Exception {
        diningRoom = new DiningRoom(3, 100);
    }

    @Test
    public void canGetCapacity() {
        assertEquals(100, diningRoom.getCapacity());

    }
}
