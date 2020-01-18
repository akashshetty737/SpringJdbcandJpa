package com.lti.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("address")
@Scope(scopeName="prototype")
@Entity
@Table(name="address")
public class Address {
	@Id
	@Column(name="address_id")
	private int addressId;
	@Column(name="city")
	private String city;
	@Column(name="pin")
	private String pin;
	
	public Address() {
//		System.out.println("----Address-----");
	}

	public Address(int addressId, String city, String pin) {
//		System.out.println("----Address(-,-,-)-----");
		this.addressId = addressId;
		this.city = city;
		this.pin = pin;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", city=" + city + ", pin=" + pin + "]";
	}
	
	
}
