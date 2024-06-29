package assigment4;

public class lettergrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks=85;
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
	}

}
