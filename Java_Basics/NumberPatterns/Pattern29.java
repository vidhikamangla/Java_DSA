// Ques 23: 
// n = 5 
 
//         1  
//       2 0 2 
//     3 0 0 0 3
//   4 0 0 0 0 0 4
// 5 0 0 0 0 0 0 0 5
import java.util.Scanner;
public class Pattern29 {
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
            // printing spaces
            int i=1;
            while(i<=nsp){
                System.out.print(" "+" ");
                i++;
            }
            int j=1;
            while(j<=nst){
                if (j==1 || j==nst){
                    System.out.print(val+" ");
                }
                else{
                    System.out.print("0"+" ");
                }
                j++;
            }

            // prep for next row
            nsp--;
            nst+=2;
            val++;
            System.out.println();
            row++;
        }
        sc.close();
    }
}
