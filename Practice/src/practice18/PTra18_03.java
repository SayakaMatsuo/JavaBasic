/*
 * PTra18_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import practice18.entity.Player;

public class PTra18_03 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */

		ArrayList<Player> array = new ArrayList<>();


		 // file/BestElevenCandidate.csvを取り込む
		try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {

       	//ファイルデータの最後まで行ったら抜けるループ
       	while (scanner.hasNext()) {

       	   //次にデータがあるかどうかの確認
       		String line = scanner.nextLine();

       	    //!一行毎にArrayListに格納、その際にカンマで区切る

       		String[] str = line.split(",");
       		Player player = new Player();

       		/*ポジション*/
       		player.setPosition(str[0]);

       		/*名前*/
       		player.setName(str[1]);

       		/*所属国*/
       		player.setCountry(str[2]);

       		/*所属チーム*/
       		player.setTeam(str[3]);

       		//ArrayListに代入
       		array.add(player);


           }
       } catch (FileNotFoundException e) {
           System.out.println("ファイルが見つかりません");
       }

		// ★ ①のArrayListの中から"レアル・マドリード", "バルセロナ"の選手を除外してください

		//リストを後ろから見ていく
		for(int i = array.size() - 1; i >= 0; i--){

			/*チームが"レアル・マドリード"または"バルセロナ"の場合、除外。両方ともfalseの場合のみfalse*/
			if(array.get(i).getTeam().equals("レアル・マドリード") || array.get(i).getTeam().equals("バルセロナ"))

		    	/*除外処理*/
		    	array.remove(i);
		}

		// ★ 削除後のArrayListの中身を全件出力してください
		for(Player player : array) {
			System.out.println(player.toString());
		}

	}
}
