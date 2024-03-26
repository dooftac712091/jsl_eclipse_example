package track16_basic;

class You {
	
	String name;
	int age;
	
	You(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
}

public class example_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		You lee = new You("승호", 25);
		You ito = lee;
		System.out.printf("name : %s\n age : %s\n", ito.name + ito.age);
		
	}

}
