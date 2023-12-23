import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class DemoStack {

    // Stack - Last-in-First-out (LIFO)

    public static void main(String[] args) {
        Stack<String> ss = new Stack<>();
        List<String> ls = new Stack<>();

        // push() - put to last
        ss.push("ABC");
        ss.push("IJK");

        // pop() - pick the last
        System.out.println(ss.pop());
        System.out.println(ss.pop());
        // System.out.println(ss.pop()); //error: nothing can be pop anymore

        ss.push("ABC");
        ss.push("IJK");
        System.out.println(ss.remove(0));

        //Compare time for stack.push(), arraylist.add(), and linkedlist.add()
        long start = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            ss.push("A");
        }
        long end = System.nanoTime();
        System.out.println("Stack.push() -> " + (end - start)); // 31118200

        ArrayList<String> as = new ArrayList<>();
        start = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            as.add("A");
        }
        end = System.nanoTime();
        System.out.println("Arraylist.add() -> " + (end - start));// 19583800

        LinkedList<String> linkedList = new LinkedList<>();
        start = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            linkedList.add("A");
        }
        end = System.nanoTime();
        System.out.println("Linkedlist.add() -> " + (end - start)); // 136765700

        //Compare time for stack.remove(0), arraylist.remove(0), and linkedlist.remove(0)
        start = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            ss.remove(0);
        }
        end = System.nanoTime();
        System.out.println("Stack.remove(0) -> " + (end - start)); // 36540400

        start = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            as.remove(0);
        }
        end = System.nanoTime();
        System.out.println("Arraylist.remove(0) -> " + (end - start));// 36621200

        start = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            linkedList.removeFirst();
        }
        end = System.nanoTime();
        System.out.println("Linkedlist.removeFirst() -> " + (end - start)); // 158360700
    }
}
