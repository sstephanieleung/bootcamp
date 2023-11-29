public class DemoDoWhileLoop {
    public static void main(String[] args){
        int j = 0;

        while (j < 0) {

        }

        for (int i = 0 ; i < 0; i++){

        }

        //Do-while: always execute once, no matter the condition
        do {
            System.out.print(++j + " ");
        }while (j < 5);
    }
}
