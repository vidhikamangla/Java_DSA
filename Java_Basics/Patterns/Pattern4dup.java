// Ques 10: 
// n = 5 
 
//         * 
//       * *
//     * * *
//   * * * *
// * * * * *
public class Pattern4dup {
    public static void main(String args[]){
        int n=5;
        int row=1;
        int nst=1;
        int nsp=n-1;
        while(row<=n){
            int i=1;
            while(i<=nsp){
                System.out.print(" "+" ");
                i++;
            }
            i=1;
            while(i<=nst){
                System.out.print("*"+" ");
                i++;
            }
            // next row
            row+=1;
            nsp=nsp-1;
            nst=nst+1;
            System.out.println();
        }
    }
}
