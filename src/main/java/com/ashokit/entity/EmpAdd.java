package com.ashokit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Address-info")
public class EmpAdd {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer aid;
	private String city;
	private String state;
	private String countrry;
	
	
	private Integer eid;
	
	
	
	public Integer getAid() {
		return aid;
	}
	public void setAid(Integer aid) {
		this.aid = aid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountrry() {
		return countrry;
	}
	public void setCountrry(String countrry) {
		this.countrry = countrry;
	}
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	@Override
	public String toString() {
		return "EmpAdd [aid=" + aid + ", city=" + city + ", state=" + state + ", countrry=" + countrry + ", eid=" + eid
				+ "]";
	}
	

}
