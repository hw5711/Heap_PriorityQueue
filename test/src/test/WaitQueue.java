package test;

import java.util.ArrayList;

public class WaitQueue {
	int waitQsize;
	ArrayList<Job> waitQ = new ArrayList<Job>();
	
	public WaitQueue(int waitQsize, ArrayList<Job> waitQ) {
		super();
		this.waitQsize = waitQsize;
		this.waitQ = waitQ;
	}

}
