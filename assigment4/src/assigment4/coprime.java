package assigment4;

public class coprime {

	public static void main(String[] args) {
	int n=5,m=7,count=0;
for(int i=1;i<=n||i<=m;i++) {
	if(n%i==0&&m%i==0) {
		count++;}}
		if(count==2) {
			System.out.println("samenume");}
		else if(count==1) {
				System.out.println("co prime");}
		else if(count>2) {
			System.out.println("not coprime");
			
		}
	}
		

	
	
	
	
		

	}


