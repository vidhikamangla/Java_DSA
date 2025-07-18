// Ques 23: 
// n = 5 
 
//         1  
//       1 1 1  
//     1 1 1 1 1  
//   1 1 1 1 1 1 1  
// 1 1 1 1 1 1 1 1 1 

import java.util.Scanner;

public class Pattern23 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        // observation
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        int row=1;
        int nst=1;
        int nsp=n-1;

        while(row<=n){

            // printing spaces
            int i=1;
            while(i<=nsp){
                System.out.print(" "+" ");
                i++;
            }
            // printing ones
            int j=1;
            while(j<=nst){
                System.out.print("1"+" ");
                j++;
            }

            // prep for next row
            nsp--;
            nst+=2;
            System.out.println();
            row++;
        }
        sc.close();
    }
}
