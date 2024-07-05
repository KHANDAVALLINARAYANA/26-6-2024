package staticinstance;

public class test1 {
	 int x = 10; 
	 public static void main(String[] args) 
	     { 
	         test1 t1 = new test1(); 
	         System.out.println(t1.x); 
	     } 
	     static
	     { 
	         int x = 20; 
	         System.out.print(x + " "); 
	     }         

	}

