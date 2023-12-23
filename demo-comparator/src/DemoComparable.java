import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoComparable {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John",40));
        students.add(new Student("Mary",10));
        students.add(new Student("John",20));
        students.add(new Student("Mary",80));

        //Comparable
        Collections.sort(students);
        Collections.reverse(students);
        System.out.println(students);

        //Comparator
        Collections.sort(students, new SortByScore());
        System.out.println(students);
        Collections.sort(students,new SortByName());
        System.out.println(students);
    }
}
