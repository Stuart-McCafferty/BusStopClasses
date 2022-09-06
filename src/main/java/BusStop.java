import java.util.ArrayList;

public class BusStop {

    private String name;
    private ArrayList<Person> queue;

    public BusStop(String name){
        this.name = name;
        this.queue = new ArrayList<Person>();
    }

    public void addQueue(Person person){
        queue.add(person);
    }

    public Person removeQueue(){
        return queue.remove(0);
    }

    public String getName() {
        return name;
    }


    public int queueSize(){
       return  this.queue.size();
    }
}
