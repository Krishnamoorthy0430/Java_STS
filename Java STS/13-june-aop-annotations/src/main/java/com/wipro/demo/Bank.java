package com.wipro.demo;

import org.springframework.stereotype.Component;

@Component

public class Bank 
{
	public void withdraw()
	{
		System.out.println("Withdraw method is Called");
	}
	public void deposit()
	{
		System.out.println("Deposit method is called");
	}
}
