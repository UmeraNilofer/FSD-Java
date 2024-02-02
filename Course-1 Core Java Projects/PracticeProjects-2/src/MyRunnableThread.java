
public class MyRunnableThread implements Runnable {
	public static int myCount = 0;
    public MyRunnableThread(){
         
    }
    public void run() {
        while(MyRunnableThread.myCount <= 10){
            try{
                System.out.println("Ex Thread: "+(++MyRunnableThread.myCount));
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                System.out.println("Exception in thread: "+ex.getMessage());
            }
        }
    } 
	public static void main(String[] args) {
		System.out.println("Starting Main Thread...");
        MyRunnableThread r = new MyRunnableThread();
        Thread t = new Thread(r);
        t.start();
        while(MyRunnableThread.myCount <= 10){
            try{
                System.out.println("Main Thread: "+(++MyRunnableThread.myCount));
                Thread.sleep(100);
            } catch (InterruptedException ex){
                System.out.println("Exception in main thread: "+ex.getMessage());
            }
        }
        System.out.println("End of Main Thread...");
	}

}
