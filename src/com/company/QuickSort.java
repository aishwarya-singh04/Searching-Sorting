package com.company;

import java.util.Arrays;

public class QuickSort {
    int partition(int[] a, int l, int h){
        int pivot= a[l];
        int i= l;
        int j= h;
        while(i<j){
            while(a[i]<=pivot)
                i++;
            while(a[j]>pivot)
                j--;
            if(i<j){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
            int temp=a[j];
            a[j]=a[l];
            a[l]=temp;

        }
        return j;
    }

    void sort(int a[], int l, int h){
        if(l<h){
            int pivot= partition(a,l,h);
            sort(a, l,pivot-1);
            sort(a, pivot+1,h);
        }
        for(int i=0; i<a.length;i++){
            System.out.print(a[i]+" ");
        }




    }




}
