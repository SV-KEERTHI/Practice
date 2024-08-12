package darshanSir;

import java.util.Scanner;

public class RPS {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] str = {"Rock","Papper","Scissor"};
		int p=0,c=0;
		System.out.println("Welcome...Let's play RPS");
		System.out.println("Enter total points: ");
		int t = s.nextInt();
		int i = 1;
		while(true) {
			System.out.println("------Round "+i+"------");
			System.out.println("players turn: ");
			String pi = s.next();
			int index = (int)(Math.random()*3);
			String ci = str[index];
			System.out.println("Player:"+pi+" Computer: "+ci);
			if((pi.equals("Rock") && ci.equals("Scissor"))||(pi.equals("Papper") && ci.equals("Rock"))||(pi.equals("Scissor") && ci.equals("Papper"))){
				p++;
				System.out.println("Player Won...");	
			}
			else if((ci.equals("Rock") && pi.equals("Scissor"))||(ci.equals("Papper") && pi.equals("Rock"))||(ci.equals("Scissor") && pi.equals("Papper"))){
				c++;
				System.out.println("Computer Won...");	
			}
			else {
				System.out.println("Match Draw...");
			}
			System.out.println("Player: "+p+"  Computer: "+c);
			i++;
			System.out.println("-----------------------------------------");
			if(p==t) {
				System.out.println("Player won...");
				break;
			}
			else if(c==t) {
				System.out.println("Computer won...");
				break;
			}
		}
		

	}

}
