package test;

import java.util.ArrayList;

public class WaitQueue {
	int waitQsize;
	ArrayList<Job> waitQ;// = new ArrayList<Job>();

	public WaitQueue(int waitQsize) {
		super();
		this.waitQsize = waitQsize;
		this.waitQ = new ArrayList<Job>();
	}

	public int getWaitQsize() {
		return waitQsize;
	}

	public void setWaitQsize(int waitQsize) {
		this.waitQsize = waitQsize;
	}

	public ArrayList<Job> getWaitQ() {
		return waitQ;
	}

	public void setWaitQ(ArrayList<Job> waitQ) {
		this.waitQ = waitQ;
	}

	public void display() {

		for (int i = 0; i < this.waitQsize; i++) {
			System.out.println(this.waitQ.get(i).getJobNum() + " "
					+ this.waitQ.get(i).getJobName() + " "
					+ this.waitQ.get(i).getSubmitter()+" "+this.waitQ.get(i).getPriority());
		}
	}

}
