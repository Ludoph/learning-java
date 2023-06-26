package learning_java;

import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		System.out.println("Hello, world!");
		
		//exo1
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		};
		
		//exo2
		int y = 1;
		for (int x = 1; x <= 100; x++) {
			y = y + x;
			System.out.println(y);
		}
		
		//exo3 
		int nbx = 7;
		for (int nby = 0; nby <= 10; nby++) {
			int total = nbx * nby;
			System.out.println(nbx + " x " + nby + " = " + total);
		}
		
		//exo4
		int annee = 300;
		if ((annee % 4 == 0) || (annee % 400 == 0 && annee % 100 != 0)) {
			System.out.println("Bisextile");
		} else {
			System.out.println("Non bisextile");
		}
		
		//exo5
		String mot = "kayak";
		System.out.println(mot.length());
		String[] words = mot.split("");
		System.out.println(Arrays.toString(words));
		System.out.println(words[0]);
		
	}
}
