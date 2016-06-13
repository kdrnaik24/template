package com.cybage.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cybage.adapter.CricketAdaptor;
import com.cybage.model.Cricket;


@Service("userService")
@Transactional
public class UserServiceImpl implements UserService
{
	/*public User findById(long id)
	{
		User obj=new User();
		if(id==1)
		{
		obj.setId(10);
		obj.setName("jitan");
		return obj;
		}
		return null;
	}*/

	@Override
	public Cricket getPlayerDetails(String name)
	{
		CricketAdaptor adaptor=new CricketAdaptor();
		Cricket obj=adaptor.getPlayerDetail(name);
		return obj;
	}
}
