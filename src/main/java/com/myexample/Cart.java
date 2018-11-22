package com.myexample;

import java.lang.String;
import java.lang.StringBuilder;
import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;

public class Cart implements Serializable {

	private static final long serialVersionUID = -8271470625896780879L;

	@org.kie.api.definition.type.Label(value = "cart items")
	private java.util.List<CartItem> cartItems = new ArrayList<CartItem>();
	@org.kie.api.definition.type.Label(value = "discount")
	private double discount;

	public Cart() {
	}

	public List<CartItem> getCartItems() {
		return this.cartItems;
	}

	public void setCartItems(List<CartItem> cartItems) {
		this.cartItems = cartItems;
	}

	public double getDiscount() {
		return this.discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	public int getTotalPrice() {
	    int total = 0;
	    for (CartItem item : cartItems) {
	        total += item.getProduct().getPrice()*item.getQty();
	    }
	    return total;
	}
	
	public int getFinalPrice() {
	    return getTotalPrice() - (int)getDiscount(); 
	}
	
	public Cart(List<CartItem> cartItems, double discount) {
		this.cartItems = cartItems;
		this.discount = discount;
	}

}
