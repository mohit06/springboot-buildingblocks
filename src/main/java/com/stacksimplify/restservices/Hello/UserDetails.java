package com.stacksimplify.restservices.Hello;

public class UserDetails {
	
	
	
	
	public UserDetails(String firstName, String lastNAme, String city) {
	
		this.firstName = firstName;
		this.lastNAme = lastNAme;
		this.city = city;
	}
	
	private String firstName;
	private String lastNAme;
	private String city;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastNAme() {
		return lastNAme;
	}
	public void setLastNAme(String lastNAme) {
		this.lastNAme = lastNAme;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "UserDetails [firstName=" + firstName + ", lastNAme=" + lastNAme + ", city=" + city + "]";
	}
	

	
	
}
