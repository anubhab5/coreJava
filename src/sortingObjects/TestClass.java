package sortingObjects;

import java.util.Set;
import java.util.TreeSet;

public class TestClass {

	public static void main(String[] args) {

		Set<Employee> set = new TreeSet<Employee>(new EmployeeNameComparator());
		set.add(new Employee(1, "Anubhab"));
		set.add(new Employee(3, "Anurag"));
		set.add(new Employee(5, "Tom"));
		set.add(new Employee(2, "Rambo"));
		set.add(new Employee(4, "Julia"));
		
		for (Employee employee : set) {
			System.out.println(employee.getId());
			System.out.println(employee.getName());
		}
	}

}
