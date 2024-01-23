package com.vtlab.bootcamp.lomboks;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
public class Person {

    private String name;

    private int age;

    public Person(String name) {
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
        this.name = "";
    }

    public boolean isElderly() {
        return this.age >= 65;
    }

    public static Person of(String name, int age) {
        if (name == null || age < 0)
            return null;
        return new Person(name, age);
    }

    public static String concat(String s1, String s2) {
        if (s1 == null)
            return null;
        if (s2 == null)
            throw new IllegalArgumentException();
        return s1.concat(s2);
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setAge(30);
        p1.setName("John");
        System.out.println(p1.getName() + " " + p1.getAge());

        Person p2 = new Person("Mary", 20);
        System.out.println(p2.toString());

        Person p3 = new Person("John", 30);
        System.out.println(p1.equals(p3));

        System.out.println(p1.hashCode());
        System.out.println(p3.hashCode());

        Person p4 = Person.builder().name("Peter").age(23).build();
    }
}
