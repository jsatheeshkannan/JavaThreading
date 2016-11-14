package org.vmware.threader;

public class ThreadGroupingInfrRunnable implements Runnable {

	public void run() {
		
		System.out.println("Name:"+Thread.currentThread().getName());
		System.out.println("Group:"+Thread.currentThread().getThreadGroup());

	}

}
