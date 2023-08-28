package Day_2_IfElse;

import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = sc.next();
		
		System.out.println("Enter five sub makrs=");
		int sub1=sc.nextInt();
		int sub2=sc.nextInt();
		int sub3=sc.nextInt();
		int sub4=sc.nextInt();
		int sub5=sc.nextInt();
		
		int percentage=(sub1+sub2+sub3+sub4+sub5)/5;
		
		System.out.println(name+" has scored "+percentage);
		
		if(percentage<=36)
		{
			System.out.println("You have failed!!! Try hard next time");
		}
		else
		{
			System.out.println("Congratulations!!! Passed and promoted");
		}
	}

}
