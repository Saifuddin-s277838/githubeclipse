package githubprojects;
import java.util.Scanner;
public class LabTest1question2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sales, com = 0, daily = 0;
		int hours;
		
		System.out.print("Enter sales: ");
		sales = sc.nextDouble();
		System.out.print("Enter hours worked: ");
		hours = sc.nextInt();
		
		if ( sales >= 150.00 && sales <= 300.00 ) {
			com = sales*5/100;
			daily = (hours*5)+com;
		}
		else if ( sales >= 301.00 && sales <= 500.00 ) {
			com = sales*10/100;
			daily = (hours*5)+com;
		}
		else if ( sales > 500.00 ) {
			com = sales*15/100;
			daily = (hours*5)+com;
		}
		
		System.out.println("\nComission: " + com);
		System.out.println("Daily wages: " + daily);
		
		sc.close();
	}

}