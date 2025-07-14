// Ques 13: 
// n = 5 

// *  
// * *  
// * * *  
// * * * *  
// * * * * *  
// * * * *  
// * * *  
// * *  
// * 

import java.util.Scanner;
public class Pattern13 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        for (int i=1;i<=2*n-1;i++){
            for(int j=1;j<=n;j++){
                if ((i<=n) &&(j<=i)){
                    System.out.print("* ");
                }
                else if ((i>n) &&(j+(i-n)<=n)){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
