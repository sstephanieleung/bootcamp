package lambda;

import java.util.Objects;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class DemoPredicate {

    public static void main(String[] args) {
        int age = 17;
        boolean isAdult = age >= 18;
        System.out.println(isAdult);

        Predicate<Integer> isAdult2 = x -> x >= 18; // Predicate return boolean
        System.out.println(isAdult2.test(age));

        Predicate<Integer> isOdd = x -> x % 2 == 1;
        System.out.println("9 is an odd number: " + isOdd.test(9));

        // .and()
        Predicate<Integer> isPositive = x -> x > 0;
        System.out.println(isOdd.and(isPositive).test(2));

        // .or()
        System.out.println(isOdd.or(isPositive).test(0));

        // BiPredicate
        BiPredicate<String, Integer> isVowel = (str, idx) -> {
            Objects.requireNonNull(str); //throw NPE
            Objects.requireNonNull(idx); //throw NPE
            if (idx > str.length() - 1 || idx < 0)
                return false;
            char[] vowel = new char[] { 'a', 'e', 'i', 'o', 'u' };
            for (char e : vowel)
                if (str.charAt(idx) == e)
                    return true;
            return false;
        };

        System.out.println(isVowel.test("hello", 2));
        System.out.println(isVowel.test("hello",-1));

        String s = null;
        Integer n = null;
        System.out.println(isVowel.test(s, n)); //throw NPE

        BiPredicate<String, String> isEqual = (s1, s2) -> {
            Objects.requireNonNull(s1);
            Objects.requireNonNull(s2);
            return s1.equals(s2);
        };
        System.out.println(isEqual.test(new String("hello"),new String("hello"))); //true
    }
}
