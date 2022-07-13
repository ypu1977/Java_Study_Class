package com.iu.object2;

public class Method3 
{
	//sal
	public static void sal(int salery)
	{
		System.out.println("월급 계산");
		System.out.println(salery*0.967+ "원");
		salery = 20;
	}
	
	public static void hap(int num1, int num2) 
	{
		System.out.println(num1+num2);
	}
	
	//info : 이름 나이 이메일주소를 받아서 출력
	public static void info(String name, int age, String email)
	{
		System.out.print(name);
		System.out.println(age);
		System.out.println(email);
	}
	
	public static void info2(Member member)
	{
		System.out.println(member.name);
		System.out.println(member.age);
		System.out.println(member.email);
		System.out.println(member.phone);
	}
}