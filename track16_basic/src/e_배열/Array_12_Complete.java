package e_배열;

public class Array_12_Complete {

	public static void main(String[] args) {
		
		// 총점
		// 평균
		// 합격, 불합격 데이터가 들어가는 배열 수
		int additionalInfo = 3;
		
		ArrayData sampleData = new ArrayData();
		String[] arr = sampleData.arry1;
		String[][] targetArr = sampleData.score1;
		
		// 기존 import 배열에 추가정보를 적재할 배열 생성
		String[][] standardArr = new String[targetArr.length][targetArr[0].length + additionalInfo];
		
		// 합격 기준 설정
		int basic = 80;
		
		for(int k = 0; k < standardArr.length; k++) {
			
			// 각각의 인원의 점수 계산을 위한 변수 초기화
			int sum = 0;
			double average = 0.0;
			double major = 0.0;
			
			standardArr[k][0] = targetArr[k][0];
			
			for(int i = 1; i < standardArr[k].length; i += 1) {
				if(i < (standardArr[k].length - additionalInfo)) {
					if(targetArr[k][i] != "" || targetArr[k][i] != null) {
						standardArr[k][i] = targetArr[k][i];
						sum += Integer.parseInt(targetArr[k][i]);
						major += 1.0;
					} else {
						standardArr[k][i] = targetArr[k][i];
					}
				} else if (i == (standardArr[k].length - additionalInfo)) {
					standardArr[k][i] = Integer.toString(sum);
					average = sum / major;
				} else if (i == (standardArr[k].length - additionalInfo + 1)) {
					standardArr[k][i] = String.format("%.1f", average);
				} else if (i == (standardArr[k].length - additionalInfo + 2)) {
					if(average > basic) {
						standardArr[k][i] = "합격";
					} else {
						standardArr[k][i] = "불합격";
					}
				}
			}
		}
		
		for(int j = 0; j < standardArr.length; j++) {
			for(int m = 0; m < standardArr[j].length; m++) {
				System.out.print(standardArr[j][m] + " ");
			}
			System.out.println("");
		}
	}

}
