package Day_4;

import java.util.Scanner;

public class GreaterNumOf_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 numbers:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		//6 7 8
		//7 6 8
		//8 7 6
		if(num1>num2)
		{
			if(num1>num3)
			{
				System.out.println(num1+" is greates");
			}
			else
			{
				System.out.println(num3+" is greates");
			}
		}
		else
		{
			if(num2>num3)
			{
				System.out.println(num2+" is greatest");
			}
			else 
			{
				System.out.println(num3+" is greatest");
			}
		}
	}

}
