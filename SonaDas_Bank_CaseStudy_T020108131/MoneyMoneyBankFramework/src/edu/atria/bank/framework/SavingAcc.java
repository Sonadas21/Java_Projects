package edu.atria.bank.framework;

public abstract class SavingAcc extends BankAcc {
	private boolean isSalaried;
    private static final float MINBAL = 0;
    
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal);
		this.isSalaried = isSalaried;
	}

	//getters 
	public boolean isSalaried() {
		return isSalaried;
	}
	
	public static float getMinbal() {
		return MINBAL;
	}

	public void withdraw(float accBal) {
		System.out.println("Account minimun balance is:" +MINBAL);
	}

    
	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + "]";
	}
	
	

}
