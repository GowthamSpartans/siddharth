package OopsCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Student {
	private String name;
	private int id;
	private int marks;
	private String branch;
	private char gender;
	public Student(String name,int id,int marks,String branch,char gender) {
		this.name=name;
		this.id=id;
		this.marks=marks;
		this.branch=branch;
		this.gender=gender;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setId(int id) {
		this.id=id;
	}
	public void setMarks(int marks) {
		this.marks=marks;
	}
	public void setBranch(String branch) {
		this.branch=branch;
	}
	public String getName() {
		return this.name;
	}
	public String getBranch() {
		return this.branch;
	}
	public int getId() {
		return this.id;
	}
	public int getMarks() {
		return this.marks;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String toString() {
		return "name="+name+"id="+id+"marks="+marks+"branch="+branch;
	}

}

public class UseStudents {
	public static void main (String []args)
	{
		Student s1=new Student("spartans",10001,80,"computer",'m');
		Student s2=new Student("saro",10002,70,"english",'f');
		Student s3=new Student("priya",10003,90,"MBA",'f');
		Student s4=new Student("sharukan",10004,60,"mtech",'m');
		ArrayList<Student>s=new ArrayList<>();
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.add(s4);
		//s.forEach(System.out::println);
		
		List<Student> li=s.stream().filter(a->a.getGender()=='f').collect(Collectors.toList());
		for(Student v:li) {
			System.out.println(v);
			}
		int maxSalary=li.stream().map(Student::getMarks).max(Integer::compare).get();
		System.out.println("Max mark from all female student:"+ maxSalary);
		System.out.println(maxSalary);
		
		
		
	}	

}
