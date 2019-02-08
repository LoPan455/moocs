
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user.

        System.out.print("Type a number: ");
        double firstNumber = Integer.parseInt((reader.nextLine()));

        System.out.print("Type another number: ");
        double secondNumber = Integer.parseInt((reader.nextLine()));

        double result = firstNumber / secondNumber;

        System.out.print("Division: " + firstNumber + " / " + secondNumber + " = " + result);


    }
}
