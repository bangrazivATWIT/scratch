import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		int x,y;
		double pow;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the two values: ");
		x = input.nextInt();
		y = input.nextInt();	

		pow = Math.pow(x, y);

		System.out.printf("The result is %.3f.%n", pow);

	}

}