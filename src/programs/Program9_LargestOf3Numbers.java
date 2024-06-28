package programs;

import java.util.Scanner;

public class Program9_LargestOf3Numbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        int a = sc.nextInt();

        System.out.println("Enter second number");
        int b = sc.nextInt();

        System.out.println("Enter third number");
        int c = sc.nextInt();

        //Logic 1
        /*if(a>b && a>c){
            System.out.println(a+" is largest number");
        }
        else if(b>a && b>c){
            System.out.println(b+" is largest number");
        }
        else{
            System.out.println(c+" is largest number");
        }*/

        //Logic 2 - Ternary operator
        //int largest1 = a>b ? a:b; //largest of a & b
        //int largest2 = c>largest1? c:largest1; // largest of c & largest1

       //System.out.println(largest2+" is largest number");

       //Logic 3 - using math operator
        System.out.println(Math.max(a, Math.max(b,c)));



    }
}
