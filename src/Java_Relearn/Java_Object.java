package Java_Relearn;

public class Java_Object {
	String car = "Honda";
	
	public  String car_color() {
		return "has a blue color";
	}

	
	public static void main(String[] args) {
		// Declaring an Object
		Java_Object carobj = new Java_Object();
		String car_name = carobj.car;
		System.out.println(car_name +" "+ carobj.car_color());
	}

}
