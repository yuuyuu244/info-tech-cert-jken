package com.mumvall.info_tech_cert_jken;


public class BSearch_160911 {
	public static void main(String[] args) {
		int x = 21;
		int[] dat = {1,2,3,5,8,13,21,34,55,89};

		System.out.println(bSearch(dat.length, dat, x));
	}

	public static int bSearch(int n, int[] dat, int x) {
		int m;

		int low = 0;
		int high = n - 1;
		int p = -1;

		//                    (1)
		while ( (p == -1) && (low <= high) ) {
			m = (low + high) / 2;

			if (dat[m] == x) { // Ⓐ
				p = m;
				break;
			} else {
				if (dat[m] < x) {
					// (2)
					low = m + 1;
				} else {
					// (3)
					high = m - 1;
				}
			}

		}

		return p;

	}

}
