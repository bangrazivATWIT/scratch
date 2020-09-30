import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		int grade1, grade2;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the student's first grade: ");
		grade1 = input.nextInt();
		
		System.out.print("Enter the student's second grade: ");
		grade2 = input.nextInt();
		
		if (grade1 < 0 || grade2 < 0) {
			System.out.printf("Please enter positive numbers");
			System.exit(0);
		}
		
		else if (grade1 >= 90 && grade2 >= 90) {
			System.out.printf("Way to go!");
		}
		
		else if (grade1 < 70 || grade2 < 70) {
			System.out.printf("Study more!");
		}
		
		else {
			System.out.printf("Keep it up!");
		}
		
	}

}