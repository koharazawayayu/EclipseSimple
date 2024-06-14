package exercise;

public class Java8_3 {

	public static void main(String[] args) {

//【問1】 基本問題
//1から10までの整数の合計を計算し、その結果を表示するプログラムをforループを使用して作成してください
		int total = 0;
		for (int i = 1; i <= 10; i++) {
			total = total + i;
		}
		System.out.println(total);
//【問2】九九
//九九を表示するプログラムを作成してください
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
		}
		
//【問3】階段
//添付されている「階段」を出力するようなプログラムを作成してください
		String s = "";
		for(int i = 0; i < 5; i++) {
			s = s + "*";
			System.out.println(s);
		}
		

//【問4】ピラミッド
//添付されている「ピラミッド」を出力するようなプログラムを作成してください
		String p = "";
		for(int i = 0; i < 5; i++) {
			p = "";
			for(int l = 4; i < l; l--) {
				p = p + " ";
			}
			for(int l = 0; l < i + i + 1; l++) {
				p = p + "*";
			}
			System.out.println(p);
		}
	}

}
