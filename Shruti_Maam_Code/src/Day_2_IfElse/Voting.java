package Day_2_IfElse;

import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age to vote:");
		int age=sc.nextInt();
		
		if(age>=18)
		{
			System.out.println("You are eligible to vote");
		}
		else
		{
			System.out.println("You are not eligible");
		}
		sc.close();

	}

}
