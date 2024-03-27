package d_반복문;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Car {
	private static int key;
	private String name;
	private int year;
	
	Car(String name, int year) {
		this.key += key;
		this.name = name;
		this.year = year;
	}

	public int getKey() {
		return key;
	}

	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}

}

public class DoWhile_1 {
	public static void main(String[] args) {

		int select = 0;
		
		Scanner sc = new Scanner(System.in);
		
		List<Car> vehicleList = new ArrayList<Car>();
		
		do {
			
			System.out.print("선택해주세요 : 검색[1], 등록[2], 수정[3], 종료[0]");
			
			select = sc.nextInt();
			
			if(select == 1) {
				
			} else if(select == 2) {
				
				System.out.print("등록할 차량의 이름을 입력해주세요 : ");
				String name = sc.next();
				
				System.out.print("등록할 차량의 연식을 입력해주세요(예 : 0000년) : ");
				int year = sc.nextInt();
				
				Car vehicle = new Car(name, year);
				
				vehicleList.add(vehicle);
			
			} else if(select == 3) {
				
				if(vehicleList.size() != 0) {
					for(int k = 0; k < vehicleList.size(); k++) {
						System.out.printf("식별번호 : %d\n"
								+ "차량명 : %s\n"
								+ "연식 : %d\n", 
								vehicleList.get(k).getKey(), 
								vehicleList.get(k).getName(), 
								vehicleList.get(k).getYear());
					}
					System.out.print("수정할 등록할 차량의 식별번호를 입력해주세요 : ");
					
				} else {
					System.out.println("저장된 차량이 없습니다.");
				}
				
				
			} else if(select == 0) {
				System.out.println("프로그램을 종료합니다.");
			} else {
				System.out.println("잘못된 입력입니다.");
			}
			
		} while(select != 0);
	}
}
