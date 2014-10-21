package r4;
import java.util.Scanner;
public class Reciprocal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		System.out.println("Enter a non-zero number");
		if(stdin.hasNextDouble()){
			double number = stdin.nextDouble();
			if(number !=0){
				System.out.println("Reciprocal is " + 1/number);
			}
			else{
				System.out.println("Invalid Input!");
			}
		}
		else{
			System.out.println("Invalid Input!");
		}
	}

}

