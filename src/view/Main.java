package view;

import controller.ThreadId;

public class Main {
	public static void main(String[] args) {
		
		for(int x = 0; x < 5; x++) {
			ThreadId t = new ThreadId();
			t.start();
		}
		
	}
}
