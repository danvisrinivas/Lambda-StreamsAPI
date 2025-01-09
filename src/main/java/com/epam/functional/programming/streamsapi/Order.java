package com.epam.functional.programming.streamsapi;

public class Order {

	private String category;
	private String product;
	private double price;
	private int quantity;

	public Order() {

	}

	public Order(String category, String product, double price, int quantity) {
		this.category = category;
		this.product = product;
		this.price = price;
		this.quantity = quantity;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Order [category=" + category + ", product=" + product + ", price=" + price + ", quantity=" + quantity
				+ "]";
	}
}
