package com.myexample;

import com.myexample.*;
import java.lang.String;
import java.lang.StringBuilder;
import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;

public class Cart implements Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "customer")
	private Customer customer;
	@org.kie.api.definition.type.Label(value = "cart items")
	private java.util.List<CartItem> cartItems = new ArrayList<CartItem>();
	@org.kie.api.definition.type.Label(value = "discount")
	private double discount;

	public Cart() {
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
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
	
	public void addItem(Product product, int qty) {
	    CartItem cartItem = new CartItem(this, product, quantity);
	    this.cartItems.add(cartItem);
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
	
	public String toString() {
	    StringBuilder sb = new StringBuilder();
	    for (CartItem item : cartItems) {
	        sb.append(item).append("\n");        
	    }
	    sb.append("Discount: ").append(getDiscount())
	      .append("\nTotal: ").append(getTotalPrice())
	      .append("\nTotal After Discount: ").append(getFinalPrice());
	   return sb.toString();
	}

	public Cart(Customer customer,
			List<CartItem> cartItems, double discount) {
		this.customer = customer;
		this.cartItems = cartItems;
		this.discount = discount;
	}

}