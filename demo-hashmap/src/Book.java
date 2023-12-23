import java.util.Objects;

public class Book {
    
    private String name;

    private String version;

    public Book(String name){
        this.name = name;
        this.version = "0.0";
    }

    public Book(String name, String ver){
        this.name = name;
        this.version = ver;
    }

    private String getName(){
        return this.name;
    }

    private String getVersion(){
        return this.version;
    }

    @Override
    public String toString(){
        return "Title: "+this.name + " | Version: " + this.version;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if(!(obj instanceof Book))
            return false;
        Book newObj = (Book) obj;
        return Objects.equals(this.name, newObj.getName()) && Objects.equals(this.version, newObj.getVersion());
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.name, this.version);
    }

}
