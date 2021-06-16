package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    void binSearch(int val){
        System.out.println("Enter the size of array");
        Scanner sc=new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr =new int[size];
        System.out.println("Enter elements");
        for(int i=0;i<size;i++)
        {
            arr[i]= sc.nextInt();
        }
        Arrays.sort(arr);

        int flag=0;
        int i=0;
        int j=size-1;
        while((i<=j)&&(flag==0)){
            int mid=(i+j)/2;
            if(arr[mid]==val){
                flag=1;
                System.out.println("Found at index "+ mid);
                break;
            }
            else if(val>arr[mid]){
                i=mid+1;
            }
            else if(val<arr[mid]){
                j=mid-1;
            }

        }
        if(flag!=1)
            System.out.println("Not found");


    }
}
