// Ques 23: 
// n = 5 
 
//         1  
//       2 2 2  
//     3 3 3 3 3  
//   4 4 4 4 4 4 4  
// 5 5 5 5 5 5 5 5 5
public class Pattern24 {
    public static void main(String args[]){
        // observation
        int n=5;
        int row=1;
        int nst=1;
        int nsp=n-1;
        int val=1;

        while(row<=n){

            // printing spaces
            int i=1;
            while(i<=nsp){
                System.out.print(" "+" ");
                i++;
            }
            // printing ones
            int j=1;
            while(j<=nst){
                System.out.print(val+" ");
                j++;
            }

            // prep for next row
            nsp--;
            val++;
            nst+=2;
            System.out.println();
            row++;
        }
    }
}
