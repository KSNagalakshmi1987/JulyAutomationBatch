package com.sgtesting.tests;

import org.apache.log4j.Logger;
public class forDemo{
	public static Logger log=Logger.getLogger("loop output");
	public static void main(String[] args) 
	{
		log.info("For loop output starts here...");
		for(int i=20;i<=40;i++)
		{
			if(i%2==0)
			{
				log.info("the Even Number: "+i);
			}
		}log.info("For loop output ends here....");
	}
}

