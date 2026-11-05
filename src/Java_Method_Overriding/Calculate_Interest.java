package Java_Method_Overriding;

public class Calculate_Interest {

	public static void main(String[] args) {
		UBA uba = new UBA();
		WEMA wema = new WEMA();
		System.out.println(uba.getInterest());
		System.out.println(wema.getInterest());

	}

}
