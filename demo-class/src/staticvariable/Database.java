package staticvariable;

import java.util.Arrays;

import javax.xml.crypto.Data;

public class Database {

    private static String[] strings = new String[0];

    //final vs. static final
    //1. "final" is still instance variable, the object can call it by "this"
    //2. "static final" is constant

    private final int hoursPerDay = 24; //Constant instnace variable

    private static final int MINUTES_PER_HOUR = 60; // Constant in class

    public static void add(String str) {
        String[] newArr = new String[strings.length + 1];
        for (int i = 0; i < strings.length; i++) {
            newArr[i] = strings[i];
        }
        newArr[newArr.length - 1] = str;
        strings = newArr;
    }

    public static String get(int index) {
        if (isIndexValid(index)) {
            return Database.strings[index];
        }
        return null;
    }

    public static boolean remove(int index) {
        if (!isIndexValid(index)) {
            return false;
        }
        String[] newStrings = new String[strings.length - 1];
        int idx = 0;
        for (int i = 0; i < strings.length; i++) {
            if (i != index) {
                newStrings[idx++] = strings[i];
            }
        }
        strings = newStrings;
        return true;
    }

    public static boolean isIndexValid(int index) {
        return index >= 0 && index < strings.length;
    }

    public static void main(String[] args) {
        Database.add("hello"); // We do not need to create Database object to operate static variables
        Database.add("world");
        System.out.println(Database.get(0));
        System.out.println(Database.get(1));
        Database.remove(1);
        System.out.println(Database.get(0));
        System.out.println(Database.get(1));

    }
}