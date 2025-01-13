import java.util.*;

public class JavaBasics{
    public static void main(String args[]){
    
    Scanner inp = new Scanner(System.in);
    
    float pencil = inp.nextFloat();
    float pen = inp.nextFloat();
    float eraser = inp.nextFloat();

    float total_cost =  pencil + pen + eraser;


    float gst_cost = (total_cost * 0.18f);

    float total_bill = total_cost + gst_cost;

    System.out.println(total_cost);

    System.out.println(total_bill);
   
    
    }
} 






    // int side = inp.nextInt();

    // int Square = (side * side);    

    // System.out.println("Square of Side = " + Square);


// System.out.println("Enter 3 numbers :");
    
    // int a = inp.nextInt();
    // int b = inp.nextInt();
    // int c = inp.nextInt();

    // int Average = (a+b+c)/3;
    
    // System.out.println("Average of 3 Numbers is : " +Average);



 // float number = inp.nextInt();
    // System.out.println(number);



// int A = inp.nextInt();
    // int B = inp.nextInt();

    // int sum = A + B;

    // System.out.println("Sum of A & B = " + sum);


    // float r = inp.nextFloat();

    // float area = 3.14f * r * r;

    // System.out.println("Area of radius = " + area);  