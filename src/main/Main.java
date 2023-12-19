package main;

import sort.BubbleSort;
import sort.InsertionSort;
import sort.SelectionSort;

public class Main {
	public static void main(String[] args) {
		// ランダムに数値が入ったしたい配列
		final int[] nums = { 2, 6, 1, 4, 3, 7, 5, 9, 8 };

		// 並び替え処理

		// バブルソート
		BubbleSort bs = new BubbleSort();
		int[] bubbleSort = bs.bubbleSort(coppyArray(nums));
		// 選択ソート（セレクトソート）
		SelectionSort ss = new SelectionSort();
		int[] selectionSort = ss.selectionSort(coppyArray(nums));
		// 挿入ソート
		InsertionSort is = new InsertionSort();
		int[] insertionSort = is.insertionSort(coppyArray(nums));

		// 結果出力

		System.out.println("並び替え前");
		print(nums);
		System.out.println("\n-------------------------------");
		System.out.printf("%-8s経過時間:%,7dナノ秒\n","バブルソート",bs.time);
		print(bubbleSort);
		System.out.println("\n-------------------------------");
		System.out.printf("%-8s経過時間:%,7dナノ秒\n","選択ソート",bs.time);
		print(selectionSort);
		System.out.println("\n-------------------------------");
		System.out.printf("%-8s経過時間:%,7dナノ秒\n","挿入ソート",bs.time);
		print(insertionSort);
	}

	// 配列を出力する
	public static void print(int[] nums) {
		for (int num : nums) {
			System.out.print(num + " ");
		}
	}
	
	// 配列を複製し戻り値として返す
	// ※配列は参照型の為、並び替えメソッドの引数にそのまま渡してしまうと
	// もとの配列を参照して書き換えてしまうため、必ずこのメソッドを呼んで複製する事
	
	public static int[] coppyArray(int[] nums) {
		int[] num = new int[nums.length];
		for(int i = 0; i < nums.length; i++) {
			num[i] = nums[i];
		}
		return num;
	}
}
