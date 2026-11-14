package Java_Array;

import java.util.Arrays;

public class DisplayUni extends ListOfUniversities{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DisplayUni displayuni = new DisplayUni();
		String[] uni = displayuni.getUniList();
		//Displaying UNI list per line
		for (int i = 0; i < uni.length; i++) {
			System.out.println(uni[i]);
		}
		
		// Whole array on one line
		System.out.println(Arrays.toString(uni));
		String firstUni = displayuni.getFirstUni(uni);
		System.out.println(firstUni);
	}

}
