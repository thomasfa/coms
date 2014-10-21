package pa3;

import wof.game.WheelOfJavaGame;

import java.util.Random;
import java.util.Scanner;


public class WheelOfJava
{
	
	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(System.in);
		String usedCharacters = "";
		String WinningPhrase = WheelOfJavaGame.selectPhrase();
		String PartialPhrase = createPartialphrase(WinningPhrase);
		char Guess;
		int winnings = 0;
		System.out.println("WELCOME TO WHEEL OF JAVA!!");
		while (isSolved(WinningPhrase, usedCharacters) == false) 
		{
			System.out.println("CURRENT PHRASE ");
			
			System.out.println(PartialPhrase);
			
			int spin = spinWheel();
			
			int bet = spin;
			
			System.out.println("You spun the wheel and got $" + bet);
			
			System.out.println("What character are you guessing?");
			
			Guess = stdin.next().toUpperCase().charAt(0);
			
			int appears = characterFrequency(WinningPhrase, Guess);
			
			
			
			if (containsCharacter(usedCharacters, Guess) == true)
				
			{
				System.out.println("You already guessed that letter.");
			}
			else
			{
				usedCharacters = usedCharacters + Guess;
				
				if (containsCharacter(WinningPhrase, Guess) == true)
				{
					PartialPhrase = updatePartialphrase(PartialPhrase, WinningPhrase, Guess);
				}
		
				System.out.println("There are " + appears + " " + Guess + ("'s in the phrase'"));
				
				if (appears > 0)
				{
					winnings += appears * bet;
				
					System.out.println("Your total is $" + winnings);
				}
			}
		}
		System.out.println("CURRENT PHRASE " + PartialPhrase);
		
		System.out.println("You Win, Game Over, You earned $" + winnings);
		
		stdin.close();
	}

	
	public static String createPartialphrase(String secretphrase)
	{
		for (int i = 0 ; i < secretphrase.length(); i ++)
		{
			char check = secretphrase.charAt(i);
			
			if (check >= 'A' && check <= 'Z')
			{
				secretphrase = secretphrase.substring(0,i) + "-" + secretphrase.substring(i + 1);
			}
		}
		
		return secretphrase;
	}
	
	public static String replaceChar(String partial, char guess, int i) 
	{
		partial = partial.substring(0 , i) + guess + partial.substring(i + 1);
		
		return partial;
	}
	
	public static String updatePartialphrase(String partial, String secret, char guess)
	{
		for(int i = 0 ; i < secret.length(); i++)
		{
			if (secret.charAt(i) == guess)
			{
				partial = replaceChar(partial, guess, i);				
			}
		}
		return partial;
	}
	
	public static int spinWheel()
	{
		Random number = new Random();
		
		int spin = number.nextInt(51) * 10;
		
		return spin;
	}

	public static int characterFrequency(String phrase, char letter) 
	{
		int count = 0;
		
		for(int i = 0 ; i < phrase.length(); i++)
		{
			if (phrase.charAt(i) == letter)
			{
				count ++;
			}
		}
		return count;
	}

	public static boolean containsCharacter(String Phrase, char letter)
	{
		for (int i = 0 ; i < Phrase.length() ; i++)
		{
			if (Phrase.charAt(i) == letter)
			{
				return true;
			}
		}
		return false;
	}

	public static boolean isSolved(String phrase, String guessed) 
	{
		int count = 0;
		
		int spacecount = 0;
		
		for(int n = 0 ; n < guessed.length() ; n++)
		{
			char guess = guessed.charAt(n);
			
			for(int i = 0 ; i < phrase.length() ; i++)
			{
				if (phrase.charAt(i) == guess)
				{
					count++;
				}
			}
		}
		for(int i = 0 ; i < phrase.length() ; i++)
		{
			if(Character.isWhitespace(phrase.charAt(i)))
			{
				spacecount++;
			}
		}
		if (count + spacecount == phrase.length())
		{
			return true;
		}
		else
		{
			count = 0;
			spacecount = 0;
			return false;
		}
		
	}
}