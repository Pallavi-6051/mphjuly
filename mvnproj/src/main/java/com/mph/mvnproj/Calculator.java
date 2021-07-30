package com.mph.mvnproj;

public class Calculator {

	public int add(int... num)
	{
	int result=0;
	for(int i:num)
	{
		result+=i;
	}
	return result;
	}
	public int multiply(int...val)
	{
		int ans=1;
		for(int i:val)
		{
			ans=ans*i;
		}
		return ans;
	}
	
	public int divide()
	{
		int ans=1/1;
		return ans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c=new Calculator();
		System.out.println(c.add(12,45));
		System.out.println(c.multiply(2,3,4));
		
	}

}
