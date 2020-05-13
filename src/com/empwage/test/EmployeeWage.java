package com.empwage.test;

import com.empwage.model.*;
import com.empwage.controller.*;

import java.util.*;

public class EmployeeWage
{

	public static void main(String[] args)
	{

		System.out.println("Welcome to Employee Wage Computation Program");
		Random random=new Random();
		Employee employee=new Employee(20,(int)(Math.random()*10));
		ManageEmployee manageemployee=new ManageEmployee();
		System.out.println(manageemployee.EmployeePresent(employee) ? "Employee is Present" : "Employee is Absent");
		System.out.println("Daily wage of employee is " +manageemployee.EmployeeDailyWage(employee));
		System.out.println(manageemployee.EmployeeParttime(employee) ? "Employee is Part-time" : "Employee is Full-time");
	}

}
