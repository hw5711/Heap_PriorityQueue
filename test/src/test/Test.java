package test;

import java.io.IOException;
import java.util.ArrayList;

public class Test {
	
	public static void main(String args[])  {
		
		// Create 11 jobs in wait queue
		int m = 11;
		System.out.println("Display original wait queue(priority unsorted.");
		System.out.println("Job#   "+"Job Name"+"  Submitter"+" priority");
		for(int i = 0; i < m; i++) {
			String tempStr1 = "JobName"+ Integer.toString(i);
			String tempStr2 = "Submitter"+Integer.toString(i);
			int tempNum = 0 +  (int)(Math.random() * m + 1);
			ArrayList<Job> rQ = new ArrayList<Job>();
			rQ.add(new Job(100+i, tempStr1, tempStr2, tempNum));
			
		}

        
        
        
        
        
        
       }


}
