/*
 * PTra13_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

import practice13.common.Hero;
import practice13.common.Slime;


public class PTra13_04 {

	/*
	 * ★ PTra13_02, PTra13_03で作成した、Hero/Slimeクラスを使用します
	 */

	public static void main(String[] args) {

		// ★ HeroインスタンスとSlimeインスタンスを作成し、それぞれの名前に"勇者", "スライム"を設定してください
		Hero hero=new Hero(25,10,7);
		Slime slime=new Slime(10, 5, 2);

		hero.setName("勇者");
		slime.setName("スライム");
		/*
		 * ★ HeroとSlimeを、どちらかが体力０になるまで戦わせます
		 *
		 * 	●Heroの攻撃 -> ダメージ判定 -> Slimeの攻撃 -> ダメージ判定
		 * 上記を繰り返し行います
		 */

		boolean winFlg = false;

		//0の時true(終了) 残っている時falseつづく


		while (!winFlg) {


		// ★ 勝利した方の出力を行ってください。「○○は■■との戦闘に勝利した」

			if(slime.damage(hero.attack())) {
				System.out.println("勇者はスライムとの戦闘に勝利した");
				winFlg = true;

			}else if(hero.damage(slime.attack()))  {
				System.out.println("スライムはとの戦闘に勝利した");

				winFlg = true;

			}
		}












	}
}
