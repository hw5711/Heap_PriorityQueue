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
	// Display 
	public void display() {

		for (int i = 0; i < this.readyQsize; i++) {
			System.out.println(this.readyQ.get(i).getJobNum() + "   "
					+ this.readyQ.get(i).getJobName() + "   "
					+ this.readyQ.get(i).getSubmitter() + "     "
					+ this.readyQ.get(i).getPriority());
		}
	}

	// Insert job
	public void insert(Job value) {
			this.readyQsize++;
			this.readyQ.add(this.readyQsize - 1,value);
			siftUp(this.readyQsize - 1);
	}

	private void siftUp(int nodeIndex) {
		int parentIndex;
		if (nodeIndex != 0) {
			parentIndex = nodeIndex/2;
			if (this.readyQ.get(parentIndex).getPriority() < this.readyQ.get(nodeIndex).getPriority()) {
				Collections.swap(this.readyQ, parentIndex, nodeIndex);
				siftUp(parentIndex);
			}
		}
	}
	
	// Delete job
	// Delete the root
	public void remove() {
		if (this.readyQsize == 0)
			System.out.println("Heap is empty");
		else {
			//this.waitQ.add(0,this.waitQ.get(this.waitQsize-1));
			this.readyQ.remove(0);
			this.readyQsize--;
			if (this.readyQsize > 0)
				siftDown(0);
		}
	}

	public void siftDown(int nodeIndex) {
		int leftChildIndex, rightChildIndex, minIndex;
		leftChildIndex = 2 * nodeIndex;
		rightChildIndex = 2 * nodeIndex + 1;
		if (rightChildIndex >= this.readyQsize) {
			if (leftChildIndex >= this.readyQsize)
				return;
			else
				minIndex = leftChildIndex;
		} else {
			if (this.readyQ.get(leftChildIndex).getPriority() >= this.readyQ.get(rightChildIndex).getPriority())
				minIndex = leftChildIndex;
			else
				minIndex = rightChildIndex;
		}
		if (this.readyQ.get(nodeIndex).getPriority() < this.readyQ.get(minIndex).getPriority() ) {
			Collections.swap(this.readyQ, minIndex, nodeIndex);
			siftDown(minIndex);
		}
	}
	

}
