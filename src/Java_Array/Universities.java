package Java_Array;

public class Universities{

	//Declaration of Array - No memory is allocated yet; 'scores' is null.
	public static void main(String[] args) {
	String[] universityList;
	
	//Instantiation of Array- Assigning it to memory,Uses 'new' to allocate space for 5 integers in heap memory.
	universityList = new String [5];

	// 3. Initialization- Manually assigns specific values to individual indices.
	universityList[0] = "Olabisi Onabanjo University";
	universityList[1] = "University of Lagos";
	universityList[2] = "University of Ibadan";
	universityList[3] = "University of Benin";
	universityList[4] = "Covenant University";
	
	//iterate over the list of universities
	for (int i = 0; i < universityList.length; i++) {
		System.out.println(universityList[i]);
		
	}
	
	}
}