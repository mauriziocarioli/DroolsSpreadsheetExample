package com.myexample;

import com.myexample.*;
import java.lang.String;
import java.io.Serializable;

public class Customer implements Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "coupon")
	private String coupon;
	@org.kie.api.definition.type.Label(value = "new")
	private boolean newCustomer;

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

	public Customer(String coupon, boolean newCustomer) {
		this.coupon = coupon;
		this.newCustomer = newCustomer;
	}

}