package com.service;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ EmployeeServiceTest.class, 
	OperationServiceTest.class, 
	ProductServiceMocTest.class,
	TestingHookExample.class })
public class AllTests {

}
