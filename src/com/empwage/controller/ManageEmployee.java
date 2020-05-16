package com.empwage.controller;

import com.empwage.model.*;

import java.util.*;

public class ManageEmployee
{
	int wagePerHour=20;
	int workHours=(int)(Math.random()*10)+1;
	public void EmployeePresent(Employee employee)
	{

		int presentStatus=(int)(Math.random()*10)%2;
		System.out.println(presentStatus);
		employee.setIsPresent(true);

		if (presentStatus==1)
		{
			employee.setIsPresent(true);
			System.out.println("Employee is Present");
		}

		else
		{
			employee.setIsPresent(false);
			System.out.println("Employee is Absent");
		}


	}

	public void EmployeeDailyWage(Employee employee)
	{

		employee.setDailyWage(0);

		if(employee.getIsPresent()==true)
		{
			employee.setDailyWage(wagePerHour*workHours);
			System.out.println("Daily wage of employee is " +employee.getDailyWage());
	                System.out.println("Hours Worked "+workHours);
		}

		else
		{
			employee.setDailyWage(0);
			System.out.println("Daily wage of employee is zero as the employee is absent");
        	        System.out.println("Hours Worked is also zero");
		}

	}

	public void EmployeeParttime(Employee employee)
	{

		if(employee.getIsPresent()==true)
		{

			if(workHours<=8)
			{
				employee.setIsParttime(true);
				System.out.println("Partime employee");
				System.out.println("Hours Worked "+workHours);
			}

			else
			{
				employee.setIsParttime(false);
				System.out.println("Fulltime employee");
				System.out.println("Hours Worked "+workHours);
			}
		}

		else
			System.out.println("Neither parttime nor fulltime since the employee is absent");


	}

	public void EmployeeMonthWage(Employee employee)
	{
		employee.setMonthWage(0);
		for(int i=1;i<=20;i++)
		{
			int presentStatus=(int)(Math.random()*10)%2;
			int workHours=(int)(Math.random()*10)+1;
		        if (presentStatus==1)
			{
				//int workHour=(int)(Math.random()*10)+1;
				System.out.println("Employee is present on Day "+i);
				System.out.println("Hours Worked : "+workHours);
				employee.setMonthWage(employee.getMonthWage()+(wagePerHour*workHours));
			}
		}
		System.out.println("Total Month Wage : "+employee.getMonthWage());
		System.out.println("Total hours worked : "+(employee.getMonthWage()/wagePerHour));
	}

	public void EmployeeCondition(Employee employee)
	{
		int days=1;
		int totalWorkhours=0;
		while(days<=20 && totalWorkhours<100)
		{
			int presentStatus=(int)(Math.random()*10)%2;
			//System.out.println("Status is "+presentStatus);
                        if (presentStatus==1)
                        {
                                //int workHour=(int)(Math.random()*10)+1;
				if((totalWorkhours+workHours)<100)
                                {

					System.out.println("Employee is present on Day "+days);
                                	System.out.println("Hours Worked : "+workHours);
                                	totalWorkhours+=workHours;

				}

			}
			else
				System.out.println("Employee is absent on Day "+days);
			days+=1;


		}
		System.out.println("Total hours Worked : "+totalWorkhours);
		//System.out.println("Total days checked : "+days);

	}

}
