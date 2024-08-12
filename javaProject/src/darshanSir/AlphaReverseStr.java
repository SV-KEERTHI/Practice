package darshanSir;

import java.util.Scanner;

public class AlphaReverseStr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int i = 0;
        int j = s.length() - 1;
        String ans = "";

        while (i <= j) {
            char charAtI = s.charAt(i);
            char charAtJ = s.charAt(j);

            if (!(charAtI >= 'A' && charAtI <= 'Z') && !(charAtI >= 'a' && charAtI <= 'z')) {
                ans += charAtI;
                i++;
            } else if (!(charAtJ >= 'A' && charAtJ <= 'Z') && !(charAtJ >= 'a' && charAtJ <= 'z')) {
                j--;
            } else {
                ans += charAtJ;
                i++;
                j--;
            }
        }

        System.out.println(ans);
    }
}
