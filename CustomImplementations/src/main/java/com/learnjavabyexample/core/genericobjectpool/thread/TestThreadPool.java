/**
 * 
 */
package com.learnjavabyexample.core.genericobjectpool.thread;

/**
 * @author pmis23
 *
 */
public class TestThreadPool {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ThreadPool pool = new ThreadPool(5);
		
		System.out.println("Number of thread in pool when initialize: " + pool.size());
		
		Runnable t1 = pool.get();
		Runnable t2 = pool.get();
		Runnable t3 = pool.get();
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		
		System.out.println("Number of thread in pool after getting 3 thread from the pool: " + pool.size());
		pool.release(t1);
		pool.release(t3);
		System.out.println("Number of thread in pool after releasing 2 thread: " + pool.size());
	}

}
