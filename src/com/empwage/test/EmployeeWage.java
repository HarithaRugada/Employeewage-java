package com.empwage.test;

import com.empwage.model.*;
import com.empwage.controller.*;

public class EmployeeWage
{

	public static void main(String[] args)
	{

		System.out.println("Welcome to Employee Wage Computation Program");
		Employee employee=new Employee(20,8);
		ManageEmployee manageemployee=new ManageEmployee();
		System.out.println(manageemployee.EmployeePresent(employee) ? "Employee is Present" : "Employee is Absent");
		System.out.println("Daily wage of employee is " +manageemployee.EmployeeDailyWage(employee));
	}

}
