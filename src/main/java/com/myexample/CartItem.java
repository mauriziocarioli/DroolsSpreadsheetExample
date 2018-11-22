package com.myexample;

import java.lang.String;
import java.io.Serializable;

public class CartItem implements Serializable {

	private static final long serialVersionUID = -7763658409038984469L;

	@org.kie.api.definition.type.Label(value = "product")
	private Product product;
	@org.kie.api.definition.type.Label(value = "quantity")
	private int qty;

	public CartItem() {
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQty() {
		return this.qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}
	
	public CartItem(Product product,
			int qty) {
		this.product = product;
		this.qty = qty;
	}

}
