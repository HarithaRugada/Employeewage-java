package com.empwage.controller;

import com.empwage.model.*;

public class EmpWageBuilder
{
	//public static final int isParttime=1;
	//public static final int isFulltime=0;
	public void computeEmpWage(CompanyEmpWage companyempwage)
	{

		int empHours=0;
		int totalempHours=0;
		int totalWorkingDays=0;

		while(totalempHours<=companyempwage.getMaxtotalHours() && totalWorkingDays<companyempwage.getNumberofWorkingDays())
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

		companyempwage.setTotalEmpWage(totalempHours*companyempwage.getEmpwagePerHour());

		//System.out.println("Total Employee Wage for Company " +company+ " is > " +totalEmpWage);

	}


}
