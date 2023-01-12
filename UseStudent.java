package OopsCollection;

class Students {
	private String name;
	private int age;
	private int id;
	private Address address;
	public Students(String name,int age,int id,Address address) {
		this.name=name;
		this.age=age;
		this.id=id;
		this.address=address;
	}
	public void setName(String name) {
		this.name=name;
	}public String getName() {
	return this.name;
    }public void setAge(int age) {
		this.age=age;
	}public int getAge() {
		return this.age;
	}public void setId(int id) {
	this.id=id;
	}public int getId() {
		return this.id;
	}
	public void setAddress(Address address) {
		this.address=address;
	}public Address getAddress() {
		return this.address;
	}
	public String toString(){
		return "name="+name+", age="+age+", id="+id+",  Address="+address;
	}
}
class Address {
	private int no;
	private String street;
	private int pincode;
	public Address (int no,String street,int pincode) {
		this.no=no;
		this.street=street;
		this.pincode=pincode;
	}
	public void setNo(int no) {
		this.no=no;
	}
	public int getNo() {
		return this.no;
	}
	public void setStreet(String street) {
		this.street=street;
	}
	public String getStreet() {
		return this.street;
	}
	public void setPincode(int pincode) {
		this.pincode=pincode;
	}
	public int getPincode() {
		return this.pincode;
	}
	public String toString() {
		return "no="+no+", street="+street+", pincode+"+pincode;
	}
}
public class UseStudent {
	public static void main(String args[]){
	
		Address a=new Address(25,"north street",605106);
	    a.setNo(25);
		a.setStreet("north street");
        a.setPincode(605106);
		Students s=new Students("Mani",25,2005,a);
		
		System.out.println(s.getName()+"  "+s.getAge()+"  "+s.getId());
		System.out.println(s.getAddress().getNo()+"  "+s.getAddress().getStreet()+"  "+s.getAddress().getPincode());
		System.out.println(s);
	}

}
