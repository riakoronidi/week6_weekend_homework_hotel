import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest;

    @Before
    public void before(){
        guest = new Guest("guest1");
    }

    @Test
    public void canGetName(){
        assertEquals("guest1",guest.getName());
    }
}
