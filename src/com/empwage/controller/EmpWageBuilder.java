package com.empwage.controller;

public class EmpWageBuilder
{
	//public static final int isParttime=1;
	//public static final int isFulltime=0;

	private final String company;
	private final int empwagePerHour;
	private final int numberofWorkingDays;
	private final int maxtotalHours;
	private int totalEmpWage;

	public EmpWageBuilder(String company,int empwagePerHour,int numberofWorkingDays,int maxtotalHours)
	{

		this.company=company;
		this.empwagePerHour=empwagePerHour;
		this.numberofWorkingDays=numberofWorkingDays;
		this.maxtotalHours=maxtotalHours;

	}

	public void computeEmpWage()
	{

		int empHours=0;
		int totalempHours=0;
		int totalWorkingDays=0;

		while(totalempHours<=maxtotalHours && totalWorkingDays<numberofWorkingDays)
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

		totalEmpWage=totalempHours*empwagePerHour;

		System.out.println("Total Employee Wage for Company " +company+ " is > " +totalEmpWage);

	}


}
