package tcs;

import java.util.Scanner;

public class FrequencyOfNum {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int[] arr = new int[size];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();	
		}
		boolean[] visited = new boolean[size];
		for (int i = 0; i < arr.length; i++) {
			if(!visited[i]) {
				count = 1;
				for (int j = i+1; j < arr.length; j++) {
					if(arr[i] == arr[j]) {
						count++;
						visited[j] = true;
					}
					
				}
				System.out.println(arr[i] + " --> " + count);
			}
			
		}
	}

}
