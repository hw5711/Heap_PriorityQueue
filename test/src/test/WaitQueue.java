package test;

import java.util.ArrayList;
import java.util.Collections;

public class WaitQueue {
	int waitQsize;
	ArrayList<Job> waitQ;// = new ArrayList<Job>();

	public WaitQueue(int waitQsize) {
		super();
		this.waitQsize = waitQsize;
		this.waitQ = new ArrayList<Job>();
	}

	public int getWaitQsize() {
		return this.waitQsize;
	}

	public void setWaitQsize(int waitQsize) {
		this.waitQsize = waitQsize;
	}

	public ArrayList<Job> getWaitQ() {
		return this.waitQ;
	}

	public void setWaitQ(ArrayList<Job> waitQ) {
		this.waitQ = waitQ;
	}

	public void display() {

		for (int i = 0; i < this.waitQsize; i++) {
			System.out.println(this.waitQ.get(i).getJobNum() + "   "
					+ this.waitQ.get(i).getJobName() + "   "
					+ this.waitQ.get(i).getSubmitter() + "     "
					+ this.waitQ.get(i).getPriority());
		}
	}

	// heap sort
	public static void buildheap(ArrayList<Job> waitQ) {

		for (int i = (waitQ.size() - 1) / 2; i >= 0; i--) {
			heapify(waitQ, i, waitQ.size() - 1);
		}
	}

	public static void heapify(ArrayList<Job> waitQ, int i, int size) {
		int left = 2 * i + 1;
		int right = 2 * i + 2;
		int max;
		if (left <= size
				&& waitQ.get(left).getPriority() < waitQ.get(i).getPriority()) {
			max = left;
		} else {
			max = i;
		}

		if (right <= size && waitQ.get(right).getPriority() < waitQ.get(max)
				.getPriority()) {
			max = right;
		}
		// If max is not current node, exchange it with max of left and right
		// child
		if (max != i) {
			Collections.swap(waitQ, i, max);
			heapify(waitQ, max, size);
		}
	}

	public void heapSort() {

		buildheap(this.waitQ);
		int sizeOfHeap = this.waitQ.size() - 1;
		for (int i = sizeOfHeap; i > 0; i--) {
			Collections.swap(this.waitQ, 0, i);
			sizeOfHeap = sizeOfHeap - 1;
			heapify(this.waitQ, 0, sizeOfHeap);
		}
	}

	// Delete the root
	public void remove() {
		if (this.waitQsize == 0)
			System.out.println("Heap is empty");
		else {
			//this.waitQ.add(0,this.waitQ.get(this.waitQsize-1));
			this.waitQ.remove(0);
			this.waitQsize--;
			if (this.waitQsize > 0)
				siftDown(0);
		}
	}

	public void siftDown(int nodeIndex) {
		int leftChildIndex, rightChildIndex, minIndex;
		leftChildIndex = 2 * nodeIndex;
		rightChildIndex = 2 * nodeIndex + 1;
		if (rightChildIndex >= this.waitQsize) {
			if (leftChildIndex >= this.waitQsize)
				return;
			else
				minIndex = leftChildIndex;
		} else {
			if (this.waitQ.get(leftChildIndex).getPriority() >= this.waitQ.get(rightChildIndex).getPriority())
				minIndex = leftChildIndex;
			else
				minIndex = rightChildIndex;
		}
		if (this.waitQ.get(nodeIndex).getPriority() < this.waitQ.get(minIndex).getPriority() ) {
			Collections.swap(this.waitQ, minIndex, nodeIndex);
			siftDown(minIndex);
		}
	}

}
