package com.empwage.controller;

import com.empwage.model.*;
import com.empwage.controller.*;

import java.util.*;

public class EmpWageBuilderArray implements IEmpWage
{

	private int numofCompanies=0;
	//private CompanyEmpWage[] companyEmpWageArray;
	private LinkedList<CompanyEmpWage> companyempwagelist;
	private Map<String,CompanyEmpWage> companyempwagemap;


	public EmpWageBuilderArray()
	{
		//companyEmpWageArray=new CompanyEmpWage[5];
		companyempwagelist=new LinkedList<>();
		companyempwagemap=new HashMap<>();
	}

	public void addCompanyEmpWage(String company,int empwagePerHour,int numberofWorkingDays,int maxtotalHours)
	{
		//companyEmpWageArray[numofCompanies]=new CompanyEmpWage(company,empwagePerHour,numberofWorkingDays,maxtotalHours);
		//numofCompanies++;
		CompanyEmpWage companyempwage=new CompanyEmpWage(company,empwagePerHour,numberofWorkingDays,maxtotalHours);
		companyempwagelist.add(companyempwage);
		companyempwagemap.put(company,companyempwage);
	}

	public void computeEmpWage()
	{
		for(int i=0;i<numofCompanies;i++)
		{
			//companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
			CompanyEmpWage companyempwage=companyempwagelist.get(i);
			computeEmpWage(companyempwage);
			System.out.println(companyempwage.toString());
		}
	}

	public int getTotalWage(String company)
	{
		return companyempwagemap.get(company).totalEmpWage;
	}


	public int computeEmpWage(CompanyEmpWage companyEmpWage)
	{

		int empHours=0;
		int totalempHours=0;
		int totalWorkingDays=0;
		int wage=0;
		int totalSalary=0;
		int totalWage=0;

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
			wage=empHours*companyEmpWage.getEmpwagePerHour();;
			totalSalary+=wage;
			System.out.println("Day " +totalWorkingDays+ " Employee hours > " +empHours);
		}

		//return totalempHours*companyEmpWage.getEmpwagePerHour();
		empwagebuilderarray.setTotalWage(totalSalary);
		return empwagebuilderarray.getTotalWage();
		//System.out.println("Total Employee Wage for Company " +company+ " is > " +totalEmpWage);

	}


}

