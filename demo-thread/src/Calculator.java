public class Calculator {
    
    private int x;

    //Multi-thread environment encounter atomic problem (read-write issue on share resource)
    // One of the apporaches to solve is "synchronized"
    // When a thread accessing a "synchronized" instance method, obtain a lock from the object is required.

    public synchronized void increment(){
        this.x++;
    }

    public void increment2(){
        this.x++;
    }

    public synchronized void decrement(){
        this.x--;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Thread vincent = new Thread(()-> {
            for(int i = 0; i < 100_000; i++)
                calculator.increment();
        });
        Thread oscar = new Thread(()-> {
            for(int i = 0; i < 100_000; i++)
                calculator.increment();
        });
        vincent.start();
        oscar.start();

        try{
            vincent.join();
            oscar.join();
        } catch (InterruptedException e){

        }

        System.out.println("calculator.x = "+ calculator.x);

        calculator.x = 0;
        vincent = new Thread(()-> {
            for(int i = 0; i < 100_000; i++)
                calculator.increment2();
        });
        oscar = new Thread(()-> {
            for(int i = 0; i < 100_000; i++)
                calculator.increment2();
        });

        vincent.start();
        oscar.start();

        try{
            vincent.join();
            oscar.join();
        } catch (InterruptedException e){

        }

        System.out.println("calculator.x = "+ calculator.x); //calculator.x = 1xxxxx

        //Example 3: increment with synchronized and decrease with synchronized

        calculator.x = 0;
        vincent = new Thread(()-> {
            for(int i = 0; i < 100_000; i++)
                calculator.increment();
        });
        oscar = new Thread(()-> {
            for(int i = 0; i < 100_000; i++)
                calculator.decrement();
        });

        vincent.start();
        oscar.start();

        try{
            vincent.join();
            oscar.join();
        } catch (InterruptedException e){

        }

        System.out.println("calculator.x = "+ calculator.x); //calculator.x = 0


    }
}
