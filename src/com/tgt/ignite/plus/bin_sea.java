package com.tgt.ignite.plus;

import java.util.Scanner;

public class bin_sea {
    public static void main(String[] args){
        int n,l=0,i,x;
        int[] arr={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        Scanner read = new Scanner(System.in);
        System.out.println("enter  num of array elements");
        n=read.nextInt();
        System.out.println("enter array elements");
        for(i=0;i<n;i++) {
            arr[i] = read.nextInt();
        }
        System.out.println("enter the element to be searched ");
        x=read.nextInt();
        while(l<=n){
            int m=l+(n-1)/2;
            if(arr[m]==x){
                System.out.println(+x+ " is present at index " +m);
                break;
            }
            if (arr[m]<x){
                l=m+1;
            }
            else if(arr[m]>x){
                n=m-1;
            }
            else {
                System.out.println("element not found");
            }
        }
    }

}
