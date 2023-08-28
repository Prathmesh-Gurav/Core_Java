package Day_4;

import java.util.Scanner;

public class If_Else {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your percentage:");
		float per = sc.nextFloat();

		System.out.println("Enter our PCM marks:");
		int phy = sc.nextInt();
		int chem = sc.nextInt();
		int math = sc.nextInt();
		
		int total=phy+chem+math;
		
		if(total>=85 && per>=90)
		{
			System.out.println("Eligible1");
		}
		else
		{
			if(total>=85 ^ per>=90)
			{
				System.out.println("Eligible");
			}
			else 
			{
				System.out.println("Uneligible");
			}
		}
	}

}
