
/**
 * Chapter 9: Programming Project 1
 * Write a method that accepts a String object as an argument and displays its contents backward. 
 * For instance, if the string argument is "gravity" the method should display "ytivarg". 
 * Demonstrate the method in a program that asks the user to input a 
 * string and then prints out the result of passing the string into the method.
 * 
 * @author Mark Kasule
 */
import java.util.Scanner;

public class BackwardString {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// ask user for word
		System.out.print("Enter a string: ");
		String word = input.nextLine();

		// call reverse method
		String reversedWord = reverse(word);

		System.out.println(reversedWord);

	}

	/**
	 * Reverses the string entered
	 * 
	 * @param word to be reversed
	 * @return the reversed word
	 */
	public static String reverse(String word) {
		String rev = "";
		for (int i = 0; i < word.length(); i++) {
			// access last character and reverse
			char list = word.charAt(word.length() - 1 - i);
			// accumulate last character to a string
			rev += list;
		}
		return rev;

	}

}
