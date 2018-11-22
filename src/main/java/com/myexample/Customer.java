package com.myexample;

import java.lang.String;
import java.lang.StringBuilder;
import java.io.Serializable;

public class Customer implements Serializable {

	private static final long serialVersionUID = -3991522817200723246L;

	@org.kie.api.definition.type.Label("coupon")
	private String coupon;
	@org.kie.api.definition.type.Label("new")
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
