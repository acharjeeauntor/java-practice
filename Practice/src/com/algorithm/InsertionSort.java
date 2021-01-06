package com.algorithm;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] item= {5,8,4,2,1,6,9};
		int temp,j;
		for(int i=1;i<item.length;i++) {
			temp=item[i];
			j=i;

			while(j>0&&item[j-1]>temp) {
				item[j]=item[j-1];
				j--;
			}
			item[j]=temp;
		}
		
		for(int x=0;x<item.length;x++) {
			System.out.println(item[x]);
		}
	}

}
