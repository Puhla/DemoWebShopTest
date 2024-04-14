package com.demoWebShop.models;

public class Contact {
private String firstname;
private String lastname;
private  String email;
private  String password;
private String confirmPassword;

public Contact setFirstname (String firstname) {
	this.firstname = firstname;
	return this;
}

public Contact setLastname (String lastname) {
	this.lastname = lastname;
	return this;
}

public Contact setEmail (String email) {
	this.email = email;
	return this;
}

public Contact setPassword (String password) {
	this.password = password;
	return this;
}

public Contact setConfirmPassword (String confirmPassword) {
	this.confirmPassword = confirmPassword;
	return this;
}

public String getFirstname () {
	return firstname;
}

public String getLastname () {
	return lastname;
}

public String getEmail () {
	return email;
}

public String getPassword () {
	return password;
}

public String getConfirmPassword () {
	return confirmPassword;
}
}
