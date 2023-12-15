import java.util.Arrays;

public class StringQueue implements Addable, Pollable {

    private String[] queues;

    public StringQueue() {
        this.queues = new String[0];
    }

    private StringQueue(String s) {
        this.queues = new String[] { s };

    }

    public static StringQueue of(String s) {
        return new StringQueue(s);
    }

    @Override // Overidding add() from Addable
    public void add(String s) {
        addTail(s);
    }

    @Override // Overriding poll() from Pollable
    public String poll() {
        return pollHead();
    }

    public String peak() { // read the head only, not poll
        return this.queues[0];
    }

    public boolean isEmpty() {
        return this.queues.length == 0 ? true : false;
    }

    public int currentPosition(String s){
        for(int i = 0; i< this.queues.length; i++){
            if(this.queues[i] == s)
                return i+1;
        }
        return -1;
    }

    public String pollHead() {
        if (this.queues.length == 0) {
            return null;
        }
        String s = this.queues[0];
        String[] newQueue = new String[this.queues.length - 1];
        for (int i = 0; i < newQueue.length; i++) {
            newQueue[i] = this.queues[i + 1];
        }
        this.queues = newQueue;
        return s;
    }

    private void addTail(String s) {
        String[] newQueue = Arrays.copyOf(this.queues, this.queues.length + 1);
        newQueue[newQueue.length - 1] = s;
        this.queues = newQueue;
    }

    public static void main(String[] args) {
        StringQueue sq = new StringQueue();
        sq.add("hello");
        sq.add("ABC");
        System.out.println(sq.poll());
        System.out.println(sq.currentPosition("ABC"));
        System.out.println(sq.poll());
        System.out.println(sq.isEmpty());
        
    }
}
