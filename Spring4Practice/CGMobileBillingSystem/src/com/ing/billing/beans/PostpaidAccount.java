package com.ing.billing.beans;
import java.util.HashMap;
import java.util.Map;
public class PostpaidAccount {
	private long mobileNo;
	private Plan plan;
	private Customer customer;
	private Map<Integer, Bill> bills = new HashMap<>();
	public PostpaidAccount(long mobileNo, Plan plan, Customer customer,
			Map<Integer, Bill> bills) {
		super();
		this.mobileNo = mobileNo;
		this.plan = plan;
		this.customer = customer;
		this.bills = bills;
	}
	public PostpaidAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public Plan getPlan() {
		return plan;
	}
	public void setPlan(Plan plan) {
		this.plan = plan;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Map<Integer, Bill> getBills() {
		return bills;
	}
	public void setBills(Map<Integer, Bill> bills) {
		this.bills = bills;
	}
	
}