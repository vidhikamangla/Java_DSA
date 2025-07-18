// Ques 31: 
// n = 5 
 
// 5 4 3 2 *  
// 5 4 3 * 1  
// 5 4 * 2 1  
// 5 * 3 2 1  
// * 4 3 2 1 

import java.util.Scanner;
public class Pattern31 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        // observation
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        int row=1;
        int nst=n;

        while(row<=n){
            int val=n;
            int j=1;
            // System.out.println("row: "+row);
            while(j<=nst){
                if (val==row){
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print(val+" ");
                }
                // prep for numbers
                val--;
                j++;
            }

            // prep for next row
            System.out.println();
            row++;
        }
        sc.close();
    }
}
