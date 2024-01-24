package com.vtlab.bootcamp;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.*;

import static org.hamcrest.MatcherAssert.*;
import org.junit.jupiter.api.Test;

import static com.vtlab.bootcamp.model.EmailMatcher.*;

import static com.vtlab.bootcamp.model.UppercasesStringMatcher.*;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    void testIntegerString() {
        int actual = 45;
        assertThat(actual, equalTo(45));
        assertThat(actual, not(equalTo(44)));
        assertThat(actual, is(not(equalTo(44)))); // same as above

        String actual2 = "hello";
        assertThat(actual2, equalTo("hello"));
        assertThat(actual2, not(equalTo("hell")));
        assertThat(actual2, containsString("ll"));
        assertThat(actual2, not(containsString("world")));
    }

    @Test
    void testNullValue() {
        String actual = null;
        assertThat(actual, nullValue());

        String actual2 = "hello";
        assertThat(actual2, notNullValue());
    }

    @Test
    void testSameObject() {
        String s1 = "hello";
        String s2 = "hello";
        assertThat(s1, sameInstance(s2));

        String s3 = new String("hello");
        assertThat(s2, not(sameInstance(s3)));
    }

    @Test
    void testAllRangeOfResult() {
        int result = 48;

        assertThat(result, allOf(
                greaterThan(47),
                lessThan(50)));

        String actual = "world";
        assertThat(actual, anyOf(
                equalTo("hello"),
                equalTo("world")));
    }

    @Test
    void testEmptyString() {
        String emptyString = "";
        assertThat(emptyString, emptyString());
        assertThat(" ", not(emptyString()));
        String actual = "hello";
        assertThat("actual", not(emptyString()));

        assertThat(actual, allOf(
                not(emptyString()),
                equalTo("hello"),
                startsWith("h"),
                endsWith("o")));
    }

    @Test
    void testCollection() {
        List<String> strings = new ArrayList<>();
        strings.add("John");
        strings.add("Peter");
        strings.add("Jenny");

        assertThat(strings, hasItem("Peter"));
        assertThat(strings, not(hasItem("Peterr")));
        assertThat(strings, hasSize(3));

        assertThat(strings.size(), allOf(
                lessThanOrEqualTo(100),
                greaterThanOrEqualTo(0)));

        assertThat(strings, containsInAnyOrder("John", "Jenny", "Peter"));
        assertThat(strings, not(containsInAnyOrder("John", "Peter")));

        //what is the difference between contains() and hasItems()
        //1. contains() & containsInAnyOrder() -> with all items
        //2. hasItems() -> with specific items only, no orderly
    }

    @Test
    void testArray(){
        String[] strings = new String[]{"John","Ken","Steven"};

        assertThat(strings, arrayContaining("John","Ken","Steven"));
        assertThat(strings, not(arrayContaining("John","Steven")));
        assertThat(strings, not(arrayContaining("John","Steven","Ken")));

        assertThat(strings, arrayContainingInAnyOrder("Ken","John","Steven"));
    }

    @Test
    void testTolerance(){
        double tolerance = 0.01d;
        double actual = 3.14159d;  // 3.13159 <= x <= 3.15159
        assertThat(actual, closeTo(3.14, tolerance));
        assertThat(actual, closeTo(3.15, tolerance));
        assertThat(actual, not(closeTo(3.13149, tolerance))); 
        assertThat(actual, closeTo(3.15149, tolerance));
    }

    @Test
    void testObject(){
        Object obj = "hello";
        System.out.println(obj);
        if(obj instanceof String){
            String s = (String) obj;
        }
        obj = 1000;
        if(obj instanceof Integer){
            Integer i = (Integer) obj;
        }
    }
    @Test
    void testAnimal(){
        Animal animal1 = Animal.get(3);
        assertThat(animal1, instanceOf(Dog.class));

        Animal animal2 = Animal.get(10);
        assertThat(animal2, instanceOf(Cat.class));
    }

    @Test
    void testCompatible(){
        assertThat(Cat.class, typeCompatibleWith(Animal.class));
        assertThat(Cat.class, typeCompatibleWith(Object.class));
        assertThat(Cat.class, not(typeCompatibleWith(Integer.class)));
        assertThat(Cat.class, not(typeCompatibleWith(Dog.class)));
        assertThat(Animal.class, not(typeCompatibleWith(Cat.class)));
    }

    @Test
    void testCustomMatcher(){
        String result = "HELLO";
        assertThat(result, containsUppercaseOnly());
        assertThat("hello", not(containsUppercaseOnly()));
        assertThat("HELL0", not(containsUppercaseOnly()));
    }

    @Test
    void testEmail(){
        String email = "abc.def-ijk_xyz@gmail.com";

        assertThat(email, validateEmail());
        assertThat("-abc@gmail.com", not(validateEmail()));
        assertThat("abc-@gmail.com", not(validateEmail()));
        assertThat("abc@yahoo.com.hk", validateEmail());
    }
}
