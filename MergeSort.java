package com.demo.turtorial.hr.model;
import java.util.Arrays;

public class MergeSort {
	
	public static int[] arr = { 404, 403, 402, 401, 99, 200, 101, 201, 300, 10, 102, 1000, 98, 1001, 1002, 1003, 1005};
	public static int[] helper = new int[arr.length];
	
	public static void main (String args[]) {
		sort(0, arr.length-1);
		for (int k=0; k < arr.length; k++) {
        	System.out.println(arr[k]);
		};
	};
	
	public static void sort(int lo, int hi) {
		
		// split until length = 1
		if ((hi - lo) >= 1) {
			int mid = (hi + lo)/2;
			sort(lo, mid);
			sort(mid + 1, hi);
			
			merge(lo, mid, hi);
		}
	};
	
	public static void merge(int lo, int mid, int hi) {
			// merge sorted sides of array 
			//		- from lo included to mid not included
			// 		- from mid included to hi not included
	        int i = lo;
	        int j = mid+1;
	        int k = lo;
	        helper = Arrays.copyOf(arr, arr.length);
	        while (i <= mid && j <= hi) {
	            if (helper[i] < helper[j]){
	               arr[k] = helper[i];
	               i++;
	            }
	            else { 
	            	arr[k] = helper[j];
	                j++;
	            };
	            k++;
	        };
	        
	        while (i <= mid) {
	        	arr[k] =  helper[i];
	        	i++;
	        	k++;
	        };
	        
	        while (j <= hi) {
	        	arr[k] = helper[j];
	        	j++;
	        	k++;
	        };
	        
	        
    }
	
}
	