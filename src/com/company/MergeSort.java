package com.company;

import java.util.Arrays;

public class MergeSort {
    void merge(int[] a, int l, int mid, int r){
        int[] b =new int[a.length];
        int i=l;
        int j=mid+1;
        int k=l;
        while(i<=mid && j<=r){
            if(a[i]<a[j]){
                b[k]=a[i];
                k++;
                i++;
            }
            else{
                b[k]=a[j];
                k++;
                j++;
            }
            if(i>mid){
                while(j<=r){
                    b[k]=a[j];
                    k++;
                    j++;
                }
            }
            else{
                while(i<=mid){
                    b[k]=a[i];
                    k++;
                    i++;
                }
            }

        }
        for(k=l;k<=r;k++){
            a[k]=b[k];
        }

        for(k=0;k<=a.length;k++){
            System.out.print(a[k]+" ");
        }


    }
    void mergeSort(int[] a, int l, int r){
        if(l<r) {
            int mid = (l + r) / 2;
            mergeSort(a, l, mid);
            mergeSort(a, mid + 1, r);
            merge(a, l, mid, r);
        }
    }


}
