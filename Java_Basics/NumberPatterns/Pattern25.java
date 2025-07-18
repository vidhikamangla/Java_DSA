// Ques 23: 
// n = 5 
 
//         1  
//       2 3 4  
//     5 6 7 8 9 
//   10 11 12 13 14 15 16 
// 17 18 19 20 21 22 23 24 25

import java.util.Scanner;

public class Pattern25 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        // observation
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        int row=1;
        int nst=1;
        int nsp=n-1;
        int val=1;

        while(row<=n){

            int i=1;
            while(i<=nsp){
                System.out.print(" "+" ");
                i++;
            }
            // printing ones
            int j=1;
            while(j<=nst){
                System.out.print(val+" ");
                val++;
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
