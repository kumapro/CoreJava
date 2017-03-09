package com.learnjavabyexample.core.genericobjectpool.connection;

import java.sql.Connection;

public class TestConnectionPool {

	public static void main(String[] args) {
		ConnectionPool pool = new ConnectionPool(10);
		
		System.out.println("pool creation completed");
		System.out.println("Pool size before taking any:  " + pool.size());
		Connection p1 = pool.get();
		Connection p2 = pool.get();
		Connection p3 = pool.get();
		Connection p4 = pool.get();
		Connection p5 = pool.get();
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);

		System.out.println("Pool size after taking 5 Connection from pool : " + pool.size());
		
		pool.release(p4);
		pool.release(p2);
		
		
		System.out.println("Pool size after releasing 2 Connection from pool : " + pool.size());
		
		
		

	}

}
