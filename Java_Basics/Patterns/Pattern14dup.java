// Ques 14: 
// n = 5 

//         * 
//       * *
//     * * *
//   * * * *
// * * * * *
//   * * * *
//     * * *
//       * *
//         *

public class Pattern14dup {
    public static void main(String args[]){
        int n=5;
        int row=1;
        int nsp=n-1;
        int nst=1;
        while (row<=2*n-1){
            int i=1;
            while(i<=nsp){
                System.out.print(" "+" ");
                i+=1;
            }
            int j=1;
            while (j<=nst){
                System.out.print("*"+" ");
                j+=1;
            }
        if (row<n){
            nsp-=1;
            nst+=1;
        }else{
            nsp+=1;
            nst-=1;
        }
        row+=1;
        System.out.println();
        }
    }
}
