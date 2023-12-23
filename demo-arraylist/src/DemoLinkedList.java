import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DemoLinkedList {
    
    public static void main(String[] args) {
        List<String> ls = new ArrayList<>(100); //Initialize with suitable capacity can speed up the .add() process time
        ls.add("ABC");
        ls.add("XYZ");
        ls.add("IJK");
        System.out.println(ls);


    }
}
