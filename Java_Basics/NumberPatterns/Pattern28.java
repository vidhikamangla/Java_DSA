// Ques 23: 
// n = 5 
 
//         1  
//       2 3 2 
//     3 4 5 4 3
//   4 5 6 7 6 5 4
// 5 6 7 8 9 8 7 6 5
import java.util.Scanner;
public class Pattern28 {
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
                System.out.print(val+" ");
                if (j>nst/2){
                    val--;
                }
                else{
                    val++;
                }
                j++;
            }

            // prep for next row
            nsp--;
            nst+=2;
            val+=2;
            System.out.println();
            row++;
        }
        sc.close();
    }
}
