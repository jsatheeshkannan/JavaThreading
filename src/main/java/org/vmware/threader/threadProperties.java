package org.vmware.threader;

public class threadProperties extends Thread{
	private long start;
	private long end;
	public void run(){
		System.out.println("Thread Properties");
		
	
	
			start=System.currentTimeMillis();
			System.out.println("Name:"+Thread.currentThread().getName());
			System.out.println("priority:"+Thread.currentThread().getPriority());
			System.out.println("Max:"+Thread.MAX_PRIORITY);
			System.out.println("Min:"+Thread.MIN_PRIORITY);
			System.out.println("normal:"+Thread.NORM_PRIORITY);
			System.out.println("Active:"+Thread.activeCount());
			
			
		
	}


}
