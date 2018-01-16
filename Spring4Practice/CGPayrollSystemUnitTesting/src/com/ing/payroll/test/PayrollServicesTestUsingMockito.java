package com.ing.payroll.test;

import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;

import com.ing.payroll.beans.Associate;
import com.ing.payroll.beans.BankDetails;
import com.ing.payroll.beans.Salary;
import com.ing.payroll.daoservices.PayrollDAOServices;
import com.ing.payroll.exception.AssociateDetailsNotFoundException;
import com.ing.payroll.services.PayrollServices;
import com.ing.payroll.services.PayrollServicesImpl;

public class PayrollServicesTestUsingMockito {
	private static PayrollServices payrollServices;
	private static PayrollDAOServices mockDaoServices;
	private ArrayList<Associate> associates = null;
	private Associate associate3 = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		mockDaoServices = Mockito.mock(PayrollDAOServices.class);
		payrollServices = new PayrollServicesImpl(mockDaoServices);
	}

	@Before
	public void setUpTestData() throws Exception {
		Associate associate1 = new Associate(1000, 78000, "Intkhab", "Ahmed", "Development", "Senior Analyst",
				"NHDDJ8456N", "intkhab@gmail.com", new Salary(44000, 2000, 2000),
				new BankDetails(12345, "CITI", "CITI0000005"));
		Associate associate2 = new Associate(1001, 60000, "Intu", "Ahmed", "Training", "Manager",
				"MJGGS4521N", "intu@gmail.com", new Salary(34000, 2000, 2000),
				new BankDetails(45632, "CITI", "CITI0000005"));

		associates = new ArrayList<Associate>();
		associates.add(associate1);
		associates.add(associate2);
		
		associate2 = new Associate(1002, 60000, "Abhishek", "Kumar", "Training", "Coordinator",
				"HGJJK6743H", "abhishek@gmail.com", new Salary(36000, 2000, 2000),
				new BankDetails(78965, "CITI", "CITI0000005"));
		
		Mockito.when(mockDaoServices.getAssociate(1000)).thenReturn(associate1);
		Mockito.when(mockDaoServices.getAssociate(1001)).thenReturn(associate2);
		Mockito.when(mockDaoServices.getAssociate(1234)).thenReturn(null);
		Mockito.when(mockDaoServices.getAssociates()).thenReturn(associates);
	}

	@Test(expected = AssociateDetailsNotFoundException.class)
	public void testCalculateNetSalaryForInvalidId() {
		fail("Not yet implemented");
	}

	@Test
	public void testCalculateNetSalaryForValidId() {
		fail("Not yet implemented");
	}

	@Test(expected = AssociateDetailsNotFoundException.class)
	public void testGetAssociateDetailsForInvalidId() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAssociateDetailsForValidId() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAllAssociatesDetails() {
		fail("Not yet implemented");
	}

	@After
	public void tearDownMockTestEnv() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		payrollServices = null;
	}

}
