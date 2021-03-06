package com.algorithm;

public class BinarySearch {
	
	private static int [] list1 = new int[] {1,2,3,6,8,9,12 };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(binarySearch(list1,1)) {
			System.out.println("Found");
		}else {
			System.out.println("Not Found");
		}

	}
	private static boolean binarySearch(final int[] array,int search) {
		int first =0;
		int last = list1.length-1;
		int middle = (first+last)/2;
		
		while(first<=last) {
			if(array[middle]<search) {
				first=middle+1;
			}
			else if(array[middle]==search) {
				return true;
			}else {
				last=middle-1;
			}
			middle=(first+last)/2;
		}
		return false;
		
	}

}
