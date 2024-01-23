import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {

    public static void main(String[] args) throws InterruptedException {
        Hashtable<Integer, String> ht = new Hashtable<>(); // Thread-safe
        Map<Integer, String> hm = new HashMap<>(); // Non-thread safe

        Runnable addHt = () -> {
            for (int i = 0; i < 1_000_000; i++) {
                ht.put(i, "x");
            }

        };

        Runnable addHm = () -> {
            for (int i = 0; i < 1_000_000; i++) {
                hm.put(i, "x");
                // System.out.println(i+" "+ hm.size() + " " +Thread.currentThread().getName());
            }
        };
    

        Runnable mergeHt = () -> {
            for (int i = 0; i < 1_000_00; i++) {
                ht.merge(1,"s",(oldVal,newVal) -> oldVal.concat(newVal));
            }

        };

        Runnable mergeHm = () -> {
            for (int i = 0; i < 1_000_00; i++) {
                hm.merge(1,"s",(oldVal,newVal) -> oldVal.concat(newVal));
            }
        };
        

        Thread t1 = new Thread(addHt);
        Thread t2 = new Thread(addHt);

        // t1.start();
        // t2.start();

        // t1.join();
        // t2.join();
        // System.out.println(ht.size());

        // t1 = new Thread(addHm);
        // t2 = new Thread(addHm);

        // t1.start();
        // t2.start();

        // t1.join();
        // t2.join();
        // System.out.println(hm.size());

        t1 = new Thread(mergeHt);
        t2 = new Thread(mergeHt);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(ht.get(1).length());

        t1 = new Thread(mergeHm);
        t2 = new Thread(mergeHm);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(hm.get(1).length());

    }
}
