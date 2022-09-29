package com.mav.bean;

public class Furniture {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean getShipping() {
		return isShipping;
	}
	public void setShipping(boolean isShipping) {
		this.isShipping = isShipping;
	}
	public String getDateOfManufacture() {
		return dateOfManufacture;
	}
	public void setDateOfManufacture(String dateOfManufacture) {
		this.dateOfManufacture = dateOfManufacture;
	}
	private String material;
	private int price;
	private boolean isShipping;
	private String dateOfManufacture;

}
