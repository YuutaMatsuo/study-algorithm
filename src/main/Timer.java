package main;

public class Timer {
	long startTime;
	long endTime;

	public void start() {
		this.startTime = System.nanoTime();
	}

	public void end() {
		this.endTime = System.nanoTime();
	}

	public long calc() {
		return (this.endTime - this.startTime);
	}
}
