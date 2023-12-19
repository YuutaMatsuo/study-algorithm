package sort;

import main.Timer;

public class InsertionSort {
	Timer timer = new Timer();
	public long time;
	// 挿入ソート

	public int[] insertionSort(int[] nums) {
		int j;

		// 計測開始
		timer.start();
		for (int i = 1; i <= nums.length - 1; i++) {
			j = i;
			while (j >= 1 && nums[j - 1] > nums[j]) {
				int tmp = nums[j];
				nums[j] = nums[j - 1];
				nums[j - 1] = tmp;
				j -= 1;
			}
		}
		// 計測終了
		timer.end();
		this.time = timer.calc();
		return nums;
	}
}
