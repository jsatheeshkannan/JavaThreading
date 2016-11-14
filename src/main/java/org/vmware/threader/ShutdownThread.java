package org.vmware.threader;

public class ShutdownThread extends Thread{

	public void run(){
		System.out.println(Thread.currentThread().getName()+"shuting down now...");
	}
}
