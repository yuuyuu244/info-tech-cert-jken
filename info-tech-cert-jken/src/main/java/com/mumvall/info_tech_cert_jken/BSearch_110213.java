package com.mumvall.info_tech_cert_jken;


public class BSearch_110213 {
	public static void main(String[] args) {
		int[] dt = {2,4,7,9,11,17,21,30,35,40};
		int num = 30;
		int size = 10;

		System.out.println(bSearch(num, size, dt));
	}

	/**
	 * binary search
	 */
	public static int bSearch(int num, int size, int[] dt) {
		int m;

		// (1)
		int ret = -1;

		int l = 0;
		int h = size - 1;

		while ((ret == -1) && (l <= h)) {
			m = (l + h) / 2;       // Ⓐ←何回実行される？

			// (2)
			if ( dt[m] == num ) {
				ret = m;
			} else {

				// (3)
				if (dt[m] < num) {
					l = m + 1;
				} else {
					h = m - 1;
				}
			}
		}

		return ret;
	}

}
