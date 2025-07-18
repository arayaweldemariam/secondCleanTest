package com.Inner;

		interface greeting
		{
		  public void show();	
		}

class greet
{
public void gret(greeting g)
		{
		 System.out.println("this  inner class");	
		}
}

public class InnerClass 
{

	public static void main(String[] args) 
	{
		
		greet g=new greet();
		g.gret(new greeting()
				{
             		@Override
					public void show() 
					{
						System.out.println("this is from inner class");
					}
			
				});
	System.out.println("developer seccond has changed this");
	}

}
