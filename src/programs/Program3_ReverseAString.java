package programs;

public class Program3_ReverseAString {

    public static void main(String[] args) {
        String s ="ABCD";
        String rev = "";

        //1) Using + (String concatenation)


        /*int length = s.length();
        System.out.println(length); //4

        for(int i=length-1; i>=0; i--){
            rev = rev + s.charAt(i);
        }

        System.out.println("Reverse String:" +rev);*/

        //2) Using character Array
        /*char[] a = s.toCharArray();
        int len = a.length;
        for(int i=len-1; i>=0; i--){
            rev = rev + a[i];
        }
        System.out.println("Reverse String:" +rev);*/

        //3)Using StringBuffer
        StringBuffer sbf = new StringBuffer(s);
        System.out.println(sbf.reverse());




    }
}
