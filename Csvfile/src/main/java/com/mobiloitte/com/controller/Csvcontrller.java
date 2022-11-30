package com.mobiloitte.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mobiloitte.com.service.Csvinterface;

@RestController
public class Csvcontrller {
@Autowired
private Csvinterface csvinterface;
@PostMapping("/feedCustomerData")
public String setDataInDB() {
	csvinterface.saveCustomerData();
	return "saved successfully";
	}
}
