package staticinstance;

public class test2 {
	 static int i = 1; 
	 public static void main(String[] args) 
	     { 
	         int i = 1; 
	         for (test2.i = 1; test2.i < 10; test2.i++) { 
	             i = i + 2; 
	             System.out.print(i + " "); 
	         } 
	     } 


}
