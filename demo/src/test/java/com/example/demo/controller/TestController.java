package com.example.demo.controller;

import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.json.JsonParser;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.Address;
import com.example.demo.model.DemoModel;
import com.example.demo.service.ServiceClass;
import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.jupiter.api.*;

@SpringBootTest
public class TestController {
	
	@Autowired
	DemoController dc;
	
	@Autowired
	Address ad;
	
	@Autowired
	DemoModel dm;
	
	@Autowired
	ServiceClass sc;
	@Test
	public void test()
	{
		 Assert.assertEquals("test",dc.testdata());
	}
	@Test
	public void getEmployeesTest()
	{
		 Assert.assertNotNull(dc.getemployees());
	}
	
	@Test
	public void servicem()
	{
		 Assert.assertNotNull(sc.getEmployee());
	}
	@Test
	public void serviceGetAddress() throws JSONException
	{
		   ad=sc.getAddress();
	      JSONObject obj=new JSONObject();
	      obj.put("strname", "kummari");
	      obj.put("vname","kairawadi");
	      obj.put("statename","ap");
	      obj.put("Hno",12);
	      JSONAssert.assertEquals(new Gson().toJson(ad),obj,false);
	}
	@Test
	public void serviceGetEmployees() throws JSONException
	{
		   dm=sc.getEmployee();
		   System.out.println(new Gson().toJson(dm));
	      
	      JSONObject obj2=new JSONObject();
	      obj2.put("strname", "kummari");
	      obj2.put("vname","kairawadi");
	      obj2.put("statename","ap");
	      obj2.put("Hno",12);
	      JSONObject obj1=new JSONObject();
	      obj1.put("empid",121);
	      obj1.put("empname","Naveen");
	      obj1.put("salary",30000);
	      obj1.put("Department","cde");
	      obj1.put("address",obj2);
	      
	      System.out.println(obj1);
	      JSONAssert.assertEquals(new Gson().toJson(dm),obj1,false);
	}
	

}
