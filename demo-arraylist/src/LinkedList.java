public class LinkedList {

    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public boolean add(int value) {
        if (head == null) {
            head = new Node(value);
            return true;
        }
        // while loop until tail, then setNext()
        Node current = this.head;
        while (current.next() != null) {
            current = current.next();
        }
        current.setNext(new Node(value));
        return true;
    }

    public boolean remove(int value) {
        // Early return: no head
        if (this.head == null)
            return false;
        // Early return: the first element is found
        if (this.head.getValue() == value) {
            this.head = this.head.next();
            return true;
        }
        Node current = this.head;
        while (current!=null){
            if(current.getValue() == value){
                current.prev().setNext(current.next());
                return true;
            }        
            current = current.next();
        }
        return false;
    }

    public boolean isFound(int value) {
        Node current = this.head;
        if (head == null)
            return false;
        while (current.getValue() != value && current.next() != null) {
            current = current.next();
        }
        if (current.getValue() == value) {
            System.out.println("Value " + value + " is found!");
            System.out.println(current);
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder separator = new StringBuilder(String.valueOf(", "));
        Node current = this.head;

        while (current.next() != null) {
            sb.append(String.valueOf(current.getValue())).append(separator);
            current = current.next();
        }
        sb.append(current.getValue());
        return sb.toString();
    }

    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        System.out.println(list1.add(1));
        System.out.println(list1.add(2));
        System.out.println(list1.add(3));
        System.out.println(list1.toString());
        System.out.println("Remove 3: " + list1.remove(3));
        System.out.println(list1.toString());
        System.out.println("Remove 1: " + list1.remove(1));
        System.out.println(list1.toString());

    }
}
