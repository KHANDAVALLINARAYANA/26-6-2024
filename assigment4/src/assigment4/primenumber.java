package assigment4;

public class primenumber {

	public static void main(String[] args) {
		int count=0;
		for(int i=1;i<=20;i++) {
			if(i==2) {
			continue;
			}
			count=0;
		
		for(int j=1;j<=i;j++)
		{
			
			if(i%j==0)
			{
				count++;
			
			}
			
		}
		if(count==2) {
			System.out.println(i);
		}
		
		
			}
		
	}

}
