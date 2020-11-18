package com.caffe.billingservice.dao;

import java.util.List;

import com.caffe.billingservice.dto.CaffeMenu;

public interface BillingDAOInterface {

	public double calculateBilling(List<CaffeMenu> menuSelected);
}
