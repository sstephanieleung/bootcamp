public class DemoThread {
    public static void main(String[] args) throws Exception { // main thread

        System.out.println("hello");
        System.out.println("Thread ID: " +Thread.currentThread().getId() + " | Thread Name: "+ Thread.currentThread().getName()); //Thread ID: 1 | Thread Name: main

        // Runnable
        Runnable task1 = () -> {
            try{
                Thread.sleep(2000); //milli-second 2000ms = 2s
                System.out.println("Task1 is running...");
            } catch(InterruptedException e){

            }

            Thread current = Thread.currentThread();
            System.out.println("Thread ID: " +current.getId() + " | Thread Name: "+ current.getName());
        };

        // Thread
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task1);
        thread1.start(); // main thread split itself, another thread is created
        thread2.start();

        

        for (int i = 0; i < 100000000; i++) {

        }

        CustomThread customThread = new CustomThread();
        customThread.start();

        try{
            thread1.join();
            thread2.join();
            customThread.join();
        } catch(InterruptedException e){

        }

        System.out.println("main End...");

    }
}
