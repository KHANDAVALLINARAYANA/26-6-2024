package assigment4;

public class perfect {

	public static void main(String[] args) {
		int n=6,temp=n,s=0,r=0;
		for(int i=1;i<n;i++) {
			if(n%i==0)
				s+=i;
		
		}if(s==temp) {
			System.out.println("perfect number");
		}
		else
			System.out.println("not");
	}

}
