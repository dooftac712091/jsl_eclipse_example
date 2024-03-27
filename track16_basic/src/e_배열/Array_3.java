package e_배열;

import java.util.Scanner;

public class Array_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇 개의 수를 입력하시겠습니까? : ");
		int capacity = sc.nextInt();
		
		int[] arr = new int[capacity + 1];
		
		int sum = 0;
		
		for(int i = 0; i < arr.length - 1; i++) {
			System.out.printf("%d번째 수를 입력해주세요 : ", (i + 1));
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		
		arr[arr.length - 1] = sum;
		
		sc.close();

		for(int j = 0; j < arr.length; j++) {
			
			if(j != arr.length - 1) {
				System.out.printf("%d번째 수 : %d\n", (j + 1), arr[j]);
			} else {
				System.err.printf("합계 : %d", arr[j]);
			}
		}

	}
}
