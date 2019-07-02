package com.mumvall.info_tech_cert_jken;

import java.util.Arrays;

public class Q20150204_01_stack {
	/** スタック配列 */
	private static int[] stackAry = new int[50];

	/** スタックポインタ */
	private static int sp = 2;

	private static void init() {
		for (int i =0;i<stackAry.length;i++) {
			stackAry[i] = 0;
		}

		sp = -1;
	}

	public static void main(String[] args) {
		q2();

	}

	private static void q1() {
		stackAry[0] = 40;
		stackAry[1] = 76;
		stackAry[2] = 9;

		int a = 0;

		push(23);
		push(76);
		a = pop();

		push(9);
		a = pop();

		push(2);
		System.out.println(Arrays.toString(stackAry));
	}


	private static void q2() {
		int a = 0;
		int b = 0;

		push(10);
		a = pop();
		push(20);
		b = pop();

		push(10);
		push(b);

		System.out.println(Arrays.toString(stackAry));

		//------------------------------
		init();

		push(10);
		push(20);
		a = pop();
		b = pop();
		push(a);
		push(b);

		System.out.println(Arrays.toString(stackAry));

	}

	private static void q3() {
		init();
		int sw = 0;
		int a = 0;
		int b = 0;

		while(sw == 0) {
			a = pop();
			b = mod(a, 10);
		}
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
