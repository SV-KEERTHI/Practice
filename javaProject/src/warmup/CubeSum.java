package warmup;

import java.util.Arrays;
import java.util.Scanner;

public class CubeSum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
			arr[i] = (int) Math.pow(arr[i], 3);
		}
		System.out.println(Arrays.toString(arr));
	}

}
