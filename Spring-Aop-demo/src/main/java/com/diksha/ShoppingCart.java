package com.diksha;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

	public void checkout(String Status) {
		System.out.println("Checkout method from ShoppingCart Called");
	}
	
	public int quantity() {
		return 2;
	}
}
