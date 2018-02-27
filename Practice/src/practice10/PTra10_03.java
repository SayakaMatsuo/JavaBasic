package practice10;
/*
 * PTra10_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
import java.util.Scanner;
public class PTra10_03 {

	/*
	 * PTra10_01で作成したUserクラスを使用します
	 */


	public static void main(String[] args) {

		// Userクラスを作成後に着手してください
		// ★ User型の変数usを宣言してください
		User us=new User();

		// ★ 変数usに、Userクラスのインスタンスを作成・代入してください


		System.out.println("ユーザID（数字）、 ユーザ名、メールアドレス、パスワードをカンマ区切りで入力してください");

		// ★ java.util.Scannerクラスをインスタンス化し、変数scannerに代入してください
		Scanner scanner=new Scanner(System.in);

		// ★ 入力された値を、String型の変数lineに格納してください
		String line=scanner.next();


		// ★ 変数lineに格納されている値を','で区切り、配列にしてください（Stringクラスのメソッドを使用します）
		String[] linearray=line.split(",",0); //＊できてない


		// ★ 配列にした値を、usの各フィールドに代入してください
		// ユーザIDに該当する値が数値でなかった場合は、エラーでプログラムが止まっても良いです
			us.userId=Integer.parseInt(linearray[0]);
			us.userNm=linearray[1];
			us.mail=linearray[2];
			us.password=linearray[3];


			System.out.println(us.userId+" "+us.userNm+" "+us.mail+" "+us.password);


		// ★ 変数usに格納されているインスタンスの、フィールドuserId, userNm, mail, passwordを出力してください

	}
}
