package darshanSir;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		str = str.toLowerCase();
		int vowel =0;
		int consonant = 0;
		int sp =0;
		for (int i = 0; i < str.length(); i++) {	
			char c = str.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				vowel++;
			}
			else {
				consonant++;
			}
		}
		System.out.println("Vowels:"+vowel);
		System.out.println("Consonants:"+consonant);

	}

}
