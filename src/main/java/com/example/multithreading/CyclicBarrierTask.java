package com.examples.multithreadings;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierTask implements Runnable {

	private CyclicBarrier barrier;

	public CyclicBarrierTask(CyclicBarrier barrier) {
		this.barrier = barrier;
	}



	@Override
	public void run() {
		
		try {
			System.out.println(Thread.currentThread().getName()+"is waiting at barrier");
			barrier.await();
			System.out.println(Thread.currentThread().getName()+"all threads cross the barrier ..");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
