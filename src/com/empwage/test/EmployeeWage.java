package com.empwage.test;

import com.empwage.model.*;
import com.empwage.controller.*;

import java.util.*;

public class EmployeeWage
{

	public static void main(String[] args)
	{

		System.out.println("Welcome to Employee Wage Computation Program");
		Employee employee=new Employee();
                ManageEmployee manageemployee=new ManageEmployee();
		Scanner Sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter your choice");
			System.out.println("1.Check whether employee is present or absent");
			System.out.println("2.Get the daily wage of the employee");
			System.out.println("3.Check whether the employee is working parttime or fulltime");
			System.out.println("4.Exit");
			int choice=Sc.nextInt();
			switch(choice)
			{
				case 1:
					manageemployee.EmployeePresent(employee);
					break;

				case 2:
					manageemployee.EmployeePresent(employee);
					manageemployee.EmployeeDailyWage(employee);
					break;

				case 3:
					manageemployee.EmployeePresent(employee);
					manageemployee.EmployeeParttime(employee);
					break;
				case 4:
					System.exit(0);
					break;

				default:
					System.out.println("Enter valid choice");

			}
		}

	}

}
