package communityuni.com.test;

import communityuni.com.model.MyThread;

public class TestMyThread {

	public static void main(String[] args) {
		MyThread th1=new MyThread();
		th1.start();
		
		MyThread th2=new MyThread();
		th2.start();
		
		MyThread th3=new MyThread();
		th3.start();
	}

}
