import java.util.Scanner;

public class Application {

	private static Scanner scanner1;

	public static void main(String[] args) {

		String firstName, lastName, age, birthMonth, favoriteColor, siblingCount;

		scanner1 = new Scanner(System.in);

		System.out.println("Enter your first name:");
		firstName = scanner1.nextLine();

		System.out.println("Enter your last name:");
		lastName = scanner1.nextLine();

		System.out.println("Enter your age:");
		age = scanner1.nextLine();

		System.out.println("Enter the number (1-12) that corresponds to your birth month:");
		birthMonth = scanner1.nextLine();

		System.out.println("Enter your favorite ROYGBIV color:");
		favoriteColor = scanner1.nextLine();

		System.out.println("Enter how many siblings you have:");
		siblingCount = scanner1.nextLine();

		String retirementYears, vacationHome, modeOfTransport, bankBalance;

		int ageInt = Integer.parseInt(age);
		if (ageInt % 2 == 0) {
			retirementYears = "22 Years";
		} else {
			retirementYears = "18 Years";

		}

		int siblings = Integer.parseInt(siblingCount);

		switch (siblings) {

		case -1:
			vacationHome = "McMurdo Station, Antartica";
			break;

		case 0:
			vacationHome = "Paris, France.";
			break;

		case 1:
			vacationHome = "Dublin, Ireland";
			break;

		case 2:
			vacationHome = "Sydney, Australia";
			break;

		case 3:
			vacationHome = "Cairo, Egypt";
			break;

		default:
			vacationHome = "Dubai, United Arab Emirates";

		}

		String color;

		color = favoriteColor.toLowerCase();

		switch (color) {

		case "red":
			modeOfTransport = "Mazda Miata";
			break;

		case "orange":
			modeOfTransport = "Chevrolet Corvette Stingray";
			break;

		case "yellow":
			modeOfTransport = "Oscar Mayer Weinermobile";
			break;

		case "green":
			modeOfTransport = "Jeep Wrangler";
			break;

		case "blue":
			modeOfTransport = "Vespa Scooter";
			break;

		case "indigo":
			modeOfTransport = "Pair of Heelys";
			break;

		case "violet":
			modeOfTransport = "Boba Fett's Jetpack";
			break;

		default:
			modeOfTransport = "plucky attitude";
		}

		switch (birthMonth) {
		case "1":
			bankBalance = "$73.32";
			break;

		case "2":
			bankBalance = "$73.32";
			break;

		case "3":
			bankBalance = "$73.32";
			break;

		case "4":
			bankBalance = "$73.32";
			break;

		case "5":
			bankBalance = "$999,999,999.99";
			break;

		case "6":
			bankBalance = "-$63073.96";
			break;

		case "7":
			bankBalance = "$999,999,999.99";
			break;

		case "8":
			bankBalance = "$999,999,999.99";
			break;

		case "9":
			bankBalance = "$1,302,927.04";
			break;

		case "10":
			bankBalance = "$1,302,927.04";
			break;

		case "11":
			bankBalance = "$1,302,927.04";
			break;

		case "12":
			bankBalance = "$1,302,927.04";
			break;

		default:
			bankBalance = "$0.00";
		}

			System.out.println(firstName + " " + lastName + " will retire in " + retirementYears + " with "
					+ bankBalance + " in the bank, a vacation home in " + vacationHome + ", and travel by "
					+ modeOfTransport + ".");

		}
	}
