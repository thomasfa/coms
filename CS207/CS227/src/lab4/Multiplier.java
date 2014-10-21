package lab4;

import java.util.Scanner;

public class Multiplier
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    int first = getNextNumber(scanner);
    int second = getNextNumber(scanner);
    int result = first * second;
    System.out.println(first + " times " + second + " is " + result);
  }
  private static int getNextNumber(Scanner scanner)
  {
    System.out.print("Enter a number: ");
    int next = scanner.nextInt();
    return next;
  }
}