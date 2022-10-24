package com.learn.oops_1;

class Vehicle{
	public int yeaarOfMake;
	public String brandName;
	
	public Vehicle(int yearofMake, String brandName) {
		this.yeaarOfMake=yearofMake;
		this.brandName=brandName;
	}
	public int drive() {
		System.out.println("thsi is" + brandName + "made in" + yeaarOfMake);
		return 0;
	}
}

class Bike extends Vehicle{
	int costOfTheBike;
	public Bike(int yearofMake, String brandName,int costOfTheBike ) {
		super(yearofMake,brandName);
		this.costOfTheBike=costOfTheBike;
	}
}

public class Inheritance {

	public static void main(String[] args) {
		Bike unicorn= new Bike(2015, "unicorn", 980000);
		System.out.println("unicorn->"+unicorn.yeaarOfMake);
		System.out.println("unicorn->"+ unicorn.brandName);
		unicorn.drive();
		
		
		Bike appache160=new Bike(2022,"appache160",120000);
		System.out.println("appache160->"+ appache160.yeaarOfMake);
		System.out.println("appache160->"+  appache160.brandName);
		 appache160.drive();
		
	}

}
