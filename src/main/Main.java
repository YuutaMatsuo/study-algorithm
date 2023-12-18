package main;

import sort.BubbleSort;
import sort.SelectionSort;

public class Main {
	public static void main(String[] args) {
		// ランダムに数値が入ったしたい配列
		final int[] nums = { 2, 6, 1, 4, 3, 7, 5, 9, 8 };
		
		// 並び替え処理

		// バブルソート
		BubbleSort bs = new BubbleSort();
		int[] bubbleSort = bs.bubbleSort(nums);
		// 選択ソート（セレクトソート）
		SelectionSort ss = new SelectionSort();
		int[] selectionSort = ss.selectionSort(nums);

		
		// 結果出力
		
		System.out.println("並び替え前");
		print(nums);
		System.out.println("\n-------------------------------");
		System.out.println("バブルソート");
		print(bubbleSort);
		System.out.println("\n-------------------------------");
		System.out.println("選択ソート");
		print(selectionSort);
	}

	// 配列を出力する
	public static void print(int[] nums) {
		for (int num : nums) {
			System.out.print(num + " ");
		}
	}
}
