package edu.atria.bank.framework;

public abstract class CurrentAcc extends BankAcc{
	private final float creditLimit;
	
	//constructor
	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit;
	}


	//getter
	public float getCreditLimit() {
		return creditLimit;
	}


	public void withdraw(float creditLimit) {
		System.out.println("Amount withdrawn and account balance is:" +getAccNo()+ " Amount is withdrawn and credit limit is:" +creditLimit);
	}


	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + "]";
	}
	
	
	
}
