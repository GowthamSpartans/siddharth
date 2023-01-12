package OopsCollection;


public class UseSingle {
	public static void main(String args[])
	{
		Tiger t=new Tiger();
		t.eat();
		t.run();
		t.sleep();
		t.hunting();
	}

}
class Animal {
	public void eat() {
		System.out.println("Eating");
	}                                          
	public void sleep() {
		System.out.println("Sleeping");
	}
}
class Tiger extends Animal {
	
	public void run() {
		System.out.println("medium run");
	}
	public void hunting() {
		System.out.println("hunting");
		}
}