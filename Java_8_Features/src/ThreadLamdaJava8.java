
public class ThreadLamdaJava8 {
	
	//We create a thread in java in 2 ways :
	// 1.	By implementing Runnable Interface
	// 2.	By extending Thread Class
	
	public static void main(String[] args) {
		//At this point only one main thread will be there
		
		Runnable r = () -> {
			for(int i=0;i<10;i++) {
				System.out.println("Child Thread");
			}
		};
		Thread t = new Thread(r);
		t.start();
		//After t.start() , 
		//there will be 2 threads one is the MAIN THREAD and the second one will be CHILD THREAD
		//
		//Both thread will execute simultaneously, one will execute main and one will execute child thread
		
		for( int i=0;i<10;i++) {
			System.out.println("Main Thread");
		}
		
		//So we don't have the output in the same order, Some time child thread first then main thread
		//sometime main thread and then child thread
		//each time we get different output
	}

}
