package example27;
import java.util.Scanner;
/*   
Author: Chan In Kou
Purpose: The Display will show the order of three cities
*/
public class Example27 {
	public static void main(String[] args) {
		// Create a Scannera
		Scanner in = new Scanner(System.in);

		// make variables
		String firstCity;
		String secondCity;
		String thirdCity;

		// Enter three city
		System.out.print("Enter first city: ");
		firstCity = in.nextLine();

		System.out.print("Enter second city: ");
		secondCity = in.nextLine();

		System.out.print("Enter third city: ");
		thirdCity = in.nextLine();

		// display which one goes first
		if (firstCity.charAt(0) < secondCity.charAt(0) && secondCity.charAt(0) < thirdCity.charAt(0)) {
			System.out.print("Alphabetical Order: " + firstCity + ", " + secondCity + ", " + thirdCity);
		} else if (secondCity.charAt(0) < firstCity.charAt(0) && firstCity.charAt(0) < thirdCity.charAt(0)) {
			System.out.print("Alphabetical Order: " + secondCity + ", " + firstCity + ", " + thirdCity);
		} else if (thirdCity.charAt(0) < secondCity.charAt(0) && secondCity.charAt(0) < firstCity.charAt(0)) {
			System.out.print("Alphabetical Order: " + thirdCity + ", " + secondCity + ", " + firstCity);
		} else if (firstCity.charAt(0) < thirdCity.charAt(0) && thirdCity.charAt(0) < secondCity.charAt(0)) {
			System.out.print("Alphabetical Order: " + firstCity + ", " + thirdCity + ", " + secondCity);
		} else if (secondCity.charAt(0) < thirdCity.charAt(0) && thirdCity.charAt(0) < firstCity.charAt(0)) {
			System.out.print("Alphabetical Order: " + secondCity + ", " + thirdCity + ", " + firstCity);
		} else {
			System.out.print("Alphabetical Order: " + thirdCity + ", " + firstCity + ", " + secondCity);
		}
	}
}