package sorting;

/**
 * @author Kavita Ganesan 
 * http://www.kavita-ganesan.com
 */
public class BubbleSort {

	public static void main(String[] args) {

		int [] intArray={1,4,2,6,5,3,2};

		//for each i in array 
		for(int i=0; i< intArray.length; i++){
			
			//check if intArray[i] is bigger than any of the elements
			//to the right of i. If it is, swap. Now use the swapped 
			//value and figure out if its bigger than the remaining values
			// not compared against. Repeat.
			for(int m=i; m< intArray.length; m++){
				if(m!=i && intArray[i]>intArray[m]){
					int temp=intArray[m];
					intArray[m]=intArray[i];
					intArray[i]=temp;
				}
			}
		}

		System.out.println("Sorted array:");
		for(int i:intArray){
			System.out.println(i);
		}
	}
}
