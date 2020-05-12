package com.empwage.model;

public class Employee
{
	private int empId;
	private String empName;
	private boolean isPresent;
	private boolean isParttime;
	private int dailyWage;
	private int monthWage;
	private int totalWorkhours;

	public int getEmpId()
	{
		return this.empId;
	}

	public String getEmpName()
	{
		return this.empName;
	}

	public boolean getIsPresent()
	{
		return this.isPresent;
	}

	public boolean getIsParttime()
	{
		return this.isParttime;
	}

	public int getDailyWage()
	{
		return this.dailyWage;
	}

	public int getMonthWage()
	{
		return this.monthWage;
	}

	public int getTotalWorkhours()
	{
		return this.totalWorkhours;
	}


	public void setEmpId(int empId)
	{
		this.empId=empId;
	}

	public void setEmpName(String empName)
	{
		this.empName=empName;
	}

	public void setIsPresent(boolean isPresent)
	{
		this.isPresent=isPresent;
	}

	public void setIsParttime(boolean isParttime)
	{
		this.isParttime=isParttime;
	}

	public void setDailyWage(int dailyWage)
	{
		this.dailyWage=dailyWage;
	}

	public void setMonthWage(int monthWage)
	{
		this.monthWage=monthWage;
	}

	public void setTotalWorkhours(int totalWorkhours)
	{
		this.totalWorkhours=totalWorkhours;
	}

}
