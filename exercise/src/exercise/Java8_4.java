package exercise;

public class Java8_4 {

	public static void main(String[] args) {
//		【課題1】
//		10個の整数を要素とする新しい1次元配列を宣言して初期化し、任意の値を代入する。
//		整数は10、12、14、16、18、20、22、24、26、28とする。
		int [] nuv = new int [10];
		nuv[0] = 10;
		nuv[1] = 12;
		nuv[2] = 14;
		nuv[3] = 16;
		nuv[4] = 18;
		nuv[5] = 20;
		nuv[6] = 22;
		nuv[7] = 24;
		nuv[8] = 26;
		nuv[9] = 28;
//		配列の要素を for ループを使用して順番に表示するプログラム。
//		配列の要素は11,12,13,14,15とする。
		int [] nums = new int [5];
		nums[0] = 11;
		nums[1] = 12;
		nums[2] = 13;
		nums[3] = 14;
		nums[4] = 15;
		for (int i = 0; i<= 4; i++) {
			System.out.println(nums[i]);
		}
//		配列の要素を合計してその結果を表示するプログラム。
//		配列の要素は55,60,70,82とする。
		int [] nums2 = new int [4];
		nums2[0] = 55;
		nums2[1] = 60;
		nums2[2] = 70;
		nums2[3] = 82;
		int sum = 0;
        for (int i: nums2) {
            sum += i;
        }
        System.out.println(sum);
//		配列の要素を for ループを使用して表示し、その中で偶数の場合は「偶数」と、奇数の場合は「奇数」と表示するプログラム
//		配列の要素は5, 8, -1, 2とする。
        int [] nums3 = new int [4];
        nums3[0] = 5;
        nums3[1] = 8;
        nums3[2] = -1;
        nums3[3] = 2;
		for (int j = 0; j<= 3; j++) {
			if(nums3[j]%2 == 0)
			System.out.println("偶数は"+nums3[j]);
			else {
				System.out.println("奇数は"+nums3[j]);
			}
		}
//		配列の要素の合計が特定の閾値を超える場合に「閾値を超えました」と表示するプログラム。
//		閾値は100とする。
		int[] num4 = {10, 50, 100, 150, 200};
		int checkNum = 100;
		for (int i = 0; i < num4.length; i++) {
			if (num4[i] == checkNum) {
				System.out.println("閾値を超えました");
				break;
			}
		}
	
		
//		【課題2】
//		9*9の整数型2次元配列を宣言して初期化し、for文で九九を代入するプログラム
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i * j);
			}
		}
	}

}
