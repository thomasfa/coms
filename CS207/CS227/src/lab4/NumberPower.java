package lab4;
import java.util.Scanner;
public class NumberPower
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int base = getNextNumber(scan);
		int power = getNextNumber(scan);
		int result = (int) Math.pow(base,power);
		System.out.println(base + "^" + power + "=" + result);

	}
	private static int getNextNumber(Scanner scanner)
	{
	    System.out.print("Enter a number: ");
	    if (scanner.hasNextInt())
	    {	
	    int next = scanner.nextInt();
	    return next;
	    }
	    else;
	    {
	    return 1;
	    }
	}
}
