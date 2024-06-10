package exercise;

public class Java8_2 {

	public static void main(String[] args) {
//		【課題1】if文の使用
//		任意の整数型の変数 score を宣言し、任意の値で初期化してください。
		int score = 35;
//		score が80以上ならば「合格」と表示し、それ未満ならば「不合格」と表示してください。
		if (score >= 80) {
			System.out.println("合格");
		} else {
			System.out.println("不合格");
		}
//		【課題2】switch文の使用
//		1から7までの整数型の変数 dayOfWeek を宣言し、任意の値で初期化してください。
		int dayOfWeek  = 1;
//		dayOfWeek の値に応じて、それぞれの曜日名を表示してください。
		String dayname = null;
		switch (dayOfWeek) {
			case 1 :
				dayname = "月曜日" ;
				break;
			case 2 :
				dayname = "火曜日" ;
				break;
			case 3 :
				dayname = "水曜日" ;
				break;
			case 4 :
				dayname = "木曜日" ;
				break;
			case 5 :
				dayname = "金曜日" ;
				break;
			case 6 :
				dayname = "土曜日" ;
				break;
			case 7 :
				dayname = "日曜日" ;
				break;
		}
		System.out.println(dayname);
//		【課題3】条件演算子の使用
//		任意の整数型の変数 num1 と num2 を宣言し、任意の値で初期化してください。
		int num1 = 7;
		int num2 = 5;
//		num1 が num2 より大きい場合は「num1が大きい」と表示し、それ以外の場合は「num2が大きい」と表示してください。
		String result = (num1 > num2) ? "num1が大きい"  : "num2が大きい" ;
		System.out.println(result);

	}

}
