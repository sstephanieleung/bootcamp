import java.util.Random;
import java.util.Scanner;

public class DemoRandom {
    public static void main(String[] args) {

        int lowMargin = 1;
        int highMargin = 100;
        int target = new Random().nextInt(highMargin - lowMargin + 1) + lowMargin;
        System.out.println(target); // 1-100

        Scanner scanner = new Scanner(System.in);
        int input;
        do {
            System.out.println("Please enter a number from  " + lowMargin + " - " + highMargin);
            input = scanner.nextInt();
            if (input < lowMargin || input > highMargin) {
                System.out.println("Your answer is out of the range, please try again!");
                continue;
            }
            if (input > target) {
                System.out.println("Too high! Please try again!");
                highMargin = input-1;
                continue;
            }
            if (input < target) {
                System.out.println("Too low! Please try again!");
                lowMargin = input+1;
                System.out.println(lowMargin);
                continue;
            }
            System.out.println("You've got the correct answer!");
        } while (input != target);
        scanner.close();
    }
}
