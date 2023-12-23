import java.util.Objects;

public class Book {

    private String name;

    public Book() {
        this.name = "";
    }

    public Book(String name) {
        this.name = name;
    }

    private String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Book))
            return false;
        Book newObj = (Book) obj;
        return Objects.equals(this.name, newObj.getName());
    }
    @Override
    public int hashCode(){
        return Objects.hash(this.name);
    }

}
