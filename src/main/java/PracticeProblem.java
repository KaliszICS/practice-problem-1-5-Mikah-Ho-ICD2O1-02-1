/**
	* File: Lesson 1.5: Characters
	* Author: Mikah Ho
	* Date Created: February 18, 2026
	* Date Last Modified: February 18, 2026
	*/
	
	import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
	}

	public static void q1() {
		//Write question 1 code here

		char a;
		a = 'a';

		System.out.println(a);

	}

	public static void q2() {
		//Write question 2 code here

		Scanner input = new Scanner(System.in);

		String word;

		System.out.print("Input a word: ");
		word = input.nextLine();

		System.out.println(word.charAt(2));

	}

	public static void q3() {
		//Write question 3 code here

		Scanner input = new Scanner(System.in);

		String word;

		System.out.print("Input a word: ");
		word = input.nextLine();

		System.out.println("The second character user entered was: " + word.charAt(1));

	}

	public static void q4() {
		//Write question 4 code here

		Scanner input = new Scanner(System.in);

		int num;

		System.out.print("Input a number: ");
		num = input.nextInt();

		System.out.println("Your number plus 1 is: " + (num + 1));

	}

	public static void q5() {
		//Write question 5 code here

		Scanner input = new Scanner(System.in);

		String letter;
		String letter2;
		
		char character;
		char character2;

		System.out.print("Input a letter: ");
		letter = input.nextLine();

		character = letter.charAt(0);

		System.out.print("Input another letter: ");
		letter2 = input.nextLine();

		character2 = letter2.charAt(0);

		System.out.println(character + character2);
	}

}
