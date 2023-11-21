public class DemoChar {
    public static void main(String[] args){
        char c1 = 'a'; //char value is single character, notating with ''
        char c2 = 'b';
        char c3 = ' ';
        //char c4 = '10'; // syntac error, 1 and 0 are two individual char value
        //char c5 = "10"; // syntax error
        //String s = "10";
        char c6 = '好';
        System.out.println(c6); //char -> int 
        char c7 = 1;


        //Coding principle: Simple is the best!
        //For example:
        String isPassed = "P";  //No good, other programmer may think if it could be a long string too? e.g. "Pass"
        char isPassed2 = 'P'; // No good, other programmer may think if it could be another char? e.g. 'a'
        boolean isPassed3 = true; //The best approach to describe pass or fail
    }
}
