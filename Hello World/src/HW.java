import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		int n;
		
		do {
			System.out.print("Enter a positive number: ");
			n = input.nextInt();
			
		} while (n<1 || n>100);
	}
}