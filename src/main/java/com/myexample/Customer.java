package com.myexample;

import com.myexample;
import java.lang.String;
import java.lang.StringBuilder;
import java.io.Serializable;

public class Customer implements Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("coupon")
	private String coupon;
	@org.kie.api.definition.type.Label("new")
	private boolean newCustomer;
	@org.kie.api.definition.type.Label(value = "cart")
	private Cart cart;

	public Customer() {
	}

	public String getCoupon() {
		return this.coupon;
	}

	public void setCoupon(String coupon) {
		this.coupon = coupon;
	}

	public boolean isNewCustomer() {
		return this.newCustomer;
	}

	public void setNewCustomer(boolean newCustomer) {
		this.newCustomer = newCustomer;
	}

	public Cart getCart() {
		return this.cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}
	
	public void addItem(Product product, int qty) {
	    if (cart == null) {
	        cart = new Cart(this);
	    }
	    cart.addItem(product, qty);
	}
	
	public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("New customer? ").append(isNewCustomer())
	      .append("\nCoupon: ").append(coupon)
	      .append("\n").append(cart);
	    return sb.toString();
	}

	public Customer(java.lang.String coupon, boolean newCustomer,
			com.myexample.Cart cart) {
		this.coupon = coupon;
		this.newCustomer = newCustomer;
		this.cart = cart;
	}

}