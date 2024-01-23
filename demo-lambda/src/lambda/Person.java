package lambda;

import java.util.function.Predicate;

//This is a wrong example. We should NOT use a class to implement Predicate
//Instead we should use predicate 

public class Person implements Predicate<Integer> {

    private String name;

    private int age;

    private Gender gender;

    public Person() {

    }

    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public boolean test(Integer adultAge) {
        return this.age == adultAge;
    }

    @Override
    public String toString(){
        return "Person(Name: " + this.name + " |Age: "+ this.age+ " |Gender: " + this.gender+")";
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.test(18);
    }
}
