import java.util.concurrent.atomic.AtomicInteger;

public class DemoAtomicInteger {
    
    AtomicInteger atmInt;

    public DemoAtomicInteger(){
        this.atmInt = new AtomicInteger(0);
    }

    public static void main(String[] args) {
        DemoAtomicInteger demoAtomicInteger = new DemoAtomicInteger();
        int result = demoAtomicInteger.atmInt.incrementAndGet();
        System.out.println(result); // 1

        Runnable AtomicIncrement = () -> {
            for(int i = 0; i< 1_000_000; i++)
                demoAtomicInteger.atmInt.incrementAndGet();
        };

        Thread t1 = new Thread(AtomicIncrement);
        Thread t2 = new Thread(AtomicIncrement);

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        } catch (InterruptedException e){

        }

        System.out.println(demoAtomicInteger.atmInt); // 2000001
    }
}
