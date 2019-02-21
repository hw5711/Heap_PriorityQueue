package test;

public class Job {

	int jobNum;
	String jobName;
	String submitter;
	int priority;
	
	
	public Job(int jobNum, String jobName, String submitter, int priority) {
		super();
		this.jobNum = jobNum;
		this.jobName = jobName;
		this.submitter = submitter;
		this.priority = priority;
	}


	public int getJobNum() {
		return jobNum;
	}


	public void setJobNum(int jobNum) {
		this.jobNum = jobNum;
	}


	public String getJobName() {
		return jobName;
	}


	public void setJobName(String jobName) {
		this.jobName = jobName;
	}


	public String getSubmitter() {
		return submitter;
	}


	public void setSubmitter(String submitter) {
		this.submitter = submitter;
	}


	public int getPriority() {
		return priority;
	}


	public void setPriority(int priority) {
		this.priority = priority;
	}
	
	
	
	
}
