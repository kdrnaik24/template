package com.cybage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cybage.model.Cricket;

import com.cybage.service.UserService;

@RestController
	public class HelloWorldRestController {
	 
	    @Autowired
	    UserService userService; 
	 
	  
	 
	 @RequestMapping(value = "/PlayerName/{name}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	    public  Cricket getPlayerDetails(@PathVariable("name") String name) {
	        System.out.println(name);
			 //userService=new UserService();
			Cricket details=userService.getPlayerDetails(name);
			return details;
	    }
	 
	 /*@RequestMapping(value = "/user/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	    public ResponseEntity<User> getUser(@PathVariable("id") long id) {
	        System.out.println("Fetching User with id " + id);
	        User user = userService.findById(id);
	        if (user == null) {
	            System.out.println("User with id " + id + " not found");
	            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
	        }
	        return new ResponseEntity<User>(user, HttpStatus.OK);
	    }*/
	     
		 
	   
	 
	}

