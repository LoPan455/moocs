import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type the first number: ");
        int firstNumber = Integer.parseInt(reader.nextLine());

        System.out.print("Type the second number: ");
        int secondNumber = Integer.parseInt(reader.nextLine());

        if (firstNumber > secondNumber) {
            System.out.print("Greater number: " + firstNumber);
        } else if (firstNumber < secondNumber) {
            System.out.print("Greater number: " + secondNumber);
        } else {
            System.out.print("The numbers are equal!");
        }



    }
}
