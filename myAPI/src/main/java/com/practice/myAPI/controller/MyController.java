package com.practice.myAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.practice.myAPI.model.MyDetails;
import com.practice.myAPI.service.MyServiceClass;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
public class MyController {

	@Autowired
	MyServiceClass service;
	
	@PostMapping("addDetails")
	public void addDetails(@RequestBody List<MyDetails> list) {
		
		service.addEmpDetails(list);
	}
	
	@DeleteMapping("deleteById/{id}")
	public void deleteById(@PathVariable int id) {
		service.deleteUser(id);
	}
	
	@GetMapping("getDetails")
	public List<MyDetails> getAllDetails (){
		List<MyDetails> list = service.getDetails();
		
		return list;
	}
	
	@PutMapping("update")
	public void modifyDeatils(  @RequestBody MyDetails updatedDetail) {
		
		service.updateData(updatedDetail);
		
		
	}
}
