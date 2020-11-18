package com.caffe.billingservice.service;

import java.util.List;
import com.caffe.billingservice.dto.CaffeMenu;

public interface BillingserviceInterface {

	public double calculateBilling(List<CaffeMenu> menuSelected);
}
