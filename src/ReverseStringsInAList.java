

import java.util.ArrayList;

/**
 * Reverse individual strings in a list
 * Then reverse the list itself.
 * @author Kavita
 *
 */
public class ReverseStringsInAList {

	public static void main(String[] args) {
		ReverseStringsInAList app=new ReverseStringsInAList();
		app.start();
	}
	
	public void start(){
		
		ArrayList<String> strings=new ArrayList<String>();
		ArrayList<String> stringsRev=new ArrayList<String>();
		strings.add("Kavita");
		strings.add("ate");
		strings.add("orange");
		strings.add("and");
		strings.add("apple");
		strings.add("sauce");
		strings.add("!");
		
		int j=0;
		for(String s:strings){
			
			char[]  arr=s.toCharArray();
			char[]  arrTmp=new char[s.length()];
			
			//write in reverse order into temporary storage
			for(int k=arr.length-1; k>=0; k-- ){
				arrTmp[arr.length-1-k]=arr[k];
			}
			
			String newStr=String.valueOf(arrTmp);
			stringsRev.add(newStr);
			
			j++;
		}
		
		System.out.println("Actual strings:");
		System.out.println(strings);
		
		System.out.println("\nReversed strings:");
		
		//reverse the list itself by swapping first with last, etc
		//in practice, you could use Collections.reverse(..)
		for(int i=0; i<stringsRev.size()/2; i++){
			String strFirst=stringsRev.get(i);
			String strLast=stringsRev.get(stringsRev.size()-i-1);
			
			stringsRev.set(i,strLast);
			stringsRev.set(stringsRev.size()-i-1,strFirst);
		}
		
		//Collections.reverse(stringsRev);
		System.out.println(stringsRev);
	}
}
