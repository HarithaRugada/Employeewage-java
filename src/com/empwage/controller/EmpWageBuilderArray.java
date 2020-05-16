package com.empwage.controller;

import com.empwage.model.*;

public class EmpWageBuilderArray
{

	private int numofCompanies=0;
	private CompanyEmpWage[] companyEmpWageArray;

	public EmpWageBuilderArray()
	{
		companyEmpWageArray=new CompanyEmpWage[5];
	}

	public void addCompanyEmpWage(String company,int empwagePerHour,int numberofWorkingDays,int maxtotalHours)
	{
		companyEmpWageArray[numofCompanies]=new CompanyEmpWage(company,empwagePerHour,numberofWorkingDays,maxtotalHours);
		numofCompanies++;
	}

	public void computeEmpWage()
	{
		for(int i=0;i<numofCompanies;i++)
		{
			companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
			System.out.println(companyEmpWageArray[i]);
		}
	}

	public int computeEmpWage(CompanyEmpWage companyEmpWage)
	{

		int empHours=0;
		int totalempHours=0;
		int totalWorkingDays=0;

		while(totalempHours<=companyEmpWage.getMaxtotalHours() && totalWorkingDays<companyEmpWage.getNumberofWorkingDays())
		{
			totalWorkingDays++;
			int presentStatus=(int)(Math.random()*10)%2;

			if(presentStatus==1)
			{
				int isParttime=(int)(Math.random()*10)%2;

				if(isParttime==1)
					empHours=4;//present and parttime
				else
				empHours=8;//present and full time
			}

			else
				empHours=0;//absent


			totalempHours+=empHours;
			System.out.println("Day " +totalWorkingDays+ " Employee hours > " +empHours);
		}

		return totalempHours*companyEmpWage.getEmpwagePerHour();

		//System.out.println("Total Employee Wage for Company " +company+ " is > " +totalEmpWage);

	}


}

