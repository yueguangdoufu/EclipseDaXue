package com.start.pojo;

public class Product {
	
	private int id;
	private String name;
	private String bar_code;
	private float price;
	private String producer;
	
	
	
	public Product() {
		
	}
	public Product(int id, String name, String bar_code, float price, String producer) {
	
		this.id = id;
		this.name = name;
		this.bar_code = bar_code;
		this.price = price;
		this.producer = producer;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBar_code() {
		return bar_code;
	}
	public void setBar_code(String bar_code) {
		this.bar_code = bar_code;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	
	

}
