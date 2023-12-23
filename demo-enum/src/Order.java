public class Order {
    
    private int id;

    private Status status;

    public Order(int id, Status status){
        this.status = status;
        this.id = id;
    }

    public Status getStatus(){
        return this.status;
    }

    public static void main(String[] args) {
        Order o1 = new Order(1, Status.ORDERED);
        Order o2 = new Order(2, Status.SHIPPED);

        if(o1.getStatus().getVal() != o2.getStatus().getVal()){
            System.out.println("Different status value");
            System.out.println("O1 getVal is "+ o1.getStatus().getVal());
            System.out.println("O1 getVal is "+ o2.getStatus().getVal());
        }


    }
}
