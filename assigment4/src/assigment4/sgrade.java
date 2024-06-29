package assigment4;

public class sgrade {

	public static void main(String[] args) {
		int s1=56,s2=35,s3=78,marks;
		marks=(s1+s2+s3)/3;
		
		if(marks>=0&&marks<=100) {
		if(marks>90)
			System.out.println("a grade");
		else if(marks>80)
			System.out.println("b grade");
		else if(marks>60)
			System.out.println("c grade");
		else if(marks>35)
			System.out.println("d grade");
		else
			System.out.println("fail");
		
	}
		else
			System.out.println("enter the marks");

}
}