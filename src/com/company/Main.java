package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
//        LinearSearch ls=new LinearSearch();
//        ls.linSearch(15);
//        BinarySearch bs= new BinarySearch();
//        bs.binSearch(20);

        int size=sc.nextInt();
        int[] arr= new int[size];
        for(int i=0; i<size; i++)
        {
            arr[i]=sc.nextInt();
        }
//        SelectionSort ss= new SelectionSort();
//        ss.sort(arr);

//        MergeSort ms= new MergeSort();
//        ms.mergeSort(arr,0,size-1);

//        QuickSort qs = new QuickSort();
//        qs.sort(arr,0,size-1);
//        ShellSort ss= new ShellSort();
//        ss.sort(arr,0, size-1);


//        CountSort cs= new CountSort();
//        cs.countSort(arr);

        RadixSort rs = new RadixSort();
        rs.radixSort(arr);
    }
}
