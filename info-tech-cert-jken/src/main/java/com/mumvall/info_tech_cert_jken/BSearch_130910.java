package com.mumvall.info_tech_cert_jken;

public class BSearch_130910 {
	public static void main(String[] args) {
		int[] t = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
		int x = 13;
		int returnValue = binarySearch(t, x);
		System.out.println(returnValue);
	}

	public static int binarySearch(int[] t, int x) {
		int m;

		int high = t.length - 1;
		int low  =  0;
		int s    = -1;

		//                   (1)
		while ( (s == -1) && (low <= high) ) {
			m = (low + high) / 2;

			if (x == t[m]) {

				s = m;
			} else if (x < t[m]) {

				// (2)
				high = m - 1;
			} else if (x > t[m]) {

				// (3)
				low = m + 1;
			}

		}
		return s;
	}
}