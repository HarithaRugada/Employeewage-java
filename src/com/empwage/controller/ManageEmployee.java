package com.empwage.controller;

import com.empwage.model.*;

public class ManageEmployee
{
	public boolean EmployeePresent(Employee employee)
	{

		int presentStatus=(int)(Math.random()*10)%2;
		System.out.println(presentStatus);
		employee.setIsPresent(true);

		if (presentStatus==1)
			employee.setIsPresent(true);
		else
			employee.setIsPresent(false);

		return employee.getIsPresent();

	}

	public int EmployeeDailyWage(Employee employee)
	{

		//boolean isPresent=EmployeePresent(employee);
		employee.setDailyWage(0);
		if(employee.getIsPresent()==true)
			employee.setDailyWage(employee.getWagePerHour()*employee.getWorkHours());
		else
			employee.setDailyWage(0);
		return employee.getDailyWage();

	}
}