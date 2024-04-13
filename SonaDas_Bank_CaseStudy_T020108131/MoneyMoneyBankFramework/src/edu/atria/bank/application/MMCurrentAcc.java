package edu.atria.bank.application;

import edu.atria.bank.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {
	
	
	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
		// TODO Auto-generated constructor stub
	}


	public void withdraw(float creditLimit) {
		System.out.println(" Amount is withdrawn and credit limit is:" +getCreditLimit());
	}


	@Override
	public String toString() {
		return "MMCurrentAcc [getCreditLimit()=" + getCreditLimit() + ", toString()=" + super.toString()
				+ ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNo() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}


	

}
