public class DemoStringBuilder {

    public static void main(String[] args) {
        // String
        // +=
        // .concat()

        String x = "abc";
        x += "def";
        x = x.concat("def");  //Pass by value: return a new string
        System.out.println(x); //abcdefdef

        //StringBuilder <- Class
        StringBuilder y = new StringBuilder("abc");
        y.append("def").append("def");  //Pass by reference: return 
        System.out.println(y.toString());

        //123 456 789 101112...
        //While loop --> counter
        StringBuilder sbInt = new StringBuilder("");
        int counter = 4;
        int num = 0;

        while (counter-- > 0){
            //sbInt.append(++num).append(++num).append(++num).append(" ");
            for (int i = 0; i < 3 ; i++){
                sbInt.append(++num);
            }
            if(counter > 0){
                sbInt.append(" ");
            }           
        }
        System.out.println(sbInt.toString());
    }
}
