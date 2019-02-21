package test;

import java.util.ArrayList;
import java.util.Collections;

public class ReadyQueue {

	int readyQsize;
	ArrayList<Job> readyQ;// = new ArrayList<Job>();

	public ReadyQueue(int readyQsize) {
		super();
		this.readyQsize = readyQsize;
		this.readyQ = new ArrayList<Job>();
	}

	public int getReadyQsize() {
		return readyQsize;
	}

	public void setReadyQsize(int readyQsize) {
		this.readyQsize = readyQsize;
	}

	public ArrayList<Job> getReadyQ() {
		return readyQ;
	}

	public void setReadyQ(ArrayList<Job> readyQ) {
		this.readyQ = readyQ;
	}

	// Insert job
	public void insert(Job value) {
		if (this.readyQsize == this.readyQ.size())
			System.out.println("Heap's underlying storage is overflow");
		else {
			this.readyQsize++;
			this.readyQ.add(this.readyQsize - 1,value);
			siftUp(this.readyQsize - 1);
		}
	}

	private void siftUp(int nodeIndex) {
		int parentIndex;
		if (nodeIndex != 0) {
			parentIndex = nodeIndex/2;
			if (this.readyQ.get(parentIndex).getPriority() > this.readyQ.get(nodeIndex).getPriority()) {
				Collections.swap(this.readyQ, parentIndex, nodeIndex);
				siftUp(parentIndex);
			}
		}
	}

}
