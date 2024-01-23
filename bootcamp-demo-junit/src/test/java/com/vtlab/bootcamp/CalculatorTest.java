package com.vtlab.bootcamp;

import static org.junit.jupiter.api.Assertions.*; // Copy all methods to this class as static methods

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.vtlab.bootcamp.lomboks.Order;
import com.vtlab.bootcamp.lomboks.Person;
import com.vtlab.bootcamp.unittest.Calculator;

public class CalculatorTest {

    private int x = 10;

    private static int z = 50;

    @BeforeAll
    static void beforeAll(){  //have to be static
        //excute one time only
        z += 10; //60
        System.out.println("BeforeAll z="+z);
    }

    //TestInstance.Lifecycle.PER_METHOD -> the meaning of @BeforeEach same as @BeforeAll
    @BeforeEach
    void initialize(){
        this.x++;
        System.out.println("BeforeEach this.x = "+x);
    }

    @Test
    void testAddition(){
        int actualResult = Calculator.add(3,2);
        assertNotEquals(6, actualResult);
        assertNotEquals(4, actualResult);
    }

    @Test
    void testSubtraction(){
        int actualResult = Calculator.subtract(3,2);
        assertNotEquals(6, actualResult);
        assertNotEquals(4, actualResult);
    }

    
    //@Test //Maven trigger this method during "test" phase
    void testAdd(){
        int actualResult = Calculator.add(3,2);
        int expectResult = 5;

        //Expected result validation
        assertEquals(expectResult, actualResult);

        //Boundary validation
        assertNotEquals(6, actualResult);
        assertNotEquals(4, actualResult);

        //assertTrue, assertFalse
        Person p1 = new Person("Sally",65);
        assertTrue(p1.isElderly());
        assertFalse(new Person("Sally", 64).isElderly());

        //assertNull, assertNotNull
        assertNull(Person.of("John",-3));
        assertNull(Person.of(null, 0));
        assertNotNull(Person.of("John",40));


        //Person equals()
        Person x1 = new Person("Jason", 30);
        Person x2 = new Person("Jason", 30);

        assertEquals(x1,x2);


        //assertArrayEquals
        //assertSame, assertNotSame, what is different between assertSame and assertEquals
        String s1 = "hello";
        String s2 = "hello";
        assertSame(s1,s2); //check if they are same object

        String s3 = new String("hello");
        assertNotSame(s2, s3);

        //assertThrows
        //assertThrows(IllegalArgumentException.class, () -> Person.concat(null, null));
        //assertThrows(IllegalArgumentException.class, () -> Person.concat(null, "def"));
        assertDoesNotThrow(() -> Person.concat("abc", "def"));
        assertThrows(IllegalArgumentException.class,() -> Person.concat("abc",null));

        //assertAll  ->　express the sequential events testing
        Order order = new Order();
        assertAll(
            () -> assertTrue(order.order()),
            () -> assertTrue(order.payment()),
            () -> assertTrue(order.lockInventory())
        );

        //assertTimeout
        List<String> items = new ArrayList<>();
        for(int i = 0 ; i < 1_000_000; i++){
            items.add(String.valueOf(i));
        }
        assertTimeout(Duration.ofMillis(1000), () -> order.placeOrder(items));

        x++;

    }

    @AfterEach
    void reset(){
        this.x = 10;
        System.out.println("AfterEach this.x ="+x);
    }

    @AfterAll
    static void done(){
        z = 10;
        System.out.println("AfterAll z ="+z);
    }

    public static void main(String[] args) {
        //By default, the Unit Testing will be performed by instance & and instance method
        CalculatorTest c1 = new CalculatorTest();
        c1.testAdd();
        System.out.println(c1.x);

        CalculatorTest c2 = new CalculatorTest();
        c2.testAdd();
        System.out.println(c2.x);
    }
}
