package assigment4;

public class neow {

	public static void main(String[] args) {		
	int	n=9,s=0,r=0,t=0,b=0,e=0;
	e=n;
	s=n*n;
	while(s>0) {
		r=s%10;
		b=r+b;
		s=s/10;
		
	}
	
	if(b==e) {
		System.out.println("neow");
	}

	}

}
