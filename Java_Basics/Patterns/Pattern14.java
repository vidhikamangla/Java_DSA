// Ques 14: 
// n = 5 

//         * 
//       * *
//     * * *
//   * * * *
// * * * * *
//   * * * *
//     * * *
//       * *
//         *

import java.util.Scanner;
public class Pattern14 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        for (int i=1;i<=2*n-1;i++){
                for(int j=1;j<=n;j++){
                    if (i<=n){
                        if (i+j>n)
                        System.out.print("* ");
                        else
                        System.out.print("  ");
                    }
                    else{
                        if (j>=i-n+1)
                        System.out.print("* ");
                        else
                        System.out.print("  ");
                    }
                }
            System.out.println();
        }
    }
}
