package com.ibm.cio.esw.yhy;

import java.util.concurrent.TimeUnit;

public class ClassLockTest {
public static void main(String args) {
	Thread thread1 = new Thread(() ->{
		
			MultiThreadFunction.printLetter("thread1");


	});
	
	thread1.start();
	Thread thread2 = new Thread(()->{
		
			MultiThreadFunction.printNum("thread2");

	}); 
	}
}
