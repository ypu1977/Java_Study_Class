package com.iu.object1.ex1;

import java.util.Scanner;

public class StudentController 
{
	//start 메서드 선언
	//System.out.println("1. 학생 정보 입력");
	//System.out.println("2. 학생 정보 조회");
	//System.out.println("3. 학생 정보 검색");
	//System.out.println("4. 학생 정보 삭제");
	//System.out.println("5. 학생 정보 추가");
	//System.out.println("6. 프로 그램 종료");
	
	public static void start() 
	{		
		Scanner sc = new Scanner(System.in);
		//객체 생성
		StudentView sv = new StudentView();
		StudentService studentService = new StudentService();
		Student [] students = null;
		
		boolean check=true;
		while(check)
		{
			System.out.println("1. 학생 정보 입력");
			System.out.println("2. 학생 정보 조회");
			System.out.println("3. 학생 정보 검색");
			System.out.println("4. 학생 정보 삭제");
			System.out.println("5. 학생 정보 추가");
			System.out.println("6. 프로 그램 종료");
			int select = sc.nextInt();
			switch (select)
			{
			case 1:
				System.out.println("1");
				students = studentService.makeStudents();
				break;
			case 2:
				System.out.println("2");
				sv.viewAll(students);
				break;
			case 3:
				System.out.println("3");
				Student student = studentService.findStudent(students);
				if (student != null) 
				{
					sv.viewOne(student);
				}
				else 
				{
					sv.viewMessage("찾는 학생번호가 없어요");
				}
				break;
			case 4:
				System.out.println("4");
				break;
			case 5:
				
				System.out.println("5");
				break;
			default:
				System.out.println("종료중");
				check=!check;
			}
		}
	}	
}