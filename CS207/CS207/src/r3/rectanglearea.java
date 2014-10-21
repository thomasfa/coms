package r3;
import java.util.Scanner;

public class rectanglearea {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.println("Enter the width of your rectangle");
		double width= stdin.nextDouble();
		System.out.println("Enter the length of your rectangle");
		double length= stdin.nextDouble();
		double area= length * width;
		double perimeter= 2*(length + width);
		System.out.print("The area of your rectangle is ");
		System.out.println(area);
		System.out.print("The perimeter of your rectangle is");
		System.out.println(perimeter);
	}
}
