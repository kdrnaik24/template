package com.cybage.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cybage.model.Cricket;


public interface UserService
{
	public Cricket getPlayerDetails(String name);
}
