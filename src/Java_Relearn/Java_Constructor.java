package Java_Relearn;
public class Java_Constructor {
	// constructor without parameter
	public Java_Constructor() {
		System.out.println("I'm a constructor without parameter");
	}
	
	//constructor with parameter
	int age;
	String name;
	String status;
	
	public Java_Constructor(int a, String n, String s) {
		age = a;
		name = n;
		status = s;
		System.out.println("I'm a constructor with parameter");
	}
	
	
	public void display() {
		System.out.println("constructor display");
	}
	
	public void display1() {
		System.out.println(name + " "+ "is" + " "+ status + " " + "and he is" + " "+ age + "years old");
	}
	public static void main(String[] args) {
		Java_Constructor jvc = new Java_Constructor();
		Java_Constructor jvc1 = new Java_Constructor(40, "Johnson", "Married");
		jvc.display();
		jvc1.display1();
	}


	
}
