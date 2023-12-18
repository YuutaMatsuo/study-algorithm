package sort;

public class SelectionSort {
	public int[] selectionSort(int[] nums) {
		// セレクトソート

		/*
		 * 未整列の範囲を１つずつ後ろへずらしていくための繰り返しと その範囲の中で一番小さい要素の場所を探し出すための繰り返し
		 * を組み合わせた２重ループの構造になります
		 */
		
		// 外側のループ：配列の最初の要素（i=0)から最後の要素の１つ手前（.length -2)に向かって後ろへ進む
		int i, j, tmp, min;
		for (i = 0; i <= nums.length - 2; i++) {
			min = i;
			// 内側のループ：ｊは未整列の範囲の先頭（ i )から最後の要素（.length - 1）に向かって後ろへ進む
			for (j = i; j <= nums.length - 1; j++) {
				// 仮の最小値を指す変数をminとして、各要素のj番目が仮の最小値よりも小さければminにjを代入する
				if (nums[j] < nums[min]) {
					min = j;
				}
			}
			// ループが終わったら未整列の範囲の先頭（i番目)と仮の最小値（min)を交換する
			tmp = nums[i];
			nums[i] = nums[min];
			nums[min] = tmp;
		}
		return nums;
	}
}
