package com.company;

import java.util.Scanner;

public class LinearSearch {

    void linSearch(int val){
        System.out.println("Enter the size of array");
        Scanner sc=new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr =new int[size];
        System.out.println("Enter elements");
        for(int i=0;i<size;i++)
        {
            arr[i]= sc.nextInt();
        }
        int flag=0;
        for (int i = 0; i<size &&flag==0; i++) {
            if (arr[i]== val) {
                flag = 1;
                break;
            }
        }
        if(flag==1) {
            System.out.println("Found");
        }
        else
            System.out.println("Not Found");
    }

}
