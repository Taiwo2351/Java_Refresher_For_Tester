package Java_Encapsulation;

public class Department {

	private String deptName;
	private int numOfEmployee;
	private String deptCode;
	
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	public void setNumOfEmployee(int numOfEmployee) {
		if(numOfEmployee > 0) {
		this.numOfEmployee = numOfEmployee;
		}else {
			System.out.println(deptCode +" Employee can not be zero or less than zero" );
		}
	}
	
	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}
	
	public String getDeptName() {
		return deptName;
	}
	
	public int getNumOfEmployee() {
			return numOfEmployee;
		}
	
	public String geDeptCode() {
		return deptCode;
		}
}
