package org.vmware.threader;

public class MultiThreadStart extends Thread {
	private long start;
	private long end;
	public void run(){
		System.out.println("multithread begin here...");
		for (int i=0 ;i<5;i++){
			start=System.currentTimeMillis();
			try{Thread.sleep(500);
			
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println(i);
			end=System.currentTimeMillis();
			//System.out.println(end-start);
		}
	}

}
