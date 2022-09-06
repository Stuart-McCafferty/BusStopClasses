import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest{

    public Bus bus;
    public Person passenger = new Person();
    public BusStop busStop;

    @Before
    public void setUp(){
        busStop = new BusStop("Code Clan");
        bus = new Bus("Park Head" , 2);
    }

    @Test
    public void hasDestination(){
        assertEquals("Park Head", bus.getDestination());
    }


    @Test
    public void hasCapacity(){
        assertEquals(2, bus.getCapacity());
    }
    @Test
    public void isEmpty(){
        assertEquals(0, bus.numberOfPassengers());
    }

    @Test
    public void addOnePassenger(){
        busStop.addQueue(passenger);
        bus.addPassengers(busStop);
        assertEquals(1, bus.numberOfPassengers());
    }

    @Test
    public void cannotAddMorePassengers(){
        busStop.addQueue(passenger);
        busStop.addQueue(passenger);
        busStop.addQueue(passenger);
        bus.addPassengers(busStop);
        bus.addPassengers(busStop);
        bus.addPassengers(busStop);
        assertEquals(2, bus.numberOfPassengers());
    }

}
