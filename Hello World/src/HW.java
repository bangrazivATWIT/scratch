import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		int n, i;
		i = 0;
		System.out.print("Enter the maximum value:");
		n = input.nextInt();
		
		while (i<n) {
			System.out.print(n);
			n=n+1;
			
		}
	}
}