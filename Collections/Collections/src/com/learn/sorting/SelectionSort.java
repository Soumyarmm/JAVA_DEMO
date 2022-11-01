package com.learn.sorting;

public class SelectionSort {
	void sort(int arr[]) {
		int n=arr.length;
		for(int i=0; i<n-1; i++) {
			int min_id=i;
			for(int j=i+1; j<n; j++)
				if(arr[j]< arr[min_id])
					min_id=j;
			
			int temp=arr[min_id];
			arr[min_id]=arr[i];
			arr[i]=temp;
		}
	}
	void printArrayt(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}

	public static void main(String[] args) {
		SelectionSort s=new SelectionSort();
		int arr[]= {12,45,65,67,76,87};
		s.sort(arr);
		System.out.println("soted array");
		s.printArrayt(arr);;

	}

}
