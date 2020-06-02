package sortingObjects;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		
		String empName1 = o1.getName();
		String empName2 = o2.getName();
		return empName1.compareTo(empName2);
	}

}
