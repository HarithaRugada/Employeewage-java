package com.empwage.test;

import com.empwage.controller.*;
import com.empwage.model.*;

public class IEmployeeWage
{

        public static void main(String[] args)
        {
                Employee employee=new Employee(20,(int)(Math.random()*10));
                employee.setEmpId(1);
                employee.setEmpName("XYZ");
                employee.setIsPresent(false);
                employee.setIsParttime(false);
                employee.setWagePerHour(20);
                employee.setDailyWage(0);

                IManageEmployee imanageemployee=new SampleManageEmployee();
                imanageemployee.EmployeePresent(employee);
                imanageemployee.EmployeeDailyWage(employee);
		imanageemployee.EmployeeParttime(employee);
		imanageemployee.EmployeeMonthWage(employee);
		imanageemployee.EmployeeMonthWage(employee);

        }

}
