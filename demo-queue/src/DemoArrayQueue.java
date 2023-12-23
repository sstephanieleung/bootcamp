import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class DemoArrayQueue {
    
    public static void main(String[] args) {
        Queue<String> qs = new ArrayDeque<>();

        qs.add("JJJ");
        qs.add("KKK");
        qs.poll();

        System.out.println(qs.peek()); //KKK
        

        Deque<String> ds = new ArrayDeque<>();

        ds.addFirst("ABC");
        ds.addFirst("CBA");
        ds.addFirst("XXX");
        ds.removeLast(); //ABC
        

        System.out.println(ds.pollFirst());
    }
}
