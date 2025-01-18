
import java.util.*;

public class JavaFunctions{

   
  public static int Sum(int n){
    int sum = 0;

    while(n> 0){
      int lD = n % 10;
      sum = sum + lD;
      n= n/10;
    }

    return sum;
  }
 
      
    
    public static void main(String args[]){
      
      Scanner inp = new Scanner(System.in);

      int n = inp.nextInt();

     int num = Sum(n);

     System.out.println("Sum of N Digit is : " + num);

}

}



