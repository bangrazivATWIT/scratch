import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		double length, width, area;
		System.out.print("Enter positive rectangle length:");
		length = input.nextDouble();
		System.out.print("Enter positive rectangle width:");
		width = input.nextDouble();
		
		if((length<=0)||(width<=0)) {
			System.out.println("Invalid measurements!");
			System.exit(0);
		}
		area = length*width;
		System.out.println("The area is:"+area);

	}
}