import java.util.Objects;

public class Staff {

    private final String name;

    private final int age;

    public Staff(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String name() {
        return this.name;
    }

    public int age() {
        return this.age;
    }

    @Override
    public String toString() {
        return this.getClass() + "[name=" + this.name + ", age=" + this.age + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Staff))
            return false;
        Staff newObj = (Staff) obj;
        return Objects.equals(this.name, newObj.name())
                && Objects.equals(this.age, newObj.age());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.age);
    }

    public static void main(String[] args) {
        Staff s = new Staff("Vincent Lau",20);
        System.out.println(s.toString());
    }
}
