// Ques 6: 
// n = 5 

// * * * * *  
//     * * * *  
//         * * *  
//             * *  
//                 * 
import java.util.Scanner;
public class Pattern6 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        for (int i=n;i>0;i--){
            // System.out.println("i:  "+i);
            for(int j=n;j>i;j--){
                // System.out.println("j:  "+j);
                System.out.print("  ");
                System.out.print("  ");
            }
            for (int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
