package com.empwage.controller;

public interface IEmpWage

{

	public void addCompanyEmpWage(String company,int empwagePerHour,int numberofWorkingDays,int maxtotalHours);
	public void computeEmpWage();

}
