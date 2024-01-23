package com.vtlab.bootcamp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import com.vtlab.bootcamp.unittest.Calculator;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(OrderAnnotation.class)
public class Calculator2Test {

    private int value;

    @BeforeAll
    void beforeAll() {
        this.value = 10000;
        System.out.println("PER_CLASS, beforeAll this.value = " + this.value);
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("PER_CLASS, beforeEach message.");
    }

    @Test
    @Order(1)
    void testAdd() {
        this.value = Calculator.add(2, 3);
        assertEquals(5, this.value);
    }

    @Test
    @Order(2)
    void testSubtract() {
        this.value = Calculator.subtract(this.value, 10);
        assertEquals(-5, this.value);
    }

    @AfterEach
    void afterEach(){
        System.out.println("PER_CLASS, afterEach message.");
    }

    @AfterAll
    void afterAll() {
        this.value = 1;
        System.out.println("PER_CLASS, afterAll this.value = " + this.value);
    }


    public static void main(String[] args) {
        Calculator2Test c2 = new Calculator2Test();
        c2.testAdd();
        c2.testSubtract();
    }
}
