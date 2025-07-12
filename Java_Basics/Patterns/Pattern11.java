// Ques 9: 
// n = 5 
 
// * * * * *  
// *       *  
// *       *    
// *       *  
// * * * * *
import java.util.Scanner;
public class Pattern11 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        for (int i=1;i<=n;i++){
            for(int j=n;j>i;j--){
                System.out.print("  ");
            }
            for(int j=0;j<i;j++){
                if (j==(i-1)){
                    System.out.print("*");
                }
                else{
                    System.out.print("*   ");
                }
            }
            System.out.println();
        }
    }
}

