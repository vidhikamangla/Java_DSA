import java.util.*;
public class Gates {
    public static long decToBin(int n){
        // Scanner sc=new Scanner(System.in);
        // int val=sc.nextInt();
        // System.out.println(n);
        long num=0;
        long pl=0;
        while(n>=1){
            long dig=n%2;
            // System.out.println("Dig: "+dig);
            //num=101, dig=0
            num+=dig*(Math.pow(10,pl));
            pl++;
            n/=2;
        }
        return num;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();

        System.out.println(decToBin(n1));
        System.out.println(decToBin(n2));
        System.out.println();

        // AND gate
        System.out.println("AND: "+decToBin(n1 & n2));

        // OR gate
        System.out.println("OR: "+decToBin(n1 | n2));

        // NOT gate (unary)
        System.out.println(~n1);
        System.out.println(Integer.toBinaryString(n1));
        System.out.println("NOT: "+Integer.toBinaryString(~n1));
        // if n=5, ~5 = -6 (2's complement) as bin of -6= 11111111111111111111111111111010
        // System.out.println("NOT: "+ (decToBin(-6)));
        // System.out.println(~101);

        // XOR gate
        System.out.println("XOR: "+decToBin(n1 ^ n2));

        // System.out.println(decToBin(100 ^ 101 ^ 010));
        System.out.println(decToBin(4 ^ 4 ^ 4)); //100 ^ 100 ^100 (compared 2 at a time)
        // in case of multiple digits being compared at the same time,
        // odd number of 1s will give 1, even no of 1=0
        // bec, pairs of 1s will xor to be 0
        sc.close();

    }
}
