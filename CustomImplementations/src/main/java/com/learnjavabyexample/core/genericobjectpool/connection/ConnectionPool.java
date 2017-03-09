package com.learnjavabyexample.core.genericobjectpool.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.learnjavabyexample.core.genericobjectpool.ObjectPool;

/**
 * @author pmis23
 *
 */
public class ConnectionPool extends ObjectPool<Connection> {
	static {
		loadDriver();
	}

	public ConnectionPool(int size) {
		super(size);
	}

	private static void loadDriver() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			// System.out.println("Driver Loaded");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Connection createNew() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521", "system", "admin");
			// System.out.println("Connection Created..." + connection);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}

}
