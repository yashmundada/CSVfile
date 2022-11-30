package com.mobiloitte.com.serviceimpl;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobiloitte.com.dao.Csvdao;
import com.mobiloitte.com.model.Csvmodel;
import com.mobiloitte.com.service.Csvinterface;
@Service
public class Csvserviceimpl implements Csvinterface{
	
	@Autowired
	private Csvdao csvdao;
	String line="";
	
	public void saveCustomerData() {
		try {
			BufferedReader br=new BufferedReader(new FileReader("src/main/resources/pc.csv"));
			while ((line=br.readLine())!=null) {
				String[]data = line.split(",");
				Csvmodel csvmodel=new Csvmodel();
				
				csvmodel.setName(data[0]);
				csvmodel.setIssue(data[1]);
				csvmodel.setIssueid(data[2]);
				csvmodel.setAge(data[3]);
				csvdao.save(csvmodel);
				}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
