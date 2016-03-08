package main.java.Set.HashSet;

import java.util.HashSet;
import java.util.Set;


public class EqualsTest {

    public static void main(String[] args) {
        EmployeeTest e1 = new EmployeeTest();
        EmployeeTest e2 = new EmployeeTest();

        e1.setId(100);
        e2.setId(100);

        //Prints false in console if we do not override equals and hashcode method in EmployeeTest class
        System.out.println(e1.equals(e2));

        Set<EmployeeTest> employees = new HashSet<EmployeeTest>();
        employees.add(e1);
        employees.add(e2);

        //Prints two objects if we do not override equals and hashcode method in EmployeeTest class
        System.out.println(employees);

       
    }
}
