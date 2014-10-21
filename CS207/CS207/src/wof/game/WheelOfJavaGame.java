/**
 * @author Nikita Kouevda, Jenny Shen
 * @date 2013/10/05
 */
package wof.game;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import pa3.WheelOfJava;

public class WheelOfJavaGame {
	private static final String PHRASES_DIR = "/wof/phrases/";

	private static final int INITIAL_TURNS = 7;

	private final List<String> CATEGORIES, PHRASES;

	private String category, phrase;

	private Set<Character> guessedLetters;

	private int score, remainingTurns;

	public WheelOfJavaGame() {
		CATEGORIES = new ArrayList<String>();
		PHRASES = new ArrayList<String>();

		try {
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(getClass().getResourceAsStream(
							PHRASES_DIR + "phrases.txt")));

			while (reader.ready()) {
				CATEGORIES.add(reader.readLine());

				StringBuilder phrase = new StringBuilder();

				for (int i = 0; i < 4; ++i) {
					phrase.append(reader.readLine());
				}

				PHRASES.add(phrase.toString());
			}
		} catch (IOException ex) {
			CATEGORIES.add("Error");
			PHRASES.add("             No Phrases     File                ");
		}

		score = 0;
		remainingTurns = INITIAL_TURNS;

		newPhrase();
	}

	public String getCategory() {
		return category;
	}

	public String getPhrase() {
		return phrase;
	}

	public Set<Character> getGuessedLetters() {
		return guessedLetters;
	}

	public int getScore() {
		return score;
	}

	public int getTurnsLeft() {
		return remainingTurns;
	}

	public void addScore(int score) {
		this.score += score;
	}

	public void resetScore() {
		score = 0;
	}

	public void resetValues() {
		remainingTurns = INITIAL_TURNS;
		score = 0;
	}

	public void subtractTurn() {
		remainingTurns--;
	}

	public boolean isAllVowelsGuessed() {
		return !(phrase.contains("A") && !guessedLetters.contains("A")
				|| phrase.contains("E") && !guessedLetters.contains("E")
				|| phrase.contains("I") && !guessedLetters.contains("I")
				|| phrase.contains("O") && !guessedLetters.contains("O") || phrase
				.contains("U") && !guessedLetters.contains("U"));
	}

	public boolean isSolved() {
		String guessed = "";
		for (Character c : guessedLetters)
			guessed += c;
		return WheelOfJava.isSolved(phrase, guessed);
	}

	public void newPhrase() {
		int index = (int) (PHRASES.size() * Math.random());

		category = CATEGORIES.get(index);
		phrase = PHRASES.get(index).toUpperCase();

		guessedLetters = new HashSet<Character>();
	}

	public int revealLetter(char letter) {
		String guessed = "";
		for (Character c : guessedLetters)
			guessed += c;

		if (WheelOfJava.containsCharacter(guessed, letter)) {
			return 0;
		}

		guessedLetters.add(letter);

		return WheelOfJava.characterFrequency(phrase, letter);
	}

	public void revealPuzzle() {
		for (char c : phrase.toCharArray()) {
			guessedLetters.add(c);
		}
	}

	public void disableVowels() {
		guessedLetters.add('a');
		guessedLetters.add('e');
		guessedLetters.add('i');
		guessedLetters.add('o');
		guessedLetters.add('u');
	}

	@SuppressWarnings({ "unused", "resource" })
	public static String selectPhrase() {
		List<String> phrases = new ArrayList<String>();

		try {
			BufferedReader reader = new BufferedReader(new FileReader(new File("./src/wof/phrases/phrases.txt")));

			while (reader.ready()) {
				reader.readLine();

				StringBuilder phrase = new StringBuilder();

				for (int i = 0; i < 4; ++i) {
					phrase.append(reader.readLine());
				}

				phrases.add(phrase.toString());
			}
		} catch (IOException ex) {
			phrases.add("             No Phrases     File                ");
		}

		int index = (int) (phrases.size() * Math.random());
		String phrase = phrases.get(index).trim().toUpperCase();
		String[] words = phrase.split("\\s+");
		phrase = "";
		for (String word : words) {
			phrase += word + " ";
		}
		return phrase;
	}
}