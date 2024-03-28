package e_배열;

public class Array_7 {
	
	public static void main(String[] args) {
		
		String[][] info = new String[2][3];
		
		info[0][0] = "홍길동";
		info[0][1] = "대전";
		info[0][2] = "25";
		info[1][0] = "김정은";
		info[1][1] = "평양";
		info[1][2] = "40";
		
		int num = info.length;
		System.out.println("row : " + num);
		
		int col = info[0].length;
		System.out.println("col : " + col);
		
		
		for(int i = 0; i < info.length; i += 1) {
			for(int j = 0; j < info[i].length; j += 1) {
				System.out.println(info[i][j]);
			}
		}
		
	}
}
