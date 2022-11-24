package org.thread.test;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable
{
 private String name;
 
 public Task(String n)
 {
	 this.name=n;
 }
 
 public void run()
 {
	 for(int i=1;i<=10;i++)
	 {
		 System.out.println(Thread.currentThread().getName()+":"+i +" - "+this.name);
	 }
 }
 
 
}





public class ThreadPoolExample {

	static final int threadCount=3;
	
	public static void main(String[] args) {
		
		Runnable r1=new Task("task 1");
		Runnable r2=new Task("task 2");
		Runnable r3=new Task("task 3");
		Runnable r4=new Task("task 4");
		Runnable r5=new Task("task 5");
		
		
		ExecutorService pool=Executors.newFixedThreadPool(threadCount);
		
		pool.execute(r1);
		pool.execute(r2);
		pool.execute(r3);
		pool.execute(r4);
		pool.execute(r5);
		
		
		
		
		

	}

}

