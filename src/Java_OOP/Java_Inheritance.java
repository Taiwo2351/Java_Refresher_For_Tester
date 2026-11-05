package Java_OOP;

public class Java_Inheritance {
	String country;
	String name;
	
	public Java_Inheritance(String name, String country) {
		
		this.country = country;
		this.name = name;
	}
	public void relocate() {
		System.out.println(name + " "+ "Visa has been approved and he has relocated to" + " " + country);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
