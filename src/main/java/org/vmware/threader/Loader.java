package org.vmware.threader;

public class Loader {
public static void main(String[] args) throws InterruptedException {
	
	//basicThread() implementation
	//basicThread();
	
	//basicThreadRunnable implementation
	//basicThreadRunnable();
	
	//annonmousRunnable implementation;
	//annonmousRunnable();
	
	//multithreadstart implementation
	//multithreadstart();
	
	//Basic thread join implementation
	//basicThreadJoin();
	
	//Thread properties implementation
	//threadproperties();
	
	
	//Thread Grouping with thread names
	threadgrouping();
	
}

private static void threadgrouping() {
	//Thread Grouping with thread names
	System.out.println("thread grouping");
	ThreadGroup tg1 = new ThreadGroup("GroupA");
	Thread t1 = new Thread(tg1,new ThreadGroupingInfrRunnable(),"one");
	Thread t2 = new Thread(tg1,new ThreadGroupingInfrRunnable(),"two");
	t1.start();
	t2.start();
	System.out.println("Active:"+tg1.activeCount());
	System.out.println("GroupName:"+tg1.getName());
	System.out.println("ActiveG:"+tg1.activeGroupCount());
	System.out.println("Parent:"+tg1.getParent());
	
	ThreadGroup tg2 = new ThreadGroup("GroupB");
	Thread t11 = new Thread(tg2,new ThreadGroupingInfrRunnable(),"three");
	Thread t22 = new Thread(tg2,new ThreadGroupingInfrRunnable(),"four");
	t11.start();
	t22.start();
	
	ThreadGroup tg11 = new ThreadGroup(tg1, "GroupAA");
	System.out.println("parent rel:"+tg11.getParent());
	System.out.println("ChildName:"+tg11.getName());
}

private static void threadproperties() throws InterruptedException {
	threadProperties tp1 = new threadProperties();
	threadProperties tp2 = new threadProperties();
	threadProperties tp3 = new threadProperties();
	
	tp1.start();
	tp3.start();
	tp2.start();
	tp2.setName("Exec-TP2");
	tp2.join();
	System.out.println("Groupinfo:"+tp2.getThreadGroup());
	System.out.println("Main Active:"+Thread.activeCount());
}

private static void basicThreadJoin() {
	ThreadJoiner tj1 = new ThreadJoiner();
	tj1.start();
	try{
		tj1.join(1500);}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	
	ThreadJoiner tj2 = new ThreadJoiner();
	tj2.start();
	
	
	ThreadJoiner tj3 = new ThreadJoiner();
	tj3.start();
}

private static void multithreadstart() {
	MultiThreadStart t1 = new MultiThreadStart();
	t1.run();
	t1.run();
	t1.start();
	t1.start(); //java.lang.IllegalThreadStateException 
}

private static void annonmousRunnable() {
	System.out.println("direct invoking annonmyous class using interface");
	Thread tri = new Thread(new Runnable() {
		long start;
		long end;
		public void run() {
			
			for (int i=0 ;i<5;i++){
				start=System.currentTimeMillis();
				try{Thread.sleep(500);
				
				}catch(InterruptedException e){
					e.printStackTrace();
				}
				System.out.println(i);
				end=System.currentTimeMillis();
				System.out.println(end-start);
			}
			
			
		}
	});
	tri.start();
}

private static void basicThreadRunnable() {
	Thread tr1 = new Thread(new BasicThreadRunnable());

	tr1.run();
	System.out.println("start Call");
	Thread trstart1 = new Thread(new BasicThreadRunnable());
	trstart1.start();
	Thread trstart2 = new Thread(new BasicThreadRunnable());
	trstart2.start();
	System.out.println(trstart2.getPriority());
}

private static void basicThread() {
	BasicThreadExtends bte = new BasicThreadExtends();
	bte.run();
	System.out.println("start call");
	BasicThreadExtends btestart = new BasicThreadExtends();
	btestart.start();
}
}
