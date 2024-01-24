package com.vtlab.bootcamp;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App1 {

    private App2 app2;

    //if you want to use @InjectMock, then you have to create this all args constructor
    public App1(App2 app2) {
        this.app2 = app2;
    }

    // Developer A

    // public int add(int x, int y) {
    // return this.app2.provider(x * 2, y) + 1000;
    // }

    public int add(int x, int y) {
        // for UT, we should Mock the external call
        // because we dont' want the test code of add() method will be changed in the
        // future
        // due to the main code change
        int result = this.app2.provider(x * 2, y);

        if (x > 10 && y < 20)
            return result + 1000;
        return result + 500;
    }

    public String firstCharacter(List<String> strings) {
        StringBuilder sb = new StringBuilder();
        char encoded;
        for (String e : strings) {
            encoded = this.app2.encode(e.charAt(0));
            sb.append(encoded);
        }
        return sb.toString();
    }

    public int multiply(int x, int y) {
        return this.app2.provider(x, y) + this.app2.provider2(x, y);
    }
}
