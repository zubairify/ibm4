package com.ibm.shop;

public class Product {
	private String name;
	private double price;
	private int stock;
	
	public Product() {
	}

	public Product(String name, double price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}

	public double getPrice() {
		return price;
	}

	public int getStock() {
		return stock;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getName() {
		return name;
	}

	public void print() {
		System.out.println("Product: " + name + "\tRs." + price + "\tLeft: " + stock);
	}
}
