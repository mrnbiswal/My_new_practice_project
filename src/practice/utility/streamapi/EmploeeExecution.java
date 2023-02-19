package practice.utility.streamapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

/*Write a program to store employees record with following data points by using Java Collection Object
EmpId
EmpName
EmpCity
EmpCountry
EmpSalary
EmpDepratmentName
1. Sort the employees record by employee name
2. Filter the employee records based upon the name starting with A
3. Calculate the total salary of all the employees by using Java8 functional programming
4. Count the total number of employees belong to any specific city*/
public class EmploeeExecution {

	public static void main(String[] args) {
		Employees e1 = new Employees(8, "Manoranjan", "Bangalore", "India", 40000.0, "IT department");
		Employees e2 = new Employees(9, "Soumyranjan", "Bhubaneswar", "India", 60000.0, "Railway");
		Employees e3 = new Employees(1, "Prafulla Bhai", "Hatibagan", "India", 55000.0, "Govenment");
		Employees e4 = new Employees(4, "Subal god father", "Balasore", "India", 100000.0, "Business");
		Employees e5 = new Employees(5, "Niranjan", "Bhadrak", "India", 35000.0, "Shop");
		Employees e6 = new Employees(6, "Chittaranjan", "Hyderabad", "Nepal", 30000.0, "Reception");
		Employees e7 = new Employees(2, "Sankarsan", "Mumbai", "India", 42000.0, "Hotel");
		Employees e8 = new Employees(8, "Jagabandhu", "Puri", "Pakistan", 70000.0, "Teachership");
		List<Employees> l1 = new ArrayList<>();
		l1.add(e1);
		l1.add(e2);
		l1.add(e3);
		l1.add(e4);
		l1.add(e5);
		l1.add(e6);
		l1.add(e7);
		l1.add(e8);
		System.out.println("Befoer sorting");
		ListIterator<Employees> ltr = l1.listIterator();
		while (ltr.hasNext()) {
			System.out.println(ltr.next());
		}
		Collections.sort(l1);
		ltr = l1.listIterator();
		System.out.println("After sorting");
		while (ltr.hasNext()) {
			System.out.println(ltr.next());
		}
		Collections.sort(l1, Collections.reverseOrder());
		ltr = l1.listIterator();
		System.out.println("Sorting in reverse order");
		while (ltr.hasNext()) {
			System.out.println(ltr.next());
		}
		System.out.println("Name starts with S");
		List<Employees> sNames = l1.stream().filter(x -> x.getEmpName().startsWith("S")).collect(Collectors.toList());
		System.out.println(sNames);
		Double totalsalary = l1.stream().collect(Collectors.summingDouble(Employees::getEmpSalary));
		System.out.println(totalsalary);
		long count = l1.stream().filter(x -> "India".equals(x.getEmpCountry())).count();
		System.out.println(count);
	}

}
