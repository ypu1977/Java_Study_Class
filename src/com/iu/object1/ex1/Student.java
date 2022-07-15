package com.iu.object1.ex1;

public class Student 
{
	private String name; //이름
	private int num; //번호
	private int kor; //국어
	private int eng; //영어
	private int math; //수학
	private double total; //총점
	private double avg; //평균
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public int getNum() 
	{
		return num;
	}
	
	public void setNum(int num) 
	{
		this.num = num;
	}
	
	public int getKor() 
	{
		return kor;
	}
	
	public void setKor(int kor) 
	{
		this.kor = this.checkPoint(kor);
	}
	
	public int getEng() 
	{
		return eng;
	}
	
	public void setEng(int eng) 
	{
		this.eng = this.checkPoint(eng);
	}
	
	public int getMath() 
	{
		return math;
	}
	
	public void setMath(int math) 
	{
		this.math = this.checkPoint(math)
	}
	
	public double getTotal() 
	{
		return total;
	}
	
	public void setTotal(double total) 
	{
		this.total = total;
	}
	
	public double getAvg() 
	{
		return avg;
	}
	
	public void setAvg(double avg) 
	{
		this.avg = avg;
	}
	
	public void setTotal(int total)
	{
		this.total = this.kor+this.eng+this.math;
		this.setAvg();
	}
		
	public void setAvg()
	{
		this.avg = this.total/3.0;
	}
	
	private int checkPoint(int point)
	{
		if(point < 0 || point > 100)
		{
			return 0;
		}
		
		return point;
	}
}