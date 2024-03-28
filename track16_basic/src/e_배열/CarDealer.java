package e_배열;

import java.time.LocalDateTime;
import java.util.List;

class Dealer {
	private String company;
	private List<Car> products;
}

class Car {
	private int key;
	private Brand brand;
	private String name;
	private int price;
	private LocalDateTime availableDate;
	private Stock stock;
	
	Car(Brand brand, String name, int price, LocalDateTime availableDate, Stock stock) {
		this.key += 1;
		this.brand = brand;
		this.name = name;
		this.price = price;
		this.availableDate = LocalDateTime.now();
		this.stock = stock;
	}
}

class Stock {
	private int stock;
	private Strategy strategy;
}

enum Strategy {
	SELL, OUT_OF_STOCK;
}

enum AsiaBrand implements Brand {
	HYUNDAI, KIA, TOYOTA, MITSUBISHI, HONDA;
}

enum EuropeBrand implements Brand {
	Mercedes_Benz, BMW, REUNAUT, VOLKSWAGEN;
}

enum AmericaBrand implements Brand {
	General_Motors, Ford, Crysler, Dodge;
}

interface Brand {	}

public class CarDealer {
	
	public void generateDealerInfo() {
		
	}

	public static void main(String[] args) {
		
	}

}
