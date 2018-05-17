package practice18.entity;


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

public class Player {
	private String position, name, country, team;


	public String getPosition() {

		return position;

	}

	public void setPosition(String postion) {

		this.position = postion;

	}

	public String getName() {

		return name;

	}

	public void setName(String name) {

		this.name = name;

	}

	public String getCountry() {

		return country;

	}

	public void setCountry(String country) {

		this.country = country;

	}

	public String getTeam() {

		return team;

	}

	public void setTeam(String team) {

		this.team = team;

	}


	@Override
	public String toString() {

		return getPosition() + "," + getName() + "," + getCountry() + "," + getTeam();

	}

}
