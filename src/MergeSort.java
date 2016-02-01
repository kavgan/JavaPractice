/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */


class MergeSort {

	static int [] temp;
	static int idx=0;

	public static void main(String[] args) {

		int p [] = {455,2,1,2,77, 23,31,7,1,3,3,3,5,2,3,4,5,99,222};

		System.out.println("Un-sorted:");
		for(int k=0; k<p.length; k++){
			System.out.print(p[k]+" ");
		}

		//mergeSort(0,len);
		//do merge sort on array p, with index 0 to length-1
		mergeSort(p,0,p.length-1);
		
		System.out.println("\n\n");
		System.out.println("Sorted:");
		for(int k=0; k<p.length; k++){
			System.out.print(p[k]+" ");
		}

		
	}

	public static void mergeSort(int [] p, int i, int j){

		//do this only for the smallest of two cells
		if(i<j){
			
			//return the mid point
			int middle=(i+j)/2;
			
			//recursively call i till middle
			mergeSort(p,i,middle);
			
			//recursively call middle+1 till j
			mergeSort(p,middle+1,j);
			
			//send array i, middle and j
			combine(p,i,middle,j);
		}else{
			return;
		}
	}


	public static void combine(int [] p, int i, int middle, int j){

		//init tmp to hold intermediate results. size of tmp should be size of the twosubparts (left+right)
		int tmp[]=new int[j-i+1];
		int idx=0;

		//accessing sub-parts
		int left=i;
		int right=middle+1;

		//while we have not completed filling the temporary array, keep going
		while(idx<(tmp.length)){

			//if we have exhausted the left side, it means right side could still be remaining, so copy over as is.
			//each sub part is already sorted so if the left side is exhausted, just copy right side over since its sorted 
			if(left>middle && right<=j){
				tmp[idx++]=p[right++];
			}
			//if we have exhausted the right side, it means left side could still be remaining, so copy over as is.
			//each sub part is already sorted so if the right side is exhausted, just copy left side over since its sorted 
			else
			if(left <= middle && right>j){
				tmp[idx++]=p[left++];
			}
			//if we have not exhausted the left side or right side, go ahead as usual.
			else{
				int valL=p[left];
				int valR=p[right];

				if(valL>valR ){ 
					//if left great than right, copy over the right (we want ascending)
					tmp[idx++]=p[right++];
				}
				else
				if(valL<=valR){
					//if right great than or equals left, copy over the left (we want ascending)
					tmp[idx++]=p[left++];
				}
			}
		}
		

		//copy over contents of tmp into the original array.
		//note that you copy over using the original index in the original array
		//you can do this by adding i to the index of the temporary array
		for(int k=0; k<tmp.length; k++){
			p[k+i]=tmp[k];
		}
	}
}
