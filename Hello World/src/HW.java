import java.util.Scanner;

public class HW {
	
	static final int C = 299792458;
	
	public static void main(String[] args) {
		double E, M;
		E = Energy();
		M = Mass();
		
		System.out.printf("The energy is %f%n", E);
		System.out.printf("The mass is %f%n", M);
	}
	
	public static double Energy(){
		double M,E;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter mass: ");
		M = input.nextDouble();
		
		if (M < 0) {
			System.out.println("The mass must be at least 0!");
			System.exit(0);
		}
		
		E = M * C * C;
		return E;
	}
	
	public static double Mass(){
		double M,E;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter energy: ");
		E = input.nextDouble();
		
		if (E < 0) {
			System.out.println("The energy must be at least 0!");
			System.exit(0);
		}
		
		M = E / (C * C);
		return M;
	}
}