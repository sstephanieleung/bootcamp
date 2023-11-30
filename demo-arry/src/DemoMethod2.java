public class DemoMethod2 {
    public static void main(String[] args) {

        String s1 = "abc";
        String s2 = "def";
        String str = "ThisIsMeaninglessString";
        String s = "abcbcdabc";

        System.out.println(append(s1, s2));
        System.out.println(getLastChar(str));
        System.out.println(isStartedWith(str, "this"));
        System.out.println(remove(s, "bcd"));
        System.out.println(sound2("Dog"));
        System.out.println(notifyCustomer());

    }

    // s1 -> "abc"
    // s2 -> "def"
    // return "abcdef"
    public static String append(String s1, String s2) {
        String result = s1.concat(s2);
        return result;
    }

    // Get the last character of the String s
    // if s length < 1, return ' ' (space character)
    public static char getLastChar(String s) {
        char c = s.charAt(s.length() - 1);
        return c;
    }

    // s -> "helloworld"
    // prefix -> "hello"
    // return true
    public static boolean isStartedWith(String s, String prefix) {
        boolean start = s.startsWith(prefix);
        return start;
    }

    // s -> "abcbcdabc"
    // toBeRemove -> "bcd"
    // return "abcabc"
    public static String remove(String s, String toBeRemoved) {
        String newString = s.replace("bcd", "");
        return newString;
    }

    public static void sound(String animal) {
        // Early return
        if ("ABC".equals(animal)) {
            return; // it is grammarly correct to have return in a void method, the method will end
                    // here.
        }
        if ("Dog".equals(animal)) {
            System.out.println("Wo wo");
        } else {
            System.out.println("Default not found..");
        }
    }

    public static String sound2(String animal) {
        if ("ABC".equals(animal)) {
            return ""; // this string method must return with a String value when exit the method.
        }
        if ("Dog".equals(animal)) {
            return "wo wo";
        } else {
            return "Default sound...";
        }
    }

    //Check if successfully notify customer
    public static boolean notifyCustomer(){
        return sendEmail() || sendSMS();        
    }
    public static boolean sendEmail(){
        return false;
    }
    public static boolean sendSMS(){
        return false;
    }

    public static boolean methodName (int x, char y){
        return true;
    }
    public static boolean methodName (char y, int x){
        return true;
    }


}
