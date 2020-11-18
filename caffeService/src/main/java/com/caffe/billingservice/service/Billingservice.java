package com.caffe.billingservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caffe.billingservice.dao.BillingDAO;
import com.caffe.billingservice.dto.CaffeMenu;

@Service
public class Billingservice implements BillingserviceInterface {
	
	@Autowired
	private BillingDAO billingDAO;
	

	public Billingservice(BillingDAO billingDAO) {
		super();
		this.billingDAO = billingDAO;
	}



	@Override
	public double calculateBilling(List<CaffeMenu> order) {
		
		return billingDAO.calculateBilling(order);
	}

}
