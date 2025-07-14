// Ques 10: 
// n = 5 
 

// * * * * * 
//     * * * * 
//         * * * 
//             * * 
//                 * 
//             * * 
//         * * *
//     * * * *
// * * * * *
public class Pattern15 {
    public static void main(String args[]){
        int n=5;
        int row=1;
        int nsp=0;
        int nst=n;
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
            nsp+=2;
            nst-=1;
        }else{
            nsp-=2;
            nst+=1;
        }
        row+=1;
        System.out.println();
        }
    }
}
