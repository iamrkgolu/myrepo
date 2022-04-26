package com.example.rahul.rest_app_with_database.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String firstName;
	private String lastName;
	private String address;
	private String dateOfApp;
	private String discharge;
	private double ammount;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDateOfApp() {
		return dateOfApp;
	}
	public void setDateOfApp(String dateOfApp) {
		this.dateOfApp = dateOfApp;
	}
	public String getDischarge() {
		return discharge;
	}
	public void setDischarge(String discharge) {
		this.discharge = discharge;
	}
	public double getAmmount() {
		return ammount;
	}
	public void setAmmount(double ammount) {
		this.ammount = ammount;
	}
	@Override
	public String toString() {
		return "Patient [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
				+ ", dateOfApp=" + dateOfApp + ", discharge=" + discharge + ", ammount=" + ammount + "]";
	}
	public Patient(int id, String firstName, String lastName, String address, String dateOfApp, String discharge,
			double ammount) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.dateOfApp = dateOfApp;
		this.discharge = discharge;
		this.ammount = ammount;
	}
	public Patient() {
		super();
	}
	
	
}
