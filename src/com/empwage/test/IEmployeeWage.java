package com.empwage.test;

import com.empwage.controller.*;
import com.empwage.model.*;

public class IEmployeeWage
{

        public static void main(String[] args)
        {
                Employee employee=new Employee();

                IManageEmployee xyzmanageemployee=new XYZManageEmployee();
                IManageEmployee abcmanageemployee=new ABCManageEmployee();

		System.out.println("Sample Employee");
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

		System.out.println("<<<<<<<<<<<<<<----------------------------------------------------------->>>>>>>>>>>>>>");

		EmpWageBuilder reliance=new EmpWageBuilder("Reliance" , 20, 5 , 50);
		EmpWageBuilder bigc=new EmpWageBuilder("Big C" , 15, 10 , 30);
		reliance.computeEmpWage();
		//System.out.println(reliance);
		bigc.computeEmpWage();
		//System.out.println(bigc);


        }

}
