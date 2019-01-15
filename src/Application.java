import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		String firstName,
		lastName,
		age,
		birthMonth,
		favoriteColor,
		siblingCount;
		
		Scanner scanner1 = new Scanner(System.in);
		
		System.out.println("Enter your first name:");
		firstName = scanner1.nextLine();
		
		System.out.println("Enter your last name:");
		lastName = scanner1.nextLine();
		
		System.out.println("Enter your age:");
		age = scanner1.nextLine();
		
		System.out.println("Enter your birth month:");
		birthMonth = scanner1.nextLine();
		
		System.out.println("Enter your favorite ROYGBIV color:");
		favoriteColor = scanner1.nextLine();
		
		System.out.println("Enter how many siblings you have:");
		siblingCount = scanner1.nextLine();
		
		System.out.println("Your name is " + firstName + " " + lastName + " and you are " + age + " years old.");


		
		
	}

}
