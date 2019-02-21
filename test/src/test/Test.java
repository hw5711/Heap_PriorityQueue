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
		
		// Step b: sort wait queue and display
		wQ.heapSort();
		System.out.println("\nDisplay sorted wait queue( by priority).");
		wQ.display();
		
		// Step c: move 4 times jobs into ready queue
		// Create a ready queue with 0 element
		ReadyQueue rQ = new ReadyQueue(0);
		for(int i = 0; i< 4; i++) {
		rQ.insert(wQ.getWaitQ().get(0));
		wQ.remove();
		}
		System.out.println("\nAfter 4 times deletion(wait Q) and addition(ready Q)");
		System.out.println("Wait Queue:");
		wQ.display();
		System.out.println("\nReady Queue:");
		rQ.display();
		
		// Step d: delete 2 jobs from ready queue and display
		rQ.remove();
		rQ.remove();
		System.out.println("\nAfter removing 2 jobs form ready queue");
		rQ.display();
		
		
		// Step e: add 2 jobs into wait queue
		for(int i = 0; i < 2; i++) {
			String tempStr1 = "JobName2"+ Integer.toString(i);
			String tempStr2 = "Submitter2"+Integer.toString(i);
			int tempNum = 0 +  (int)(Math.random() * m + 1);
			wQ.getWaitQ().add(new Job(200+i, tempStr1, tempStr2, tempNum));
		}
		// Move 3 jobs from wait queue to ready queue
		for(int i = 0; i< 3; i++) {
			rQ.insert(wQ.getWaitQ().get(0));
			wQ.remove();
		}
		// Delete 1 job from ready queue
		rQ.remove();
		// Display
		System.out.println("\nAfter step e");
		System.out.println("Wait Queue:");
		wQ.display();
		System.out.println("\nReady Queue:");
		rQ.display();
		
        
        
       }


}
