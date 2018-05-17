/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PTra18_04 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */

		ArrayList<EntryPlayer> array = new ArrayList<>();


		 // file/BestElevenCandidate.csvを取り込む
		try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {

      	//ファイルデータの最後まで行ったら抜けるループ
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

		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください

        /*ArrayListをランダム表示*/
        Collections.shuffle(array);

        int GK = 0;
        int DF = 0;
        int MF = 0;
        int FW = 0;

        for(EntryPlayer player:array) {

        	if(player.getPosition().equals("GK")) {

        		/*GK1名以下だった時*/
        		if(GK < 1) {
        			System.out.println(player.toString());
        			GK++;
        		}
        	}

        	if(player.getPosition().equals("DF")) {

        		/*DF4名以下*/
        		if(DF < 4) {
        			System.out.println(player.toString());
        			DF++;
        		}
        	}
        	if(player.getPosition().equals("MF")) {

        		/*MF4名以下*/
        		if(MF < 4) {
        			System.out.println(player.toString());
        			MF++;
        		}
        	}

        	if(player.getPosition().equals("FW")) {

        		/*FW2名以下*/
        		if(FW < 2) {
        			System.out.println(player.toString());
        			FW++;
        		}
        	}
        }
	}
}
