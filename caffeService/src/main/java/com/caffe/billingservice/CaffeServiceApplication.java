package com.caffe.billingservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.caffe.billingservice.dto.CaffeMenu;
import com.caffe.billingservice.service.Billingservice;

@SpringBootApplication
public class CaffeServiceApplication {
	
	
	public static void main(String[] args) {
		
		List<CaffeMenu> order = new ArrayList<CaffeMenu>();
		//order.add(new CaffeMenu("COLA","Drinks",0.0,"COLD"));
		//order.add(new CaffeMenu("COFFE","Drinks",0.0,"HOT"));
		order.add(new CaffeMenu("STEAK_SANDWICH","Food",0.0,"HOT"));
		order.add(new CaffeMenu("CHESE_SANDWICH","Food",0.0,"COLD"));
		
		ApplicationContext applicationContext = SpringApplication.run(CaffeServiceApplication.class, args);
		Billingservice service = applicationContext.getBean(Billingservice.class);
        double billingPrice = service.calculateBilling(order);
        System.out.println("Billing Price is>> " + billingPrice +"$");
	}

}
