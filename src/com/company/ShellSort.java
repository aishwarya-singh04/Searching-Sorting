package com.company;

import java.util.Arrays;

public class ShellSort {
    void sort(int[] a, int i, int j){
        for(int gap=a.length/2; gap>=1; gap=gap/2){
            for(j=gap;j<a.length;j++){
                for(i=j-gap;i>=0;i=i-gap){
                    if(a[i+gap]>a[i]){
                        break;
                    }
                    else{
                        int temp=a[i+gap];
                        a[i+gap]=a[i];
                        a[i]=temp;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
