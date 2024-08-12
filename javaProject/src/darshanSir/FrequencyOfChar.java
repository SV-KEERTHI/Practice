package darshanSir;

import java.util.Arrays;
import java.util.Scanner;

public class FrequencyOfChar {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        char[] c = str.toCharArray();
        Arrays.sort(c);

        int i = 0;
        while (i < c.length) {
            int count = 1;
            int j = i + 1;
            while (j < c.length && c[i] == c[j]) {
                count++;
                j++;
            }
            System.out.println(c[i] + "-->" + count);
            i = j;  // Skip to the next different character
        }
    }
}
