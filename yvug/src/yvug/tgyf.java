package yvug;

public class tgyf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int year=2100;
		String name=(((year%100!=0)&(year%4==0)|(year%400==0)))?"leap":"not leap";
		System.out.println(name);
	}

}
