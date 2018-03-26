package practice14.ptra14;

import java.util.Arrays;

public class DBCourse implements practice14.common.Course {
	/*
	 * ★ common.Courseを実装した、DBCourseクラスを作成してください
	 *
	 * コース名称
	 * 		「【Eラーニング】DB基礎」
	 * 単元
	 * 		DB基礎
	 * 		SQL基礎
	 * 		正規化
	 * 		SQL応用
	 */

	public String getCourseName() {
		System.out.println("コース名称");
		System.out.println("「" + PREFIX + "DB基礎」");
		return PREFIX;

	}

	public String[] getCourseUnit() {
		String[] unit = {"DB基礎","SQR基礎","正規化","SQR応用"};
		System.out.println("単元");
		System.out.println(Arrays.toString(unit));
		return unit;
	}

}

