// Ques 32: 
// n = 5 
 
// 1  
// 2 * 2  
// 3 * 3 * 3  
// 4 * 4 * 4 * 4  
// 5 * 5 * 5 * 5 * 5  
// 4 * 4 * 4 * 4  
// 3 * 3 * 3  
// 2 * 2  
// 1 

import java.util.Scanner;
public class Pattern32 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        // observation
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        int row=1;
        int nst=1;
        int val=1;

        while(row<=2*n-1){
            int j=1;
            // System.out.println("row: "+row);
            while(j<=nst){
                if (j%2==0){
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print(val+" ");
                }
                j++;
            }

            // prep for next row
            System.out.println();
            if (row<=n-1){
                nst+=2;
                val++;
            }
            else{
                nst-=2;
                val--;
            }
            row++;
        }
        sc.close();
    }
}
