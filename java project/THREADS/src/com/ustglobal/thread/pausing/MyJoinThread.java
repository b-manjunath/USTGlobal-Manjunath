package com.ustglobal.thread.pausing;

public class MyJoinThread extends Thread {
	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("Child Thread");
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
