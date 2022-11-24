package org.thread.test;

class DemoThread extends Thread
{
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			System.out.println(i);
			
					
					if(i==50)
					{
						Thread.currentThread().interrupt();
						System.out.println(Thread.currentThread().isInterrupted());
						System.out.println("Interrupted!!");
					}
			
		}
	}
}


public class InterruptExample {

	public static void main(String[] args) {
		DemoThread d=new DemoThread();
		d.start();
	
		

	}

}

