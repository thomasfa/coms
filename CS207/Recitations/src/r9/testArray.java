package r9;
import java.util.Scanner;

public class testArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		double[] scores = new double[5];
		System.out.println(scores.length);
		int[] data = new int[25];
		System.out.println(data.length);
		int[] values = {2, -3, 4, 6, 8, -99};
		System.out.println(values.length);
		for(int i = 0; i<scores.length; i++){
			System.out.println("Please enter " + i +" the array value");
			scores[i]= stdin.nextDouble();
		}
		for(int i = 0; i<scores.length; i++){
			System.out.print(scores[i] + " ");
		}
		System.out.println();
		for(int i = 0; i<values.length; i++){
			System.out.print(values[i] + " ");
		}
		System.out.println();
		for(int i = 0; i<data.length; i++){
			System.out.print(data[i] + " ");
		}
		}

}
