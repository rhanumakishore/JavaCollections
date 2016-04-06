package main.java.Lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> list  = new ArrayList<Employee>();
		list.add(new Employee(25, "Reddy","Kishore"));
		list.add(new Employee(20, "Venkata","Hanuma"));
		list.add(new Employee(35, "Srinivasa","Rao"));
		list.add(new Employee(32, "Venkata","Reddy"));
		list.add(new Employee(20, "Akshaj","Reddy"));
		
		System.out.println("------------------------Old Way------------------------------");
		
		Collections.sort(list, new Comparator<Employee>(){

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o2.getAge() - o1.getAge();
			}
			
		});
		
		System.out.println("After sort...");
		
		for(Employee emp : list)
		{
			System.out.println(emp.getAge() + "   " + emp.getFirstName() + "   " + emp.getLastName());
		}
		
		System.out.println("------------------------New Way------------------------------");
		
		System.out.println("After sorting using lambdas - age");
		list.sort((Employee o1, Employee o2) -> o1.getAge() - o2.getAge());
		list.forEach((emp) -> System.out.println(emp.getAge() + "   " + emp.getFirstName() + "   " + emp.getLastName()));
		
		System.out.println("After sorting using lambdas - firstname");
		Comparator<Employee> nameComparator = (emp1, emp2) -> emp1.getFirstName().compareTo(emp2.getFirstName());
		list.sort(nameComparator);
		list.forEach((emp) -> System.out.println(emp.getAge() + "   " + emp.getFirstName() + "   " + emp.getLastName()));
		
		System.out.println("After sorting using lambdas - lastname");
		list.sort((e1, e2) -> e2.getLastName().compareTo(e1.getLastName()));
		list.forEach((e) -> System.out.println(e.getAge() + "   " + e.getFirstName() + "   " + e.getLastName()));
		
		System.out.println("Sorting using lambdas using different comparators at the same time");
		Comparator<Employee> ageComparator = (emp1, emp2) -> emp1.getAge() - emp2.getAge();
		Comparator<Employee> fnameComparator = (emp1, emp2) -> emp1.getFirstName().compareTo(emp2.getFirstName());
		Comparator<Employee> lnameComparator = (emp1, emp2) -> emp1.getLastName().compareTo(emp2.getLastName());
		list.sort(ageComparator.thenComparing(fnameComparator).thenComparing(lnameComparator));
		list.forEach((e) -> System.out.println(e.getAge() + "   " + e.getFirstName() + "   " + e.getLastName()));
		
		

	}

}
