import java.util.*;
public class DecToBin2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // System.out.println(n);
        String num="";
        while(n>=1){
            int dig=n%2;
            // System.out.println("Dig: "+dig);
            //num=101, dig=0

            // if(dig==1){
            //     num="1"+num;
            // }
            // else{
            //     num="0"+num;
            // }

            // ternary operator "? :"
            // demands 3 operands
            // checks if the ?statement is true, executes left if true, right if false

            // condition?  true value:false value
            num=((dig==1)? "1":"0")+num;
            n/=2;
        }
        sc.close();
        System.out.println(num);
    }
}
