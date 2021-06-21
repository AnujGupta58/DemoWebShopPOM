package com.dws.DemoWebShop;

import com.dws.utilities.TestUtil;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestUtil util = new TestUtil("C:\\Users\\Anuj Gupta\\Desktop\\TestFile.xlsx");
		System.out.println(util.getRowCount());
		System.out.println(util.getColumnCount());
		System.out.println(util.getCellData("firstSheet", 1, 2));
	}

}
