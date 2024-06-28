package programs;

public class Program1_Swapping2Numbers {

    public static void main(String[] args) {

        int a=10, b=20;
        System.out.println("Before swapping values are.. "+a+" "+b);

        //Logic 1 - create temp variable
        /*int temp;
        temp=a;
        a=b;
        b=temp;

        System.out.println("After swapping values are.. "+a+" "+b);*/


        //Logic 2 (use + - operators) without using third variable
        /*a=a+b; //10+20=30
        b=a-b; //30-20=10
        a=a-b;//30-10=20

        System.out.println("After swapping values are.. "+a+" "+b);*/

        //Logic 3(use * / operators) without using third variable
        //a & b values should not be 0

        /*a=a*b; //10*20=200
        b=a/b; //200/20=10
        a=a/b; //200/10=20

        System.out.println("After swapping values are.. "+a+" "+b);*/

        //Logic 4 (bitwise XOR  operator ^) -> using bitwise site and use XOR operator
        /*a=a ^ b; //10 ^ 20 = 30
        b=a ^ b; //30 ^ 20 = 10
        a=a ^ b; //30 ^ 10 = 20

        System.out.println("After swapping values are.. "+a+" "+b);*/

        //Logic 5 - Single statement - a=10, b=20
        b=a+b-(a=b);
        System.out.println("After swapping values are.. "+a+" "+b);






    }
}
