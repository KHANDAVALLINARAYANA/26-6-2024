package assigment3;

public class vowel {

	public static void main(String[] args) {
		char a='A';
		if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U')
			System.out.println("vowel");
		else if(a>='a'&&a<='z'||a>='A'&&a<='Z')
			System.out.println("conast");
		else
			System.out.println("check");

	}

}
