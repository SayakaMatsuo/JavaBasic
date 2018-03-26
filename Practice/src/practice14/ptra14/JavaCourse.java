package practice14.ptra14;

import java.util.Arrays;

public class JavaCourse implements practice14.common.Course {


	/*
	 * ★ common.Courseを実装した、JavaCourseクラスを作成してください
	 *
	 * コース名称
	 * 		「【Eラーニング】Java」
	 * 単元
	 * 		式と演算
	 * 		制御構文
	 * 		メソッド
	 * 		配列
	 * 		オブジェクト指向
	 * 		継承
	 * 		高度な継承
	 */

	public String getCourseName() {
		System.out.println("コース名称");
		System.out.println("「" + PREFIX + "Java」");
		return PREFIX;

	}

	public String[] getCourseUnit() {
		String[] unit = {"式と演算","制御構文","メソッド","配列","オブジェクト指向","継承","高度な継承"};
		System.out.println("単元");
		System.out.println(Arrays.toString(unit));
		return unit;
	}

}
