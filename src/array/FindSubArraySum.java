package array;

import java.util.HashSet;

/**
 * Find all subsets within an array that adds up to a value K 
 * @author Kavita Ganesan
 *
 */
public class FindSubArraySum {
	
	public static void main (String args[]){
		FindSubArraySum fsa=new FindSubArraySum();
		fsa.start();
	}

	/** temporary storage */
	HashSet<String> hs=new HashSet<String>();
	
	/** this is the K */ 
	int sumNeeded=4;
	
	/** this is the array */
	int [] intArray={4,1,2,1,4,3,2,3};
	
	public void start(){
		
		for(int i=0; i<intArray.length; i++){
			
			hs.clear();
			int currSum=0;
			int idxCurr=i;
			String strCurrSubArray="";
			
			boolean found=findSubArray(currSum,idxCurr,strCurrSubArray);
			
			if(found)
				hs.add(Integer.toString(intArray[i]));
			
			if(!hs.isEmpty())
			System.out.println(hs);
		}
	}
	
	private boolean findSubArray(int sumSoFar, int idxCurr, String currSubArrayVals) {
		
		//find the current sum 
		int currSum=sumSoFar+intArray[idxCurr]; 
		
		//if its just initialized then assign the str value of the intArray[idxCurr]
		if(sumSoFar==0){
			currSubArrayVals=intArray[idxCurr]+"";
		}
		
		//if found a sum, then return true
		if(currSum==sumNeeded)
			return true;
		
		//exceeded value, return
		if(currSum > sumNeeded)
			return false;
				
		//if sum < sumNeeded, then keep searching in the remaining 
		//elements of the array
		for(int i=idxCurr+1; i<intArray.length; i++){
			
			int nextIdx=i;
			String subArrayVals=currSubArrayVals+" "+intArray[nextIdx];
			boolean found=findSubArray(currSum, nextIdx, subArrayVals);
			
			//if found, add to hashset but continue searching as there may be multiple options
			if(found)
				hs.add(subArrayVals);
		}
		
		return false;
	}
	
	
}
