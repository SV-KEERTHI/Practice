package tcs;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();    
        }
        Arrays.sort(arr);
        
        // Print the first half in ascending order
        for (int i = 0; i < n / 2; i++) {
            System.out.print(arr[i] + " ");
        }
        // Print the second half in descending order
        for (int i = n - 1; i >= n / 2; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
