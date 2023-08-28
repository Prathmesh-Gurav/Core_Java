import java.util.Scanner;
class Scanner_Class{
	public static void main(String args[]){

		Scanner sc= new Scanner(System.in);

		System.out.println("Enter your name:");
		String name=sc.next();

		System.out.println("Enter your age:");
		int age=sc.nextInt();
		
		System.out.println("Enter sub1 mark=");
		int sub1=sc.nextInt();

		System.out.println("Enter sub2 mark=");
		int sub2=sc.nextInt();

		System.out.println("Enter sub3 mark=");
		int sub3=sc.nextInt();

		float percentage=(sub1+sub2+sub3)/3;

		System.out.println(name+" of age "+age+" has scored "+percentage+"%");
}

}