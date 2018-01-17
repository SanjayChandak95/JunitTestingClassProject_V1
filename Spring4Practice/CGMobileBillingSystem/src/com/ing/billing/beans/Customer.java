package com.ing.billing.beans;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Customer {
	private int customerID;
	private String firstName, lastName, emailID, dateOfBirth,password;
	private Map<Long, PostpaidAccount> postpaidAccounts = new HashMap<>();
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int customerID, String firstName, String lastName,
			String emailID, String dateOfBirth, String password,
			Map<Long, PostpaidAccount> postpaidAccounts) {
		super();
		this.customerID = customerID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailID = emailID;
		this.dateOfBirth = dateOfBirth;
		this.password = password;
		this.postpaidAccounts = postpaidAccounts;
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
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
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Map<Long, PostpaidAccount> getPostpaidAccounts() {
		return postpaidAccounts;
	}
	public void addPostpaidAccounts(long key, PostpaidAccount postpaidAccounts) {
		this.postpaidAccounts.put(key, postpaidAccounts);
	}
	
	
}