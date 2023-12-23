public class Item {

    private static int serialNum = 0;
    
    private String desc;

    private double unitPrice;

    private boolean isActive;

    private int itemNum;

    public Item(String desc, double unitPrice, boolean isActive){
        this(desc,unitPrice);
        this.isActive = isActive;
    }

    public Item(String desc, double unitPrice){
        this.desc = desc;
        this.unitPrice = unitPrice;
        this.isActive = false;
        this.itemNum = ++serialNum;
    }

    public double getPrice(){
        return this.unitPrice;
    }
    public boolean isActive(){
        return this.isActive;
    }

    public int getItemNum(){
        return this.itemNum;
    }
}
