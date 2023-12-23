public class Node {

    private int value;

    private Node next; // stores the object reference of another Node Object

    private Node prev;

    public Node(int value) {
        this.value = value;
    }

    public void setNext(Node node) {
        if (node != null)
            node.setPrev(this);
        this.next = node;
    }

    public void setPrev(Node node) {
        this.prev = node;
    }

    public Node next() {
        return this.next;
    }

    public Node prev() {
        return this.prev;
    }

    public int getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        // return String.valueOf(this.value);
        String prev = "Null";
        String next = "Null";

        if (this.prev != null)
            prev = String.valueOf(this.prev.getValue());
        if (this.next != null)
            next = String.valueOf(this.next.getValue());
        return "[" + prev + ", " + next + "] " + this.value;
    }

    public static void main(String[] args) {
        // Node head = new Node(100,null);
        // Node node1 = new Node(101,null);
        // head.next(node1); //set node1 into head obj reference
        // node1.next(new Node(102,null)); //set node2 into node1 obj reference .node
        // System.out.println(head.getNode().getNode().getValue()); //102

    }

}
