package OopsCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


class Employee {
	private String name;
	private int id;
	private int salary;
	private String department;
	public Employee(String name,int id,int salary,String department) {
		this.name=name;
		this.id=id;
		this.salary=salary;
		this.department=department;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setId(int id) {
		this.id=id;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	public void setDepartment(String department) {
		this.department=department;
	}
	public String getName() {
		return this.name;
	}
	public String getDepartment() {
		return this.department;
	}
	public int getId() {
		return this.id;
	}
	public int getSalary() {
		return this.salary;
	}
	public String toString() {
		return "Name= "+name+", Id= "+id+", Salary= "+salary+", Department= "+department;
	}

}
public class UseEmployee {
		public static void main(String []args)
		{
			Employee e1=new Employee("raja",890,22000,"mechanical");
			Employee e2=new Employee("bala",894,25000,"computer");
			Employee e3=new Employee("karthi",895,30000,"IT");
			Employee e4=new Employee("sonu",860,12000,"Electrical");
			ArrayList<Employee>e=new ArrayList<>();
			e.add(e1);
			e.add(e2);
			e.add(e3);
			e.add(e4);
			List<Employee> li = e.stream().collect(Collectors.toList());
			for(Employee er:li) {
				System.out.println(er);
			}
			
			
			int maxSalary=li.stream().map(Employee::getSalary).max(Integer::compare).get();
			System.out.println("Max salary from all employee:"+ maxSalary);
			int minSalary=li.stream().map(Employee::getSalary).min(Integer::compare).get();
			System.out.println("Min salary from all employee:"+minSalary);
		}

	}


