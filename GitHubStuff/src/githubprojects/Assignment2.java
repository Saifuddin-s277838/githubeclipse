package githubprojects;
import java.util.Scanner;
public class Assignment2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please tell me about yourself.");
		System.out.println("What is your name? (nickname)");
		String name = sc.next();
		System.out.println("How old are you? (in number)");
		int age = sc.nextInt();
		System.out.println("What is your ic number? (without - )");
		int ic = sc.nextInt();
		System.out.println("What is your gender? (M/F)");
		char gender = sc.next().charAt(0);
		System.out.println("What is your phone number? (without - )");
		int phone = sc.nextInt();
		System.out.println("When is your birthday year? (in number)");
		int year = sc.nextInt();
		System.out.println("When is your birthday day? (in number)");
		int day = sc.nextInt();
		System.out.println("What is your birthday month? (in word)");
		String month = sc.next();
		
		System.out.println("\nWELCOME TO SAI BEAUTY AND CARE SHOP.");
		System.out.println("Do you interested in our shop?");
		System.out.println("What product or services provided in our shop you may ask?");
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
		System.out.println("\nWould you like to buy our products? (Y for yes / N for no)");
		char ans = sc.next().charAt(0);
		
		int q1=0, q2=0, q3=0, q4=0, q5=0, q6=0, q7=0, q8=0;
		double total = 0, price1=0, price2=0, price3=0, price4=0, price5=0, price6=0, price7=0, price8=0;
		
		if(ans == 'Y' || ans == 'y') {
			System.out.println("How much would you buy face serum?");
			q1 = sc.nextInt();
			price1 = q1 * 23;
			System.out.println("How much would you buy day lotion?");
			q2 = sc.nextInt();
			price2 = q2 * 32;
			System.out.println("How much would you buy night cream?");
			q3 = sc.nextInt();
			price3 = q3 * 29;
			System.out.println("How much would you buy sun screen?");
			q4 = sc.nextInt();
			price4 = q4 * 16;
			System.out.println("How much would you buy under-eye cream?");
			q5 = sc.nextInt();
			price5 = q5 * 19;
			System.out.println("How much would you buy cleanser?");
			q6 = sc.nextInt();
			price6 = q6 * 15;
			System.out.println("How much would you buy spot treatment?");
			q7 = sc.nextInt();
			price7 = q7 * 26;
			System.out.println("How much would you buy exfoliating scrub?");
			q8 = sc.nextInt();
			price8 = q8 * 10;
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
		
		System.out.println(" ");
		
		int t=1;
		do {
			if (t>0)
				System.out.print("*");
			t++;
		} while(t<50);
		
		System.out.println(" ");
		
		System.out.println("\nName: " + name);
		System.out.println("Age: " + age);
		System.out.println("Ic number: " + ic);
		System.out.println("Gender: " + gender);
		System.out.println("HP: " + phone);
		System.out.println("\nBirthday: " + day +" "+ month +" "+ year);
		
		System.out.println("\nSAI BEAUTY AND CARE SHOP.");
		System.out.println("\t\t\t\s\s\s\sQuantity\tprice");
		System.out.println("1.\tFace serum:\t\t"+q1+"\t" + price1);
		System.out.println("2.\tDay lotion:\t\t"+q2+"\t" + price2);
		System.out.println("3.\tNight cream:\t\t"+q3+"\t" + price3);
		System.out.println("4.\tSun screen:\t\t"+q4+"\t" + price4);
		System.out.println("5.\tUnder-eye cream:\t"+q5+"\t" + price5);
		System.out.println("6.\tCleanser:\t\t"+q6+"\t" + price6);
		System.out.println("7.\tSpot treatment:\t\t"+q7+"\t" + price7);
		System.out.println("8.\tExfoliating scrub:\t"+q8+"\t" + price8);
		
		System.out.println(" ");
		int i=1, line=0;
		while (i <50) {
			i = line++;
			System.out.print("-");
		}
		System.out.println(" ");
		
		System.out.println("\nThe total price is:\t"+ total);
		System.out.println("Your discount will be:\t"+ discount);		
		System.out.println("Your price to be paid:\t"+ dprice);		
		
		System.out.println(" ");

		for(int e=1; e <50; e++) {
			System.out.print(".");
		}
		System.out.println(" ");
		
		sc.close();

	}

}
