
// * * *    * * *  
// * *        * *  
// *            *   
// 
// *            *    
// * *        * *  
// * * *    * * * 
public class Pattern17 {
    public static void main(String args[]){
        int n=7;
        int row=1;
        int nsp=1;
        int nlst=n/2;
        int nrst=n/2;
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
            while (k<=nrst){
                System.out.print("*"+" ");
                k+=1;
            }
        if (row<n/2+1){
            nsp+=2;
            nlst-=1;
            nrst-=1;
        }else{
            nsp-=2;
            nrst+=1;
            nlst+=1;
        }
        row+=1;
        System.out.println();
        }
    }
}
