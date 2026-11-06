package Java_Abstract_Class;

//Abstract class needs to be declare using abstract keyword
// Abstract class should contain at least one abstract method
// Abstract class needs to be extends by a child class for implementation
// Abstract method does not contain any implementation

abstract public class Java_Abstract {

	public abstract void displayCarName();
	
	public void nonAbstract() {
		System.out.println("This is no abstract method");
	}
}
