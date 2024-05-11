package com.practice.myAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.myAPI.model.MyDetails;

@Repository
public interface ExtractData extends JpaRepository<MyDetails, Integer> {

}
