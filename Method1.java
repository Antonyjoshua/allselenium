package com.pratice;

public class Method1 {
	public String method1()
	{
		System.out.println("Hello ");
		return "antony";
	}

	public static void method3()//class level access when we use static keyword dont need to use object to call it
	{
		System.out.println(" world");
	}
	public static void main(String[] args) {
		Method1 M1=new Method1();
		String name=M1.method1();
		System.out.println(name);
		method3();
		Method2 m2= new Method2();//we don't need to create two objects when we use inheritance concept same memory usuage
		m2.method2();
		
		
		
		

	}

}
