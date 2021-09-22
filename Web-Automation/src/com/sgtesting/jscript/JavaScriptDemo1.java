package com.sgtesting.jscript;
interface AA
{
	void addition(int x,int y);
}
interface BB
{
	void subtraction(int x,int y);
}
class CC implements AA,BB
{
	public void addition(int x,int y)
	{
		System.out.println("addition result"+(x+y));
	}
	public void subtraction(int x, int y)
	{
		System.out.println("subtraction result"+(x-y));
	}
}
public class JavaScriptDemo1
{
	public static void main(String args[])
	{
		AA obj= new CC();
		BB bb=(BB) obj;
		bb.subtraction(20, 10);

	}
}

