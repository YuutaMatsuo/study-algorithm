package main;

import java.util.Random;

import sort.BubbleSort;
import sort.InsertionSort;
import sort.SelectionSort;

public class Main {
	public static void main(String[] args) {

		// 並び替え処理

		// バブルソート
		BubbleSort bs = new BubbleSort();
		int[] bubbleSort = bs.bubbleSort(createArray(10000));
		// 選択ソート（セレクトソート）
		SelectionSort ss = new SelectionSort();
		int[] selectionSort = ss.selectionSort(createArray(10000));
		// 挿入ソート
		InsertionSort is = new InsertionSort();
		int[] insertionSort = is.insertionSort(createArray(10000));

		// 結果出力

		System.out.printf("%-8s経過時間:%,10dミリ秒\n", "バブルソート", bs.time);
		print(bubbleSort);
		System.out.println("-----------------------------------------\n");
		System.out.printf("%-8s経過時間:%,10dミリ秒\n", "選択ソート", bs.time);
		print(selectionSort);
		System.out.println("-----------------------------------------\n");
		System.out.printf("%-8s経過時間:%,10dミリ秒\n", "挿入ソート", bs.time);
		print(insertionSort);
		System.out.println("-----------------------------------------\n");
	}

	// 配列を出力する
	public static void print(int[] nums) {
		StringBuilder sb = new StringBuilder();
		for (int num : nums) {
			sb.append(num + " ");
		}
		System.out.println(sb);
	}

	// 配列を複製し戻り値として返す
	// ※配列は参照型の為、並び替えメソッドの引数にそのまま渡してしまうと
	// もとの配列を参照して書き換えてしまうため、必ずこのメソッドを呼んで複製する事
	public static int[] coppyArray(int[] nums) {
		int[] num = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			num[i] = nums[i];
		}
		return num;
	}

	// 配列を生成する
	public static int[] createArray(int num) {
		Random random = new Random();
		int[] nums = new int[num];
		for (int i = 0; i < num; i++) {
			nums[i] = random.nextInt(100);
		}
		return nums;
	}
}
