//package BinarySearch;
//A classical java code for the binary search

import java.util.Arrays;

public class binarysearch {
    public static void main(String[] args) {
        int a[]={12,9,1,7,33,42};
        Arrays.sort(a);
        int n=a.length;
        System.out.println(bs(a, n,12));
    }
    public static int bs(int a[],int n,int x){
        int lo=0,hi=n-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(a[mid]==x){
                return mid;
            }
            else if(a[mid]>x){
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return -1;
    }
}
