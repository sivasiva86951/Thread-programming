package org.thread.test;

class Thread1 extends Thread
{
    public void run()
    {
    int i;
    for(i=1;i<=100;i++)
        {
        System.out.println(Thread.currentThread().getName()+ ":"+i);
           
        }
    }
}
 class Thread2 extends Thread
 {
    public void run()
    {
    int j;
    for(j=101;j<=200;j++)
        {
         System.out.println(Thread.currentThread().getName()+ ":"+j);
               
        }
     }
 }
 class Thread3 extends Thread
 {
     public void run()
     {
     int k;
     for(k=201;k<=300;k++)
         {
         System.out.println(Thread.currentThread().getName()+ ":"+k);
                    
         }
      }
  
}
    
            
public class ThreadAssignment1 {
	 public static void main(String[] args) throws InterruptedException {
	        
		 Thread1 t1=new Thread1();
	        t1.setName("t1");
	        
	        Thread2 t2=new Thread2();
	        t2.setName("t2");
	     
	        
	        Thread3 t3=new Thread3();
	        t3.setName("t3");
	        
	        t1.start();
	        
	        t1.join();
	        
	        
	        t2.start();
	        
	        t2.join();
	      
	        t3.start();
	        
	        
	    }

	}
	


