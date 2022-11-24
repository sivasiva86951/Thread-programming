package org.thread.test;
class ThreadA extends Thread
{
    public void run()
    {
        for(int i=1;i<=1000;i++)
        {
            System.out.println(Thread.currentThread().getName()+ ":"+i);
            if(Thread.currentThread().getName().equals("t1") && i==50)
			{
				Thread.currentThread().stop();
			}
			
			if(Thread.currentThread().getName().equals("t2") && i==70)
			{
				Thread.currentThread().stop();
			}
			
			if(Thread.currentThread().getName().equals("t3") && i==90)
			{
				Thread.currentThread().stop();
			}

        }
    }
    
}




public class JoinExample{

    public static void main(String[] args) throws InterruptedException {
        
        ThreadA t1=new ThreadA();
        t1.setName("t1");
        
        ThreadA t2=new ThreadA();
        t2.setName("t2");
        
        
        ThreadA t3=new ThreadA();
        t3.setName("t3");
        
        t1.start();
        
        
        
        t1.join();
        
        
        t2.start();
        
        t2.join();
        
        t3.start();
        
        
    }

}