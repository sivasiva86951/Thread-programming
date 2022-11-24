package org.thread.test;


class Prime extends Thread{

    public void run()
    {
        
        for(int i=1;i<=10;i++)
        { 
           
            try
            {
            
                int c=0;
                for(int j=1;j<=i;j++)
                {
                    if(i%j==0)
                    {
                      c=c+1;    
                    }
                }
                if(c==2)
                {
                    System.out.println("Prime");
                }
                else
                {
                    System.out.println("Not prime");
                }
                Thread.sleep(2000); 
            }
        
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
         
    }
    }





class Range extends Thread{
    public void run()
    {
        try
        {
        
        for(int i=1;i<=10;i++)
        { 
            System.out.println(i);
            Thread.sleep(2000); 
        }
        
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
}
}


class ThreadAssignment 
{
    public static void main(String args[])
    {
        Prime pthread=new Prime();
        Range rthread=new Range();
        
        rthread.start();
        pthread.start();
        
    }
}
