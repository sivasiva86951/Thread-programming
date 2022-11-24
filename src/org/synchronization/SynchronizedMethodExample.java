package org.synchronization;

class Multiplicationtable
{
	synchronized public static void print(int number)
	{
       
			for(int i=1;i<=10;i++)
			{
	          	System.out.println(number + " * "+ i+"="+number*i);		
			}
        
		
	
	}
	
	
}


class Thread1 extends Thread
{
	Multiplicationtable m;
	
	public Thread1(Multiplicationtable m)
	{
	  this.m=m; 	
	}
	
	public void run()
	{
		m.print(5);
	}
	
}

class Thread2 extends Thread
{
	Multiplicationtable m;

	public Thread2(Multiplicationtable m)
	{
	  this.m=m; 	
	}
	
	public void run()
	{
		m.print(10);
	}
		
}
public class SynchronizedMethodExample {

	public static void main(String[] args) {
		
		Multiplicationtable m=new Multiplicationtable();
		
		Thread1 t1=new Thread1(m);
		Thread2 t2=new Thread2(m);
		
		t1.start();
		t2.start();
	}

}
