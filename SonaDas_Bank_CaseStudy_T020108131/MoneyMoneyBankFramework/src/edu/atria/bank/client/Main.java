package edu.atria.bank.client;

import edu.atria.bank.application.MMBankFactory;
import edu.atria.bank.application.MMCurrentAcc;
import edu.atria.bank.application.MMSavingAcc;
import edu.atria.bank.framework.BankFactory;
import edu.atria.bank.framework.CurrentAcc;
import edu.atria.bank.framework.SavingAcc;

public class Main {

	public static void main(String[] args) {
		BankFactory bf = new MMBankFactory();
		SavingAcc sa = new MMSavingAcc(1,"shrinivas",6000, true );
		CurrentAcc ca = new MMCurrentAcc(2, "sona", 4000, 30000);
		sa.withdraw(sa.getAccNo());
		sa.toString();
		sa.deposit(sa.getAccBal());
		sa.toString();
		ca.withdraw(ca.getCreditLimit());
		ca.toString();
		ca.deposit(ca.getAccBal());
		ca.toString();
	}

}
