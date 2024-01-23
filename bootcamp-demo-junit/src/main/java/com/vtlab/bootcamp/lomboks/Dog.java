package com.vtlab.bootcamp.lomboks; 

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

//@RequiredArgsConstructor
@AllArgsConstructor
@ToString
public class Dog {
    
    private final String firstName = "John";

    @NonNull
    private String LastName;

    @NonNull
    private String color;

    public static void main(String[] args) {
        Dog d1 = new Dog(
            "Chan","Red"
        );
        System.out.println(d1);
    }

}
