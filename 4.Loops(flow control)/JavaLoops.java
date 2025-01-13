
import java.util.*;


public class JavaLoops{
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);

       int n = inp.nextInt();
      
     
     if(n == 2){
        System.out.println(n + "N is prime");
     }else{
       boolean isPrime = true;
       for(int i= 2; i<=Math.sqrt(n); i++){
      
       if(n % i == 0){
        isPrime = false;
       }
      }

      if(isPrime == true){
        System.out.println(n + " is prime");
      }else{
        System.out.println("N is not prime");
      }
     }
      
      
    }
}
 