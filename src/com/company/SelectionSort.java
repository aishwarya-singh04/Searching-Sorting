package com.company;

import java.util.Arrays;

public class SelectionSort {
    void sort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int temp;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
//        for(int val:a)
//            System.out.print(val);
        System.out.println(Arrays.toString(a));


    }
}
