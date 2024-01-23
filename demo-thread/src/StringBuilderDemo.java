public class StringBuilderDemo {
    
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder();

        StringBuffer sbf = new StringBuffer();

        // sbf.append("hello").append("world");

        // System.out.println(sbf);

        //StringBuilder vs StringBuffer
        //Runnable -> 2 thread append "x" 1_000_000 times -> StringBuilder
        Runnable task1 = () -> {
            for(int i = 0; i < 1_000_000; i++){
                sb.append("x");
            }
        };
        //Runnable -> 2 thread append "x" 1_000_000 times -> String Buffer
        Runnable task2 = () -> {
            for(int i = 0; i < 1_000_000; i++){
                sbf.append("x");
            }
        };

        //Test String Builder
        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task1);

        sb.setLength(0);
        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        } catch (InterruptedException e){

        }
        System.out.println(sb.length()); //1xxxxxx

        //Test String Buffer
        t1 = new Thread(task2);
        t2 = new Thread(task2);

        sbf.setLength(0);
        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        } catch (InterruptedException e){

        }
        System.out.println(sbf.length()); //2000000


        //For single thread read/write application, both StringBuilder and StringBuffer are fine.
        //For multi-thread read/write application, you may consider to use StringBuffer as all methods in StringBuffer are synchronized
        //It is good to review the program design to avoid multi-thread read/write
        //Instead, some thread is responsible for read and fewer thread is responsible for read/write.
    }
}
