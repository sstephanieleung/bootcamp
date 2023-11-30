import java.util.ArrayList;
import java.util.List;

public class removeDuplicatesElement {
    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "grape", "banana", "orange", "apple"};
        String[] uniqueArr = removeDuplicates(arr);
        
        // Print the unique elements
        for (String element : uniqueArr) {
            System.out.println(element);
        }
    }

    public static String[] removeDuplicates(String[] arr) {
        List<String> uniqueList = new ArrayList<>();
        
        for (String element : arr) {
            if (!uniqueList.contains(element)) {
                uniqueList.add(element);
            }
        }
        
        // Convert the list back to an array
        String[] uniqueArr = new String[uniqueList.size()];
        uniqueArr = uniqueList.toArray(uniqueArr);
        
        return uniqueArr;
    }
}