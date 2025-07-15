// Ques 18: 
// n = 7 

// * * * * * * * 
// * * *   * * *
// * *       * *
// *           *
// * *       * *
// * * *   * * *
// * * * * * * *
public class Pattern19 {
    public static void main(String args[]){
        // observation
        int n=7;
        int nlst=n/2+1;
        int nrst=n/2+1;
        int nsp=-1;
        int row=1;

        while(row<=7){
            // for row 1
            int i=1;
            while (i<=nlst){
                System.out.print("*"+" ");
                i+=1;
            }
            
            int j=1;
            while (j<=nsp){
                System.out.print(" "+" ");
                j+=1;
            }

            int k=1;
            if (row==1 || row==n){
                k=2;
            }
            while (k<=nrst){
                System.out.print("*"+" ");
                k+=1;
            }
            // prep for next row
            if (row<=n/2){
                nrst-=1;
                nlst-=1;
                nsp+=2;
            }
            else{
                nlst+=1;
                nrst+=1;
                nsp-=2;
            }
            row+=1;
            System.out.println();
        }
    }
}