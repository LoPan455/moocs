
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        int input = Integer.parseInt(reader.nextLine());
        int sum = 0;
        int iterator = 0;

        while (iterator <= input) {
            sum += (int) Math.pow(2, iterator);
            iterator++;
        }

        System.out.println("The sum is: " +  sum);


    }
}
