import java.util.Scanner;

class ScannerDemo
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter your name:");
		
		String name= sc.next();
		
	   System.out.println("Enter your age:");
		
		int age = sc.nextInt();
		
		System.out.println("Enter your marks of sub1:");
		
		float sub1= sc.nextFloat();
		
		System.out.println("Enter your marks of sub2:");
		
		float sub2= sc.nextFloat();
		
		System.out.println("Enter your marks of sub3:");
		
		float sub3= sc.nextFloat();
		
		float per = ((sub1+sub2+sub3)/300)*100;
		
		System.out.println(name+" of age "+age+ " has scored "+ per +"%");
		
		
		
		
	}
	
	
}

