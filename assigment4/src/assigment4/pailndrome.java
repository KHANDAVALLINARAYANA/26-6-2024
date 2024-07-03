package assigment4;

public class pailndrome {

	public static void main(String[] args) {
		int n=521,temp=n,r=0,sum=0;
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n/=10;
		}
		if(temp==sum)
			System.out.println("paindrome");
		else
			System.out.println("not paindrome");
			
	}

}
