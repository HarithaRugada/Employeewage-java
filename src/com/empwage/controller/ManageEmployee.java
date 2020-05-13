package com.empwage.controller;

import com.empwage.model.*;

public class ManageEmployee
{
	public boolean EmployeePresent(Employee employee)
	{

		int presentStatus=(int)(Math.random()*10)%2;
		System.out.println(presentStatus);

		if (presentStatus==1)
			employee.setIsPresent(true);
		else
			employee.setIsPresent(false);

		return employee.getIsPresent();

	}

}
