package com.vtlab.bootcamp.lomboks; 

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@EqualsAndHashCode
@ToString (onlyExplicitlyIncluded = true)
public class Cat {
    
    @Getter
    @Setter
    @EqualsAndHashCode.Exclude
    private double weight;

    @Getter
    private String name;

    @Getter
    @ToString.Include
    private int age;

    public static void main(String[] args) {
        Cat c1 = new Cat(3.2, "ABC",1);
        System.out.println(c1.getName() + " " + c1.getWeight());
        c1.setWeight(3.9);
        Cat c2 = new Cat(3.2, "ABC",1);
        System.out.println(c1.equals(c2));
        System.out.println(c2.toString());
    }
}
