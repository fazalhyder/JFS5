class EmoloyeeDetails{
	public void getEmployeeName (){
		System.out.println("Employee Names :  ");
		System.out.println("  Nick ");
		System.out.println("  Jones ");
		System.out.println("  Rock ");
		System.out.println("  John ");
		
		
		
	}
	public void IDS(){
		System.out.println("Employee IDs : ");
		System.out.println("  29292 ");
		System.out.println("  12122 ");
		System.out.println("  22322 ");
		System.out.println("  22222 ");
		
	}
}
class PermanentEmployee extends EmoloyeeDetails{
	public void  SalaryOnMonthlyBasis(){
		System.out.println("  For a Permanent Employee, Monthly salary is 300K");
	}

}
class ContractEmp extends EmoloyeeDetails{
	public void salaryOnHourly(){
		System.out.println("  For a Contract Emp, Hourly salary is 1K");
	}
}
public class HLinheritence{
	public static void main(String [] args) {
		PermanentEmployee pemp = new PermanentEmployee();
		ContractEmp cemp = new ContractEmp();
		cemp.getEmployeeName();
		cemp.IDS();
		cemp.salaryOnHourly();
		pemp.getEmployeeName();
		pemp.IDS();
		pemp.SalaryOnMonthlyBasis();

	}
}