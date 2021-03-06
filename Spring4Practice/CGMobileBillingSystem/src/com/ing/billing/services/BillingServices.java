package com.ing.billing.services;
import java.util.List;

import com.ing.billing.beans.Bill;
import com.ing.billing.beans.Customer;
import com.ing.billing.beans.Plan;
import com.ing.billing.beans.PostpaidAccount;
import com.ing.billing.exceptions.BillDetailsNotFoundException;
import com.ing.billing.exceptions.BillingServicesDownException;
import com.ing.billing.exceptions.CustomerDetailsNotFoundException;
import com.ing.billing.exceptions.InvalidBillMonthException;
import com.ing.billing.exceptions.PlanDetailsNotFoundException;
import com.ing.billing.exceptions.PostpaidAccountNotFoundException;

public interface BillingServices {
	
	List<Plan> getPlanAllDetails() throws BillingServicesDownException, PlanDetailsNotFoundException;
	
	//int acceptCustomerDetails(String firstName, String lastName, String emailID, String dateOfBirth, String billingAddressCity, String billingAddressState, int billingAddressPinCode, String homeAddressCity, String homeAddressState, int homeAddressPinCode) throws BillingServicesDownException;

	long openPostpaidMobileAccount(int customerID, int planID) 
			throws PlanDetailsNotFoundException,CustomerDetailsNotFoundException,
			BillingServicesDownException;
	
	double  generateMonthlyMobileBill(int customerID, long mobileNo, String billMonth, int noOfLocalSMS, int noOfStdSMS, int noOfLocalCalls, int noOfStdCalls,int internetDataUsageUnits) 
			throws CustomerDetailsNotFoundException, PostpaidAccountNotFoundException, 
			InvalidBillMonthException, BillingServicesDownException, 
			PlanDetailsNotFoundException, BillDetailsNotFoundException;
	
	Customer getCustomerDetails(int customerID)
			throws CustomerDetailsNotFoundException, BillingServicesDownException;
	
	List<Customer>  getAllCustomerDetails() throws BillingServicesDownException, CustomerDetailsNotFoundException;
	
	PostpaidAccount getPostPaidAccountDetails(int customerID, long mobileNo) 
			throws CustomerDetailsNotFoundException, 
			PostpaidAccountNotFoundException, 
			BillingServicesDownException;
	
	List<PostpaidAccount> getCustomerAllPostpaidAccountsDetails(int customerID)
			throws CustomerDetailsNotFoundException, BillingServicesDownException, PostpaidAccountNotFoundException;
	
	Bill getMobileBillDetails(int customerID, long mobileNo, String billMonth)
			throws CustomerDetailsNotFoundException, PostpaidAccountNotFoundException, 
			InvalidBillMonthException, BillDetailsNotFoundException, BillingServicesDownException;
	
	List<Bill>   getCustomerPostPaidAccountAllBillDetails(int customerID, long mobileNo) 
			throws CustomerDetailsNotFoundException, PostpaidAccountNotFoundException, 
			BillingServicesDownException, BillDetailsNotFoundException;
	
	boolean changePlan(int customerID, long mobileNo, int planID)
			throws CustomerDetailsNotFoundException, PostpaidAccountNotFoundException, 
			PlanDetailsNotFoundException, BillingServicesDownException;
	
	boolean closeCustomerPostPaidAccount(int customerID, long mobileNo) 
			throws CustomerDetailsNotFoundException, PostpaidAccountNotFoundException, 
			BillingServicesDownException;
	
	boolean deleteCustomer(int customerID) 
			throws BillingServicesDownException, CustomerDetailsNotFoundException;
	
	Plan getCustomerPostPaidAccountPlanDetails(int customerID, long mobileNo) 
			throws CustomerDetailsNotFoundException, PostpaidAccountNotFoundException, 
			BillingServicesDownException, PlanDetailsNotFoundException ;

	Customer acceptCustomerDetails(Customer customer)
			throws BillingServicesDownException;

	

	boolean authenticateCustomer(Customer customer) throws CustomerDetailsNotFoundException, BillingServicesDownException;
}