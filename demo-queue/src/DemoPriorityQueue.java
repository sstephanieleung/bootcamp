import java.util.PriorityQueue;
import java.util.Queue;

public class DemoPriorityQueue {
    
    //PriorityQueue: every operation when process sorting once -> slow data structure

    public static void main(String[] args) {
        Queue<String> qs = new PriorityQueue<>(new SortByDesc());

        qs.add("hello");
        qs.add("a");
        qs.add("b");
        qs.add("hb");
        qs.add("b");
        qs.add("hb");
        System.out.println(qs);
    }
}
