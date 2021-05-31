package test;

class Student
{
	void fun()
	{
		System.out.print("Student name");
	}
}
class Markes extends Student
{
	void fun()
	{
		System.out.print("90");
	}
}
class Result extends Markes
{
	void fun()
	{
		System.out.print("pass");
	}
}
public class overriding 
{
	public static void main(String args[])
	{
	Result t=new Result();
	t.fun();
	}
}
