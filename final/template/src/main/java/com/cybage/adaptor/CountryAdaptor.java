package com.cybage.adaptor;

import org.springframework.web.client.RestTemplate;



public class CountryAdaptor {

	

	public String getCountryDetail(String country) 
	{
		String uri="http://localhost:9091/thirdpart/rest/country/cname/"+country;
	    RestTemplate restTemplate = new RestTemplate();
	    String obj = restTemplate.getForObject(uri, String.class);
	    System.out.println(obj);
	    return obj;
		
	}

	
}
