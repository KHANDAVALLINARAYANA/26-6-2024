package assigment4;

public class revrnesnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=521,temp=n,r=0,sum=0;
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n/=10;
		}
		
			System.out.println(sum);
		

	}

}
