package com.lti.entity;

public class Calculator {
	public int add(int x,int y)
	{
		int r=x+y;
		return r;
	}
	public void searchEmpId(int empid)
	{
		if(empid==0)
		{
			throw new ArithmeticException("u enetered zero");
		}
		else
		{
			System.out.println(" do something");
		}
		
	}

}
