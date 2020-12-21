package githubprojects;
import java.util.Scanner;
public class Exercise4GitHub {

	public static void main(String[] args) {
		
		
		printExercise1();
		printExercise2();
		printExercise3();
		printExercise4();
	}
	
	public static void printExercise1() {
		int[] alpha = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		int[] beta = new int[20];
	
		System.out.println(alpha[4]);
	
		alpha[4] = 35;
		System.out.println(alpha[4]);
	
		alpha[8] = alpha[5] + alpha[12];
		System.out.println("Sum: " + alpha[8]);
	}
	
	public static void printExercise2() {
		
		String[] days = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		
		for(int i=0; i<days.length; i++) {
			System.out.println(days[i]);
			
		}
		
		System.out.println();
		int j = 0;
		while (j < days.length) {
			System.out.println(days[j]);
			j++;
		}
		
		System.out.println();
		int k = 0;
		do {
			System.out.println(days[k]);
			k++;
		}while (k<days.length);
	}
	
	public static void printExercise3() {
		
		int[] numbers = new int[10];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		
		for (int i=0; i<numbers.length; i++) {
			numbers[i] = sc.nextInt();
		}
		
		int sum=0;
        
        for(int i=0; i<numbers.length; i++)
        {
            sum += numbers[i];
        }
        
        System.out.println("Sum numbers: " +sum);
		
	}
	
	public static void printExercise4() {
		Scanner sc = new Scanner(System.in);
		
		  int[] list1 = new int[5];
		  int[] list2 = new int[5];
		  
		  System.out.print("Enter five values for list1: ");
		  for(int i=0; i<list1.length; i++) {
				list1[i] = sc.nextInt() ;
		  }
		  
		  System.out.println("list1: ");
		  for(int i=0; i<list1.length; i++) {
			  System.out.println(list1[i]);
			}
		  
		  System.out.println("list2: ");
			for(int i=0; i<list1.length; i++) {
			  list2[i] = list1[i];
			  System.out.println(list2[i]);
			}
	}

}
