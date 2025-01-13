import java.util.*;

public class JavaConditional{

    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        
     int year = inp.nextInt();
    
    if(year % 400 == 0){
        System.out.println("Leap year");
    }else if(year % 100 == 0){
        System.out.println("not a Leap year");
    }else if(year % 4 == 0){
        System.out.println("Leap year");
    }else{
        System.out.println("not a Leap year");
    }

    }
}