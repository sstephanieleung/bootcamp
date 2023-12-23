import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class DemoQueue {
    public static void main(String[] args) {
        List<String> ls = new LinkedList<>();
        Queue<String> qs = new LinkedList<>();
        LinkedList<String> linkeds = new LinkedList<>();

        // List vs Queue
        // 1. we cannot access the middle elements in the queue, just get the object
        // from the queue head.
        // 2. Queue is first-in-first-out (FIFO)

        // remove() <- List vs Queue
        ls.add("SAA");
        ls.remove(0);
        qs.add("BBB");
        qs.remove(); // the remove() in Queue is different from List, it remove ldast element

        //add() <- List vs Queue
        ls.add(null);
        qs.add(null);
        ls.contains(linkeds);
        qs.containsAll(linkeds);
        linkeds.containsAll(linkeds);

        // add() <- Deque
        Deque<String> ds = new LinkedList<>();
        ds.add("AAA");// add as last element
        ds.addFirst("BBB");// add as first element (head)
        ds.addLast("CCC");// add as last element
        
        //poll() <- Deque
        ds.poll(); //pick the first element, if list is empty, return null
        ds.pollFirst(); //pick the first element, if list is empty, return null
        System.out.println(ds.pollLast()); //pick the last element, if list is empty, return null

        //remove() <-Deque
        ds.remove(); //remove the first element, if list is empty, runtime error
        ds.removeFirst(); //remove the first element, if list is empty, runtime error
        System.out.println(ds.removeLast()); //if list is empty, runtime error


        // poll() <- Queue.interface method(); if List.interface want to perform same
        // function, get() and hence remove() is needed.
        // poll() <- pick the first element from the queue
        String sq1 = qs.poll();

        String sl1 = ls.get(0);
        ls.remove(0);

        Set<String> setString = new LinkedList<>();


    }
}
