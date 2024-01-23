import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Demo {
    
    public static void main(String[] args) {
        Student s1 = new Student("ABC", 10);
        Student s2 = new Student("ABC", 2);
        Student s3 = new Student("BCD", 2);

        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        List<Student> students = new ArrayList<>(List.of(s1,s2,s3));
        Function<Student,String> f = e -> e.getName();
        Comparator<Student> fc = (e1,e2) -> e2.getName().compareTo(e1.getName())>0? -1:1;
        Collections.sort(students,Comparator.comparing(Student::getName).reversed());
        Collections.sort(students,Comparator.comparing(f).reversed());
        Collections.sort(students,new Student.SortbyName());
        System.out.println(students);

        
    }
}
