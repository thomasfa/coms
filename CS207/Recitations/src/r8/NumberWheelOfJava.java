package r8;
import java.util.*;

public class NumberWheelOfJava {
	public static void main (String[] args) {
		int secrectnumber = pickSecretNumber();
		int guess;
		int bet = spinwheel();
		int win = 0;
		int didIwin = 1;
		int winnings = 0;
		int currentbet;
		System.out.println("Welcome to Number Wheel Of Java. I picked a secret integer between -0- and -99-");
		System.out.println("you have won $" + winnings);
		Scanner stdin = new Scanner(System.in);
		while(didIwin != win, bet = spinwheel()){
			currentbet = bet;
			System.out.println("The wheel spun and landed on " + currentbet);
			System.out.println("what would you like to do now?");
			System.out.println("Type 1 if you would like to guess a number that is larger than or equal to the secret number");
			System.out.println("Type 2 if you would like to guess a number that is smaller than or equal to the secret number");
			int choice = stdin.nextInt();
			if (choice == 1){
				System.out.println("Ok, guess a number larger than or equal to the secret number");
				guess = stdin.nextInt();
				didIwin = compare(guess, secretnumber);
				if (didIwin == 1){
					System.out.println("Good job! " + guess + " is larger than the secret number you win $" + currentbet);
				}
				else if (didIwin == 0){
					System.out.println("Excellent! " + guess + " is the secret number you win $" + currentbet);
				}
				else{
					System.out.println("Too bad! " + guess + "is smaller than the secret number. You dont win any money this round");
				}

			}
		}
		
	}

	public static int pickSecretNumber() {
		Random r = new Random();
		return r.nextInt(100);
	}

	public static int spinwheel() {
		Random spin = new Random();
		return spin.nextInt();
	}

	public static int compare(int guessednumber, int secretnumber){
		if (guessednumber > secretnumber){
			return 1;
		}
		else if (guessednumber < secretnumber){
			return -1;
		}
		else {
			return 0;
		}
	}
}

