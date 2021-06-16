package com.company;

import java.util.Arrays;

public class InsertionSort {
    void sort(int a[]){
        for(int i=1;i<a.length;i++){
            int val=a[i];
            int j=i-1;
            while(val<a[j]){
                a[j+1]=a[j];
                j--;
                if(j<0)
                    break;
            }
            a[j+1]=val;
        }
        System.out.println(Arrays.toString(a));
    }
}
