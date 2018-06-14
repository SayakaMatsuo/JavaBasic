package practice02;
/*
 * PTra02_10.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra02_10 {
	public static void main(String[] args) {
		int moneyInHand = 1000;	// 所持金
		int coffee = 120;	// コーヒーの値段
		int snack = 200;	// スナック菓子

		/*
		 * ●一本120円（税別）の缶コーヒーを2本
		 * ●一袋200円（税別）のスナック菓子を1袋
		 *
		 * ★ 上記の商品を購入したときの所持金を出力してください
		 * ※ 消費税は、全商品の合計に8%が加算されます
		 * ※ 日本円には小数点がありませんので、整数の値で出力してください(少数部分は切り捨て)
		 * ※ プログラムは何行書いても良いです
		 */

		//1000円(所持金)　使った金額：（120×２＋200×1）×1.08
		//答え＝｛1000-(（120×２＋200×1）×1.08)｝

		int sum = coffee * 2 + snack; //合計
		double tax = 1.08 * sum; //税込み
		moneyInHand-=tax;


		System.out.println("所持金"+moneyInHand+"円");


	}
}
