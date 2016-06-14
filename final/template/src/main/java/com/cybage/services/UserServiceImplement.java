package com.cybage.services;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cybage.adaptor.CountryAdaptor;



@Service("userService")
@Transactional
public class UserServiceImplement implements UserServices
{
	

	@Override
	public String getCountryDetails(String country) 
	{
	
		CountryAdaptor adaptor=new CountryAdaptor();
		String obj=adaptor.getCountryDetail(country);
		System.out.println(obj);
		return obj;
	}
}	
	

