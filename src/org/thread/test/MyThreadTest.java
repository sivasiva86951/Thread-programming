package org.thread.test;

class Mythread1 extends Thread
{

public void run()
{
for(int i=1;i<=100;i++)
{
System.out.println("Thread 1:"+i);
}

}

}

class Mythread2 extends Thread
{

public void run()
{
for(int i=100;i>=1;i--)
{
System.out.println("Thread 2:"+i);
}

}

}


public class MyThreadTest {

public static void main(String[] args) {

Mythread1 t1=new Mythread1();

Mythread2 t2=new Mythread2();

t1.start();
t2.start();




}

}