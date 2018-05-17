/*
 * PTra13_08.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

import practice13.common.Employee;


public class PTra13_08 {

	/*
	 * ★ common.Personクラスを継承して、common.Employeeクラスを作成してください
	 *
	 * フィールド
	 * 		departmentNm（部署名）		:	String
	 * 		departmentCnt（部署人数）	:	int
	 * メソッド
	 * 		各フィールドのアクセサ
	 */

	public static void main (String[] args) {

		Employee employee = new Employee();
		employee.setDepartmentNm("AAA");
		employee.setDepartmentCnt(10);
		System.out.println(employee.getDepartmentNm());
		System.out.println(employee.getDepartmentCnt());

	}

}
