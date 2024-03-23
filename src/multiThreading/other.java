/*// In this we are using join() method which is caller thread (main thread) to wait for called thread (t1 & t2) to complete
// First with the join() it will work & it will wait for the join to complete the exection
public class main implements Runnable{
    public void run(){
        synchronized(this){
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello "+Thread.currentThread().getName());
            }
        }
    }
    public static void main(String[] args) {
        main ob = new main();
        main ob1 = new main();
        Thread t1 = new Thread(ob);
        Thread t2 = new Thread(ob1);
        System.out.println("Hello "+Thread.currentThread().getName());
        t1.setName("First");
        t2.setName("Second");
		t1.start();
		t2.start();
        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
        }
		System.out.println("Both the threads are over");

    }
}*/





/* // In this we are using the object lock which is accessed by only one thread at a time
// This lock comes into picture only when object has got non-static synchronized method/s or block
public class other implements Runnable
{
	public void run()
	{
		synchronized(this)
		{
			for(int i=0;i<5;i++)
			{	
                System.out.println("Hello "+Thread.currentThread().getName()+"\t"+i);
			}
		}
	}
	public static void other
(String args[])
	{
		other
     ob=new other
    ();
		other
     ob1=new other
    ();
		Thread t1=new Thread(ob);
		Thread t2=new Thread(ob1);
        System.out.println("Hello "+Thread.currentThread().getName());
        t1.setName("First");
        t2.setName("Second");
		t1.start();
		t2.start();
	}
}*/










/*// In this we are using synchronized block for the program
public class other implements Runnable{
    public void run(){
        synchronized(this){
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello "+Thread.currentThread().getName()+"\t"+i);
            }
        }
        
    }
    public static void other
(String[] args) {
        other
     obj = new other
    ();
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);
        System.out.println("Hello "+Thread.currentThread().getName());
        t1.setName("First");
        t2.setName("Second");
        t1.start();
        t2.start();
    }
}*/






/*// In this we are using implements Runnable and we are synchronized keyword to remove the race condition
public class other implements Runnable{
    synchronized public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello "+Thread.currentThread().getName()+"\t"+i);
        }
    }
    public static void other
(String[] args) {
        other
     obj = new other
    ();
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);
        System.out.println("Hello "+Thread.currentThread().getName());
        t1.setName("First");
        t2.setName("Second");
        t1.start();
        t2.start();
    }
}*/






/*// In this we are using implements Runnable instead of extend Thread with this we can use methods which are provided by Runnable interface
public class other implements Runnable{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello "+Thread.currentThread().getName()+"\t"+i);
        }
    }
    public static void other
(String[] args) {
        other
     obMain = new other
    ();
        Thread t1 = new Thread(obMain);
        Thread t2 = new Thread(obMain);
        System.out.println("Hello "+Thread.currentThread());
        t1.setName("First");
        t2.setName("Second");
        t1.start();
        t2.start();
    }
}*/





/*// In this 2 threads are been used and we are setting there name and we are printing their info using currentThread() and we are making those thread for 100 millseconds sleep(100)
public class other extends Thread{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello "+Thread.currentThread().getName()+"\t"+i);
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void other
(String[] args) {
        other
     t1 = new other
    ();
        other
     t2 = new other
    ();
        t1.setName("First");
        t2.setName("Second");
        t1.start();
        t2.start();
    }
}*/












/*// In this 2 threads are used and there name is set using setName() along with the currentThread() info
public class other extends Thread{
    public void run(){
        System.out.println(Thread.currentThread());
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello "+i);
        }

    }

    public static void other
(String[] args) {
        System.out.println(Thread.currentThread());
        other
     t1 = new other
    ();
        other
     t2 = new other
    ();
        t1.setName("First");
        t2.setName("Second");
        t1.start();
        t2.start();
    }
}*/






/*// Printing Threads with currentThread() method which gives info of currentThread()
public class other extends Thread{

    public void run(){
        System.out.println(Thread.currentThread());
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello "+i);
        }
    }
    public static void other
(String[] args) {
        System.out.println(Thread.currentThread());     // currentThread() is used for getting the info of currentThread
        other
     t1 = new other
    ();
        t1.start();

    }
}*/







/*// Simple thread creation and utilization of the thread
public class other extends Thread{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello "+i);
        }
    }
    
    public static void other
(String[] args) {
        other
     t1 = new other
    ();
        t1.start();
    }
    
}*/

