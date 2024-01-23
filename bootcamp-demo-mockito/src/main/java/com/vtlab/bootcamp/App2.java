package com.vtlab.bootcamp;

public class App2 {

    public int provider(int x, int y) {
        return x / y;
    }

    public char encode(char c) {
        return (char) (c % 7 * 100 % 27 + 64);
    }

    public int provider2(int x, int y) {
        return x * y;
    }
}
