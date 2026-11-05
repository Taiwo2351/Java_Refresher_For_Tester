package Java_Method_Overloading;

public class Multiplication extends Calculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiplication multiply = new Multiplication();
		multiply.multipyvalues(10, 10);
		multiply.multipyvalues(5, 6, 7);
		double val = multiply.multipyvalues(20.00, 20.00, 10.00);
		System.out.println(val);
	}

}
