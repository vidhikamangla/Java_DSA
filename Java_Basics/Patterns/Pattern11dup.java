// Ques 11: 
// n = 5 
 
//         *
//       *   *
//     *   *   *
//   *   *   *   *
// *   *   *   *   *

// used even odd concept instead of printing extra spaces
import java.util.Scanner;
public class Pattern11dup {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        for (int i=1;i<=n;i++){
            for(int j=n;j>i;j--){
                System.out.print("  ");
            }
            for(int j=0;j<2*i-1;j++){
                if (j%2==0){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

