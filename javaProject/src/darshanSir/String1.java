package darshanSir;

import java.util.Scanner;

public class String1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		int vowel =0;
		int consonant = 0;
		int sp =0;
		for (int i = 0; i < str.length(); i++) {		
			if(str.charAt(i) == 'A'||str.charAt(i) == 'E'||str.charAt(i) == 'I'||str.charAt(i) == 'O'||str.charAt(i) == 'U'||
					str.charAt(i) == 'a'||str.charAt(i) == 'e'||str.charAt(i) == 'i'||str.charAt(i) == 'o'||str.charAt(i) == 'u') {
				vowel++;
			}
			else {
				consonant++;
			}
		}
		System.out.println(vowel);
		System.out.println(consonant);

	}

}
