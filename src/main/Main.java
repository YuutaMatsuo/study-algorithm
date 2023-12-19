package main;

import java.util.Random;

import sort.BubbleSort;
import sort.InsertionSort;
import sort.SelectionSort;

public class Main {
	public static void main(String[] args) {
		int[] nums = createArray(7000);

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
		System.out.println("各種ソートによる配列の並び替え\n");
		printResult(nums, "並び替え前", 0);
		System.out.println("-----------------------------------------");
		printResult(bubbleSort, "バブルソート", bs.time);
		printResult(selectionSort, "選択ソート", ss.time);
		printResult(insertionSort, "挿入ソート", is.time);
		System.out.println("-----------------------------------------");
	}

	// 結果を出力する
	public static void printResult(int[] nums, String text, long time) {
		System.out.printf("%-7s経過時間:%6dミリ秒 配列 >>  ", text, time);
		
		// 配列を表示させない場合は下のコードをコメントアウトし、println();のコメントアウトを外してください
		System.out.println(printArray(nums));
//		System.out.println();
	}

	// 配列の要素をすべて出力する
	public static String printArray(int[] nums) {
		StringBuilder sb = new StringBuilder();
		for (int num : nums) {
			sb.append(num + " ");
		}
		return sb.toString();
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
			nums[i] = random.nextInt(1, 99);
		}
		return nums;
	}
}
