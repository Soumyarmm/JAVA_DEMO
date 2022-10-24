package com.learn.oops;

public class GetSet_This {
	String name;
	void setName(String name) {
		this.name=name;
	}
	String getName() {
		return this.name;
	}

	public static void main(String[] args) {
		GetSet_This  obj= new GetSet_This ();
		obj.setName("electro");
		System.out.println("obj.name :" + obj.getName());
			
		

	}

}
