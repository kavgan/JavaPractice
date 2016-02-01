package recursion;

/**
 * Find a fibbonacci sequence using recursion, no recursion and recursion with memory
 * @author Kavita
 *
 */
public class FindFibbonacciSequence {

	public static void main(String[] args) {
		FindFibbonacciSequence fs=new FindFibbonacciSequence();
		fs.start();
	}
	
	public void start(){
		
		System.out.print("=========Using Recursion========\n");
		
		//recursion
		for(int i=0; i<30; i++){
			int fib=fibbonacci(i);
			System.out.print(fib);	
			System.out.print(" ");
		}
		
		System.out.print("\n\n=========Using Recursion with Memory========\n");
		
		//recursion
		int memory[]=new int[30];
		for(int i=0; i<30; i++){
			fibbonacci(i,memory);
			System.out.print(memory[i]);	
			System.out.print(" ");
		}
		
		
		//no recursion
		System.out.print("\n\n=========Using Loops========\n");
		int prevMinus1=0;
		int prevMinus2=0;
		
		for(int i=0; i<30; i++){
	
			int fib=0;
			if(i<=1){
				fib=i;
				
				if(i==0){
					prevMinus2=0;
				}else{
					prevMinus1=1;
				}
			}else{
				fib=prevMinus1+prevMinus2;
				prevMinus2=prevMinus1;
				prevMinus1=fib;
			}
			
			System.out.print(fib);	
			System.out.print(" ");
		}
		
		
	}
	
	public int fibbonacci(int n){
		
		if(n<=1)
			return n;
		
		return fibbonacci(n-1)+ fibbonacci(n-2);
	}
	
	
	public int fibbonacci(int n, int [] mem){
		
		if(n<=1){
			mem[n]=n;
			return mem[n];
		}
		
		//only recurse when the value in the memory cell is empty
		if(mem[n]==0){
			int m=fibbonacci(n-1,mem)+ fibbonacci(n-2,mem);
			mem[n]=m;
		}
		
		return mem[n];
	}

}
