package test;

public class Test {

	public static void main(String args[]) {

		// Create 11 jobs in wait queue
		int m = 11;
		System.out.println(
				"\nStep a: Display original wait queue(priority unsorted).");
		System.out.println(
				"Job#   " + "Job Name" + "  Submitter" + "   priority");
		WaitQueue wQ = new WaitQueue(m);
		for (int i = 0; i < m; i++) {
			String tempStr1 = "JobName" + Integer.toString(i);
			String tempStr2 = "Submitter" + Integer.toString(i);
			int tempNum = 0 + (int) (Math.random() * m + 1);
			wQ.getWaitQ().add(new Job(100 + i, tempStr1, tempStr2, tempNum));
		}
		// Step a: Display unsorted wait queue
		wQ.display();

		// Step b: sort wait queue and display
		wQ.heapSort();
		System.out
				.println("\nStep b: Display sorted wait queue( by priority).");
		wQ.display();

		// Step c: move 4 times jobs into ready queue
		// Create a ready queue with 0 element
		ReadyQueue rQ = new ReadyQueue(0);
		for (int i = 0; i < 4; i++) {
			rQ.insert(wQ.getWaitQ().get(0));
			wQ.remove();
		}
		System.out.println(
				"\nStep c: 4 times deletion(wait Q) and addition(ready Q)");
		System.out.println("\nWait Queue:");
		wQ.display();
		System.out.println("\nReady Queue:");
		rQ.display();

		// Step d: delete 2 jobs from ready queue and display
		System.out.println("\nStep d: Removing 2 jobs form ready queue");
		rQ.remove();
		rQ.remove();
		System.out.println("\nWait Queue(no changes in this step):");
		wQ.display();
		System.out.println("\nReady Queue:");
		rQ.display();

		// Step e: add 2 jobs into wait queue
		for (int i = 0; i < 2; i++) {
			String tempStr1 = "JobName2" + Integer.toString(i);
			String tempStr2 = "Submitter2" + Integer.toString(i);
			int tempNum = 0 + (int) (Math.random() * m + 1);
			wQ.setWaitQsize(wQ.getWaitQsize() + 1);
			wQ.getWaitQ().add(new Job(200 + i, tempStr1, tempStr2, tempNum));
			wQ.heapSort();
		}
		// Move 3 jobs from wait queue to ready queue
		for (int i = 0; i < 3; i++) {
			rQ.insert(wQ.getWaitQ().get(0));
			wQ.remove();
		}
		// Delete 1 job from ready queue
		rQ.remove();
		// Display
		System.out.println("\nStep e");
		System.out.println("Wait Queue(add 2 jobs and remove 3 jobs):");

		wQ.display();
		System.out.println(
				"\nReady Queue(add 3 job from wait queue and remove 1 job):");
		rQ.display();

		// Step f: Change 2 priority jobs in the wait queue
		wQ.getWaitQ().get(0).setPriority(1);
		wQ.getWaitQ().get(1).setPriority(1);
		System.out.println("\nStep f");
		System.out
				.println("\nWait Queue(change first two jobs' priority to 1):");
		wQ.heapSort();
		wQ.display();

		// Step g: remove all rest jobs , display
		while (wQ.getWaitQsize() != 0) {
			rQ.insert(wQ.getWaitQ().get(0));
			wQ.remove();
		}

		while (rQ.getReadyQsize() != 0) {
			rQ.remove();
		}
		System.out.println("\nStep f");
		System.out.println("\nWait Queue(empty):");
		wQ.display();
		System.out.println("\nReady Queue(empty):");
		rQ.display();
	}
}
