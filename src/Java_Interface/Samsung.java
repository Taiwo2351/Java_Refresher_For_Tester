package Java_Interface;

public class Samsung implements Mobile_Phones {
	
	public void displaypahoneNames() {
		//System.out.println(Apple.PhoneType ) or;
		System.out.println(Mobile_Phones.PhoneType + " " + "is Samsung");
	}


	public void brandName() {
		System.out.println("Brand name is Samsung Group");
	}


	public void operatingSystem() {
		System.out.println("Operating system is Android");
	
	}



	public static void main(String[] args) {
		
		Samsung samsung = new Samsung();
		samsung.displaypahoneNames();
		samsung.brandName();
		samsung.operatingSystem();

	}



}
