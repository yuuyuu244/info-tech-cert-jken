package com.mumvall.info_tech_cert_jken;

import java.util.Arrays;

public class Q20160911_01_stack {
	/** スタック配列 */
	private static int[] stackAry = new int[50];

	/** スタックポインタ */
	private static int sp = 2;

	public static void main(String[] args) {
		stackAry[0] = 10;
		stackAry[1] = 4;

		push(100);
		printAry("stack : ",stackAry);
		System.out.println(pop());

	}

/*	private void inq() {

	}

	private void deq() {

	}*/

	/**
	 * 配列表示メソッド(独自)
	 * @param text 表示名
	 * @param array 配列
	 */
	static void printAry(String text, int[] array) {
		System.out.println(text + "\t" + Arrays.toString(array));
	}

	private static void push(int num) {
		sp++;
		stackAry[sp] = num;
	}

	private static int pop() {
		int num = stackAry[sp];
		sp--;
		return num;
	}


}
