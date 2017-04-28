package com.examples.multithreadings;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierSolution {
	
	public static void main(String[] args) {
		Runnable barrier = ()->System.out.println("Reached barrier .. closing actions will call");
		final CyclicBarrier cyclicBarier = new CyclicBarrier(3, barrier);
		
		Thread t1= new Thread(new CyclicBarrierTask(cyclicBarier),"Thread 1");
		Thread t2= new Thread(new CyclicBarrierTask(cyclicBarier),"Thread 2");
		Thread t3= new Thread(new CyclicBarrierTask(cyclicBarier),"Thread 3");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
