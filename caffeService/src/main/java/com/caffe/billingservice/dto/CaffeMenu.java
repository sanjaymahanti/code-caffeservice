package com.caffe.billingservice.dto;

public class CaffeMenu {

	private String menuName;
	
	private String menuType;
	
	private double menuPrice;
	
	private String menuTemp;

	
	public CaffeMenu(String menuName, String menuType, double menuPrice, String menuTemp) {
		super();
		this.menuName = menuName;
		this.menuType = menuType;
		this.menuPrice = menuPrice;
		this.menuTemp = menuTemp;
	}

	
	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getMenuType() {
		return menuType;
	}

	public void setMenuType(String menuType) {
		this.menuType = menuType;
	}

	public double getMenuPrice() {
		return menuPrice;
	}

	public void setMenuPrice(double menuPrice) {
		this.menuPrice = menuPrice;
	}

	public String getMenuTemp() {
		return menuTemp;
	}

	public void setMenuTemp(String menuTemp) {
		this.menuTemp = menuTemp;
	}
	
	
	
}
