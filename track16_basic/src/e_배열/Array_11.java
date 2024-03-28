package e_배열;

public class Array_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayData sampleData = new ArrayData();
		String[] arr = sampleData.arry1;
		
		// 총점
		// 평균
		// 합격, 불합격 데이터가 들어가는 배열 수
		int additionalInfo = 3;
		
		int sum = 0;
		double average = 0.0;
		double major = 0.0;
		
		int basic = 80;
		
		for(int i = 1; i < arr.length; i += 1) {
			if(i < (arr.length - additionalInfo)) {
				sum += Integer.parseInt(arr[i]);
				major += 1.0;
				System.out.println(major);
			} else if (i == (arr.length - additionalInfo)) {
				arr[i] = Integer.toString(sum);
				average = sum / major;
			} else if (i == (arr.length - additionalInfo + 1)) {
				arr[i] = Double.toString(average);
			} else if (i == (arr.length - additionalInfo + 2)) {
				if(average > basic) {
					arr[i] = "합격";
				} else {
					arr[i] = "불합격";
				}
			}
		}
		
		for(int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");
		}
	}

}
