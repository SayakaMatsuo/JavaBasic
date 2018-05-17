package practice13.common;

public class Item {

	/*
	 * ★ common.Itemクラスを作成してください
	 *
	 * フィールド
	 * 		name	:	String
	 * 		additionalDamage	:	int
	 * メソッド
	 * 		各フィールドのアクセサ
	 * コンストラクタ
	 * 		name, additionalDamageに初期値を設定するコンストラクタ
	 * 		上記2つを設定するための引数を持つ
	 */

	private String name;
	private int additionalDamage;



	public Item(String name, int additionalDamage) {

	}

	//名前を取得
	public String getName() {
		return name;
	}

	//名前を設定
	public void setName(String name) {
		this.name = name;
	}

	//ダメージ取得
	public int getAdditionalDamage() {
		return additionalDamage;
	}

	//ダメージ設定
	public void setAdditionalDamage(int additionalDamage) {
		this.additionalDamage = additionalDamage;
	}



}
