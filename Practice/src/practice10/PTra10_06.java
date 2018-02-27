package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */

		Car car1=new Car();
		car1.color="blue";
		car1.gasoline=40;

		Car car2=new Car();
		car2.color="yellow";
		car2.gasoline=60;

		Car car3=new Car();
		car3.color="green";
		car3.gasoline=100;

		final int distance = 500;

		int sum=0;
		int n =0;

		while(true) {
			int a=car1.run();
			int b=car2.run();
			int c=car3.run();
			n++;
			;
			sum+=a;
			sum+=b;
			sum+=c;

			System.out.println(sum);
			if(sum>=distance) {
				System.out.println("目的地にまで"+n+"時間かかりました。"+"残りのガソリンは"+car1.gasoline+"リットルです。");
				System.out.println("目的地にまで"+n+"時間かかりました。"+"残りのガソリンは"+car2.gasoline+"リットルです。");
				System.out.println("目的地にまで"+n+"時間かかりました。"+"残りのガソリンは"+car3.gasoline+"リットルです。");
				break;
			}
		}

	}
}
