package Day_3_Revision;

import java.util.Scanner;

public class StudentResult {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter five subject marks:");
		int marathi=sc.nextInt();
		int hindi=sc.nextInt();
		int english=sc.nextInt();
		int maths=sc.nextInt();
		int scince=sc.nextInt();
		
		float percentage=(marathi+hindi+english+maths+scince)/5;
		
		System.out.println("Student result:"+percentage+"%");
		sc.close();
	}

}
