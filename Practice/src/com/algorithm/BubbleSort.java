package com.algorithm;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int[] item = {36,18,29,12,5};
	
	int temp;
	for(int i =0;i<item.length;i++) {
		int flag=0;
		for(int j =0;j<item.length-1-i;j++) {
			if(item[j]>item[j+1]) {
				temp=item[j];
				item[j]=item[j+1];
				item[j+1]=temp;
				flag=1;
			}
		}
		if(flag==0) {
			break;
		}
	}
	
	for(int x=0;x<item.length;x++) {
		System.out.println(item[x]);
	}
	
	}

}
