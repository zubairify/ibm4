package com.ibm.shop;

public class ShoppingCart {
	private Product[] cart;
	private double total;
	private int idx;
	
	public ShoppingCart() {
		cart = new Product[5];
	}
	
	public void addToCart(Product p) {
		if(idx == 5)
			System.out.println("Your cart is full...");
		else if(p.getStock() == 0)
			System.out.println("Sorry! Product out of stock..");
		else {
			cart[idx] = p;
			idx ++;
			total += p.getPrice();
			p.setStock(p.getStock() - 1);
			System.out.println(p.getName() + " added to cart");
		}
	}
	
	public void checkout() {
		System.out.println("Product in your cart");
		for(int i=0; i<idx; i++)
			cart[i].print();
		
		System.out.println("Cart Total: Rs." + total);
	}
}
