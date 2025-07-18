// Ques 33: 
// n = 10 
           
//                   0 
//                 9 0 9 
//               8 9 0 9 8 
//             7 8 9 0 9 8 7 
//           6 7 8 9 0 9 8 7 6 
//         5 6 7 8 9 0 9 8 7 6 5 
//       4 5 6 7 8 9 0 9 8 7 6 5 4 
//     3 4 5 6 7 8 9 0 9 8 7 6 5 4 3 
//   2 3 4 5 6 7 8 9 0 9 8 7 6 5 4 3 2 
// 1 2 3 4 5 6 7 8 9 0 9 8 7 6 5 4 3 2 1 

import java.util.Scanner;
public class Pattern33 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        // observation
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        int row=1;
        int nsp=n-1;
        int nst=1;
        int val=10;
        while(row<=n){
            // System.out.println("row: "+row);
            // System.out.println("nst: "+nst);
            // System.out.println("nsp: "+nsp);
            // printing spaces
            int i=1;
            while(i<=nsp){
                System.out.print(" "+" ");
                i++;
            }
            // printing numbers
            int j=1;
            while(j<=nst){
                if (j==row){
                    System.out.print(0+" ");
                }
                if(j<row){
                    System.out.print(val+" ");
                    if (j!=row-1)
                    val++;
                }
                else if(j>row){
                    System.out.print(val+" ");
                    if(j!=nst)
                    val--;
                }
                j++;
            }

            // prep for next row
            System.out.println();
            nst+=2;
            val--;
            nsp--;
            row++;
        }
        sc.close();
    }
}