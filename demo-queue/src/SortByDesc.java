import java.util.Comparator;

public class SortByDesc implements Comparator<String> {

    @Override
    public int compare(String a, String b) {
        System.out.println("Compare "+ a + " " + b);
        return b.compareTo(a) > 0 ? 1 : -1;
    }
}
