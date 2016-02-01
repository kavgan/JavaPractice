
/**
 * Perform in-place swapping of two numbers
 * @author Kavita
 *
 */
class InPlaceSwap {
  
  static int [] temp;
  static int idx=0;
  
  public static void main(String[] args) {
    
   int a=5;
   int b=3;
  
    System.out.println("Before swap");
    System.out.println("a: "+a);
    System.out.println("b: "+b);
    
    a=a+b; //add 5+3=8
    b=a-b; //we need 5 here, so 8-3=5
    a=a-b; //we need 3 here, so 8-5=3
    
    System.out.println("After swap");
    System.out.println("a: "+a);
    System.out.println("b: "+b);
    
  }
}
 