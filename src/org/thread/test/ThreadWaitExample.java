package org.thread.test;

class PrintWork1 extends Thread
{
    public void run()
    {
        for(int i=0;i<=100;i++)
        {
            
            
                System.out.println(i);
                //Thread.sleep(2000,500);//2000mills + 500nano
        
            
        }
    }
}

class PrintWork2 extends Thread
{
    public void run()
    {
        for(int i=100;i>=1;i--)
        {
            
            
                System.out.println(i);
                //Thread.sleep(2000,500);//2000mills + 500nano
            
            
        }
    }
}
public class ThreadWaitExample {

    public static void main(String[] args) {
        PrintWork1 thread1=new PrintWork1();// New/Born
        thread1.start();//Active state
        
        PrintWork2 thread2=new PrintWork2();// New/Born
        thread2.start();//Active state
      
    }

}

