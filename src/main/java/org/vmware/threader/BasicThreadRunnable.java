package org.vmware.threader;

public class BasicThreadRunnable implements Runnable {

	public void run() {
		System.out.println("Thread from basic thread runnable classs...");
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("Exec-1");
		System.out.println(Thread.currentThread().getName());

	}

}
