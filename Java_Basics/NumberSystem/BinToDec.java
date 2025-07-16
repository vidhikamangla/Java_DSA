// same code as dec to bin j replaced 10s with 2s and vice versa
import java.util.*;
import java.lang.Math;
public class BinToDec {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // System.out.println(n);
        long num=0;
        long pl=0;
        while(n>=1){
            long dig=n%10;
            System.out.println("Dig: "+dig);
            //num=101, dig=0
            num+=dig*(Math.pow(2,pl));
            pl++;
            n/=10;
        }
        sc.close();
        System.out.println(num);
    }
}
