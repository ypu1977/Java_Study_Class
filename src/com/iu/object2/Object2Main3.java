package com.iu.object2;

import java.util.Scanner;

public class Object2Main3 
{
	public static void main(String[] args) 
	{
		Method3 m3 = new Method3();
		//월급 입력 스캐너 X
		int salery = 5000000;
		m3.sal(salery);
		System.out.println(salery);
		//m3.hap(10, 20);
		//
		m3.info("박상준\n", 24, "ypu1977@gmail.com");
		
		Member member = new Member();
		member.name="psj";
		member.age = 24;
		member.email="psj@gmail.com";
		member.phone="010-1234-5678";
		m3.info2(member);
		System.out.println(member.age);
		
		
	}
}