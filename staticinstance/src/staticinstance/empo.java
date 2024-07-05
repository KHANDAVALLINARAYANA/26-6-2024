package staticinstance;

public class empo {
int x=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		empo t1 = new empo(); 
        empo t2 = new empo(); 
        t1.x = 20; 
        System.out.print(t1.x + " "); 
        System.out.println(t2.x);
	}

}
