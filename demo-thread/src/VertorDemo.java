import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VertorDemo {

    public static void main(String[] args) throws InterruptedException {
        Vector<String> vector = new Vector<>(); //
        List<String> arrayList = new ArrayList<>();

        Runnable vectorAdd = () -> {
            for (int i = 0; i < 1_000_000; i++)
                vector.add("x");
        };

        Runnable arrayListAdd = () -> {
            for (int i = 0; i < 1_000_000; i++) {
                arrayList.add("x");
            }
        };

        Thread t1 = new Thread(vectorAdd);
        Thread t2 = new Thread(vectorAdd);

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(vector.size()); //2000000

        t1 = new Thread(arrayListAdd);
        t2 = new Thread(arrayListAdd);

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(arrayList.size()); //1294098

    }
}
