package com.vtlab.bootcamp;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 * Unit test for simple App.
 */
@ExtendWith(MockitoExtension.class)
public class App1Test {
    /**
     * Rigorous Test :-)
     */

    @Mock
    private App2 dependency; // we didnt' create object

    @BeforeAll
    static void initialize() {

    }

    @InjectMocks
    private App1 app1;

    @Test
    void testAdd_Case1() {

        // if someone call dependency.provider(10,4), return -323
        Mockito.when(dependency.provider(10, 4)).thenReturn(-323);

        //App1 app1 = new App1(dependency);
        int result = app1.add(5, 4);
        assertEquals(177, result);
    }

    @Test
    void testAdd_Case2() {
        Mockito.when(dependency.provider(18, 19)).thenReturn(100);
        App1 app1 = new App1(dependency);
        int result = app1.add(9, 19);
        assertEquals(600, result);
    }

    @Test
    void testAdd_Case3() {
        Mockito.when(dependency.provider(18, 20)).thenReturn(100);
        App1 app1 = new App1(dependency);
        int result = app1.add(9, 20);
        assertEquals(600, result);
    }

    @Test
    void testAdd_Case4() {
        Mockito.when(dependency.provider(22, 20)).thenReturn(100);
        App1 app1 = new App1(dependency);
        int result = app1.add(11, 20);
        assertEquals(600, result);
    }

    @Test
    void testFirstCharacter() {
        when(dependency.encode('a')).thenReturn('B');
        when(dependency.encode('c')).thenReturn('D');
        when(dependency.encode('i')).thenReturn('J');
        when(dependency.encode('j')).thenReturn('K');
        // mock is done in @BeforeAll
        App1 app1 = new App1(dependency);
        List<String> strings = new ArrayList<>(List.of("abc", "ijk", "cba", "jba", "jba"));
        String result = app1.firstCharacter(strings);
        assertEquals("BJDKK", result);

        verify(dependency, times(1)).encode('a');
        verify(dependency, times(1)).encode('i');
        verify(dependency, times(1)).encode('c');
        verify(dependency, times(2)).encode('j');

    }
}
