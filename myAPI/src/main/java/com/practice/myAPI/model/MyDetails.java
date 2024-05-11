package com.practice.myAPI.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class MyDetails {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;
	
	@Column
	private String name;
	@Column
	private String occupation;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public MyDetails(int id, String name, String occupation) {
		super();
		Id = id;
		this.name = name;
		this.occupation = occupation;
	}
	public MyDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "MyDetails [Id=" + Id + ", name=" + name + ", occupation=" + occupation + "]";
	}
	
	
	
	

}
