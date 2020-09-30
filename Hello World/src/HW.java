import java.util.Scanner;

/**
 * 
 * @author Vincent
 *
 */
public class HW {

	public static void main(String[] args) {
		double grade;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the student's grade: ");
		grade = input.nextInt();	

		
		if (grade >= 90) {
			System.out.printf("A");
		}
		
		else if (grade >= 80 && grade <90) {
			System.out.printf("B");
		}
		
		else if (grade >= 70 && grade <80) {
			System.out.printf("C");
		}	
		
		else if (grade >= 60 && grade <70) {
			System.out.printf("D");
		}
		
		else if (grade <60) {
			System.out.printf("F");
		}
		
	}

}