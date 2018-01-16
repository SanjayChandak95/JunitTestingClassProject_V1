package com.ing.billing.beans;
import java.util.Map;
public class Plan {
	private int planID;
	private int monthlyRental, freeLocalCalls, freeStdCalls, freeLocalSMS, freeStdSMS, freeInternetDataUsageUnits;
	private float localCallRate, stdCallRate, localSMSRate, stdSMSRate, internetDataUsageRate;
	private String planCircle, planName;
	private Map<Long, PostpaidAccount> accounts;
	

}