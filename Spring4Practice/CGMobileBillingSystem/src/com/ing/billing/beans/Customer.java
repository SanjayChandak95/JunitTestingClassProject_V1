package com.ing.billing.beans;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Customer {
	private int customerID;
	private String firstName, lastName, emailID, dateOfBirth,password;
	private Map<Long, PostpaidAccount> postpaidAccounts = new HashMap<>();
	
}