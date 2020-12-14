package githubprojects;
import java.util.Scanner;
public class LabTest1question1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of items: ");
		int item = sc.nextInt();
		double price1 = 0, price2 = 0, price3 = 0, dtotal, discount;
		
		
		if ( item >= 1) {
			System.out.print("Enter price of first item: ");
			double first = sc.nextDouble();
			System.out.print("Enter quantity of first item: ");
			int qfirst = sc.nextInt();	
			price1 = qfirst*first;
		}
		if ( item >= 2) {
			System.out.print("\nEnter price of second item: ");
			double second = sc.nextDouble();
			System.out.print("Enter quantity of second item: ");
			int qsecond = sc.nextInt();
			price2 = qsecond*second;
		}
			
		if ( item >= 3) {
			System.out.print("\nEnter price of third item: ");
			double third = sc.nextDouble();
			System.out.print("Enter quantity of third item: ");
			int qthird = sc.nextInt();
			price3 = qthird*third;
		}	
		
			double total = price1 + price2 + price3;
			System.out.print("\nTotal price: " + total); 
			
			if ( total > 100 ) {
				discount = total*20/100;
				dtotal = total - discount;
			}
			else {
				discount = total*10/100;
				dtotal = total - discount;
			}
			
			System.out.print("\nDicount received: " + discount);
			System.out.print("\nPrice to be paid: " + dtotal);
			
			sc.close();
		}
	

}