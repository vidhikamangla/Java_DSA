// Ques 4: 
// n = 5 
 
//         *  
//       * *  
//     * * *  
//   * * * *  
// * * * * * 
import java.util.Scanner;
public class Pattern4 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        for (int i=0;i<n;i++){
            for (int j=n-1;j>i;j--){
                System.out.print("  ");
            }
            for (int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
