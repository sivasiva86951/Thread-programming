package org.thread.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class UserThread extends Thread
{
    public void run()
    {
        if(!Thread.currentThread().isDaemon())   // !false ->true
        {
            System.out.println("It's a non-daemon thread");
        }
        for(int i=1;i<=100;i++)
        {
            System.out.println(i);
        }
        
    }
}

class ServiceThread extends Thread
{
    public void run()
    {
        //Scanner scan=new Scanner(System.in);
        //scan.close();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try {
            br.close();
        } catch (IOException e) 
        {
            
            System.out.println(e.getMessage());
        }
        if(Thread.currentThread().isDaemon())
        {
            System.out.println("It's a daemon thread");
        }
    }
}

public class DaemonThreadExample {

    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
        
        ServiceThread service=new ServiceThread();
        service.setDaemon(true);
        service.setPriority(1);
        service.start();
        
        
        UserThread user1=new UserThread();
        user1.start();
        
        //user1.join();
        
        
        
        UserThread user2=new UserThread();
        System.out.println(service.isAlive());
        user2.start();
        
        //user2.join();
        
        UserThread user3=new UserThread();
        System.out.println(service.isAlive());
        user3.start();
        
        System.out.println(service.isAlive());
        

    }
}
