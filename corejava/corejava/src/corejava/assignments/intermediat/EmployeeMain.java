package corejava.assignments.intermediat;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee emps[]=new Employee[8];
		emps[0]=new Labour("kiki", 345);
		emps[1]=new Labour("kiki", 345);
		emps[2]=new Labour("kiki", 345);
		emps[3]=new Labour("kiki", 345);
		emps[4]=new Manager("kiki", 345);
		emps[5]=new Manager("kiki", 345);
		emps[6]=new Manager("kiki", 345);
		emps[7]=new Manager("kiki", 345);
		long totalSalary=0;
		for (int index = 0; index < emps.length; index++) {
			Employee employee = emps[index];
			totalSalary+=employee.getSalary();
		}
		System.out.println("totalSalary= "+totalSalary);
		
		

	}

}
