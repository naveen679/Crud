package com.example.logger;

import org.springframework.http.HttpHeaders;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Test {
	private static final Logger LOGGER = LoggerFactory.getLogger(Test.class);

	
	RestTemplate restTemplate=new RestTemplate();
	@Autowired
	List<PostModel> pm;
	@Autowired
	PostModel ps;
	
	

	@RequestMapping(value = "/posts")
	public ResponseEntity<PostModel[]> getProductList() {
		
		
		  String uri = "https://jsonplaceholder.typicode.com/posts/"; 
		  RestTemplate restTemplate = new RestTemplate(); 
		  
		  ResponseEntity<PostModel[]> responseEntity = restTemplate.getForEntity(uri, PostModel[].class);		 
		 return responseEntity;
		//LOGGER.info("Getting posts  --");
		/*
		 * HttpHeaders headers = new HttpHeaders();
		 * headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON)); HttpEntity
		 * <String> entity = new HttpEntity<String>(headers); return
		 * restTemplate.exchange("https://jsonplaceholder.typicode.com/posts",HttpMethod
		 * .GET, entity, String.class).getBody();
		 */
		  
		 }
	@RequestMapping(value = "/posts/{id}")
	public ResponseEntity<PostModel> getProductLis(@PathVariable()int id) 
	{
		
		  Map<String,Integer> params = new HashMap<String,Integer>();
		  params.put("id",id);
		  String uri = "https://jsonplaceholder.typicode.com/posts/{id}"; 
		  RestTemplate restTemplate = new RestTemplate(); 
		  ResponseEntity<PostModel> responseEntity = restTemplate.getForEntity(uri, PostModel.class,params);	
		  
		 return responseEntity;
	}


	@RequestMapping("/test")
	public String test() {
		LOGGER.info("Application started --");
		LOGGER.warn("ERROR OCCURED");
		return "Hello world";
	}

	@RequestMapping("/error1")
	public String tes() {

		LOGGER.warn("ERROR OCCURED");
		return "Hello";
	}


}
