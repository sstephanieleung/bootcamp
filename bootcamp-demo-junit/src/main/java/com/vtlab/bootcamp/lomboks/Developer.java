package com.vtlab.bootcamp.lomboks; 

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor // name? id?
@ToString (callSuper = true) // name? id?
@EqualsAndHashCode (callSuper = true) // name? id?
@SuperBuilder // name? id?

public class Developer extends Staff {
    private List<String> skills;

    public Developer (int id, String name, List<String> skills){
        super(id, name);
        this.skills = skills;
    }

    public static void main(String[] args) {
        Developer d1 = new Developer();
        d1.setSkills(null);
        System.out.println(d1.getSkills()); //null

        Developer d2 = new Developer(new ArrayList<>(List.of("coding","testing")));
        
        //@ToString -> return attributes in self class
        System.out.println(d2); //Developer(skills=[coding, testing])

        //@ToString (callSuper = true) --> return all toString function of super class and self attributes
        System.out.println(d2); //With @ToString in Staff Class: Developer(super=com.vtlab.bootcamp.Developer@e35c9fe2, skills=[coding, testing])  With @ToString in Staff Class: Developer(super=Staff(id=0, name=null), skills=[coding, testing])

        Developer d3 = Developer.builder().name("Lydia").id(2).skills(new ArrayList<>(List.of("coding","testing"))).build();
        Developer d4 = Developer.builder().name("Lydia").id(2).skills(new ArrayList<>(List.of("coding","testing"))).build();

        System.out.println(d3.equals(d4)); //true
    }
}
