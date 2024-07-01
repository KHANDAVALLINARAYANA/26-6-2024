package assigment4;

public class amstrong {

	public static void main(String[] args) {
int n=1634,rem=0,count=0,m=0,temp=0;
double sum=0;
temp=n;
//
//		while(n>0) {
//	rem=n%10;
//sum=(rem*rem*rem)+sum;
//n=n/10;}
//if(temp==sum)
//	System.out.println("amstrong");
//else
//	System.out.println("not amstrong");
//	
//
while(n>0){
m=n%10;
if(m>0)
	count++;
n/=10;
}
n=temp;
while(n>0) {
rem=n%10;
sum=Math.pow(rem,count)+sum;
n=n/10;}
if(temp==sum)
	System.out.println("amstrong");
else
	System.out.println("not amstrong");


	}

}
