import java.util.*;
import java.lang.Math;
public class DecToBin {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // System.out.println(n);
        long num=0;
        long pl=0;
        while(n>=1){
            long dig=n%2;
            System.out.println("Dig: "+dig);
            //num=101, dig=0
            num+=dig*(Math.pow(10,pl));
            pl++;
            n/=2;
        }
        System.out.println(num);
    }
}
