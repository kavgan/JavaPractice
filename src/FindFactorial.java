

/**
 * Find factorial of a number recursively.
 * @author Kavita
 *
 */
public class FindFactorial {

	public static void main(String[] args) {
		FindFactorial ff=new FindFactorial();
		ff.start();
	}
	
	public void start(){
		
		int factorialVal=factorial(10);
		System.out.println(factorialVal);
	}
	
	public int factorial(int n){
		
		if(n==1)
			return 1;
		
		return n * factorial(n-1);
	}

}
