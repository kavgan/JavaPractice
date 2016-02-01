

/**
 * @author Kavita Ganesan  O(N^2)
 * http://www.kavita-ganesan.com
 */
public class BubbleSort {

	public static void main(String[] args) {

		int [] intArray={1,4,1,34,5,2,6,5,3,2};
		boolean sorted=true;


		for(int j=0; j< intArray.length; j++){
			
			//default to already sorted
			sorted=true;
			
			//for each i in array check i+1, bubble up the values
			for(int i=0; i< intArray.length-1; i++){
				if(intArray[i]>intArray[i+1]){
					sorted=false; //make it not sorted
					int temp=intArray[i+1];
					intArray[i+1]=intArray[i];
					intArray[i]=temp;
				}
			}

			//exit if sorted
			if(sorted) break;
		}

		System.out.println("Sorted array:");
		for(int i:intArray){
			System.out.println(i);
		}
	}
}
