package exercise;

import java.util.Scanner;

public class Java8_6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		【問1】FizzBuzzプログラム
//		以下の条件を満たすプログラムを作成してください。
//		1から100まで繰り返す
//		3で割り切れる場合は"Fizz"と表示
//		5で割り切れる場合は"Buzz"と表示
//		3と5で割り切れる場合は"FizzBuzz"と表示
//		そのほかの場合は、数字を表示
//		ループ処理を使用する
		for (var i = 1; i < 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			}
			else if (i % 3 == 0) {
				System.out.println("Fizz");
			}
			else if (i % 5 == 0) {
				System.out.println("Buzz");
			}
			else {
				System.out.println(i);
			}
		};

		
//		【問2】電卓プログラム
//		以下の条件を満たすプログラムを作成してください。
//		処理はユーザーの「続行 / 終了」を聞いて、「終了」を選択された時にプログラムを終了する
//		必ず一回は計算される
//		１つ目の数字を入力させる
//		四則演算を入力させる
//		２つ目の数字を入力させる
//		計算結果を表示する
		Scanner scanner = new Scanner(System.in);
		String val1 = "";
		do {
			System.out.println("1つめの数字を入力してください");
			double num1 = scanner.nextDouble();
			System.out.println("2つめの数字を入力してください");
			double num2 = scanner.nextDouble();
			System.out.println("四則演算を入力してください");
			String operator = scanner.next();
			
			double result = 0;
			
			switch (operator) {
				case "+":
					result = num1 + num2;
					break;
				case "-":
					result = num1 - num2;
					break;
				case "*":
					result = num1 * num2;
					break;
				case "/":
					result = num1 / num2;
					break;
			 }
			 System.out.println(result);
			 
			 System.out.println("続行 / 終了");
			 val1 = scanner.next();
		} while(val1.equals("続行"));
		
		
//		【問3】ソートプログラム
//		以下の条件を満たすプログラムを作成してください。
//		配列のサイズを入力させる（1次元配列）
//		配列のサイズ分だけ繰り返し、ユーザーに数字を入力させる
//		「降順（大きい順）」か「昇順（小さい順）」を選択させる
//		「昇順」「降順」コードをメソッドで実装する
//		メソッドからは返り値を取得し、Mainメソッドでその結果を表示する
//		Javaの既存メソッド（Arrays.sortやCollections.sort）の使用禁止
		
		System.out.println("配列のサイズを入力してください");
		int num3 = scanner.nextInt();
		int[] numbers = new int[num3];
		for (int i = 0; i < num3; i++) {
			System.out.println("数字を入力してください");
			numbers[i] = scanner.nextInt();
		}
		System.out.println("降順か昇順お選びください");
		String num4 = scanner.next();
		sort(num3, numbers, num4);
		
	}
	
	public static void sort(int size, int[] numbers, String num4) {
		for (int i = 0; i < size-1; i++) {
			for (int j = i+1; j < size; j++) {
				if(num4.equals("昇順")) {
					if(numbers[i] > numbers[j]) {
						int bkpNum = numbers[j];
						numbers[j] = numbers[i];
						numbers[i] = bkpNum;
					}
                }
				else if (num4.equals("降順")) {
					if(numbers[i] < numbers[j]) {
						int bkpNum = numbers[j];
						numbers[j] = numbers[i];
						numbers[i] = bkpNum;
                	}
                }
            }
        }
		for (int i = 0; i < size; i++) {
			System.out.println(numbers[i]);
		}
	}
}
