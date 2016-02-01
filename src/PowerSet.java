import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Iterator;

/**
 * Find the power set of a set
 * @author Kavita
 *
 */
public class PowerSet {

	public static void main(String[] args) {

		Set<String> powerSet=new HashSet<>();
		powerSet.add("{}");

		List<String> ls=new ArrayList<>();
		ls.add("v");
		ls.add("x");
		ls.add("y");
		ls.add("z");

		for(int i=0; i<ls.size(); i++){

			Iterator<String> iter=powerSet.iterator();
			List<String> tmp=new ArrayList();

			//add individual elements like "v", "x", "y"
			tmp.add(ls.get(i));

			//now append to existing sub-sets
			while(iter.hasNext()){
				String s=iter.next();

				//we don't care about empty set
				if(!s.equals("{}")){

					//concatenate the set values
					String tmpStr=s+""+ls.get(i);

					//convert to character array to sort so that you don't have duplicates 
					char [] tmpChar=tmpStr.toCharArray();
					Arrays.sort(tmpChar);

					//add to tmp
					tmp.add(String.valueOf(tmpChar));
				}
			}

			//add all concatenations to powerset list
			powerSet.addAll(tmp);
		}
	
		List<String> tmpList=new ArrayList<>(powerSet);
		Collections.sort(tmpList);
		
		System.out.println("Power set of "+ls+" is:");
		System.out.println(tmpList);
}

}
