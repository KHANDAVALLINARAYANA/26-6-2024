package assigment3;

public class equlilatral {

	public static void main(String[] args) {
		int a=60,b=60,c=60;
		if(a+b+c==180)
			if(a==b&&c==b)
			System.out.println("equillateral");
		else if((a==b||c==b))
			 System.out.println("isosceles");
		else if(a!=b&&a!=c)
			System.out.println("scalence ");
		else
			System.out.println("not triangle");
	}
	
}
