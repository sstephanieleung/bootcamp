import java.util.Scanner;

public class findPrime {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please input a number to check if it is prime number: ");
        int input = scanner.nextInt();
        System.out.println(isPrime(input));

    }

    public static boolean isPrime(int num) {
        if (num == 0 || num == 1) {
            return true;
        }
        for (int i = 1; i < num; i++) {
            if (i != 1 && num % i == 0)
                return false;
        }
        return true;
    }

}
