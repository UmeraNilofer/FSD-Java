package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Employee;
import com.service.EmployeeService;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml"); // load the xml file 
		Employee emp = (Employee)ac.getBean("employee");
		emp.setId(100);
		emp.setName("Vijay");
		emp.setSalary(33000);
		
		EmployeeService es = (EmployeeService)ac.getBean("employeeService");
		String result = es.storeEmployee(emp);
		System.out.println(result);
	}

}
