package test;


public class Test {
	
	public static void main(String args[])  {
		
		// Create 11 jobs in wait queue
		int m = 11;
		System.out.println("Display original wait queue(priority unsorted).");
		System.out.println("Job#   "+"Job Name"+"  Submitter"+"   priority");
		WaitQueue wQ = new WaitQueue(m);
		for(int i = 0; i < m; i++) {
			String tempStr1 = "JobName"+ Integer.toString(i);
			String tempStr2 = "Submitter"+Integer.toString(i);
			int tempNum = 0 +  (int)(Math.random() * m + 1);
			wQ.getWaitQ().add(new Job(100+i, tempStr1, tempStr2, tempNum));
		}
		// Step a: Display unsorted wait queue
		wQ.display();
		wQ.heapSort();
		System.out.println("\nDisplay sorted wait queue( by priority).");
		wQ.display();
		
		// Step b: move 4 times jobs into ready queue
		// Create a ready queue with 0 element
		ReadyQueue rq = new ReadyQueue(0);
		rq.insert(wQ.getWaitQ().get(0));
		
		
		

        
        
        
        
        
        
       }


}
