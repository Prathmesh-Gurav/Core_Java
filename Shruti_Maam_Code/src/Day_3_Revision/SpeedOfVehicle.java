package Day_3_Revision;

import java.util.Scanner;

public class SpeedOfVehicle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter distance covered:");
		float distance = sc.nextFloat();
		
		System.out.println("Enter time taken:");
		float time = sc.nextFloat();

		float speed = distance / time;

		System.out.println("Speed of vehicle:" + speed);
		
		sc.close();
	}

}
