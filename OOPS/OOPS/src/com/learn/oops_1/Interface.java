package com.learn.oops_1;

interface RBI{
	//Inside interface, by DEFAULT,
    // all the variables are public final
    // all the methods are public abstract
	void deposit(int amount);
	int balance();
	int withDraw(int amount);
}

class ICICI implements RBI{
	private int accBalance=0;
	

	@Override
	public void deposit(int amount) {
		accBalance +=amount;
		
	}

	@Override
	public int balance() {
		
		return accBalance;
	}

	@Override
	public int withDraw(int amount) {
		
		if(amount > accBalance) {
			System.out.println("insufficient balance");
			return -1;
			
		}
		accBalance=accBalance-amount;
		return amount;
	}	
}

class HDFC implements RBI{
	private int accBalance;

	@Override
	public void deposit(int amount) {
		if(amount>5000) {
			System.out.println("you have closed limit of deposit,try again");
		}
		accBalance +=amount;
		
	}

	@Override
	public int balance() {
	
		return accBalance;
	}

	@Override
	public int withDraw(int amount) {
		if(amount>5000) {
			System.out.println("limit breached");
		}
		if(amount>accBalance) {
			System.out.println("insufficient balance");
		}
		accBalance-=amount;
		return amount;
	}
	
}

public class Interface {
	public static void main(String[] args) {
		HDFC icici = new HDFC();
        icici.deposit(10000);
        System.out.println("Balance : "+ icici.balance());
        icici.withDraw(2000);
        System.out.println("Balance : "+ icici.balance());
	}

}
