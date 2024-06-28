package programs;

import java.util.Scanner;

public class Program5_PalindromeString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");

        String str = sc.next();
        String org_str = str;

        String rev="";

        int length = str.length();

        for(int i = length-1; i>=0; i--){
            rev = rev + str.charAt(i);
        }

        if(org_str.equals(rev)){
            System.out.println(org_str+ " Palindrome String");
        }
        else{
            System.out.println(org_str+ " Not a Palindrome String");
        }


    }
}
