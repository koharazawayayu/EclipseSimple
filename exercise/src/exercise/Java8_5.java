package exercise;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Java8_5 {

	public static void main(String[] args) {
		// 【課題1】Scannerクラス
		Scanner scanner = new Scanner(System.in);
//		ユーザーに2つの整数を入力させ、これらの整数の和を計算するプログラムの作成
		System.out.println("1つめの整数を入力してください");
		int val1 = Integer.parseInt(scanner.nextLine());
		System.out.println("２つめの整数を入力してください");
		int val2 = Integer.parseInt(scanner.nextLine());
		System.out.println(val1 + val2);
		
//		円の半径をユーザーに入力させ、円の面積を計算するプログラムの作成
		System.out.println("半径を入力してください");
		int val3 = Integer.parseInt(scanner.nextLine());
		System.out.println(val3 * val3 * 3.14);
		
		
//		【課題2】Mathクラス
//		2つの整数をユーザーに入力させ、それらの整数の最大公約数（GCD）を求めるプログラムの作成
		System.out.println("1つめの整数を入力してください");
		String val4 = scanner.nextLine();
		System.out.println("２つめの整数を入力してください");
		String val5 = scanner.nextLine();
		BigInteger a, b;
		a = new BigInteger(val4);
        b = new BigInteger(val5);
		System.out.println(a.gcd(b));
//		ユーザーに入力させた浮動小数点数の平方根を求めるプログラムの作成
		System.out.println("数字を入力してください");
		int val6 = Integer.parseInt(scanner.nextLine());
		System.out.println(Math.sqrt(val6));

//		【課題3】Randomクラス
//		サイコロを模したランダムな数(1-6)を生成し、ユーザーがサイコロの目を予想するプログラムの作成
		System.out.println("サイコロの目を予想してください");
		String val7 = scanner.nextLine();
		Random random = new Random();
		int randomNumber = random.nextInt(6) + 1;
		System.out.println(randomNumber);
		

		scanner.close();
		
		stringReverse("ABCDEFG");
		
		double ave = intAverage(2, 7, 1);
		System.out.println(ave);
		
		
	}
	
//	【課題4】メソッド作成
//	文字列を引数として受け取り、その文字列を逆順にして表示するメソッドの作成
//	文字列はABCDEFGとする。
		
	public static void stringReverse(String val) {
		StringBuilder sb = new StringBuilder();

		sb.append(val);
		System.out.println(sb.toString());  // ABCDEFG

		sb.reverse();
		System.out.println(sb.toString());  // GFEDCBA
	}
		
	
//	3つの整数を引数として受け取り、それらの整数の平均を返すメソッドを作成
//	整数は2, 7, 1とする。
		public static double intAverage(int a, int b, int c) {
			int[] nums = {a, b, c};
	 		double average = Arrays.stream(nums).average().getAsDouble();
	 		return average;
	    }

}
