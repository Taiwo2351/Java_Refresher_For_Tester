package Java_Method_Overloading;

// Method Overloading helps overloading a method by using the exact method dame for different task. This can be done by taking different parameters
public class Calculate {
	
	public void multipyvalues(int a, int b) {
		int c = a * b;
		System.out.println("Multiplication result is: " + " " + c);
	}
	
	public void multipyvalues(int a, int b, int c) {
		int d = a * b * c;
		System.out.println("Multiplication result is: " + " " + d);
	}
	
	public double multipyvalues(double a, double b, double c){
		double d = a * b * c;
		return d;
	}
	
	public static void main(String[] args) {
	

	}

}
