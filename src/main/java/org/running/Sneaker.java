package org.running;
public record Sneaker(String brand, float price, int ... sizes) {
	public void test () {
		Sneaker sn = new Sneaker("Eclipse", 100, 9, 10, 11);
	}
}