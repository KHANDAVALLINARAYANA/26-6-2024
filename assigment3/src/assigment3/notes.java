package assigment3;

public class notes {

	public static void main(String[] args) {
		int amout=885,m=0;
		if(amout>=500)
		m=amout/500;
			System.out.println("500 notes:"+ m);
		amout=amout%500;
		if(amout>=200)
			m=amout/200;
				System.out.println("200 notes:"+ m);
			amout=amout%200;
			if(amout>=100)
				m=amout/100;
					System.out.println("100 notes:"+ m);
				amout=amout%100;
				if(amout>=50)
					m=amout/50;
						System.out.println("50 notes:"+ m);
					amout=amout%50;
					if(amout>=20)
						m=amout/20;
							System.out.println("20 notes:"+ m);
						amout=amout%20;
						if(amout>=10)
							m=amout/10;
								System.out.println("10 notes:"+ m);
							amout=amout%10;
	}

}
