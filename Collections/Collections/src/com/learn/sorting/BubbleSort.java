package com.learn.sorting;

public class BubbleSort {
	void bubbleSort(int arr[]) {
		int n=arr.length;
		for(int i=0; i<n-1; i++)
			for(int j=0; j<n-1; j++)
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
	}
	
	void printArray(int arr[]) {
		int n=arr.length;
		for(int i=0; i<n; i++)
			System.out.println(arr[i] + "");
		System.out.println();
	}

	public static void main(String[] args) {
		BubbleSort b=new BubbleSort();
		int arr[]= {12,34,45,67,87,54,9};
		b.bubbleSort(arr);
		System.out.println("sorted array");
		b.printArray(arr);

	}

}
