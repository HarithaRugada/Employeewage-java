package com.empwage.test;

import com.empwage.controller.*;
import com.empwage.model.*;

public class IEmployeeWage
{

        public static void main(String[] args)
        {
                Employee employee=new Employee(20,(int)(Math.random()*10));

                IManageEmployee samplemanageemployee=new SampleManageEmployee();
                IManageEmployee abcmanageemployee=new ABCManageEmployee();

		System.out.println("Sample Employee");
		samplemanageemployee.EmployeePresent(employee);
                samplemanageemployee.EmployeeDailyWage(employee);
		samplemanageemployee.EmployeeParttime(employee);
		samplemanageemployee.EmployeeMonthWage(employee);


		System.out.println("<<<<<<<<<<<<<<<<<<<---------------------------------------------->>>>>>>>>>>>>>>>>>>>");

		System.out.println("ABC Employee");
                abcmanageemployee.EmployeePresent(employee);
                abcmanageemployee.EmployeeDailyWage(employee);
                abcmanageemployee.EmployeeParttime(employee);
                abcmanageemployee.EmployeeMonthWage(employee);

        }

}
