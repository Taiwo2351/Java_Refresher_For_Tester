package Java_Encapsulation;

public class QA_Department extends Department {

	public static void main(String[] args) {
		QA_Department qa = new QA_Department();
		qa.setDeptName("Quality Assurance");
		qa.setDeptCode("QA");
		qa.setNumOfEmployee(10);
		System.out.println("The department name is " + qa.getDeptName());
		System.out.println("The number of QA employee is " + qa.getNumOfEmployee());
		System.out.println("The department code is " + qa.geDeptCode());
		
			
			
		
			
			

	}

}
