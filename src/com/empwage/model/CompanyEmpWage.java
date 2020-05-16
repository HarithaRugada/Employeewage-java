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

	public void setTotalEmpWage(int totalEmpWage)
	{
		this.totalEmpWage=totalEmpWage;
	}

	public String toString()
	{
		return "Total Emp Wage for Company" +company+ " is > " +totalEmpWage;
	}

}
