package com.cybage.adapter;

import org.springframework.web.client.RestTemplate;

import com.cybage.model.Cricket;

public class CricketAdaptor
{
	public Cricket getPlayerDetail(String name)
	{
	
	    String uri="http://localhost:8043/thirdpart/rest/player/name/"+name;
	    RestTemplate restTemplate = new RestTemplate();
	    Cricket obj = restTemplate.getForObject(uri, Cricket.class);
	    System.out.println(obj);
	    return obj;
	}

}
