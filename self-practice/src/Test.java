import java.util.Arrays;

public class Test{

    //<Object>.equals
    // public boolean equals(Object obj) {
    //     return (this == obj);
    // }

    // //<String>.equals overriding <Object.equals
    // @Override
    // public boolean equals(Object anObject) {
    //     if (this == anObject) {
    //         return true;
    //     }
    //     return (anObject instanceof String aString)
    //             && (!COMPACT_STRINGS || this.coder == aString.coder)
    //             && StringLatin1.equals(value, aString.value);
    // }

    public static void main(String[] args) {
        String s = "abc";

        System.out.println(s.indexOf("abc")); //word[0] : "abc"
        System.out.println(s.indexOf("ab")); //word[1]: "ab"
        System.out.println(s.indexOf("bc")); //word[2]: "bc"
    }






    public static void main(String[] args) {
        String[] arr = new String[]{"abc","def"};
        System.out.println(arr.toString());
        System.out.println(Arrays.toString(arr));
    }
}