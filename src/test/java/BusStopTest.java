import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest{
    public Person passenger = new Person();
    public BusStop busStop;

    @Before
    public void setUp(){
        busStop = new BusStop("Code Clan");
    }

    @Test
    public void hasName(){
        assertEquals("Code Clan", busStop.getName());
    }

    @Test
    public void queueStartsEmpty(){
        assertEquals(0, busStop.queueSize());
    }

    @Test
    public void addPassengerToQueue(){
        busStop.addQueue(passenger);
        assertEquals(1, busStop.queueSize());
    }

    @Test
    public void removePassengerToQueue(){
        busStop.addQueue(passenger);
        busStop.addQueue(passenger);
        busStop.removeQueue();
        assertEquals(1, busStop.queueSize());
    }
}