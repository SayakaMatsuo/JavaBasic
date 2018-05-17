/*
 * PTra18_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PTra18_02 {

	/*
	 * ★ BestElevenCandidate.csvの情報を保持するためのクラス、entity.Playerクラスを作成してください
	 *
	 * フィールド
	 * 		position	：	String
	 * 		name		：	String
	 * 		country		：	String
	 * 		team		：	String
	 * メソッド
	 * 		各アクセサ
	 *
	 * 		toString()	：	Objectクラスのオーバーライド
	 * 		各フィールドの値を、カンマ区切りの文字列で取得する
	 */

	public static void main(String[] args) {

		/*
		 * entity.Playerの作成後に行ってください
		 *
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */



		ArrayList<EntryPlayer> array = new ArrayList<>();





		 // file/BestElevenCandidate.csvを取り込む
		try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {

        	//ファイルの最後まで行ったら抜けるループ
        	while (scanner.hasNext()) {

        	   //次にデータがあるかどうかの確認
        		String line = scanner.nextLine();

        	    //!一行毎にArrayListに格納、その際にカンマで区切る

        		String[] str = line.split(",");
        		EntryPlayer player = new EntryPlayer();

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

		// ★ ArrayListに格納されているインスタンス全てのtoStringメソッドを実行し、出力してください
				// ※ できれば拡張for文を使いましょう
		for(EntryPlayer player: array) {
			System.out.println(player.toString());
			}


	}
}
