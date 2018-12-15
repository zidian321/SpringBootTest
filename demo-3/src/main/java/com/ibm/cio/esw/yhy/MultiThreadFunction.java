package com.ibm.cio.esw.yhy;

public class MultiThreadFunction {
  private static int num = 0;
  public static synchronized void printNum(String threadName) {
	  try {
          for(int i=0;i<26;i++) {
        	  System.out.println(i);
          }
			 Thread.sleep(1000); 
		  }catch (InterruptedException e) {
			  e.printStackTrace();
	       }
  }
  public static synchronized void printLetter(String threadName) {
	  try {
          for(int i=0;i<26;i++) {
        	  System.out.println((char)(i+97));
          }
			 Thread.sleep(1000); 
  
		  }catch (InterruptedException e) {
			  e.printStackTrace();
	       }
  }
}
