import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		final String leapYear = "The year is a leap year";
		final String notLeapYear = "The year is not a leap year";
		String returnString;

		int year = Integer.parseInt(reader.nextLine());

		if ((year % 100 != 0 && year % 400 == 0) || (year % 4 == 0))
		{
			returnString = leapYear;
			if (year % 100 == 0 && year % 400 != 0) {
				returnString = notLeapYear;
			}
		} else {
			returnString = notLeapYear;
		}
		System.out.println(returnString);
	}

}
