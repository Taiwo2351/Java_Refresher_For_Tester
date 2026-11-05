package Java_Relearn;

public class Java_Training {
	// using a method with return type
	public static int testmethod() {
		int num1 = 10;
		int num = 5;
		//System.out.println(num1 * num);
		return num1 * num;
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Let get started");
		System.out.println(testmethod());
		
		//Switch
		String day = "mONday";
		switch (day.toLowerCase()) {
		case "sunday":
			System.out.println("First day of the week");
			break;
		case "monday":
			System.out.println("Second day of the week");
			break;
		case "tuesday":
			System.out.println("Third day of the week");
			break;
		default:
			System.out.println("Not a week day");
			break;
		}
		
	}

}
