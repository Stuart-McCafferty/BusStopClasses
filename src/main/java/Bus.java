import java.util.ArrayList;

public class Bus {

    //members
    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    //constructors
    public Bus(String destination, int capacity){
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<Person>();
    }

    public int numberOfPassengers(){
        return this.passengers.size();
    }


    public void addPassengers(BusStop busStop){
        if(numberOfPassengers() < this.capacity){
            this.passengers.add(busStop.removeQueue());
        }
    }

    public void removePassenger(){
        if(numberOfPassengers() > 0){
            this.passengers.remove(0);
        }
    }

    public String getDestination() {
        return destination;
    }

    public int getCapacity() {
        return capacity;
    }
}


