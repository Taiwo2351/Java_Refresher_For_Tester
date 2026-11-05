package Java_OOP;

public class Java_Inherited extends Java_Inheritance{
	
	public Java_Inherited(String name, String country) {
		super(name, country);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Java_Inherited j_i = new Java_Inherited ("Taiwo", "Canada");
		j_i.relocate();
	}

}
