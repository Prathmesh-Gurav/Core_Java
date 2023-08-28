package Day_3_Revision;

import java.util.Scanner;

public class PositivOrNegative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		if(num>=0)
		{
			System.out.println(num+" is positive");
		}
		else
		{
			System.out.println(num+" is negative");
		}
	}

}
