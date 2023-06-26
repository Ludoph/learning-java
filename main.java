package learning_java;

import java.util.Arrays;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		System.out.println("Hello, world!");
		
		//exo1 count 1 to 10
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		};
		
		//exo2 sum 1 to 100
		int y = 1;
		for (int x = 1; x <= 100; x++) {
			y = y + x;
			System.out.println(y);
		}
		
		//exo3 mutiplicate table
		int nbx = 7;
		for (int nby = 0; nby <= 10; nby++) {
			int total = nbx * nby;
			System.out.println(nbx + " x " + nby + " = " + total);
		}
		
		//exo4 bisextile years
		int annee = 300;
		if ((annee % 4 == 0) || (annee % 400 == 0 && annee % 100 != 0)) {
			System.out.println("Bisextile");
		} else {
			System.out.println("Non bisextile");
		}
		
		//exo5 palindrome words
		Scanner motPalindrome = new Scanner(System.in);
		String mot = motPalindrome.next();
		mot = mot.toLowerCase();
		int j = mot.length()-1;
		Boolean isTrue = true;
		for (int i = 0; i < mot.length(); i++) {
			if(mot.charAt(i) == mot.charAt(j)) {
				j--;
			} else isTrue = false;
		}
		if(isTrue) {
			System.out.println("Il s'agit d'un mot palindrome");
		} else {
			System.out.println("Il ne s'agit pas d'un mot palindrome");			
		}
		
		
		
	}
}
