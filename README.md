# Heap_PriorityQueue
                                                        PROJECT 4
PRIORITY QUEUE USING HEAPIFY FUNCTION
1.	A priority queue is an abstract data type which is like a regular queue or some other data structures, but where additionally each element has a "priority" associated with it. In a priority queue, an element with high priority is served before an element with low priority like scheduler.
 If two elements have the same priority, they are served according to their order in the queue.
2.	Use the heapify, build- heap, heap-extract, heap-increase-key, heap-insert, or the heap sort algorithm discussed in the class to implement a priority queue program in any programming language you desire (C++ or java).
a.	The program should be able to insert, delete and update the priority of the jobs.
b.	The jobs should be heapified or be sorted according to their priorities.
c.	Job priorities are to be assigned a number between 1 and 20.
d.	Each job consists of Job #, Job Name, Submitter name, and priority.
3.	The program should take the job #, Job name, Submitter, and Priority as input into “Wait Queue”.  Enter m jobs to Wait queue where 10 < m  < 15 not in sorted order.
a.	Dislay the Wait Queue.
b.	Heapify (or Heap Sort)  the “Wait queue”, display the heapified or sorted Wait Queue
c.	Move the highest priority job from Wait Queue to “Ready Queue”.
Move 4 times. 
Heapify the Wait queue each time the Wait queue is changed. 
Heapify the Ready Queue each time the Ready queue is changed. 
Display the result after 4 moves from Wait queue to Ready Queue.
d.	Delete 2 jobs from Ready queue and display the result.
The Ready queue must be heapified each time the Ready Queue is changed.
Display the result.
e.	Add 2 more jobs to Wait queue, move 3 jobs from Wait queue to
Ready queue, delete 1 job from Ready queue. 
Display the result.
f.	Change the priority of 2 jobs in the Wait Queue, display the result.
g.	You must do more deletions until no more jobs are in the Wait Queue and Ready Queue.
h.	When you display the result, you must include the entire job information, 
not just job #.
i.	When you swap the priorities of two nodes, you must also swap the associated attributes.
j.	When deleting or removing a job, you may assume you are deleting the job with highest priority.
4.	Your program output must show proper information to be understood well by the reader/viewer.
