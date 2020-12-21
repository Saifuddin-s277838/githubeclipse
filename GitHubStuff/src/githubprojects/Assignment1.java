package githubprojects;
import java.util.Scanner;
public class Assignment1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please tell me about yourself");
		System.out.println("What is your name?");
		String name = sc.next();
		System.out.println("How old are you?");
		int age = sc.nextInt();
		System.out.println("What is your ic number?");
		int ic = sc.nextInt();
		System.out.println("What is your gender?");
		char gender = sc.next().charAt(0);
		System.out.println("What is your phone number?");
		int phone = sc.nextInt();
		System.out.println("When is your birthday year?");
		int year = sc.nextInt();
		System.out.println("When is your birthday day?");
		int day = sc.nextInt();
		System.out.println("What is your birthday month?");
		String month = sc.next();
		
		System.out.println("What product or services provided?");
		String product = "skin care";
		System.out.println("\nOur shop sells " + product + " products");
		
		System.out.println("What "+ product +"?");
		System.out.println("\nWe sell face serum for RM 23.00");
		System.out.println("We sell day lotion for RM 32.00");
		System.out.println("We sell night cream for RM 29.00");
		System.out.println("We sell sun screen for RM 16.00");
		System.out.println("We sell under-eye cream for RM 19.00");
		System.out.println("We sell cleanser for RM 15.00");
		System.out.println("We sell spot treatment for RM 26.00");
		System.out.println("We sell exfoliating scrub for RM 10.00");

		System.out.println("\nThere would be some discounts that you will get if you buy our product.");
		System.out.println("\nWould you like to buy our products?");
		char ans = sc.next().charAt(0);
		
		int q1=0, q2=0, q3=0, q4=0, q5=0, q6=0, q7=0, q8=0;
		double total = 0;
		
		if(ans == 'Y' || ans == 'y') {
			System.out.println("How much would you buy face serum?");
			q1 = sc.nextInt();
			double price1 = q1 * 23;
			System.out.println("How much would you buy day lotion?");
			q2 = sc.nextInt();
			double price2 = q2 * 32;
			System.out.println("How much would you buy night cream?");
			q3 = sc.nextInt();
			double price3 = q3 * 29;
			System.out.println("How much would you buy sun screen?");
			q4 = sc.nextInt();
			double price4 = q4 * 16;
			System.out.println("How much would you buy under-eye cream?");
			q5 = sc.nextInt();
			double price5 = q5 * 19;
			System.out.println("How much would you buy cleanser?");
			q6 = sc.nextInt();
			double price6 = q6 * 15;
			System.out.println("How much would you buy spot treatment?");
			q7 = sc.nextInt();
			double price7 = q7 * 26;
			System.out.println("How much would you buy exfoliating scrub?");
			q8 = sc.nextInt();
			double price8 = q8 * 10;
			total = price1 + price2 + price3 + price4 + price5 + price6 + price7 + price8;
		}
		
		else if(ans == 'N' || ans == 'n') {
			System.out.println("\nThank you for visiting our shop ;)");
		}
				
		double discount = 0, dprice = 0;
		
		
		if ( total >= 200 ) {
			discount = total*30/100;
			dprice = total - discount;
		}	
		else if ( total > 100 || total < 200 ) {
			discount = total*20/100;
			dprice = total - discount;
		}
		else {
			discount = total*10/100;
			dprice = total - discount;
		}
		
		System.out.println("\nName: " + name);
		System.out.println("Age: " + age);
		System.out.println("Ic number: " + ic);
		System.out.println("Gender: " + gender);
		System.out.println("HP: " + phone);
		System.out.println("Birthday: " + day +" "+ month +" "+ year);
		
		System.out.println("\nThe quantity of face serum: "+q1);
		System.out.println("The quantity of day lotion: "+q2);
		System.out.println("The quantity of night cream: "+q3);
		System.out.println("The quantity of sun screen: "+q4);
		System.out.println("The quantity of under-eye cream: "+q5);
		System.out.println("The quantity of cleanser: "+q6);
		System.out.println("The quantity of spot treatment: "+q7);
		System.out.println("The quantity of exfoliating scrub: "+q8);
				
		System.out.println("\nThe total price is: "+ total);
		System.out.println("Your discount will be: "+ discount);		
		System.out.println("Your price to be paid: "+ dprice);		

	}

}
