package com.empwage.model;

public class CompanyEmpWage
{

        public final String company;
        public final int empwagePerHour;
        public final int numberofWorkingDays;
        public final int maxtotalHours;
        public int totalEmpWage;

        public CompanyEmpWage(String company,int empwagePerHour,int numberofWorkingDays,int maxtotalHours)
        {

                this.company=company;
                this.empwagePerHour=empwagePerHour;
                this.numberofWorkingDays=numberofWorkingDays;
                this.maxtotalHours=maxtotalHours;

        }

	public String getCompany()
	{
		return this.company;
	}

	public int getEmpwagePerHour()
	{
		return this.empwagePerHour;
	}

	public int getNumberofWorkingDays()
	{
		return this.numberofWorkingDays;
	}

	public int getMaxtotalHours()
	{
		return this.maxtotalHours;
	}

	public int getTotalEmpWage()
	{
		return this.totalEmpWage;
	}

	/*public void setCompany(String company)
	{
		this.company=company;
	}

	public void setEmpWagePerHour(int empWagePerHour)
	{
		this.empWagePerHour=empWagePerHour;
	}

	public void setNumberofWorkingDays(int numberofWorkingDays)
	{
		this.numberofWorkingDays=numberofWorkingDays;
	}

	public void setMaxtotalHours(int maxtotalHours)
	{
		this.maxtotalHours=maxtotalHours;
	}*/


	public void setTotalEmpWage(int totalEmpWage)
	{
		this.totalEmpWage=totalEmpWage;
	}

	public String toString()
	{
		return "Total Emp Wage for Company  " +company+ " is > " +totalEmpWage;
	}

}

