package track16_basic;

public class Car {
	
	Car(String carName) {
		System.out.println(carName + "搭乗状態です！");
	}
	
	public void Drive() {
		System.out.println("出発します！");
	}
	
	public void Stop() {
		System.out.println("停止します！");
	}
}
