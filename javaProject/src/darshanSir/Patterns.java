package darshanSir;

import java.util.Scanner;

public class Patterns {
	public static void Pattern0(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(i+""+j+" ");	
			}
			System.out.println();
		}	
	}
	public static void Pattern1(int n) {
		for (int i = 1; i <=n ; i++) {
			for (int j = 1; j <= n;j++) {
				System.out.print((i+j)%2+" ");		
			}
			System.out.println();
		}

	}
	public static void Pattern2(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(j+" ");	
			}
			System.out.println();
		}

	}
	public static void Pattern3(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print("*"+" ");	
			}
			System.out.println();
		}

	}
	public static void Pattern4(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < 2; j++) {
				System.out.print("*"+" ");	
			}
			System.out.println();
		}


	}
	public static void Pattern5(int n) {
		for (int i = 1; i < 2; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print("* ");	
			}
			System.out.println();
		}

	}
	public static void Pattern6(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(j == n) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}
	public static void Pattern7(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(i == n ) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}
	public static void Pattern8(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(i == 1 || j==1 || i==n|| j==n) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}
	public static void Pattern9(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(i == j) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}
	public static void Pattern10(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(i+j == n) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}
	public static void Pattern11(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(i+j== n || i==n||j==1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}
	public static void Pattern12(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(i+j == n||i==1 ||j==n) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}
	public static void Pattern13(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(i+j==n+1 || i==j ||i==1||j==1||i==n||j==n) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}
	public static void Pattern14(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}
	public static void Pattern15(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}
	public static void Pattern16(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(i+j >=n+1) {
				System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
				
			System.out.println();
		}

	}
	public static void Pattern17(int n) {
		int m =1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((m++)+" ");
			}
				
			System.out.println();
		}

	}
	public static void Pattern18(int n) {
		int inc = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j=j+2) {
				if(i >= j) {
				System.out.print(j+" ");
				}else {
					System.out.print("  ");
				}
			}
				
			System.out.println();
		}

	}
	public static void Pattern19(int n) {
		char c = 'A';
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((c++)+" ");
			}

			System.out.println();
		}

	}
	public static void Pattern20(int n) {
		char c = 'A';
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((c++)+" ");
			}
			c = 'A';

			System.out.println();
		}
	}
	public static void Pattern21(int n) {
		char c = 'A';
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if(i%2 != 0) {
					System.out.print(j+" ");
				}
				else {
					System.out.print((c++)+" ");
				}
			}
			c = 'A';

			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		Pattern21(n);

	}

}
