public class DemoSwitch {
    public static void main(String[] args) {
        // if, else-if -> comparison and logical operators

        // switch: single value comparison (==)
        char vipGrade = 'G'; // Gold (G) , Silver (S)
        double discount = 0.0d;

        //Switch function - no breaks
        switch (vipGrade) {
            case 'G':
                discount += 0.1d;  // when vipGrade is G, discount add 0.1
   
            case 'S':
                discount += 0.1d;  // when vipGrade is G / S, discount add 0.1, so vipGrade G will discount added twice.

            case 'N':

        }

        //Switch function - with breaks
        switch (vipGrade) {
            case 'G':
                discount += 0.2d;  // when vipGrade is G, discount add 0.2
                break;  //this scenario ends here
   
            case 'S':
                discount += 0.1d;  // when vipGrade is S, discount add 0.1
                break;  //this scenario ends here

            case 'N':
            default:
                break;
        }

        String name = "Stephanie";
        int nameIndex = 5;
        switch (name.charAt(nameIndex)) {
            case 'a':
                System.out.println("The name.charAt(5) character of your name is a.");
                break;
        
            default:
                System.out.println("The name.charAt(5) is not a.");
                break;
        }
    }
}
