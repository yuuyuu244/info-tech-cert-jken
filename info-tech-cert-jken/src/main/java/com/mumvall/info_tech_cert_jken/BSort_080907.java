package com.mumvall.info_tech_cert_jken;

import java.util.Arrays;

/**
  * バブルソートアルゴリズム
  */
public class BSort_080907 {
  static int[] data = {-1,5,1,3,7,6,9,8};

  public static void main(String[] args) {
    bSort(data, data.length-1);
    showAry(data);
  }

  public static void bSort(int[] data, int n) {
    int i;
    int w;
    int sw = 1;

    // ループ1
    while ( (n > 1) && (sw == 1) ) {
      sw = 0;
      i = 1;

      // ループ2
      while (i < n) {  // 残ソート回数のチェック
        if (data[i] > data[i+1]) {

          w = data[i];
          data[i] = data[i+1];
          data[i+1] = w;

          // (1)エ
          sw = 1;
        }

        // (2)ア
        i++;
      }

      // (3)オ
      n--;
    }

  }

  /**
   * 配列の表示
   */
  public static void showAry(int[] ary) {
    System.out.println(Arrays.toString(ary));
  }
}
