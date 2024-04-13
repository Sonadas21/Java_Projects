package edu.atria.bank.application;

import edu.atria.bank.framework.BankFactory;
import edu.atria.bank.framework.CurrentAcc;
import edu.atria.bank.framework.SavingAcc;

public class MMBankFactory extends BankFactory {

	@Override
	public SavingAcc getNewSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		MMSavingAcc mmsaving = new MMSavingAcc(accNo, accNm, accBal, isSalaried);
		return mmsaving;
	}

	@Override
	public CurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		MMCurrentAcc mmcurrent = new MMCurrentAcc(accNo, accNm, creditLimit, creditLimit);
		return mmcurrent;
	}

	

}
