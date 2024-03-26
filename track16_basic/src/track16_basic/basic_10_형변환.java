package track16_basic;

public class basic_10_형변환 {
	public static void main(String[] args) {
		int intToDouble = 50;
		double doubleToInt = 50.0;
		String stringToInt = "50";
		int intToString = 50;
		
		double aa = (double)intToDouble; // int를 double로 형변환
		int bb = (int)doubleToInt; // double을 in로 형변환
		int cc = Integer.parseInt(stringToInt); // String을 int로 형변환
		String dd = Integer.toString(intToString); // int를 String으로 형변환
		
		System.out.printf("intToDouble : %.3f\n", aa);
		System.out.printf("doubleToInt : %d\n", bb);
		System.out.printf("stringToInt : %d\n", cc);
		System.out.printf("intToString : %s", dd);
	}
}
