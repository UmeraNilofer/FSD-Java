package com.service;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class LoginServiceTest {

  @Test
  public void signInTest() {
    //throw new RuntimeException("Test not implemented");
	  LoginService ls= new LoginService();
	  boolean res1=ls.signIn("umera@gmail.com", "123");
	  boolean res2=ls.signIn("amera@gmail.com", "123");
	  assertTrue(res1);
	  assertFalse(res2);
  }

  @Test
  public void signUpTest() {
    //throw new RuntimeException("Test not implemented");
	  LoginService ls= new LoginService();
	  String res1=ls.signUp("umera@gmail.com", "12345");
	  assertEquals("Account created successfully", res1);
	  String res2=ls.signUp("umeragmail.com", "12345");
	  assertEquals("Account didn't create", res2);
  }
}
