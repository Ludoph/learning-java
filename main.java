package learning_java;

import java.util.Arrays;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);		
		
		/*
		//exo1 count 1 to 10
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		};
		
		//exo2 sum of all integers from 1 to 100
		int y = 1;
		for (int x = 1; x <= 100; x++) {
			y = y + x;
			System.out.println(y);
		}
		 */
		
		//exo3 multiplication table
		System.out.print("Entrez votre table de multiplication :");
		int table = scanner.nextInt();
		
		for (int nby = 0; nby <= 10; nby++) {
			int total = table * nby;
			System.out.println(table + " x " + nby + " = " + total);
		}
		
		
		//exo4 find a leap year
		System.out.println("Entrez une année pour savoir si elle est bisextile :");
		int annee = scanner.nextInt();
		if ((annee % 4 == 0) || (annee % 400 == 0 && annee % 100 != 0)) {
			System.out.println("Bisextile");
		} else {
			System.out.println("Non bisextile");
		}
		
		//exo5 find if a word is palindrome
		System.out.println("Entrez votre mot :");
		String mot = scanner.next();
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
