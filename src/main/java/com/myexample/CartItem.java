package com.myexample;

import com.myexamples.*;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class CartItem implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "cart")
	private Cart cart;
	@org.kie.api.definition.type.Label(value = "product")
	private Product product;
	@org.kie.api.definition.type.Label(value = "quantity")
	private int qty;

	public CartItem() {
	}

	public com.myexample.Cart getCart() {
		return this.cart;
	}

	public void setCart(com.myexample.Cart cart) {
		this.cart = cart;
	}

	public com.myexample.Product getProduct() {
		return this.product;
	}

	public void setProduct(com.myexample.Product product) {
		this.product = product;
	}

	public int getQty() {
		return this.qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public CartItem(com.myexample.Cart cart, com.myexample.Product product,
			int qty) {
		this.cart = cart;
		this.product = product;
		this.qty = qty;
	}

}