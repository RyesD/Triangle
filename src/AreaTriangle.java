import java.util.Scanner;

public class AreaTriangle {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
	
		System.out.print("Enter the base length of the triangle:");
		double B = input.nextDouble();

		System.out.print("Enter the height of the triangle:");
		double H = input.nextDouble();
		
		double area = (0.5*(B * H));
		
		System.out.print("Area: " + area);
		
	}
}
