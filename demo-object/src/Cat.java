import java.util.Arrays;
import java.util.Objects;

public class Cat {

    private String name;

    private int age;

    private final Eye[] eyes = new Eye[2]; // final: fixed the array size, but content is free to amend

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.eyes[0] = new Eye("Blue");
        this.eyes[1] = new Eye("Blue");
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public Eye[] getEyes(){
        return this.eyes;
    }


    @Override
    public String toString(){
        return this.name + " | Age: "+ this.age + " | Eyes color: " + Arrays.toString(this.eyes);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) // check if is idential object
            return true;
        if (!(obj instanceof Cat)) // Filter out non-Cat object
            return false;
        Cat cat = (Cat) obj; // already ensure it is a Cat object in previous line
        // return this.name.equals(cat.getName()) //Compare all values of this &
        // (cat)obj
        // && this.age == cat.getAge();
        return Objects.equals(this.name, cat.getName()) //
                && Objects.equals(this.age, cat.getAge()) //
                && Objects.equals(this.eyes, cat.getEyes());
    }

    // hashcode() -> represent object address
    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.age, this.eyes); // put all attributes into this method
    }

    public static void main(String[] args) {
        // Cat equals
        Cat c1 = new Cat("ABC", 5);
        Cat c2 = new Cat("ABC", 10);
        Cat c3 = new Cat("DEF", 5);
        Cat c4 = new Cat("IJK", 7);
        Cat c5 = new Cat("ABC", 5);

        System.out.println(c1.equals(c2)); // false, different age
        System.out.println(c1.equals(c3)); // false, different name
        System.out.println(c1.equals(c4)); // false, different name and different age
        System.out.println(c1.equals(c5)); // true
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
        System.out.println(c4.toString());
        System.out.println(c5.toString());
    }
}
