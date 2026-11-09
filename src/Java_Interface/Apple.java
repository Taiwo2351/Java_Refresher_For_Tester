package Java_Interface;

public class Apple implements Mobile_Phones  {
	

	public void displaypahoneNames() {
		//System.out.println(Apple.PhoneType ) or;
		System.out.println(Mobile_Phones.PhoneType + " " + "is Iphone");
	}


	public void brandName() {
		System.out.println("Brand name is Apple");
	}


	public void operatingSystem() {
		System.out.println("Operating system is IOS");
	
	}



	public static void main(String[] args) {
		Apple apple = new Apple();
		apple.displaypahoneNames();
		apple.brandName();
		apple.operatingSystem();

	}

	
	

}
