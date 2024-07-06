
public class Book {

	public static void main(String[] args) {
		int year=2000;
		String name=(year%4==0|year%400==0&year%100!=0)?"leap":"not leap";
		System.out.println(name);
	}

}
