package com.caffe.billingservice.dao;

import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.caffe.billingservice.dto.CaffeMenu;
import com.caffe.billingservice.util.MenuPrice;

@Repository
public class BillingDAO implements BillingDAOInterface {

	public BillingDAO() {
		super();
		
	}

	@Override
	public double calculateBilling(List<CaffeMenu> order) {

		Iterator<CaffeMenu> litr = order.iterator();
		CaffeMenu item = null;
		boolean menuTypeDrink = true;
		double price = 0.0;
		
		while (litr.hasNext()) {
			item = litr.next();
			switch (item.getMenuName().toUpperCase()) {
			case "COLA":
					if (item.getMenuTemp().equals("COLD"))
					item.setMenuPrice(MenuPrice.COLA_COLD);
					break;
			case "COFFE":
					if (item.getMenuTemp().equals("HOT"))
					item.setMenuPrice(MenuPrice.COFFE_HOT);
					break;
			case "CHESE_SANDWICH":
				if (item.getMenuTemp().equals("COLD"))
					item.setMenuPrice(MenuPrice.CHESE_SANDWICH_COLD);
					menuTypeDrink = false;
					break;
			case "STEAK_SANDWICH":
					if(item.getMenuTemp().equals("HOT"))
					item.setMenuPrice(MenuPrice.STEAK_SANDWICH_HOT);
					menuTypeDrink = false;
					break;
			default: break;
			
			}
			price = price + item.getMenuPrice();

		}
		//include service charge
		if(!menuTypeDrink) {
			price = price + price*0.1;
		}

		return price;
	}
}

