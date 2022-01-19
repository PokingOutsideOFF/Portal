package varName;
/*class newthread extends Thread
{
	Thread t1,t2;
	newthread()
	{
		t1=new Thread(this,"Thread_1");
		t2=new Thread(this,"Thread 2");
		t1.start();
		t2.start();
	}
	public void run()
	{
		t2.setPriority(Thread.MAX_PRIORITY);
		System.out.print(t1.equals(t2));
	}
}*/
class display
{
	int x;
	void show()
	{
		if(x>1)
			System.out.print(x+" ");
	}
}
public class muli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display[] arr=new display[3];
		for(int i=0;i<3;i++)
			arr[i]=new display();
		arr[0].x=0;
		arr[1].x=1;
		arr[2].x=2;
		for(int i=0;i<3;i++)
			arr[i].show();
	}

}
