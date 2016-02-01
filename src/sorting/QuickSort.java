package sorting;

import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */


class QuickSort {

	static int [] temp;
	static int idx=0;

	public static void main(String[] args) {

		int p [] = {30,2,45,1,2,23};
		for(int k=0; k<p.length; k++){
			System.out.print(p[k]+" ");
		}

		//mergeSort(0,len);
		quickSort(p,0,p.length-1);

		System.out.println("====");


		for(int k=0; k<p.length; k++){
			System.out.print(p[k]+" ");
		}

		System.out.println();
	}

	public static void quickSort(int [] p, int lo, int hi)   {

		if(hi<=lo)
			return;

		int pivot = partition(p, lo, hi);

		quickSort(p,lo,pivot-1);
		quickSort(p,pivot+1,hi);


	}


	private static int partition(int[] p, int lo, int hi) {
		int pivot=lo+(hi-lo)/2;
		int start=lo;
		int end=hi;

		if(p[pivot]==45){
			System.out.println("D");
		}
		
		while(start<end){
			System.out.println("start:" +p[start]+ "  pivot:"+p[pivot]+" end:"+p[end]+"");

			if((p[start]>=p[pivot] && p[end]<=p[pivot])){
				int tmp=p[start];
				p[start]=p[end];
				p[end]=tmp;
				start++;
				end--;
			}
			else
			if(p[start]>p[pivot] && p[end]>p[pivot]){
					end--;
			}
			else
			if(p[start]<p[pivot] && p[end]<=p[pivot]){
				start++;
			}else{
				start++;
				end--;
			}
		}
		

		return pivot;
	}

	public static void combine(int [] p, int i, int middle, int j){

		int tmp[]=new int[j-i];
		int idx=0;

		int moveright=0;
		for(int k=i; k<middle; k++){

			int right=middle+moveright;

			if(p[k]>p[right] && right < tmp.length){
				tmp[idx++]=p[right];
				moveright++;
			}

			if(p[k]<=p[middle+k]){
				tmp[idx++]=p[k];
			}
		}

		for(int k=0; k<tmp.length; k++){

			System.out.print(tmp[k]+" ");
		}

	}
}

