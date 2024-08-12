package darshanSir;

import java.util.Scanner;

public class StrSort {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		String alpha= "",num ="",sc="";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if((c>='A' && c<='Z')||(c>='a' && c<='z')) {
				alpha += c;
			}
			else if((c>='0' && c<='9')) {
				num += c;
			}
			else {
				sc += c;
			}
		}
		System.out.println(alpha+num+sc);
	}

}
