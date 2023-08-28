package Day_4;

public class ShortHand {

	public static void main(String[] args) {
		byte b1=45;
		byte b2=67;
		
		//b1=b1+b2; it gives casing warnnign
		b1+=b2;// shorthand removes the casting problem
		System.out.println(b1);
		
	}

}