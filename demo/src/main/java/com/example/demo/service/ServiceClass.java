package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repo.AddRepo;
import com.example.demo.Repo.RepositoryClass;
import com.example.demo.model.DemoModel;
import com.example.demo.model.Address;


@Service
public class ServiceClass{
	
	@Autowired
	DemoModel dm;
	@Autowired
	Address ad;
	@Autowired
	RepositoryClass rp;
	
	@Autowired
	AddRepo ar;

	
	public DemoModel getEmployee() {
		// TODO Auto-generated method stub
		 dm.setEmpid(121);
		 dm.setDepartment("cde");
		 dm.setSalary(30000);
		 dm.setEmpname("Naveen");
			ad.setHno(12);
			ad.setStrname("kummari");
			ad.setVname("kairawadi");
			ad.setStatename("ap");
		 dm.setAdress(ad);
		
		return dm;
	}
	public Address getAddress() {
		// TODO Auto-generated method stub
		ad.setHno(12);
		ad.setStrname("kummari");
		ad.setVname("kairawadi");
		ad.setStatename("ap");
		 
		 
		
		return ad;
	}

	
	public DemoModel postemployee(DemoModel dm) {
		
		return rp.save(dm);
	}
	
	

}
