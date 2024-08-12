package darshanSir;

import java.util.Scanner;

public class strPalindrome {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        System.out.println(rev.equalsIgnoreCase(str) ? "palindrome" : "Not palindrome");
    }
}
