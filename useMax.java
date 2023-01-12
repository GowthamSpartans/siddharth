package OopsCollection;

 class Max {
	public void two(int a,int b) {
		if(a>b) {
		System.out.println(a+" is greater");
		}else {
			System.out.println(b+" is greater");
		}
	}
	public void two(int a,int b,int c) {
		if(a>b && a>c) {
			System.out.println(a+" is greater");
			}else if (b>a && b>c){
				System.out.println(b+" is greater");
			}else {
				System.out.println(c+" is greater");
			}
	}
	public void two(String a,String b,String c) {
		if(a.length()>b.length()) {
			System.out.println(a+" is greater length");
		}else if(b.length()>c.length()) {
			System.out.println(b+" is greater length");
		}else {
			System.out.println(c+" is greater length");
		}
	}

}
public class useMax {
	public static void main(String args[]) {
		Max m=new Max();
		m.two(400, 50);
		m.two(20, 300, 40);
		m.two("gowtham", "raja", "ragul");
	}
}
