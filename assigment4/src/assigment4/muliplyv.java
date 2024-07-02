package assigment4;

public class muliplyv {

	public static void main(String[] args) {
		int  n=1234,r=0,s=1;
		
		while(n>0) {
			r=n%10;
			s*=r;
			n/=10;
		}
			System.out.println(s);

	}

}
