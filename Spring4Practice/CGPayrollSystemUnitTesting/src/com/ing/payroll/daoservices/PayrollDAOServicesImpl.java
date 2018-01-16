package com.ing.payroll.daoservices;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import com.ing.payroll.beans.Associate;

public class PayrollDAOServicesImpl implements PayrollDAOServices {
	
	public  static HashMap<Integer, Associate> associates = new HashMap<>();
	public static int ASSOCIATE_ID_COUNTER =1000;

	@Override
	public int insertAssociate(Associate associate) throws SQLException {
		
		return 0;
	}

	@Override
	public boolean updateAssociate(Associate associate) throws SQLException {
	
		return false;
	}

	@Override
	public boolean deleteAssciate(int associateId) throws SQLException {
		
		return false;
	}

	@Override
	public Associate getAssociate(int associateId) throws SQLException {
		
		return null;
	}

	@Override
	public List<Associate> getAssociates() throws SQLException {
		
		return null;
	}
}
