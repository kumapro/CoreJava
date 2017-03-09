package com.learnjavabyexample.core.genericobjectpool;

/**
 * @author pmis23
 *
 */
public interface Pool<T> {

	/**
	 * @return one of the pooled objects
	 */
	T get();

	/**
	 * @param object T to be return back to pool
	 * 
	 */
	void release(T object);

	/**
	 * Shuts down the pool. Should release all resources.
	 */

	void shutdown();

}
