package com.example.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.ExceptionModel;
import com.example.demo.model.DemoModel;
import com.example.demo.model.Address;
import com.example.demo.service.ServiceClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


//pushing second test to dev
@RestController
public class DemoController {
	private static final Logger LOGGER=LoggerFactory.getLogger(DemoController.class);

	@Autowired
	ServiceClass sv;
	
	
	@Autowired
	DemoModel dm;
	@GetMapping("/getemployees")
	public Object getemployees()
	{
		DemoModel dl=sv.getEmployee();
		
		LOGGER.info("APPLICATION STARTED RUNNING");
		//To Create Nested Json Object Logic
		 HashMap<String,Object> map=new LinkedHashMap<>();
		 map.put("teamlead","naveen");
		 map.put("designation","cde");
		 map.put("company","cognizant");
		 map.put("Employees",dl);
		 //map.put("Address",ld);
		
		
	    return dl;
	}
	@PostMapping("/postemployees")
	public DemoModel postemployees(@RequestBody DemoModel dm)
	{
		if(dm.getEmpname()=="")
		{
			throw new NullPointerException();
		}
		DemoModel dl=sv.postemployee(dm);
	  return dl;   
	}
	@GetMapping("/employee/{id}")
	public String byid(@PathVariable("id")int id)
	{
		if(id<=0||id>100)
		{
		  throw new ExceptionModel();
		}
		
		return "correct input";
	}
}
