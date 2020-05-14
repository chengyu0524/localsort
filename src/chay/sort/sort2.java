package chay.sort;

import java.util.Arrays;

public class sort2 {
	/**
	 * 冒泡排序
	 * 
	 * @param args
	 */

	public static int[] goblinSort(int[] str) {
		if (str.length <= 1) {
			return str;
		}

		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str.length - 1 - i; j++) {
				System.out.println(str[j + 1]+"---"+str[j]);
				if (str[j + 1] < str[j]) {
					int temp = str[j + 1];
					str[j + 1] = str[j];
					str[j] = temp;
				}
			}
			System.out.println("第"+i+"次排序"+Arrays.toString(str));
		}
		return str;

	}

	public static void main(String[] args) {
		int[] str = { 7, 4, 3, 6, 2, 5, 8 };
		System.out.println("排序前：" + Arrays.toString(str));
		sort2.goblinSort(str);
		System.out.println("排序后：" + Arrays.toString(str));
	}

}
