package org.bike;

public class Ktm implements Bike {


	@Override
	public void speed() {
		System.out.println("bike speed is: high" );
		
	}

	@Override
	public void cost() {
		System.out.println("Bike cost is: 45000");
		
	}
public static void main(String[] args) {
	Ktm m = new Ktm();
	m. speed();
	m.cost();
}
}
