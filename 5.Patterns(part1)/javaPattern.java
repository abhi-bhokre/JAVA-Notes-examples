
import java.util.*;

public class javaPattern{

    public static void main(String args[]){

        Scanner inp = new Scanner(System.in);

      
       int n = 5;
       int m = 5;
      for(int i=1; i<=n; i++){

        for(int j=1; j<=m ; j++){
            
            if(i==1 || i==n || j==1 || j==m){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
      }

    }
}
