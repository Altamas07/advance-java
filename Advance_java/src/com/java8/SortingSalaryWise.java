package com.java8;

import java.util.ArrayList;
import java.util.List;

class Employee{
	
	int salary;
	String name;
	
	Employee(String name1,int salary1){
		
		this.name=name1;
		this.salary=salary1;
		
		
	}

	public int getSalary() {
		return salary;
	}

	public String getName() {
		return name;
	}

}


public class SortingSalaryWise {

	public static void main(String[] args) {
		
	
	List<Employee> emp=new ArrayList<>();
	
	emp.add(new Employee("altamash", 20000));
	emp.add(new Employee("saad", 12000));
	emp.add(new Employee("aamir", 10000));
	emp.add(new Employee("abrar", 11000));
	emp.add(new Employee("hashim", 21000));
	
	emp.sort((e1,e2)-> e1.salary-e2.salary);
	emp.forEach(e->System.out.println(e.name+" "+e.salary));
	
	System.out.println("\n");
	System.out.println("By greater salary");
	
	emp.stream().filter(e->e.salary>15000);
	emp.forEach(e->System.out.println(e.name));
	
	System.out.println("\n");
	System.out.println("By max salary ");
	
	int max=emp.stream().mapToInt(Employee::getSalary).max().getAsInt();
	System.out.println(max);
	
	System.out.println("BY min salary");
	
     int min=emp.stream().mapToInt(Employee::getSalary).min().getAsInt();
     System.out.println(min);
}
}