
// * * *    * * *  
// * *        * *  
// *            *   
// 
// *            *    
// * *        * *  
// * * *    * * * 
public class Pattern21 {
    public static void main(String args[]){
        int n=5;
        int row=1;
        int nsp=n+2;
        int nlst=1;
        int nrst=1;
        while (row<=n){
            int i=1;
            while(i<=nlst){
                System.out.print("*"+" ");
                i+=1;
            }
            int j=1;
            while (j<=nsp){
                System.out.print(" "+" ");
                j+=1;
            }
            int k=1;
            if(row==n){
                k=2;
            }
            while (k<=nrst){
                System.out.print("*"+" ");
                k+=1;
            }
        nsp-=2;
        nlst+=1;
        nrst+=1;
        row+=1;
        System.out.println();
        }
    }
}
