package com.ynovgroup.patientwse.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import com.ynovgroup.patientwse.models.Person;

public class RestDemoController {

	@GetMapping("/getUserDetails")
	public Person getExample(@RequestHeader() String name) {
		return new Person(name, "30", "Dallas");
	}                                           

	@PostMapping("/createUser")
	public Person getExample(@RequestBody Person person) {
		return person;
	}  
	
	@PutMapping("/updateUser")
	public String putExample(@RequestBody Person person) {
		return "Updated user "+person.getName();
	} 
	
	@DeleteMapping("/deleteUser")
	public String deleteExample(@RequestHeader String name) {
		return "Deleted user "+name;
	} 
}
