package com.iu.object1.ex1;

import java.util.Scanner;

public class Ex1Main {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		Student a = new Student();
		
		a.name = "박상준";
		a.num = 1;
		a.kor = 80; //국어
		a.eng = 80; //영어
		a.math = 80; //수학
		a.total = a.kor + a.eng + a.math; //총점
		a.avg = a.total/3.0;
		
		System.out.println("이름 : "+ a.name);
		System.out.println("번호 : "+ a.num + "번");
		System.out.println("국어 : "+ a.kor + "점");
		System.out.println("영어 : "+ a.eng + "점");
		System.out.println("수학 : "+ a.math + "점");
		System.out.println("합계 : "+ a.total + "점");
		System.out.println("평균 : "+ a.avg + "점");
		
		Student st = null;
		Scanner sc = new Scanner(System.in);
		Student [] students = new Student[3];
		for(int i=0; i<3; i++) {
			st = new Student();
			System.out.println("이름 입력");
			st.name = sc.next();
			students[i] = st;
		}
		
		System.out.println(students[0].name);
		System.out.println(students[1].name);
		System.out.println(students[2].name);
		
		System.out.println(st.name);
		
		
		System.out.println("프로그램 종료");
	}

}
