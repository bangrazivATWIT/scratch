import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		int in;
		int rem;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the value to check: ");
		in = input.nextInt();	

		rem = in % 2;
		
		if (rem == 0) {
			System.out.printf("The value is even.");
		}
		
		else {
			System.out.printf("The value is odd.");
		}
		//1

	}

}