package com.vtlab.bootcamp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class App1SpyTest {

    @Spy
    private App2 app2; // During the UT, there is a n object created for app2

    @Test
    void testMulitply() {
        // If we just mock provider2(), provider() is still working normally(due to Spy)
        when(app2.provider2(8, 2)).thenReturn(105);
        App1 app1 = new App1(app2);
        int actual = app1.multiply(8, 2);
        assertEquals(109, actual); // 3/10+105

    }
}
