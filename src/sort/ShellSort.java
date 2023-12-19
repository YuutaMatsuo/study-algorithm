package sort;

import main.Timer;

public class ShellSort {
	Timer timer = new Timer();
	public long time;

	public int[] shellSort(int[] nums) {
		// シェルソート

		// 計測開始
		timer.start();

		// シェルソートの最初の間隔(h)を決める
		int h = 1;
		while ((h * 3) + 1 <= nums.length / 9) {
			h = (h * 3) + 1;
		}

		int j, tmp;

		// 間隔(h)を狭めていく
		while (h >= 1) {
			for (int i = 1; i <= nums.length - 1; i++) {
				j = i;
				while (j >= h && nums[j - h] > nums[j]) {
					// 交換処理
					tmp = nums[j];
					nums[j] = nums[j - h];
					nums[j - h] = tmp;
					j -= h;
				}
			}
			h /= 2;
		}

		// 計測終了
		timer.end();
		this.time = timer.calc();
		return nums;
	}
}
