package staticinstance;

public class emp {
	static String company;
	int id=101;
	String name="aaa";
	static emp obj=new emp();
	static {
		System.out.println("Static block");
		
		System.out.println("company");
		company="sss";
	}
	
	public static void disp(){
		System.out.println("display block");
		
		System.out.println(company);
		System.out.println(obj.name);
		
	}
	public static void main(String[] args) {
		System.out.println("main method");
		//emp obj=new emp();
		System.out.println(company);
		System.out.println(obj.id);
		System.out.println(obj.name);
		disp();
		//dept d=new dept();
		dept.display();
		
	}

	}
class dept{
	//dept d=null;
	//d= new dept();
	//int deptno=10;
	//String deptname="fff";
			//static {
		//System.out.println();
	public static void display() {
		System.out.println("dept and display method");
		emp.disp();
		System.out.println(emp.company);
		emp d=new emp ();
		System.out.println(d.id);
	
	}

	
			
	
}

