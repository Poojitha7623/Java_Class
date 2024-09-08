package week1.day2;

public class EmployeeDetails {

		private int employeeId=1022;
		boolean isAbsent;
		public void details() {
			int local = 101;
			System.out.println(local);
			System.out.println(employeeId);
		}
		public void details2() {
			//System.out.println(local);
			//System.out.println(employeeName);
			System.out.println(employeeId);
		}
		
	public static void main(String[] args) {

		String employeeName="puji";
		System.out.println(employeeName);
		 int age = 21;
		 System.out.println( age);
	   EmployeeDetails employee=new EmployeeDetails();
		System.out.println(employee.isAbsent);
	}

}
