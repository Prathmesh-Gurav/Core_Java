package Day_5_Loop_1;

import java.util.Scanner;

public class For_Loop1 {

	public static void main(String[] args) 
		{
		Scanner sc = new Scanner(System.in);
		for(int i=1;i<=50;i++)
		{
			
			if(i%3==0 && i%5==0)
			{
				System.out.println("Hello");
			}
			else if(i%5==0)
			{
				System.out.println("Welcome");
			}
			else if(i%3==0)
			{
				System.out.println("Bye");
			}
			else
			{
				System.out.println(i);
			}
			
		}
	}

}
