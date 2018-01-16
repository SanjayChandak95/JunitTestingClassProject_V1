package com.ing.billing.services;	
import java.sql.SQLException;
import java.util.List;

import com.ing.billing.beans.Bill;
import com.ing.billing.beans.Customer;
import com.ing.billing.beans.Plan;
import com.ing.billing.beans.PostpaidAccount;
import com.ing.billing.daoservices.BillingDAOServices;
import com.ing.billing.daoservices.BillingDAOServicesImpl;
import com.ing.billing.exceptions.BillDetailsNotFoundException;
import com.ing.billing.exceptions.BillingServicesDownException;
import com.ing.billing.exceptions.CustomerDetailsNotFoundException;
import com.ing.billing.exceptions.InvalidBillMonthException;
import com.ing.billing.exceptions.PlanDetailsNotFoundException;
import com.ing.billing.exceptions.PostpaidAccountNotFoundException;
public class BillingServicesImpl implements BillingServices {

	BillingDAOServices BillingDAOServices = new BillingDAOServicesImpl();
	@Override
	public List<Plan> getPlanAllDetails() throws BillingServicesDownException, PlanDetailsNotFoundException {
		List<Plan> plans = BillingDAOServices.getAllPlans();
		if(plans == null) throw new PlanDetailsNotFoundException("No Plan Available!");
		return plans;
		
	}

	@Override
	public long openPostpaidMobileAccount(int customerID, int planID)
			throws PlanDetailsNotFoundException, CustomerDetailsNotFoundException, BillingServicesDownException {
		// TODO Auto-generated method stub
		
		return 0;
	}

	@Override
	public double generateMonthlyMobileBill(int customerID, long mobileNo, String billMonth, int noOfLocalSMS,
			int noOfStdSMS, int noOfLocalCalls, int noOfStdCalls, int internetDataUsageUnits)
			throws CustomerDetailsNotFoundException, PostpaidAccountNotFoundException, InvalidBillMonthException,
			BillingServicesDownException, PlanDetailsNotFoundException, BillDetailsNotFoundException {
				return internetDataUsageUnits;
		//Do it, it is wrong
	}
	

	@Override
	public Customer getCustomerDetails(int customerID)
			throws CustomerDetailsNotFoundException, BillingServicesDownException {
		Customer customer = BillingDAOServices.getCustomer(customerID);
		if(customer == null) throw new CustomerDetailsNotFoundException("No customer available with id "+customerID);
		return customer;
	}

	@Override
	public List<Customer> getAllCustomerDetails() throws BillingServicesDownException, CustomerDetailsNotFoundException {
		List<Customer> customers = BillingDAOServices.getAllCustomers();
		if(customers == null) throw new CustomerDetailsNotFoundException("No customer available");
		return customers;
	}

	@Override
	public PostpaidAccount getPostPaidAccountDetails(int customerID, long mobileNo)
			throws CustomerDetailsNotFoundException, PostpaidAccountNotFoundException, BillingServicesDownException {
		// TODO Auto-generated method stub
		PostpaidAccount postpaidAccount = BillingDAOServices.getCustomerPostPaidAccount(customerID, mobileNo);
		if(postpaidAccount == null) throw new PostpaidAccountNotFoundException("Account not exist!");
		return postpaidAccount;
	}

	@Override
	public List<PostpaidAccount> getCustomerAllPostpaidAccountsDetails(int customerID)
			throws CustomerDetailsNotFoundException, BillingServicesDownException, PostpaidAccountNotFoundException {
		// TODO Auto-generated method stub
		List<PostpaidAccount> postpaidAccounts = BillingDAOServices.getCustomerPostPaidAccounts(customerID);
		if(postpaidAccounts == null) throw new PostpaidAccountNotFoundException("Account not exist!");
		return postpaidAccounts;
	}

	@Override
	public Bill getMobileBillDetails(int customerID, long mobileNo, String billMonth)
			throws CustomerDetailsNotFoundException, PostpaidAccountNotFoundException, InvalidBillMonthException,
			BillDetailsNotFoundException, BillingServicesDownException {
		// TODO Auto-generated method stub
		Bill bill = BillingDAOServices.getMonthlyBill(customerID, mobileNo, billMonth);
		if(bill == null ) throw new BillDetailsNotFoundException("Bill is not found");
		return bill;
	}

	@Override
	public List<Bill> getCustomerPostPaidAccountAllBillDetails(int customerID, long mobileNo)
			throws CustomerDetailsNotFoundException, PostpaidAccountNotFoundException, BillingServicesDownException, BillDetailsNotFoundException {
		// TODO Auto-generated method stub
		List<Bill> bills = BillingDAOServices.getCustomerPostPaidAccountAllBills(customerID, mobileNo);
		if(bills == null ) throw new BillDetailsNotFoundException("Bill is not found");
		return bills;
		
	}

	@Override
	public boolean changePlan(int customerID, long mobileNo, int planID) throws CustomerDetailsNotFoundException,
			PostpaidAccountNotFoundException, PlanDetailsNotFoundException, BillingServicesDownException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean closeCustomerPostPaidAccount(int customerID, long mobileNo)
			throws CustomerDetailsNotFoundException, PostpaidAccountNotFoundException, BillingServicesDownException {
		// TODO Auto-generated method stub
		boolean closeAccount = BillingDAOServices.deletePostPaidAccount(customerID, mobileNo);
		if(closeAccount == false) throw new CustomerDetailsNotFoundException("Customer already not exist");
		return closeAccount;
	}

	@Override
	public boolean deleteCustomer(int customerID)
			throws BillingServicesDownException, CustomerDetailsNotFoundException {
		// TODO Auto-generated method stub
		boolean deleteCustomer = BillingDAOServices.deleteCustomer(customerID);
		if(deleteCustomer == false) throw new CustomerDetailsNotFoundException("Customer already not exist");
		return deleteCustomer;
	}

	@Override
	public Plan getCustomerPostPaidAccountPlanDetails(int customerID, long mobileNo)
			throws CustomerDetailsNotFoundException, PostpaidAccountNotFoundException, BillingServicesDownException,
			PlanDetailsNotFoundException {
		// TODO Auto-generated method stub
		Plan plan = BillingDAOServices.getPlanDetails(customerID, mobileNo);
		if(plan == null) throw new CustomerDetailsNotFoundException("Customer is Not available");
		return plan;
	}

	@Override
	public Customer acceptCustomerDetails(Customer customer) throws BillingServicesDownException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean authenticateCustomer(Customer customer)
			throws CustomerDetailsNotFoundException, BillingServicesDownException {
		// TODO Auto-generated method stub
		return false;
	}
		
	
	}
