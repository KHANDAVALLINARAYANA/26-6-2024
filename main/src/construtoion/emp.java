package construtoion;

public class emp {

		    // Private fields for name and age
	    private String name;
	    private int age;
	    static emp obj=null;
	    // Constructor that takes name and age parameters
	    emp(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }
	    
	    // Method to introduce the person
	    public void introduce() {
	        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
	        
	    }
	    public static void main(String[]args) {
	    	obj=new emp("harish",21);
	    
	    	obj.introduce();
	    }
	    
	 	    }
	

		

	


