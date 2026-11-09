package Java_Interface;

/* An interface in Java is an abstract type (a contract) that cannot be instantiated.
 * It is implemented by a class using the implements keyword,
 * and an interface can inherit from other interfaces using the extends keyword.
 * A class can implement multiple interfaces.
 */

interface Mobile_Phones {

	public static final String PhoneType = "Mobile Phone";
	
	public void displaypahoneNames();
	public void brandName();
	public void operatingSystem();
}