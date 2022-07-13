package com.iu.object2;

public class Object2Main4 
{
	public static void main(String[] args) 
	{
		Member member = new Member();
		member.name="iu";
		member.age=30;
		member.email="iu@gmail.com";
		
		Member member2 = new Member();
		member2.name="Z7";
		member2.age=25;
		member2.email="Z7@gmail.com";
		
		Member member3 = new Member();
		member3.name="HT";
		member3.age=23;
		member3.email="HT@gmail.com";
		
		Member [] members = new Member[3];
		members[0] = member;
		members[1] = member2;
		members[2] = member3;
		
		Method4 m4 = new Method4();
		m4.info(members);
		
		System.out.println(members.length);//3
	}

}
