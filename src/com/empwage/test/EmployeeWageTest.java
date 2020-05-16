package com.empwage.test;

import com.empwage.controller.*;
import com.empwage.model.*;

public class EmployeeWageTest
{

        public static void main(String[] args)
        {
                Employee employee=new Employee();
		//CompanyEmpWage companyempwage=new CompanyEmpWage(" ", , );

                IManageEmployee xyzmanageemployee=new XYZManageEmployee();
                IManageEmployee abcmanageemployee=new ABCManageEmployee();

		System.out.println("XYZ Employee");
		xyzmanageemployee.EmployeePresent(employee);
                xyzmanageemployee.EmployeeDailyWage(employee);
		xyzmanageemployee.EmployeeParttime(employee);
		xyzmanageemployee.EmployeeMonthWage(employee);


		System.out.println("<<<<<<<<<<<<<<<<<<<---------------------------------------------->>>>>>>>>>>>>>>>>>>>");

		System.out.println("ABC Employee");
                abcmanageemployee.EmployeePresent(employee);
                abcmanageemployee.EmployeeDailyWage(employee);
                abcmanageemployee.EmployeeParttime(employee);
                abcmanageemployee.EmployeeMonthWage(employee);


		System.out.println("<<<<<<<<<<<<------------------------------------------->>>>>>>>>>>>");

		EmpWageBuilder empwagebuilder=new EmpWageBuilder();
		CompanyEmpWage dmart= new CompanyEmpWage("D Mart",20,5,10);
		CompanyEmpWage reliance=new CompanyEmpWage("Reliance",10,10,20);

		empwagebuilder.computeEmpWage(dmart);
		System.out.println(dmart);

		empwagebuilder.computeEmpWage(reliance);
		System.out.println(reliance);

        }

}