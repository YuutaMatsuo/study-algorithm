package sort;

public class BubbleSort {

	public int[] bubbleSort(int[] nums) {
		// バブルソート

		/*
		 * バブルソートは未整列の範囲を1つずつ後ろへずらして行くための繰り返しと、 その範囲の中で一番しい最要素を戦闘に移動するための繰り返しを組み合わせた
		 * 二重ループの構造になる
		 */

		// 外側のループ：配列の最初の要素（i=0) から最後の要素の1つ手前 (.length -2) に向かって後ろに進む
		for (int i = 0; i <= nums.length - 2; i++) {
			// 内側のループ：配列の最後の要素（.length -1）から外側のループの銭湯から１つ後ろ（i+1)に向かって前へ進む
			for (int j = nums.length - 1; j >= i + 1; j--) {
				// ループカウターが指している場所にある要素（j番目)と１つ手前（j-１）番目を比較して並べたい順番と大小が逆だったら交換する
				if (nums[j - 1] > nums[j]) {
					int tmp = nums[j];
					nums[j] = nums[j - 1];
					nums[j - 1] = tmp;
				}
			}
		}
		return nums;
	}
}
