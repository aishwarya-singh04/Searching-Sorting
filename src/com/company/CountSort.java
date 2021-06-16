package com.company;

import java.util.Arrays;
import java.util.Collections;

public class CountSort {
    public void countSort(int[] a){
        //largest no. in the array
//        int max= (int) Collections.max(Arrays.asList(a));     //need to have a collection Integer in this case
        //OR
        int maxValue= a[0];
        for(int i=1; i<a.length; i++){
            if(a[i] > maxValue){
                maxValue = a[i];
            }
        }


        int[] count = new int[maxValue+1];
        for(int i=0;i<a.length;i++){
            ++count[a[i]];
        }

        for(int i=1;i<=maxValue;i++){
            count[i]=count[i]+count[i-1];

        }

        int[] b= new int[a.length];
        for(int i=a.length-1; i>=0; i--){
            b[--count[a[i]]]=a[i];
        }

        for(int i=0;i<a.length;i++){
            a[i]=b[i];
        }
        System.out.println(Arrays.toString(a));

    }

}
