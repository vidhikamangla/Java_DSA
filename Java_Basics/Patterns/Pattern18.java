// Ques 18: 
// n = 7 

//       * 
//     * * *
//   * * * * *
// * * * * * * *
//   * * * * *
//     * * *
//       *
public class Pattern18 {
    public static void main(String args[]){
        // observation
        int n=7;
        int nsp=n/2;
        int nst=1;
        int row=1;

        while(row<=7){
            // for row 1
            int i=1;
            while (i<=nsp){
                System.out.print(" "+" ");
                i+=1;
            }
            
            int j=1;
            while (j<=nst){
                System.out.print("*"+" ");
                j+=1;
            }
            // prep for next row
            if (row<=n/2){
                nst+=2;
                nsp-=1;
            }
            else{
                nst-=2;
                nsp+=1;
            }
            row+=1;
            System.out.println();
        }
    }
}
