import java.util.Comparator;

public record Student(String name, int age){

    //All attribute in "record" has been final
    // public void setName(String name){
    //     this.name = name;
    // }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public static class SortbyName implements Comparator<Student>{

        public int compare(Student s1, Student s2){
            return s2.getName().compareTo(s1.getName())>0? -1:1;
        }

    }

    public static class SortbyAge implements Comparator<Student>{

        public int compare(Student s1, Student s2){
            return s2.getAge()> s1.getAge()? -1:1;
        }

    }


}
