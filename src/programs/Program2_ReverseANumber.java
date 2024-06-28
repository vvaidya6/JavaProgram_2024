package programs;

import java.util.Scanner;

public class Program2_ReverseANumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = scanner.nextInt(); //12345

        //Logic 1 - using algorithm
        /*int rev=0;
        while(num!=0){
           rev=rev*10+num%10;
            num=num/10;
        }
        System.out.println("Reverse number is: "+rev);
    */

        //Logic 2 -StringBuffer
        /*StringBuffer rev;

        StringBuffer sb =new StringBuffer(String.valueOf(num));
        rev = sb.reverse();
        System.out.println("Reverse number is: "+rev);*/


        //Logic 3 - StringBuilder
        StringBuilder rev;
        StringBuilder sb = new StringBuilder();
        sb.append(num);
        rev = sb.reverse();
        System.out.println("Reverse number is: "+rev);


    }
}
