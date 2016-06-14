package com.cybage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.cybage.services.UserServices;

@RestController
public class CountryController 
{
	@Autowired
	UserServices userService;
	
	@RequestMapping(value = "/CountryName/{country}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public  String getCountryDetails(@PathVariable("country") String country) 
    {
        System.out.println(country);
        String details=userService.getCountryDetails(country);
		return details;
    }
}
