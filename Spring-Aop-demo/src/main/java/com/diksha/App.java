package com.diksha;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

		ShoppingCart cart = context.getBean(ShoppingCart.class);
//		cart.checkout();
		cart.checkout("Status :"+"CANCELLED");
		
	}
}
