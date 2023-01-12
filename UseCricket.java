package OopsCollection;

import java.util.HashMap;



class Cricket{
	private String name;
	private int run;
	private int wicket;
	private int age;
	private boolean isBatsman;
	public Cricket(String name,int run,int wicket,int age,boolean isBatsman) {
		this.name=name;
		this.run=run;
		this.wicket=wicket;
		this.age=age;
		this.isBatsman=isBatsman;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRun() {
		return run;
	}
	public void setRun(int run) {
		this.run = run;
	}
	public int getWicket() {
		return wicket;
	}
	public void setWicket(int wicket) {
		this.wicket = wicket;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isBatsman() {
		return isBatsman;
	}
	public void setBatsman(boolean isBatsman) {
		this.isBatsman = isBatsman;
	}
	public String toString() {
		return "Name= "+name+", run= "+run+", wicket= "+wicket+", age= "+age;
	}
}
public class UseCricket {
	public static void main (String args[]) {
		Cricket c1=new Cricket("rohit",85,0,32,true);
		Cricket c2=new Cricket("shami",22,3,35,false);
		Cricket c3=new Cricket("chakal",35,2,30,false);
		Cricket c4=new Cricket("koli",70,0,28,true);
		Cricket c5=new Cricket("bumra",20,4,33,false);
		HashMap<Integer,Cricket>li=new HashMap<>();
		li.put(1, c1);
		li.put(2, c2);
		li.put(3, c3);
		li.put(4, c4);
		li.put(5, c5);
		int max = 0;
		String na = "";
		for (Cricket b:li.values()) {
			
			if(b.isBatsman()==false && b.getRun() > max) {
				 max=b.getRun();
            na = b.getName();
            //System.out.println(max+na);
			}
		}
		System.out.println(max+na);
		
			}
			
		}

	


