package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("./src/test/words.txt"));
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Enter a word to see its anagrams: ");
		
		String word = kb.nextLine();
		System.out.println("\n" + word + "'s anagrams are:");
		
		char[] sortedLetters = word.toLowerCase().toCharArray();
		Arrays.sort(sortedLetters);//now actually sorted
		
		while (sc.hasNextLine()) {
			String current = sc.nextLine();
			
			char[] currentSorted = current.toLowerCase().toCharArray();
			Arrays.sort(currentSorted);//now actually sorted
			
			if (Arrays.equals(currentSorted, sortedLetters) && !current.equalsIgnoreCase(word)) {
				System.out.println(current);
			}
		}
		
		kb.close();
		sc.close();
	}
}
