package org.vmware.threader;

public class BasicThreadExtends extends Thread{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("Exec-0");
		System.out.println(Thread.currentThread().getName());
	}
	
	

}
