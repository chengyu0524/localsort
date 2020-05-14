package chay.sort;

import java.util.Arrays;

public class sort1 {
	/**
	 * 地精排序
	 * 
	 * @param args
	 */

	public static void goblinSort(int[] str) {
		int i = 0;
		while (i < str.length) {
			if (i == 0 || str[i - 1] <= str[i]) {
				i++;
			} else {
				int temp = str[i];
				str[i] = str[i - 1];
				str[i - 1] = temp;
				i--;
			}
		}
	}

	public static void main(String[] args) {
		int [] str={1,4,3,6,2,5,8};
		System.out.println("排序前："+Arrays.toString(str));
		sort1.goblinSort(str);
		System.out.println("排序后："+Arrays.toString(str));
	}
}
