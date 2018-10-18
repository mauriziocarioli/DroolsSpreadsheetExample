package com.myexample;

import java.lang.String;
import java.io.Serializable;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Product implements Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "price")
	private int price;
	@org.kie.api.definition.type.Label(value = "description")
	private String desc;

	public Product() {
	}

	public int getPrice() {
		return this.price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDesc() {
		return this.desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Product(int price, String desc) {
		this.price = price;
		this.desc = desc;
	}

}