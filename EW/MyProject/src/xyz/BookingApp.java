package xyz;

class Booking implements Runnable{
	int avl=1;
	@Override
	public synchronized void run() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		if(avl==1) {
			System.out.println(name+" got the ticket");
			avl=avl--;
		}else {
			System.out.println(name+" no ticket");
		}
		
	}
	
}
public class BookingApp {

	public static void main(String[] args) {
		Booking b1=new Booking();
		Thread t1=new Thread(b1);
		Thread t2=new Thread(b1);
		Thread t3=new Thread(b1);
		t1.setName("Ajay");
		t2.setName("Vijay");
		t3.setName("Mahesh");
		t1.start();
		t2.start();
		t3.start();
	}

}
