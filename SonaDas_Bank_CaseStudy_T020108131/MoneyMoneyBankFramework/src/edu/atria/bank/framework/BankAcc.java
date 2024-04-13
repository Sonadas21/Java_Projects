package edu.atria.bank.framework;

public abstract class BankAcc {
	//fields
	private int accNo;
	private String accNm;
	private float accBal;
	
	//constructor
	public BankAcc(int accNo, String accNm, float accBal) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
	}
	
	
	//getters and setters
	public int getAccNo() {
		return accNo;
	}


	public float getAccBal() {
		return accBal;
	}

	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}
	

    //implementation
	public void withdraw(float accBal) {
		System.out.println("Amount is withdrawn and account balance is:" +accBal);
	}
	
	
	public void deposit(float accBal) {
		System.out.println("Amount is deposited and account balance is:" +accBal);
	}
	

	@Override
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + "]";
	}

}
