package edu.atria.bank.application;

import edu.atria.bank.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc {
	private static final float MINBAL = 3000;
	
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal, isSalaried);
		// TODO Auto-generated constructor stub
	}


	public float getMINBAL() {
		return MINBAL;
	}
	
	


	@Override
	public String toString() {
		return "MMSavingAcc [isSalary()=" + isSalaried() + ", toString()=" + super.toString() + ", getAccNo()="
				+ getAccNo() + ", getAccNm()=" + getAccNo() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
    
	
	
	

}
