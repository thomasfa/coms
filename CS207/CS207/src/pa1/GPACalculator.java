package pa1;
import java.util.Scanner;

public class GPACalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Scanner stdin=new Scanner (System.in);
		System.out.println("these grade points are awarded for the following grades");
		System.out.println("A = 4.00,"
				+ " A- = 3.67,"
				+ " B+ = 3.33,"
				+ " B = 3.00,"
				+ " B- = 2.67,"
				+ " C+ = 2.33,"
				+ " C = 2.00,"
				+ " C- = 1.67,"
				+ " D+ = 1.33,"
				+ " D = 1.00,"
				+ " F = 0.00");
		System.out.print("Enter your grade points for Course 1");
		double grade1 = stdin.nextDouble();
		System.out.println("Enter the credit value of Course 1");
		int credits1 = stdin.nextInt();
		double Course1Points = grade1*credits1;
		System.out.print("Enter your grade points for Course 2");
		double grade2 = stdin.nextDouble();
		System.out.println("Enter the credit value of Course 2");
		int credits2 = stdin.nextInt();
		double Course2Points = grade2*credits2;
		System.out.print("Enter your grade points for Course 3");
		double grade3 = stdin.nextDouble();
		System.out.println("Enter the credit value of Course 3");
		int credits3 = stdin.nextInt();
		double Course3Points = grade3*credits3;
		double GPA = (Course1Points + Course2Points + Course3Points)/(credits1 + credits2 + credits3);
		int totalcredits = credits1 + credits2 + credits3;
		System.out.println("Total credits taken this semester " + totalcredits);
		System.out.println("Your GPA for this semester is " + GPA);
		
	}

}
