package tcs;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MexNum {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int x = s.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }

        Set<Integer> values = new HashSet<>();
        for (int num : arr) {
            values.add(num);
            values.add(num + x);
            values.add(num - x);
        }

        int mex = 0;
        while (values.contains(mex)) {
            mex++;
        }

        System.out.println(mex);
    }
}
