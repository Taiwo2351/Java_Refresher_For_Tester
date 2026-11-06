package Java_Abstract_Class;

public class BMW extends Java_Abstract{
	
	public void displayCarName() {
		System.out.println("The car name is BMW");
		
	}


	public static void main(String[] args) {
		BMW bmw = new BMW();
		bmw.displayCarName();
		bmw.nonAbstract();
		

	}

	
}
