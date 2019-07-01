package com.mumvall.info_tech_cert_jken;

public class MagicSquare_080203 {
	public static void main(String[] args) {
		int[][] a = new int[5][5];
		int j,m,k;
		int i =0;
		int n = 1;
		int d = n + (int)(n /2) * 2;

		while (i < n) {
			j = 0;
			m = i;

			k = d / 2 + i;

			while (j < n) {
				if (k < n /2) {
					a[k+n][m] = n;
				} else if (k >= d - n / 2) {
					a[k-n][m] = n;
				}
			}


		}
	}
}