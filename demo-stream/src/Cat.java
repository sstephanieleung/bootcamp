import java.util.Objects;

public class Cat {
    
    private String name;

    private int age;

    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    @Override
    public String toString(){
        return "Cat: "+ this.name + " | "+ this.age;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if(!(obj instanceof Cat))
            return false;
        Cat newObj = (Cat) obj;
        return Objects.equals(this.name, newObj.getName()) && Objects.equals(this.age, newObj.getAge());
    }
}
