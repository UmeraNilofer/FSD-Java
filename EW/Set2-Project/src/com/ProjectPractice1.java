package com;

class Acute extends Thread {
	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("i "+i);
		}
	}
	
}

class Base implements Runnable{
	@Override
	public void run() {
		for(int j=0;j<10;j++) {
			System.out.println("j "+j);
		}	
	}
	
}
public class ProjectPractice1 {

	public static void main(String[] args) {
		Acute a=new Acute();
		Runnable r=new Base();
		Thread b=new Thread(r);
		a.start();
		b.start();
	}

}
