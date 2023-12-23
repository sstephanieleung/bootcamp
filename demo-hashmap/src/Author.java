import java.util.Objects;

public class Author {
    
    private String name;

    public Author(String name){
        this.name = name;
    }

    public String getName(){
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
        if (!(obj instanceof Author))
            return false;
        Author newObj = (Author) obj;
        return Objects.equals(this.name, newObj.getName());
    }
    @Override
    public int hashCode(){
        return Objects.hash(this.name);
    }
}
