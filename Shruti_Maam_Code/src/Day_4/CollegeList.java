package Day_4;

import java.util.Scanner;

public class CollegeList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your percentage:");
		float per = sc.nextFloat();

		if (per >= 65) {
			if (per >= 85) {
				System.out.println("Eligible for since and commerce");
			} else {
				System.out.println("eligible for commerce");
			}
		} else {
			System.out.println("you are not eligible for admission");
		}
		sc.close();
	}

}
