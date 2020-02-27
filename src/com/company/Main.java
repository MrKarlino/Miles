package com.company;

public class Main {

    public static void main(String[] args) {
    	BonusMilesService service = new BonusMilesService();
		int price = 3573;

		int result = service.calculate(price);

		System.out.println(result);
    }
}
