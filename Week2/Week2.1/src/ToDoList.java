import java.util.Comparator;
import java.util.PriorityQueue;
import java.lang.Comparable;

class Task implements Comparable<Object>
{
    int priority;
    int time_to_finish;
    String name;
    boolean is_finished;
    
    @Override
    public int compareTo(Object o) {
        Task p = (Task) o;
        return this.priority - p.priority ;
    }
    
    public int getPriority()
    {
        return this.priority;
    }
    
    Task(int time)
    {
        this.time_to_finish = time;
    }
    
    public void setFinished(boolean t)
    {
        this.is_finished = t;
    }
    
    public int getTimeToFin()
    {
        return this.time_to_finish;
    }
    
}

public class ToDoList implements Comparator<Object> {
    
    int time_i_have;
    PriorityQueue<Task> doList = new PriorityQueue<Task>();
    
    ToDoList(int t)
    {
        this.time_i_have = t;
    }
    public int compare(Object o1, Object o2) {
        Task p1 = (Task) o1;
        Task p2 = (Task) o2;
        return p1.getPriority() - p2.getPriority();
    }


    void add(Task T)
    {
        doList.add(T);
    }
    
    void markFinished(Task t)
    {
        t.setFinished(true);
    } 
    
    void markCancelled(Task t)
    {
        doList.remove(t);
    }
    
    Task getTop() 
    {
        return doList.peek();
    }
    
    boolean canFinish(){
        int total_time = 0;
        for (Task i : doList) {
            total_time += i.getTimeToFin();
        }
        return total_time < time_i_have;
    }
    
    int getRemainigTime()
    {
        int remaining = time_i_have;
        for (Task i : doList) {
            if (i.is_finished) {
                
                remaining -= i.getTimeToFin();
            }
        }
        return remaining;
    }
    
}
