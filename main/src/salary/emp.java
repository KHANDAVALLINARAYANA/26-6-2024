package salary;

public class emp {
	int age;
	String name;
	private int sal;
	static emp obj=null;

	emp(String name,int age,int sal){
		this.age=age;
		this.name=name;
		this.sal=sal;
		
	}
	
	public static void disp() {
		System.out.println(obj.sal);
	}
public static void main(String[]args) {
obj=new emp("name",21,222);
disp();
}}
