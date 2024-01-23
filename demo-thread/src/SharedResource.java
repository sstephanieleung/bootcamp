public class SharedResource {

    private boolean hasData = false; // Shared Resource

    //1. Both 2 thread starts at the same time
    //2. consume() while loop (fulfill -> wait())
    //3. product() while loop (not fulfill -> produce data -> notify)
    //4. after producer calling the notify(), consumer thread will resume

    //1. waiting thread has to be notified by someone
    //2. synchronized instance method can only be accessed when the thread has the key (lock)

    public synchronized void produce() throws InterruptedException {
        while (hasData) {
            System.out.println("Producer Waiting....");
            wait();
        }
        System.out.println("Producing Data...");
        Thread.sleep(3000);
        hasData = true;
        notify();
    }

    public synchronized void consume() throws InterruptedException {
        while (!hasData) {
            System.out.println("Consumer Waiting...");
            wait(); // wait()control current Thread to sleep;
        }
        System.out.println("Consuming Data...");
        Thread.sleep(2000);
        hasData = true;
        notify();
    }

    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        System.out.println("Main Thread ID: " + Thread.currentThread().getId() + " | Thread Name: "
                + Thread.currentThread().getName());

        Runnable produceData = () -> {
            while (true) {
                try {
                    System.out.println("Producer Thread ID: " + Thread.currentThread().getId() + " | Thread Name: "
                            + Thread.currentThread().getName());
                    sharedResource.produce();
                } catch (InterruptedException e) {
                }
            }
        };

        Runnable consumeData = () -> {
            while (true) {
                try {
                    System.out.println("Consumer Thread ID: " + Thread.currentThread().getId() + " | Thread Name: "
                            + Thread.currentThread().getName());
                    sharedResource.consume();
                } catch (InterruptedException e) {
                }
            }

        };

        Thread producer = new Thread(produceData);
        Thread consume = new Thread(consumeData);

        producer.start();
        consume.start();

    }

}
