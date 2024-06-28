package assigment3;

public class insaure {

	public static void main(String[] args) {
    char a='u';
    int age=34;
    char b='b';
    if(a=='m') 
    	System.out.println("married insure");
    
    if(a=='u'){
   	 if(b=='b'&&age>30) 
   		System.out.println("insure claim");
   	if(b=='g'&&age>20)
   		System.out.println("insure claim");
   	 }
   if(b=='b' && age<30 ||b=='g'&& b<20) {
    	System.out.println("not claim");
    }
}

}
