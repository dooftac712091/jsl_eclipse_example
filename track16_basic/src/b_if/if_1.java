package b_if;

public class if_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		int b = 5;
		int c = 0;
		int d = 1;
		
		
		
		if(a != b) {
			System.out.println("条件1：正しいです。");
		}
		
		if(a > b && a == b) {
			System.out.println("条件2：正しいです。");
		}
		
		if(a > b || a == b) {
			System.out.println("条件3：正しいです。");
		}
		
		if(a < b) {
			System.out.println("条件4−1：正しいです。");
		} else {
			System.out.println("条件4−2：正しいです。");
		}
		
		
		
		a = 8;
		
		if(a > 10 ) {
			System.out.println("条件5-1：正しいです。");
		} else if (a > 9) {
			System.out.println("9よりおっきい");
		} else if (a > 8) {
			System.out.println("8よりおっきい");
		} else if (a > 7) {
			System.out.println("7よりおっきい");
		} else {
			System.out.println("条件5-2：正しいです。");
		}
		
		System.out.println("終了します。");
	}
}
