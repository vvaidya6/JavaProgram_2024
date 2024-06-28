package programs;

public class Program7_CountEvenAndOddDigitsInANumber {

    public static void main(String[] args) {

        int num = 1312353768;
        int even_count = 0;
        int odd_count = 0;

        while(num>0){
            int rem =num%10;
            if(rem%2==0){
                even_count++;
            }
            else{
                odd_count++;
            }
            num = num/10;
        }

        System.out.println("Even Digits count: "+even_count);
        System.out.println("Odd Digits count: "+odd_count);
    }
}
