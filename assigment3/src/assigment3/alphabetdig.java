package assigment3;

public class alphabetdig {

	public static void main(String[] args) {
		char a=' ';
		if(a>='a'&&a<='z'||a>='A'&& a<='Z')
			System.out.println("alpha");
		else if(a>='0'&&a<='9')
			System.out.println("number");
		else
			System.out.println("special character"); 
		
	}

}
