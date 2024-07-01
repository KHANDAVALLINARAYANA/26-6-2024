package assigment4;

public class FACTORIAL {
	
	

	public static void main(String[] args) {
		int n=5;
	int	a=fact(n);
	
		System.out.println("fact"+a);

	}public static int fact(int n) {
		if(n!=0) {
			n=n*fact(n-1);
		return n;}
		
		else
			return 1;
	}

}
