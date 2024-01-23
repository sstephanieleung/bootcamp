public class Demo {
    
    
    public synchronized void methodA(){
        methodB();
    }

    public synchronized void methodB(){
        methodA();
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> new Demo().methodA());
        Thread t2 = new Thread(() -> new Demo().methodB());

        t1.start();
        t2.start();
    }
}
