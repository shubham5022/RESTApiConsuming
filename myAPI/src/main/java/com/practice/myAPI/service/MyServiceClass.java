package com.practice.myAPI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.myAPI.model.MyDetails;
import com.practice.myAPI.repository.ExtractData;

@Service
public class MyServiceClass {

	@Autowired
	ExtractData operations;

	public void addEmpDetails(List<MyDetails> list) {
		operations.saveAll(list);
	}

	public void deleteUser(int id) {

		operations.deleteById(id);
	}

	public List<MyDetails> getDetails() {
		List<MyDetails> list = operations.findAll();
		return list;
	}

public void updateData(MyDetails updatedDetail) {
		
		operations.save(updatedDetail);
		
	}

}
