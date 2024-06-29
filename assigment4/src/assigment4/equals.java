package assigment4;

public class equals {

	public static void main(String[] args) {
		int a=11,b=14,c=14;
		if(a==b&&a==c)
			System.out.println("all sides are equal");
		else if(a==b||b==c)
			System.out.println("symmetric");
		else if(a!=b&&b!=c)
			System.out.println("irregular");
		
			
	}

}
