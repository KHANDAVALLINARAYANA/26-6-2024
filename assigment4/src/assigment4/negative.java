package assigment4;

import java.util.Scanner;

public class negative {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
	System.out.println();
				int a=sc.nextInt();
				int b=0;
				
				while(a>0) {
					b+=a;
					a=sc.nextInt();
				}
				System.out.println(b);
					
					
				
	}

}
