package Multi_Threading;

public class Thread_Sync 
{
	private int c=0;
	
	public  synchronized void inc()
	{
		c++;
	}
	
	public  synchronized  int get()
	{
		return c;
	}
}
