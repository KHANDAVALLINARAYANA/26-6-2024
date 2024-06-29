package assigment4;

public class industry {

	public static void main(String[] args) {
		int hardness=52;
	float cardon=0.7f;
	 int tensile =5600;
	 if(hardness>50&&cardon<0.7f&&tensile>5600)
		 System.out.println("grade 10");
	 else if(hardness>50&&cardon<0.7f)
		System.out.println("grade 9");
	 else if(cardon<0.7f&&tensile>5600)
	System.out.println("grade 8");
	 else if(hardness>50&&tensile>5600)
		 System.out.println("grade7");
	 else if(hardness>50||cardon<0.7f||tensile>5600)
		 System.out.println("grade 6");
	 else 
		 System.out.println("not condition true");
	}

}
