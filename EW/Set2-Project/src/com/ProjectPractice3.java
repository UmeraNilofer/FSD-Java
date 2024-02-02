package com;

class SyncDemo extends Thread{

	@Override
	public synchronized void run() {
		Thread t= Thread.currentThread();
		String name= t.getName();
		for(int i=0;i<10;i++) {
			System.out.println(name+" i "+i);
			try {
				Thread.sleep(1500);
				if(i==3 && name=="Honda") {
					wait();
				}
				notify();
				if(i==5 && name=="Activa") {
					notify();
					wait();
				}
				notifyAll();
			}catch(Exception e) {}
		}
	}
	
}
public class ProjectPractice3 {

	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		SyncDemo s=new SyncDemo();
		Thread t1=new Thread(s);
		Thread t2=new Thread(s);
		Thread t3=new Thread(s);
		System.out.println(t);
		t1.setName("Activa");
		t2.setName("Honda");
		t3.setName("Pulsar");
		t1.start();
		t2.start();
		t3.start();
	  }
}
