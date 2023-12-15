import java.util.Objects;

public class Eye {
    
    private String color;

    public Eye(String color){
        this.color = color;
    }

    public String getColor(){
        return this.color;
    }

    @Override
    public String toString(){
        return this.color;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if(obj instanceof Eye)
            return false;
        Eye eye = (Eye) obj;
        return Objects.equals(this.color,eye.getColor());
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.color);
    }
}
