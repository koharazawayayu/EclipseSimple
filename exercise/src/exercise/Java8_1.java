package exercise;

public class Java8_1 {

	public static void main(String[] args) {

//		【問題1】変数について
//		int型の変数 num を宣言して、好きな数字を代入してください。
		int num = 75;
//		String型の変数 name を宣言し、自分の名前を代入してください。
		String name = "yayu";
//		double型の定数 PI を宣言し、3.14を代入してください。
		double PI = 3.14;
//		上記を System.out.println() を使用して出力してください。
		System.out.println(num);
		System.out.println(name);
		System.out.println(PI);
//		【問題2】型について
//		整数型の変数 myInt を宣言し、任意の整数で初期化してください。
		int myInt = 25; 
//		浮動小数点型の変数 myDouble を宣言し、myInt の値を利用して初期化してください。
		double myDouble = myInt; 
//		文字型の変数 myChar を宣言し、好きなアルファベット1文字で初期化してください。
		char myChar = 'a';
//		真偽型の変数 myBoolean を宣言し、条件式を用いて初期化してください。
		boolean myBoolean = myInt == 25;
//		文字列型の変数 myString を宣言し、自分の名前で初期化してください。
		String myString = "yayu";
//		【問題3】演算子について
//		任意の整数型の変数 a と b を宣言し、それぞれの値を代入、出力してください。
		int a;
		int b;
		a = 7;
		b = 3;
		System.out.println(a);
		System.out.println(b);
//		a と b の和を表す変数 sumResult を宣言し、和を計算して出力してください。
		int sumResult = a + b;
		System.out.println(sumResult);
//		a と b の差を表す変数 differenceResult を宣言し、差を計算して出力してください。
		int differenceResult = a - b;
		System.out.println(differenceResult);
//		a と b の積を表す変数 productResult を宣言し、積を計算して出力してください。
		int productResult = a * b;
		System.out.println(productResult);
//		a と b の商を表す変数 quotientResult を宣言し、商を計算して出力してください。
		int quotientResult = a / b;
		System.out.println(quotientResult);
//		a と b の剰余を表す変数 remainderResult を宣言し、剰余を計算して出力してください。
		int remainderResult = a % b;
		System.out.println(remainderResult);
//		a が b と等しいかどうかを表す変数 isEqual を宣言し、結果を出力してください。
		boolean isEqual = a == b;
		System.out.println(isEqual);
//		a が b より大きいかどうかを表す変数 isGreater を宣言し、結果を出力してください。
		boolean isGreater = a > b;
		System.out.println(isGreater);
//		a が b より小さいかどうかを表す変数 isLess を宣言し、結果を出力してください。
		boolean isLess = a < b;
		System.out.println(isLess);
//		【問題4】
//		三角形の面積を求められるプログラム（小数以下は必要ありません）
		int bottom = 12;
		int hight = 7;
		int area = bottom * hight / 2;
//		 円の面積を求められるプログラム（円周率は3.14でお願いします）
		int radius = 8; 
		double circle = radius * radius * 3.14; 
	}

}
