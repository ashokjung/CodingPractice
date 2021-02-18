package Multithreading;
/*
* Multithreading is a Java feature that allows concurrent execution of two or more parts of a program for maximum utilization of CPU. 
* Each part of such program is called a thread. So, threads are light-weight processes within a process.
*   Threads can be created by using two mechanisms :
*   1. Extending the Thread class
*   2. Implementing the Runnable Interface
*   This demo is using Thread class  (Thread creation by extending the Thread class)
*/
class MultithreadingDemo extends Thread 
{ 
    public void run() 
    { 
        try
        { 
           System.out.println ("Thread " + Thread.currentThread().getId() + " is running"); 
        } 
        catch (Exception e) 
        { 
            System.out.println ("Exception is caught"); 
        } 
    } 
} 

public class Multithread 
{ 
    public static void main(String[] args) 
    { 
        int n = 8; 
        for (int i=0; i<n; i++) 
        { 
            MultithreadingDemo multithreadingDemo = new MultithreadingDemo(); 
            multithreadingDemo.start();
        } 
    } 
} 