package com;

class Sync implements Runnable{

	@Override
	public synchronized void run() {
		Thread t= Thread.currentThread();
		String name= t.getName();
		for(int i=0;i<10;i++) {
			System.out.println(name+" i "+i);
			try {
				Thread.sleep(1000);
				if(i==3 && name.equals("Honda")) {
					wait();
				}
			}catch(Exception e) {}
		}
	}
	
}
public class ProjectPractice2 {

	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		Sync s=new Sync();
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
