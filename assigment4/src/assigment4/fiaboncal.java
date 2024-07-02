package assigment4;

public class fiaboncal {

	public static void main(String[] args) {
	int n=20,a=0,b=1,c=0;
	System.out.println(a);
	System.out.println(b);
	for(int i=1;i<=n;i++) {
		c=a+b;
		System.out.println(c);
		a=b;
		b=c;
	}

	}

}
