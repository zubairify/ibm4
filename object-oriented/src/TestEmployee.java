import com.ibm.emp.Employee;
import com.ibm.emp.Executive;
import com.ibm.emp.Manager;

public class TestEmployee {

	public static void main(String[] args) {
		
		Executive exec = new Executive("Polo", 4000, 2000);
		
		Manager mgr = new Manager("Lili", 5000, 3000);

		showSalary(exec);
		showSalary(mgr);
	}

	private static void showSalary(Employee emp) {
		if(emp instanceof Manager)
			System.out.println("Manager Salary: " + emp.getSalary());
		else
			System.out.println("Executive Salary: " + emp.getSalary());
	}
	
	// Method overloading...
//	private static void showSalary(Manager mgr) {
//		System.out.println("Manager Salary: " + mgr.getSalary());
//	}
//
//	private static void showSalary(Executive exec) {
//		System.out.println("Executive Salary: " + exec.getSalary());
//	}
}
