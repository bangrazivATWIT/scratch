import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		double l, w, a;
		
		//Initialize input from keyboard
		Scanner input = new Scanner(System.in);
		
		
		//Print request to user and get responses
		System.out.print("Enter the length, then the width: ");
		l = input.nextDouble();
		w = input.nextDouble();
		
		if (l < 0) {
			System.out.println("The length must be at least 0!");
			System.exit(0);
		}
		
		if (w< 0) {
			System.out.println("The length must be at least 0!");
			System.exit(0);
		}
		
		a = solveArea(l, w);
		
		System.out.printf("The area is %.3f%n", a);		
	}
	
	public static double solveArea(double l, double w) {
		return(l*w);
	}
}