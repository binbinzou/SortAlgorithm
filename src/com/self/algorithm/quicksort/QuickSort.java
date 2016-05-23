package com.self.algorithm.quicksort;

public class QuickSort {

	public static void main(String[] args) {
		
		int[] array = new int[100];
		
		int start = 0;
		 
		int end = array.length;
		
		int size = array.length;
		for(int i = 0; i < size;i++){
			int tmp = (int) (Math.random()*1000);
			array[i] = tmp;
		}
		
		int last = 0;
		for(int ii : array){
			System.out.print(ii+"  ");
			last++;
		}
		System.out.println();
		quickSort(array, start, end);
		
		int now = 0;
		for(int ii : array){
			System.out.print(ii+"  ");
			now++;
		}
		
	}
	
	public static void quickSort(int[] array,int start,int end){
		int sign = array[start];
		int signIndex = start;
		int beginIndex = start+1;
		for(int j = beginIndex; j < end ; j++){
			if(sign>array[j]){
				int temp = array[j];
				for(int m = j ;m > signIndex; m--){
					array[m] = array[m-1];
				}
				array[signIndex] = temp;
				signIndex++;
			}
		}
		if(start!=signIndex){
			quickSort(array, start, signIndex);
		}
		
		if(signIndex+1!=end){
			quickSort(array, signIndex+1, end);
		}
		

	}
	
}
