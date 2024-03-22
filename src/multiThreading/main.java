








/*
 In this we have used the synchronized in the run().*/
 public class main implements Runnable
{
    public void run()
    {
        synchronized(this)
        {
            for(int i=0;i<5;i++)
            {	
                System.out.println("Hello"+i);
            }
        }

    }
    public static void main(String args[])
    {
        main ob=new main();
        Thread t1=new Thread(ob);
        Thread t2=new Thread(ob);
        t1.start();
        t2.start();
    }
}











/*
 We used the synchronized it is used to overcome the Race Condition so that we can see 
 the output in the sequence
 
public class main implements Runnable
{
	synchronized public void run()
	{
		for(int i=0;i<5;i++)
		{	
			System.out.println("Hello"+i);
		}
	}
	public static void main(String args[])
	{
		main ob=new main();
		Thread t1=new Thread(ob);	
		Thread t2=new Thread(ob);
		t1.start();
		t2.start();
	}
}
 */









/*
 In this we have used implements Runnable instead of extend Thread
 public class main implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{	
			System.out.println("Hello"+i);
		}
	}
	public static void main(String args[])
	{
		main ob=new main();
		Thread t1=new Thread(ob);    //------------ ob is object of that class which implements runable
		Thread t2=new Thread(ob);
		t1.start();
		t2.start();
	}
}
 */












/*
 In this we have used sleep() for when the thread is used for the program
 it take some pause for sleep()
 public class main extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{	
			System.out.println("Hello  "+Thread.currentThread().getName()+"\t"+i);
			try
			{
				Thread.sleep(100);
			}
			catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}
		}
	}
	public static void main(String args[])
	{
		main t1=new main();
		main t2=new main();
		t1.setName("first");
		t2.setName("second");
		t1.start();
		t2.start();
	}
}
 */







/*
 More than one User was taken in for this Thread
 public class main extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread());
		for(int i=0;i<5;i++)
		{	
			System.out.println("Hello"+i);
		}
	}
	public static void main(String args[])
	{
System.out.println(Thread.currentThread());
		main t1=new main();
		main t2=new main();
		t1.setName("first");
		t2.setName("second");
		t1.start();
		t2.start();
	}
}
 */






/*
 This program works same as that of normal Class
 public class main extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Hello"+i);
		}
	}
	public static void main(String args[])
	{
		main t1=new main();
		t1.setName("first");
		t1.run();
	}
}
 */






/*
 currentThread() gives you name of currentThread()
 public class main extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread());
		for(int i=0;i<5;i++)
		{
			System.out.println("Hello"+i);
		}
	}
	public static void main(String args[])
	{
		System.out.println(Thread.currentThread());
		main t1=new main();
		t1.setName("first");
		t1.start();
	}
}
 */



/*
This is for Extends Thread
 public class main extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Hello"+i);
		}
	}
	public static void main(String args[])
	{
		main t1=new main();
		t1.start();
	}
}
 */

