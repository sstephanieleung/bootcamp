public class Laptop {
    private String brand;
    private String os;
    private int RAM;
    private String color;
    private String owner;
    private int[] dimensions;

    //Constructor
    public Laptop(){

    }
    public Laptop(String brand){
        
        this.brand = brand;
        if("apple".equalsIgnoreCase(brand))
            this.os = "ios";
        
    }
    public Laptop(String brand, String os, int RAM, int color){
        this.brand = brand;
        this.os = os;
        this.RAM = RAM;
        this.color = color;
    }
    public Laptop()

    //Instance Method
    //Setter
    public void setBrand (String brand){
        this.brand = brand;
    }

    public void setOS (String os){
        this.os = os;
    }

    public void setRAM (int RAM){
        this.RAM = RAM;
    }

    public void setColor (String color){
        this.color = color;
    }

    public void setOwner (String owner){
        this.owner = owner;
    }

    //Getter
    public String getBrand (){
        return this.brand;
    }

    public String getOS (){
        return this.os;
    }

    public int getRAM(){
        return this.RAM;
    }

    public String getColor (){
        return this.color;
    }

    public String getOwner (){
        return this.owner;
    }

    public static void main(String[] args){
        Laptop l1 = new Laptop("Apple");
        Laptop l2 = new Laptop();

        l2.setBrand("Asus");
        l2.setRAM(16);

        System.out.println("Laptop L1 Brand is " + l1.getBrand());
        System.out.println("Laptop L1 OS is " + l1.getOS());
        System.out.println("Laptop L2 Brand is " + l2.getBrand());
        System.out.println("Laptop L2 RAM is " + l2.getRAM());
    }


}
