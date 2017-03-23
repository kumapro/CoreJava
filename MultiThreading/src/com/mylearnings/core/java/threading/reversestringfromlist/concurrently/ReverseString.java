package com.mylearnings.core.java.threading.reversestringfromlist.concurrently;

import java.util.concurrent.Callable;

public class ReverseString implements Callable<String> {

	String strToreverse;

	public ReverseString(String strToreverse) {
		this.strToreverse = strToreverse;
	}

	@Override
	public String call() throws Exception {
		return new StringBuffer(strToreverse).reverse().toString();
	}

}
