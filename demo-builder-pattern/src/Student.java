import java.util.ArrayList;
import java.util.List;

public class Student {

    //Builder Patrern Advantage:
    //1.  If you want to control the access to setter after the object created, builder pattern is good choice.
    //2. You don't have to create too much constructors, according to the attribute

    private String name;

    private int age;

    private List<String> subjects;

    // Let say there are 10 fields for an object
    // 10 field / all arguentment constructor -> 1 constructor
    // 9 field constructor -> N constructors...

    private Student(String name, int age, List<String> subjects) {
        this.name = name;
        this.age = age;
        this.subjects = subjects;
    }

    private Student(Builder builder) {
        this.name = name;
        this.age = age;
        this.subjects = subjects;
    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder {
        private String name;

        private int age;

        private List<String> subjects;

        public Builder name(String name){  //setter
            this.name = name;
            return this;
        }

        public Builder age(int age){
            this.age = age;
            return this;
        }

        public Builder subjects(List<String> subjects){
            this.subjects = subjects;
            return this;
        }

        public Student build(){
            return new Student(this.name, this.age, this.subjects);
        }
    }

    public static void main(String[] args) {
        Student student = new Student("John", 13, new ArrayList<>(List.of("Maths", "English")));
        Student s2 = new Student.Builder().name("Peter").age(15).subjects(new ArrayList<>(List.of("Maths", "English"))).build();
        Student s3 = Student.builder().name("Peter").age(14).subjects(new ArrayList<>(List.of("Physics", "Maths"))).build();
        Student s4 = new Student.Builder().name("Hello").build();
    }
}
