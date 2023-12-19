package main;

public class Timer {
	long startTime;
	long endTime;

	// 開始時間を記録
	public void start() {
		this.startTime = System.currentTimeMillis();
	}

	// 終了時間を記録
	public void end() {
		this.endTime = System.currentTimeMillis();
	}

	// 終了時間 - 開始時間を計算し経過時間を戻り値として返す
	public long calc() {
		return (this.endTime - this.startTime);
	}
}
