package com.ing.billing.beans;
import java.util.HashMap;
import java.util.Map;
public class PostpaidAccount {
	private long mobileNo;
	private Plan plan;
	private Customer customer;
	private Map<Integer, Bill> bills = new HashMap<>();
}